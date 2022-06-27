package interfacs_estudo01.services;

import interfacs_estudo01.entities.CarRental;
import interfacs_estudo01.entities.Invoice;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxes;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxes) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxes = taxes;
    }
    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        double hours = (double) (t2 - t1) / 1000 / 60 /60;

        double basicPayment;

        if(hours <= 12.0) {
            basicPayment = Math.ceil(hours) * pricePerHour;
        }
        else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
        }

        double tax = taxes.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }





}

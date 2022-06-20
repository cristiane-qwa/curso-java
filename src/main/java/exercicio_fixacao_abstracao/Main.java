package exercicio_fixacao_abstracao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TaxPayer> taxes = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int quantity = scanner.nextInt();

        for(int i = 0; i <quantity; i++) {
            System.out.print("Individual or company (i/c)? ");
            char type = scanner.next().charAt(0);

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Anual income: ");
            Double anualIncome = scanner.nextDouble();

            if(type == 'i') {
                System.out.print("Health expenditures: ");
                Double health = scanner.nextDouble();
                taxes.add(new Individual(name, anualIncome, health));
            }
            else {
                System.out.print("Informe a quantidade de funcionários: ");
                int quantidadeFuncionarios = scanner.nextInt();
                taxes.add(new Company(name, anualIncome, quantidadeFuncionarios));
            }
        }

        double total = 0.0;
        for(TaxPayer tax : taxes) {
            System.out.println(tax.getName() + " $ " + String.format("%.2f", tax.tax()));
            total += tax.tax();
        }
        System.out.println("Total Taxes: $ "+ String.format("%.2f", total));
    }
}

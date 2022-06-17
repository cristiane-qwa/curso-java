package contratos_funcionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter Department's name: ");
        String departmentName = scanner.next();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.next();

        System.out.print("Level: ");
        String workerLevel = scanner.next();
        WorkerLevel workerLevel1 = WorkerLevel.valueOf(workerLevel);

        System.out.print("Base salary: ");
        Double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, workerLevel1, baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        Integer quantity = scanner.nextInt();

        for (Integer i = 1; i <= quantity; i++) {
            System.out.println("Enter contract " + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scanner.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);

        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();

        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear + " --> R$ " + String.format("%.2f", worker.income(year, month)));


    }
}

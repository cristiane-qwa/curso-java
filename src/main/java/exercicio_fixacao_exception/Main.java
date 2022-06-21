package exercicio_fixacao_exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer numero = scanner.nextInt();

        System.out.print("Holder: ");
        String holder = scanner.next();
        scanner.next();

        System.out.print("Initial balance: ");
        Double initialBalance = scanner.nextDouble();

        System.out.print("Withdraw Limit: ");
        Double limite = scanner.nextDouble();

        Account conta = new Account(numero, holder, initialBalance, limite);

        try {
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double withdraw = scanner.nextDouble();
            conta.withDraw(withdraw);
            System.out.println("New Balance: R$ " + String.format("%.2f", conta.getBalance()));
        }
        catch (DomainException e) {
            System.out.println(e.getMessage());
        }

    }
}

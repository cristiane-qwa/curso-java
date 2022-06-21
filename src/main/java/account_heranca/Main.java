package account_heranca;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1001, "Alex", 0.0);
        BusinnesAccount businnesAccount = new BusinnesAccount(1002, "Maria", 0.0, 500.0);

        //Upcasting é quando você instancia uma subclasse como uma superclasse.

        Account account1 = new BusinnesAccount(1003, "Bob", 0.0, 200.0);

        //Downcasting é quando você instancia uma superclasse como uma subclasse, nesses casos pode não dar certo, porque
        //pode haver perda de informação, para se assegurar que não dará erro é indicado a utilização de verificadores.

        if(account1 instanceof BusinnesAccount) {
            BusinnesAccount account2 = (BusinnesAccount) account1;
            System.out.println("Business Account");
        }
        else if(account1 instanceof  SavingsAccount) {
            SavingsAccount account2 = (SavingsAccount) account1;
            System.out.println("Saving Account");
        }

        Account account3 = new Account(1010, "Alex", 1000.0);
        account3.withdraw(200.0);
        System.out.println(account3.getBalance());

        Account account4 = new SavingsAccount(1011, "Abba", 1000.0, 0.01);
        account4.withdraw(200.0);
        System.out.println(account4.getBalance());

        Account account5 = new BusinnesAccount(1012, "Alfa", 1000.0, 500.0);
        account5.withdraw(200.0);
        System.out.println(account5.getBalance());

    }
}

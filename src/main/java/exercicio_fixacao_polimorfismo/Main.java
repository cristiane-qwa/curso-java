package exercicio_fixacao_polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        List<Product> produtos = new ArrayList<>();

        System.out.print("Informe a quantidade de produtos: ");
        int quantidade = scanner.nextInt();

        for(int i = 0; i < quantidade; i++) {
            System.out.print("Common, used or imported (c/u/i)? ");
            char tipo = scanner.next().charAt(0);

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Price: ");
            Double price = scanner.nextDouble();

            if(tipo == 'i' || tipo =='I') {
                System.out.print("Customs fee: ");
                Double customsFee = scanner.nextDouble();
                produtos.add(new ImportedProduct(name, price, customsFee));
            }
            else if(tipo == 'U' || tipo == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dateString = scanner.next();

                try {
                    produtos.add(new UsedProduct(name, price, sdf.parse(dateString)));
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                produtos.add(new Product(name, price));
            }

        }

        for(Product product : produtos) {
            System.out.println(product.priceTag());
        }
    }
}

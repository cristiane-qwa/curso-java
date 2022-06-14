package contribuinte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Contribuinte> lista = new ArrayList<>();

        System.out.print("Informe a quantidade de inserts: ");
        int quantidade = scanner.nextInt();


        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe o nome do contribuente: ");
            String nome = scanner.next();

            System.out.print("Digite E para empresa e P para pessoa física: ");
            char tipo = scanner.next().charAt(0);
            if(tipo == 'p') {
                System.out.print("Informe o valor anual: ");
                double valorAnual = scanner.nextDouble();
                System.out.print("Informe o valor gasto com saúde: ");
                double saude = scanner.nextDouble();

                lista.add(new PessoaFisica(nome,valorAnual, saude ));
            }
            else {
                System.out.print("Informe o valor anual: ");
                double valorAnual = scanner.nextDouble();
                System.out.print("Informe a quantidade de funcionarios: ");
                int funcionarios = scanner.nextInt();

                lista.add(new Empresa(nome,valorAnual, funcionarios ));
            }
        }

        double valorTotalImposto = 0.0;

        for (Contribuinte contribuinte : lista) {
            System.out.print("Contribuinte: " + contribuinte.getNome() + "\nValor imposto: " + String.format("%.2f",contribuinte.resultado()) + "\n\n");
            valorTotalImposto += contribuinte.resultado();
        }
        System.out.println("Valor total imposto: " + String.format("%.2f", valorTotalImposto));
    }
}

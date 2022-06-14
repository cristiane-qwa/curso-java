package produtos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de produtos: ");
        Integer quantidadeProdutos= scanner.nextInt();

        for (Integer i = 0; i < quantidadeProdutos; i++) {
            System.out.print("Informe o nome do produto: ");
            String nomeProduto = scanner.next();

            System.out.print("Informe o valor do produto: ");
            Double valorProduto = scanner.nextDouble();

            System.out.print("Digite:\nC -- Comum\nI -- Importado\nU -- Usado\n");
            char tipo = scanner.next().charAt(0);

            if(tipo == 'i' || tipo == 'I') {
                System.out.println("Informe o valor de alfandega: ");
                double valorAlfandega = scanner.nextDouble();
                Produto prod = new ProdutoImportado(nomeProduto, valorProduto, valorAlfandega);
                produtos.add(prod);
            }
            else if(tipo == 'u' || tipo == 'U') {
                System.out.println("Informe a data de fabricação: ");
                String dataFabricacao = scanner.next();
                SimpleDateFormat dataEmFormato = new SimpleDateFormat(dataFabricacao);
                Produto prod = new ProdutoUsado(nomeProduto, valorProduto, dataEmFormato);
                produtos.add(prod);
            }
            else {
                Produto prod = new Produto(nomeProduto, valorProduto);
                produtos.add(prod);
            }
        }

        for (Produto produto : produtos) {
            System.out.println(produto.priceTag());
        }
    }
}

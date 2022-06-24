package files_estudos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoFiles {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        System.out.println("Informe o caminho do arquivo csv: ");
        String pathString = scanner.nextLine();

        File path = new File(pathString);

        File[] files = path.listFiles(File::isFile);
        List<String> textos = new ArrayList<>();

        for (File file : files) {
            String fileName = file.getName();
            int lastIndex = fileName.lastIndexOf('.');
            String extension = fileName.substring(lastIndex + 1);
            if (extension.equalsIgnoreCase("csv")) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getAbsolutePath()))) {
                    String line = bufferedReader.readLine();
                    while (line != null) {
                        String parteTexto = line;
                        String[] split = parteTexto.split(",");
                        for (String s : split) {
                            textos.add(s);
                        }
                        line = bufferedReader.readLine();
                    }
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        while (textos.size() > 0) {
            String nome = textos.get(0).replace("'", "");
            String valor = textos.get(1).replace("'", "");
            String quantidade = textos.get(2).replace("'", "");

            Produto produto = new Produto(nome, Double.parseDouble(valor), Integer.parseInt(quantidade));
            produtos.add(produto);

            textos.remove(0);
            textos.remove(0);
            textos.remove(0);
        }

        String pathTo = "C:\\Users\\cristiane.andrade\\Documents\\testando-files\\arquivo.csv";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathTo, true))) {

            for (Produto produto : produtos) {
                bufferedWriter.write(produto.getNomeProduto() + "," + String.format("%.2f", produto.valorTotal()));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

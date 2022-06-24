package files_estudos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ApplicationWriter {
    public static void main(String[] args) {

        String[] lines = new String[]{"Olá", "Tudo bem?", "Tchau"};

        String path = "C:\\Users\\cristiane.andrade\\workspace\\curso-java\\src\\main\\java\\files_estudos\\arquivo.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {

                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

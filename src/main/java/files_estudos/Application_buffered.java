package files_estudos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Application_buffered {
    public static void main(String[] args) {
        String path = "C:\\Users\\cristiane.andrade\\Documents\\testando-files\\tres.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package map_fixacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        Map<String, Integer> votos = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            System.out.println("Opa");
            String line = br.readLine();
            while (line != null) {
                String[] split = line.split(",");
                if (votos.containsKey(split[0])) {
                    int quantidade = votos.get(split[0]) + Integer.parseInt(split[1]);
                    System.out.println(votos.get(split[0]));
                    votos.put(split[0], quantidade);
                } else {
                    votos.put(split[0], Integer.valueOf(split[1]));
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String key : votos.keySet()) {
            System.out.println(key + " : " + votos.get(key));
        }
    }

}

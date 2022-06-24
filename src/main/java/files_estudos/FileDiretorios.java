package files_estudos;

import java.io.File;
import java.util.Scanner;

public class FileDiretorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a directory path: ");
        String path = scanner.nextLine();

        File filePath = new File(path);

        File[] directories = filePath.listFiles(File::isDirectory);
        System.out.println("DIRECTORIES: ");
        for (File directory : directories) {
            System.out.println(directory);
        }
    }



}

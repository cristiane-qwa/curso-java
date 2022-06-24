package files_estudos;

import java.io.File;
import java.util.Scanner;

public class FileFiles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a folder path: ");

        String path = scanner.nextLine();

        File filePath = new File(path);

        File [] files = filePath.listFiles(File::isFile);
        System.out.println("FILES:");

        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(path +"\\subdir").mkdir();
        System.out.println("Directory created: " + success);
    }
}

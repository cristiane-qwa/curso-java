package files_estudos;

import java.io.File;
import java.util.Scanner;

public class FileInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String path = scanner.nextLine();

        File pathFile = new File(path);

        System.out.println("getName: " + pathFile.getName());
        System.out.println("getParent: " + pathFile.getParent());
        System.out.println("getPath: " + pathFile.getPath());

    }
}

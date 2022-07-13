package set_fixacao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> alunos = new HashSet<>();

        System.out.print("How many students for course A? ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            alunos.add(scanner.nextInt());
        }

        System.out.print("How many students for course B? ");
        int b = scanner.nextInt();
        for (int i = 0; i < b; i++) {
            alunos.add(scanner.nextInt());
        }

        System.out.print("How many students for course C? ");
        int c = scanner.nextInt();
        for (int i = 0; i < c; i++) {
            alunos.add(scanner.nextInt());
        }

        System.out.println("Total students: " + alunos.size());

    }
}

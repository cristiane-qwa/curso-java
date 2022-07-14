package fixacao_funcional;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Funcionario> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                String[] split = line.split(",");
                list.add(new Funcionario(split[0], split[1], Double.parseDouble(split[2])));
                line = br.readLine();
            }
            System.out.print("Enter salary: ");
            Double salario = scanner.nextDouble();

            List<String> emails = list.stream()
                    .filter(s -> s.getSalary() > salario)
                    .map(p -> p.getEmail())
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than 2000.00:");
            emails.forEach(System.out::println);

            Double soma = list.stream()
                    .filter(n -> n.getName().charAt(0) == 'M')
                    .map(n -> n.getSalary())
                    .reduce(0.0, (n,y) -> n+y);

            System.out.printf("Sum of salary of people whose name starts with 'M' : %.2f\n", soma);

        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

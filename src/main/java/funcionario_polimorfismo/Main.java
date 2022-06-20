package funcionario_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> funcionarios = new ArrayList<>();

        System.out.print("Informe a quantidade de funcionários: ");
        int quantidade = scanner.nextInt();

        for(int i = 1; i <= quantidade; i++) {
            System.out.print("Informe o nome do funcionario: ");
            String nome = scanner.next();

            System.out.print("Informe a quantidade de horas trabalhadas: ");
            Integer horasTrabalhadas = scanner.nextInt();

            System.out.print("Informe o valor da hora trabalhada: ");
            Double valorHora = scanner.nextDouble();

            System.out.print("Houve despesa extra? (Y/N): ");
            char resposta = scanner.next().charAt(0);

            if(resposta == 'Y' || resposta == 'y') {
                System.out.print("Informe o valor das despesas adicionais: ");
                Double despesasAdicionais = scanner.nextDouble();

                funcionarios.add(new OutsourcedEmployee(nome, horasTrabalhadas, valorHora, despesasAdicionais));
            }
            else {
                funcionarios.add(new Employee(nome, horasTrabalhadas, valorHora));
            }
        }

        for(Employee employee : funcionarios) {
            System.out.println("Funcionario: " + employee.getName() + " R$ " + String.format("%.2f",employee.payment()));
        }
    }
}

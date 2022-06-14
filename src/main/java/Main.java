import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de funcionarios: ");
        int quantidadeFuncionarios = scanner.nextInt();

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.print("Funcionario é terceirizado? ");
            char tipo = scanner.next().charAt(0);

            System.out.print("Informe o nome do funcionario: ");
            scanner.nextLine();
            String nome = scanner.nextLine();

            System.out.print("Informe a quantidade de horas trabalhadas: ");
            Integer horasTrabalhadas = scanner.nextInt();

            System.out.print("Informe o valor hora: ");
            Double valorHora = scanner.nextDouble();

            if (tipo == 's' || tipo == 'S') {
                System.out.print("Informe o valor de despesa adicional: ");
                Double valorDespesaAdicional = scanner.nextDouble();
                Funcionario func = new Terceirizado(nome, horasTrabalhadas, valorHora, valorDespesaAdicional);
                funcionarios.add(func);
            } else {
                Funcionario func = new Funcionario(nome, horasTrabalhadas, valorHora);
                funcionarios.add(func);
            }
        }
        System.out.println();
        System.out.println("Pagamentos: ");

        for (Funcionario func : funcionarios) {
            System.out.println(func.getNome() + " R$ " + String.format("%.2f", func.calculaSalario()));
        }
    }
}

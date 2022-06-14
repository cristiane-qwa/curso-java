package geometria;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        List<Shape> figuras = new ArrayList<>();

        System.out.print("Informe a quantidade de figuras geométricas: ");
        int quantidade = scanner.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Figura " + i + " dados: ");
            System.out.print("Digite R para retâgulo e C para circulo: ");
            char figura = scanner.next().charAt(0);
            System.out.print("Informe a cor: Black/Blue/Red: ");
            Color cor = Color.valueOf(scanner.next().toUpperCase());

            if (figura == 'r' || figura == 'R') {
                System.out.print("Informe a altura: ");
                double altura = scanner.nextDouble();
                System.out.print("Informe a largura: ");
                double largura = scanner.nextDouble();

                figuras.add(new Retangulo(cor, altura, largura));
            } else {
                System.out.print("Informe o radio: ");
                double radio = scanner.nextDouble();
                figuras.add(new Circulo(cor, radio));
            }

        }

        for (Shape figura : figuras) {
            System.out.println("Área: " + String.format("%.2f",figura.area()));
        }

        scanner.close();

    }
}

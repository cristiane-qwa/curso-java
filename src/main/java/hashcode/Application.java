package hashcode;

public class Application {
    public static void main(String[] args) {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "joao@gmail.com");

        System.out.println(c1.equals(c2));
    }
}

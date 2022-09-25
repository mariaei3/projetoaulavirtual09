import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a temperatura em graus Fahrenheit:");
        double fahr = sc.nextDouble();

        double graus = (fahr - 32) * 5 / 9;

        System.out.print("Essa é a temperatura em graus Celsius: " + graus);
    }
}
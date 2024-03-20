import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numeroDigitado = leitura.nextInt();

        System.out.print("Deseja digitar outro numero? ");
        String opcaonova = leitura.next();


        while (opcaonova.equals("s")) {
            System.out.print("Digite outro numero: ");
            int novoNumero = leitura.nextInt();

            System.out.print("Deseja digitar outro numero? ");
            String opcaonovaN1 = leitura.next();

        }
    }
}
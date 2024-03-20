import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite de que valor deseja comecar a contagem: ");
        int valorInicial = leitura.nextInt();

        System.out.println("Deseja contar de quantos em quantos? ");
        int salto = leitura.nextInt();

        System.out.println("Deseja contar ate quanto? ");
        int valorFinal = leitura.nextInt();

        for (int i = valorInicial; i <= valorFinal; i+=salto) {
            System.out.println(i);
        }
    }
}
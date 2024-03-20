import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.print("Deseja começar a contar de que numero?  ");
        int comeco = leitura.nextInt();

        System.out.print("Deseja contar ate que numero?  ");
        int ateque = leitura.nextInt();

        for (int i = comeco; i <= ateque; i++) {
            System.out.println(i);
        }
    }
}
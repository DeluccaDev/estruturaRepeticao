import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite que tipo de conversao deseja fazer? ");
        String conversao = leitura.next();

        if (conversao.equals("m")) {
            System.out.println("Conversao em metros");
            String metros = leitura.next();



            System.out.println(conversao);
        }
    }
}
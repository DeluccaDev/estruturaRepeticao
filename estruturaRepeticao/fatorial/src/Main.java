import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n = 12;
        int f = 1;
        int contador = n;

        while (contador >=0 ){
            f = f*contador;
            contador--;

            System.out.println(f);
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int contador = 0;
//
//        while (contador <5) {
//            System.out.println(contador);
//            contador++;
//        }

//        int contador = 0;
//
//        while (contador <9) {
//            contador++;
//            if (contador == 4 || contador ==8){
//                continue;
//            }
//            System.out.println(contador);
//
//        }
//  Comando Break faz com que pule para fora do laço, mesmo que nao tenha finalizado
        int contador = 0;

        while (contador <9) {
            contador++;
            if (contador == 4){
                break;
            }
            System.out.println(contador);

        }
    }
}
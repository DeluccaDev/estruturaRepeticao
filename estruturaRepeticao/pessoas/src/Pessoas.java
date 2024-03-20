import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {

        int qtMulheres = 0, qtHomens = 0, sexo;
        float altura, somaH = 0, mediaHomens = 0, maior = 0, menor = 0;

        Scanner leitura = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Escolha o sexo da pessoa(1 - Mulher, 2 Homem: )");
            sexo = leitura.nextInt();

            System.out.println("Digite a altura da pessoa: ");
            altura = leitura.nextFloat();

            if (sexo == 1) {
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
            }else {
                System.out.print("Opção invalida");
            }

            if (altura > maior) {
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }
        }

        mediaHomens = somaH / qtHomens;

        System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediaHomens + " m");
        System.out.println("O número de mulheres é " + qtMulheres);
    }
}
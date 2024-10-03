import java.util.Scanner;

public class Exercio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de carros: ");
        int quantidadeCarros = sc.nextInt();

        double[] notas = new double[quantidadeCarros];
        int notaspos = 0;
        int notasneg = 0;
        double mediaNotas = 0;


        // pede a nota conforme o numero de Carro
        for (int i = 0 ; i < quantidadeCarros; i++) {
            System.out.println("Informe a nota do carro "+ (i +1 ) +" entre 1 a 10 : ");
            double notaCarro = sc.nextDouble();
            notas[i] = notaCarro;

            // pedir novamnete a nota
            while (notaCarro < 0 || notaCarro > 10) {
                System.out.println("Nota invalida, insira novamente: ");
                notaCarro = sc.nextDouble();
            }
            if (notaCarro >= 6) {
                notaspos++;
            }else {
                notasneg++;
            }
            mediaNotas += notaCarro;
        }
        double mediaFinal =mediaNotas /= quantidadeCarros;

        System.out.println("Quantidade de carros bons: " + notaspos);
        System.out.println("Quantidade de carros ruins: " + notasneg);
        System.out.println("Media notas: " + mediaFinal);

    }
}

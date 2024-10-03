import java.util.Scanner;

public class Exercio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de pessoas votando : ");
        int pessoas = sc.nextInt();

        int taffe = 80;
        int rodrigo = 70;
        int lucas = 60;
        int alesandro = 50;

        int votosTaffe = 0;
        int votosRodrigo = 0;
        int votosLucas = 0;
        int votosAlesandro = 0;

        System.out.println("Opcoes de candidatos :  80-Taffe, 70-Rodrigo, 60-lucas, 50-Alessandro");

        for (int i = 0; i < pessoas; i++) {

            int voto = 0;
            do {
                System.out.println("Insira seu voto : ");
                voto = sc.nextInt();
            } while (voto != 80 && voto != 70 && voto != 60 && voto != 50);

            if (voto == taffe) {
                System.out.println("Votou em Taffe");
                votosTaffe++;
            }
            if (voto == rodrigo) {
                System.out.println("Votou em Rodrigo");
                votosRodrigo++;
            }
            if (voto == lucas) {
                System.out.println("Votou em Lucas");
                votosLucas++;
            }
            if (voto == alesandro) {
                System.out.println("Votou em Alessandro");
                votosAlesandro++;
            }

        }

        if (votosTaffe > votosRodrigo && votosTaffe > votosLucas && votosTaffe > votosAlesandro) {
            System.out.println("Taffe venceu");
        }else if (votosRodrigo > votosTaffe && votosRodrigo > votosLucas && votosRodrigo > votosAlesandro) {
            System.out.println("Rodrigo venceu");
        }else if (votosLucas > votosRodrigo && votosLucas > votosAlesandro && votosLucas > votosTaffe) {
            System.out.println("Lucas venceu");
        }else if (votosAlesandro > votosTaffe && votosAlesandro > votosRodrigo && votosAlesandro > votosLucas) {
            System.out.println("Alessandro venceu");
        }

    }
}











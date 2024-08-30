import java.util.Scanner;

/**
 * @Autor Leonardo
 * @since agosto 2024
 * Jogo da Adivinhação
 */



public class AppJogo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int magico, palpite;
        //Numero aleatorio entre 1 e 1000
        magico = (int) (Math.random() * 1000) + 1;
        int cont = 0;
        do {
            System.out.println("Digite o palpite " + (cont+1) + " entre [1 ... 1000]: ");
            palpite = Integer.parseInt(leitor.nextLine());
            cont++;

            //Verificando se acertou
            if (palpite == magico) {
                System.out.println("Parabéns... Você ganhou!!!");
                return; // Terminar o programa
            } else {
                if (palpite > magico) {
                    System.out.println("Seu palpite foi alto!");
                } else {
                    System.out.println("Seu palpite foi baixo!");
                }

            }
            if(cont == 10){
                System.out.println("A banca venceu... PUTZ, O numero era " + magico);
                return;
            }
        } while(true);

    }
}

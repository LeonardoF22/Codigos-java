package model;

import java.security.SecureRandom;
import java.util.Arrays;

public class MegaSena {
    private int[][] tabuleiro = new int[6][10];
    private int[] cartela = new int[6];

    //Definindo método construtor
    public MegaSena(){
        // Logica para gerar o tabuleiro 1  a 60
        int cont = 1;
        for (int i = 0; i < 6; i++) { // linha
            for (int j = 0; j < 10; j++) { // coluna
                tabuleiro[i][j] = cont++;
            }

        }
    }

    public void exibirVolante(){
        for (int i = 0; i < 6; i++) { // linha
            for (int j = 0; j < 10; j++) { // coluna
                System.out.printf("[%2d] ", tabuleiro[i][j]); // valor
            }
            System.out.println();
        }
    }
    public void gerarCartela(){
        SecureRandom numeros = new SecureRandom();
        for (int i = 0; i < 6; i++) {
            cartela[i] = numeros.nextInt(1,61);
        }
        //Exibir a cartela gerada
        Arrays.sort(cartela); // ordenando
        System.out.println("Jogue os numeros da sorte: ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("[%2d] ", cartela[i]);
        }
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}

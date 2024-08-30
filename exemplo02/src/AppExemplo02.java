import java.util.Scanner;

public class AppExemplo02 {
    public static void main(String[] args) {
        // Leitor é variavel objeto para leitura de dados do teclado
        Scanner leitor = new Scanner(System.in);
        int x, y;
        //Exibir mensagem na tela
        System.out.println("Digite o valor de X: ");
        // x recebe o numero inteiro digitado pelo usuario
        x = leitor.nextInt();
        // Exibir mensagem na tela
        System.out.println("Digite o valor de Y: ");
        // y recebe o numero inteiro digitado pelo usuario
        y = leitor.nextInt();
        // soma recebe o valor de x acrescentado ao valor de y
        int soma = x + y;
        // Exibe o resultado na tela
        System.out.println("Resultado: " + soma);
    }
}

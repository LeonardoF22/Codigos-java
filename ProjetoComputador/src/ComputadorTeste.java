import java.util.Scanner;

public class ComputadorTeste {
    public static void main(String[] args) {
        //Criando computador1
        Computador computador1 = new Computador();
        computador1.marca ="HP";
        computador1.modelo = "Novo";
        computador1.cor = "Branco";
        computador1.numeroSerie = 12346789;
        computador1.preco = 3500.00;
        computador1.imprimir();

        //Alterando o valor e imprimindo o novo preço
        computador1.calcularValor();
        computador1.imprimir();

        //Criando computador2
        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Velho";
        computador2.cor = "Branco";
        computador2.numeroSerie = 12121212;
        computador2.preco = 2000.0;
        computador2.imprimir();

        //Alterando o valor e imprimindo o novo preço
        computador2.calcularValor();
        computador2.imprimir();

        //Leitor da classe scanner
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o novo valor: ");
        // Recebo um texto com o valor e converto para o tipo double
        double valor = Double.parseDouble(leitor.nextLine());
        if(computador2.alterarValor(valor)){
            System.out.println("Preço alterado com sucesso!");
        } else {
            System.out.println("Preço deve ser positivo!");
        }
        computador2.imprimir();
    }
}

import java.util.Scanner;

public class ContaTeste {
    // Atributo
    public Conta cc = new Conta();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Objeto para usar a conta teste
        ContaTeste teste = new ContaTeste();
        int opcao = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1... Cadastrar Conta");
            System.out.println("2... Consultar Conta");
            System.out.println("3... Depositar na Conta");
            System.out.println("4... Sacar da Conta");
            System.out.println("9... Finalizar programa");
            System.out.println("Digite sua opção: ");

            opcao = Integer.parseInt(input.nextLine());
            switch(opcao){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execConsultar();
                    break;
                case 3   :
                    teste.execDepositar();
                    break;
                case 4:
                    teste.execSacar();
                    break;
                case 9:
                    System.out.println("Programa Encerrado");
                default:
                    System.out.println("Opção Invalida");
            }
        } while(opcao!=9);
    }

    public void execCadastrar(){
        Scanner nome = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        cc.nomeCliente = nome.nextLine();

        System.out.println("Digite a agência: ");
        Scanner agencia = new Scanner(System.in);
        cc.agencia = agencia.nextLine();

        System.out.println("Digite a conta: ");
        Scanner conta = new Scanner(System.in);
        cc.conta = conta.nextLine();

        System.out.println("Digite o valor para primeiro depósito: R$");
        Scanner saldo = new Scanner(System.in);
        double valor = Double.parseDouble(saldo.nextLine());
        cc.depositar(valor);
    }

    public void execConsultar(){
        cc.imprimir();
    }

    public void execSacar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor para sacar: R$");
        double valor = Double.parseDouble(input.nextLine());
        if(cc.sacar(valor) == true){
            System.out.println("Saque de R$"+ valor + " realizado com sucesso!");
        } else {
            System.out.println("O saque não pode ser realizado!");
        }
    }

    public void execDepositar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor para depositar: R$");
        double valor = Double.parseDouble(input.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito de R$"+ valor + " realizado com sucesso");
    }
}

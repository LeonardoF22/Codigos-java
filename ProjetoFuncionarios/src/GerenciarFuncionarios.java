import model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionarios {
    List<Funcionario> funcionarios;
    //Construtor personalizado
    public GerenciarFuncionarios(){
        funcionarios = new ArrayList<>();
        //Começar uma lista vazia
    }

    public static void main(String[] args) {
        GerenciarFuncionarios gerenciar = new GerenciarFuncionarios();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0; // Opção do menu
        do{
            System.out.println("Menu de operações");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Bonificar");
            System.out.println("4 - Inativar");
            System.out.println("5 - Listar todos");
            System.out.println("9 - Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            switch (opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execConsultar();
                    break;
                case 3:
                    gerenciar.execBonificar();
                    break;
                case 4:
                    gerenciar.execDesativar();
                    break;
                case 5:
                    gerenciar.execListarTodos();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 9);
    }

    public void execConsultar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o RG do funcionário a ser consultado: ");
        String rgProc = scanner.nextLine();
        // Varrer a lista a procura do rgProc
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getRg().equalsIgnoreCase(rgProc)){
                System.out.println(funcionario.listar());
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }

    public void execBonificar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o RG do funcionário a ser bonificado: ");
        String rgProc = scanner.nextLine();
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getRg().equalsIgnoreCase(rgProc)){
                double aumento;
                System.out.println("Digite o valor do aumento: ");
                aumento = Double.parseDouble(scanner.nextLine());
                funcionario.bonificar(aumento);
                System.out.println("Funcionário bonificado com sucesso!");
                return;
            }
            System.out.println("Funcionario não cadastrado!");
        }
    }

    public void execCadastrar(){
        // Pedir os dados para o usuario
        // Criar um objeto funcionario e atribuir esses dados
        // Em seguida colocar na lista
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Digite o nome do funcionário: ");;
        funcionario.setNome(scanner.nextLine());
        System.out.println("Digite o departamento do funcionário: ");
        funcionario.setDepartamento(scanner.nextLine());
        System.out.println("Digite o RG do funcionário: ");
        funcionario.setRg(scanner.nextLine());
        System.out.println("Digite o salário do funcionário: ");
        funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
        System.out.println("Funcionário cadastrado com sucesso!");
        funcionarios.add(funcionario); // Adicionando funcionário na lista
    }

    public void execListarTodos(){
        for (Funcionario funcionario : funcionarios){
            System.out.println(funcionario.listar());
        }
    }

    public void execDesativar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o rg do funcionario para deixa-lo inativo: ");
        String rgProc = scanner.nextLine();
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getRg().equalsIgnoreCase(rgProc)){
                funcionario.setAtivo(false);
                System.out.println("Funcionário Inativado!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado!");
    }
}

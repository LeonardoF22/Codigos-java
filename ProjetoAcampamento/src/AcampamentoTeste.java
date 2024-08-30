public class AcampamentoTeste {
    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        membro.nome = "Joãozinho";
        membro.idade = 16;

        //Invocar o método imprimir
        membro.imprimir();

        //Executando o método separarGrupo
        membro.separarGrupo();

        //Imprimindo com o grupo atribuido
        membro.imprimir();
    }
}

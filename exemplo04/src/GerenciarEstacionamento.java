import model.Carro;
import model.Pessoa;

import java.time.LocalDate;

public class GerenciarEstacionamento {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("Pulse");
        carro.setMarca("Fiat");
        carro.setCor("Prata");
        carro.setAnoFab(2023);

        Carro carro2 = new Carro();
        carro2.setModelo("Santa Fé");
        carro2.setMarca("Hyuindai");
        carro2.setCor("Branca");
        carro2.setAnoFab(2015);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Leonardo");
        pessoa.setDataAbertura(LocalDate.now());
        pessoa.setId(1);

        //Adicionar os dois carros a pessoa
        pessoa.adicionarCarro(carro);
        pessoa.adicionarCarro(carro2);


        System.out.println("Imprimindo -> Dados da pessoa");
        System.out.println(pessoa);


        //Mostrar dados dos carros da pessoa
        System.out.println("\nImprimindo os carros ->");
        System.out.println(pessoa.getCarrosDaPessoa());
    }
}

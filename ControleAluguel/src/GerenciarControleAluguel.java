import model.Aluguel;
import model.Caminhao;
import model.Carro;
import model.Moto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControleAluguel {
    public static void main(String[] args) throws InterruptedException {
        Carro carro1 = new Carro();
        carro1.setPlaca("ABC1234");
        carro1.setModelo("Uno");
        carro1.setMarca("Fiat");
        carro1.setAno(2020);
        carro1.setCor("Branco");
        carro1.setNumeroPortas(2);

        Moto moto1 = new Moto();
        moto1.setPlaca("XYZ9876");
        moto1.setModelo("CG");
        moto1.setMarca("Honda");
        moto1.setAno(2021);
        moto1.setCor("Branca");

        Caminhao caminhao1 = new Caminhao();
        caminhao1.setPlaca("DEF5678");
        caminhao1.setModelo("FH");
        caminhao1.setMarca("Volvo");
        caminhao1.setAno(2019);
        caminhao1.setCor("Prata");

        Aluguel aluguel1 = new Aluguel();
        aluguel1.setIdAluguel(1);
        aluguel1.setVeiculo(carro1);
        aluguel1.setDataAluguel(LocalDate.now());
        aluguel1.setHoraAluguel(LocalDateTime.now());
        aluguel1.setHoraDevolucao(LocalDateTime.now().plusHours(2));

        Aluguel aluguel2 = new Aluguel();
        aluguel2.setIdAluguel(2);
        aluguel2.setVeiculo(moto1);
        aluguel2.setHoraAluguel(LocalDateTime.now());
        aluguel2.setDataAluguel(LocalDate.now());
        aluguel2.setHoraDevolucao(LocalDateTime.now().plusHours(1));

        Aluguel aluguel3 = new Aluguel();
        aluguel3.setIdAluguel(3);
        aluguel3.setVeiculo(caminhao1);
        aluguel3.setDataAluguel(LocalDate.now());
        aluguel3.setHoraAluguel(LocalDateTime.now());
        aluguel3.setHoraDevolucao(LocalDateTime.now().plusHours(6));

        System.out.println(aluguel1.apresentarAluguel() + "\n");
        Thread.sleep(3000);
        System.out.println(aluguel2.apresentarAluguel() + "\n");
        Thread.sleep(3000);
        System.out.println(aluguel3.apresentarAluguel());
    }
}

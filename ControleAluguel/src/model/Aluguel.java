package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aluguel {
    private int idAluguel;
    private Veiculo veiculo;
    private LocalDate dataAluguel;
    private LocalDateTime horaAluguel;
    private LocalDateTime horaDevolucao;

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDateTime getHoraAluguel() {
        return horaAluguel;
    }

    public void setHoraAluguel(LocalDateTime horaAluguel) {
        this.horaAluguel = horaAluguel;
    }

    public LocalDateTime getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(LocalDateTime horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public String apresentarAluguel(){
        return  "Dados do aluguel" + "\n" +
                "Tipo de Veiculo: " + veiculo.getClass().getSimpleName() + "\n" +
                "Placa: " + veiculo.getPlaca() + "\n" +
                "Marca: " + veiculo.getMarca() + "\n" +
                "Modelo: " + veiculo.getModelo() + "\n" +
                "Ano: " + veiculo.getAno() + "\n" +
                "Cor: " + veiculo.getCor() + "\n" +
                "Data do aluguel: " + getDataAluguel() + "\n" +
                "Horario do Aluguel: " + getHoraAluguel().format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "\n" +
                "Horario de devolução: " + getHoraDevolucao().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
}

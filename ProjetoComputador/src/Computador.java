public class Computador {
    // Atributos
    public String marca;
    public String cor;
    public String modelo;
    public long numeroSerie;
    public double preco;

    // Métodos
    public void imprimir(){
        System.out.println("Marca = " + marca);
        System.out.println("Cor = " + cor);
        System.out.println("Modelo = " + modelo);
        System.out.println("Numero de serie = " + numeroSerie);
        System.out.println("Preço = " + preco);
        System.out.println("\n");
    }
    public void calcularValor(){
        if (marca.equalsIgnoreCase("HP")) { //Ignora o modo que HP foi escrito ex "HP", "Hp", "hP" ou "hp"
            preco = preco + (preco * 30 / 100); // Ou preco *= 1.3
            return;
        }
        if (marca.equalsIgnoreCase("IBM")){
            preco = preco + (preco * 50 / 100); // Ou preco *= 1.5
        }
    }
    public boolean alterarValor(double valor){
        if(valor > 0){
            preco = valor;
            return true;
        } else {
            return false;
        }
    }
}

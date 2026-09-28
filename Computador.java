public class Computador 
{
    private String processador;
    private double capacidadeProcessador;
    private int memoriaRAM;
    private double preco;

    public Computador(String processador, double capacidadeProcessador, int memoriaRAM, double preco) {
        this.processador = processador;
        this.capacidadeProcessador = capacidadeProcessador;
        this.memoriaRAM = memoriaRAM;
        this.preco = preco;
    }

    public double getCapacidadeProcessador() {
        return capacidadeProcessador;
    }

    public void setCapacidadeProcessador(double capacidadeProcessador) {
        this.capacidadeProcessador = capacidadeProcessador;
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public double getPreco() {
        return preco;
    }
}
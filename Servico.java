import java.util.ArrayList;
public class Servico {

    private String nomeServico;
    private int tempoEstimado; // 
    private double valor;
    private String categoria;
    

    public Servico(String nomeServico, int tempoEstimado, double valor, String categoria) {

        this.nomeServico = nomeServico;
        this.tempoEstimado = tempoEstimado;
        this.valor = valor;
        this.categoria = categoria;

    }
    public String getNomeServico() {
        return nomeServico;
    }
    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }
    public int getTempoEstimado() {
        return tempoEstimado;
    }
    public void setTempoEstimado(int tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    
}

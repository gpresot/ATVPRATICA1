import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class OrdemServico {

    private int codigo;
    private String nomeCliente;
    private String modeloVeic;
    private String placaVeic;
    private LocalDate data;
    private String statusServic;
    
    public int getCodigo() {
        return codigo;
    }


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public String getModeloVeic() {
        return modeloVeic;
    }


    public void setModeloVeic(String modeloVeic) {
        this.modeloVeic = modeloVeic;
    }


    public String getPlacaVeic() {
        return placaVeic;
    }


    public void setPlacaVeic(String placaVeic) {
        this.placaVeic = placaVeic;
    }


    public LocalDate getData() {
        return data;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }


    public String getStatusServic() {
        return statusServic;
    }


    public void setStatusServic(String statusServic) {
        this.statusServic = statusServic;
    }


    private ArrayList<Servico> ordemServico = new ArrayList<>();


    public OrdemServico(int codigo, String nomeCliente, String modeloVeic, String placaVeic, LocalDate data,
            String statusServic) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.modeloVeic = modeloVeic;
        this.placaVeic = placaVeic;
        this.data = data;
        this.statusServic = statusServic;
    }


    public void cadastrarOrdemServico(Servico servico){

        ordemServico.add(servico);

    }
}

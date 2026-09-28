public class Box {

    private Mecanico mecanicoResp;
    private int numero;
    private String tipoServico;
    private int capcMax;
    private String localizacao;

    public Box(Mecanico mecanicoResp, int numero, String tipoServico, int capcMax, String localizacao) {
        
        this.mecanicoResp = mecanicoResp;
        this.numero = numero;
        this.tipoServico = tipoServico;
        this.capcMax = capcMax;
        this.localizacao = localizacao;

    }
    public Mecanico getMecanicoResp() {

        return mecanicoResp;

    }
    public void setMecanicoResp(Mecanico mecanicoResp) {

        this.mecanicoResp = mecanicoResp;

    }
    public int getNumero() {

        return numero;

    }
    public void setNumero(int numero) {

        this.numero = numero;

    }
    public String getTipoServico() {

        return tipoServico;
        
    }
    public void setTipoServico(String tipoServico) {

        this.tipoServico = tipoServico;

    }
    public int getCapcMax() {

        return capcMax;

    }
    public void setCapcMax(int capcMax) {
        
        this.capcMax = capcMax;

    }
    public String getLocalizacao() {

        return localizacao;

    }
    public void setLocalizacao(String localizacao) {

        this.localizacao = localizacao;

    }


}

public class Servico extends Comercio{
    private String tipoServico;

    public Servico(String nome, String endereco, String telefone, String horarioFuncionamento, String tipoServico) {
        super(nome, endereco, telefone, horarioFuncionamento);
        this.tipoServico = tipoServico;
    }

    public String getTipoServico() {
        return this.tipoServico;
    }


    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public String toString() {
        return super.toString() + "\nTipo de Serviço: " + this.tipoServico + "\n";
    }
}

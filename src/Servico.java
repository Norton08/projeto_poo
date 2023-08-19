import java.util.ArrayList;

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
        return "--------------------------" +
                    "Tipo: Serviço"  +
                "--------------------------\n" +
                "Código: " + getCodigo() + "\n" +
                "Nome: " + getNome() +  "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Horário de Funcionamento: " + getHorarioFuncionamento() + "\n" +
                "Tipo de Produto: " + getTipoServico();
    }
}

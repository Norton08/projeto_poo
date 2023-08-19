import java.util.ArrayList;

public class Alimenticio extends Comercio  {
    private String tipoComida;

    public Alimenticio(String nome, String endereco, String telefone, String horarioFuncionamento, String tipoComida) {
        super(nome, endereco, telefone, horarioFuncionamento);
        this.tipoComida = tipoComida;
    }

    public String getTipoComida() {
        return this.tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String toString() {
        return "--------------------------" +
                    "Tipo: Alimentício"  +
                "--------------------------\n" +
                "Código: " + getCodigo() + "\n" +
                "Nome: " + getNome() +  "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Horário de Funcionamento: " + getHorarioFuncionamento() + "\n" +
                "Tipo de Produto: " + getTipoComida() + "\n";
    }
}


public class Alimenticio extends Comercio {
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
                "Código: " + this.getCodigo() + "\n" +
                "Nome: " + this.getNome() +  "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "Telefone: " + this.getTelefone() + "\n" +
                "Horário de Funcionamento: " + this.getHorarioFuncionamento() + "\n" +
                "Tipo de Produto: " + this.tipoComida + "\n";
    }
}

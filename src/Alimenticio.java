public class Alimenticio extends Comercio{
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
        return super.toString() + "\nTipo de Comida: " + this.tipoComida + "\n";
    }
}

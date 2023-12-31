import java.util.ArrayList;

public class Fabrica extends Comercio {
    private String tipoProduto;
    private String setor;

    public Fabrica(String nome, String endereco, String telefone, String horarioFuncionamento, String tipoProduto, String setor) {
        super(nome,  endereco,  telefone,  horarioFuncionamento);
        this.tipoProduto = tipoProduto;
        this.setor = setor;
    }

    public String getTipoProduto() {
        return this.tipoProduto;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String toString() {
        return  "--------------------------" +
                      "Tipo: Fábrica"  +
                "--------------------------\n" +
                "Código: " + getCodigo() + "\n" +
                "Nome: " + getNome() +  "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Telefone: " + getTelefone() + "\n" +
                "Horário de Funcionamento: " + getHorarioFuncionamento() + "\n" +
                "Tipo de Produto: " + getTipoProduto() + "\n" +
                "Setor: " + getSetor() + "\n";
    }
}

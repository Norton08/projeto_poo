public class Fabril extends Comercio{
    private String tipoProduto;
    private String setor;

    public Fabril(String nome, String endereco, String telefone, String horarioFuncionamento, String tipoProduto, String setor) {
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
        return super.toString() + "\nTipo de Produto: " + this.tipoProduto + "\nTipo de Serviço: " + this.setor + "\n";
    }
}

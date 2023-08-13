public abstract class Comercio {
    private String nome;
    private String endereco;
    private String telefone;
    private String horarioFuncionamento;

    public Comercio(String nome, String endereco, String telefone, String horarioFuncionamento) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getHorarioFuncionamento() {
        return this.horarioFuncionamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nEndereço: " + this.endereco + "\nTelefone: " + this.telefone + "\nHorário de Funcionamento: " + this.horarioFuncionamento;
    }

}
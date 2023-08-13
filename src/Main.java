import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Comercio> comercios = new ArrayList<Comercio>();
        //read "comercios.txt" if exists else create "comercios.txt"
        try { Arquivo.ler("C:\\GITHUB\\projeto_poo\\src\\comercios.txt"); }
        catch (Exception e) { Arquivo.escrever("C:\\GITHUB\\projeto_poo\\src\\comercios.txt", ""); }
        //sistema de listagem de comercios sendo comercio dos tipos Alimenticio, Serviços e Fabil com CRUD completo
        JMenuItem cadastrar = new JMenuItem("Cadastrar");
        JMenuItem listar = new JMenuItem("Listar");
        JMenuItem atualizar = new JMenuItem("Atualizar");
        JMenuItem excluir = new JMenuItem("Excluir");
        JMenuItem sair = new JMenuItem("Sair");
        JMenu menu = new JMenu("Menu");
        menu.add(cadastrar);
        menu.add(listar);
        menu.add(atualizar);
        menu.add(excluir);
        menu.add(sair);
        JMenuBar barra = new JMenuBar();
        barra.add(menu);
        JFrame janela = new JFrame("Comércios");
        janela.setJMenuBar(barra);
        janela.setSize(250, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        cadastrar.addActionListener(e -> {
            String[] tipos = {"Alimentício", "Serviço", "Fábrica"};
            String tipo = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de comércio", "Tipo de comércio", JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);
            if (tipo == "Alimentício") {
                String nome = JOptionPane.showInputDialog("Nome do comércio");
                String endereco = JOptionPane.showInputDialog("Endereço do comércio");
                String telefone = JOptionPane.showInputDialog("Telefone do comércio");
                String horarioFuncionamento = JOptionPane.showInputDialog("Horário de funcionamento do comércio");
                String tipoComida = JOptionPane.showInputDialog("Tipo de comida do comércio");
                Alimenticio comercio = new Alimenticio(nome, endereco, telefone, horarioFuncionamento, tipoComida);
                comercios.add(comercio);
                Arquivo.escrever("C:\\GITHUB\\projeto_poo\\src\\comercios.txt", comercio.toString());
            } else if (tipo == "Serviço") {
                String nome = JOptionPane.showInputDialog("Nome do comércio");
                String endereco = JOptionPane.showInputDialog("Endereço do comércio");
                String telefone = JOptionPane.showInputDialog("Telefone do comércio");
                String horarioFuncionamento = JOptionPane.showInputDialog("Horário de funcionamento do comércio");
                String tipoServico = JOptionPane.showInputDialog("Tipo de serviço do comércio");
                Servico comercio = new Servico(nome, endereco, telefone, horarioFuncionamento, tipoServico);
                comercios.add(comercio);
                Arquivo.escrever("C:\\GITHUB\\projeto_poo\\src\\comercios.txt", comercio.toString());
            } else if (tipo == "Fábrica") {
                String nome = JOptionPane.showInputDialog("Nome do comércio");
                String endereco = JOptionPane.showInputDialog("Endereço do comércio");
                String telefone = JOptionPane.showInputDialog("Telefone do comércio");
                String horarioFuncionamento = JOptionPane.showInputDialog("Horário de funcionamento do comércio");
                String tipoProduto = JOptionPane.showInputDialog("Tipo de produto do comércio");
                String setor = JOptionPane.showInputDialog("Setor do comércio");
                Fabrica comercio = new Fabrica(nome, endereco, telefone, horarioFuncionamento, tipoProduto, setor);
                comercios.add(comercio);
                Arquivo.escrever("C:\\GITHUB\\projeto_poo\\src\\comercios.txt", comercio.toString());
            }
        });
    }
}

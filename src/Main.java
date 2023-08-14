import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main (String [] args){
        Main main = new Main();
        main.menuComercios();
    }

    public void salvaComercio(ArrayList<Comercio> comercios){
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream
                    (new FileOutputStream("C:\\Users\\norto\\IdeaProjects\\projeto_poo\\src\\Comercios.txt"));
            for (int i=0; i < comercios.size(); i++)
                outputStream.writeObject(comercios.get(i));
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Impossível criar arquivo!");
            ex.printStackTrace();
            throw new RuntimeException("File can't be created!");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {  //Close the ObjectOutputStream
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @SuppressWarnings("finally")
    public ArrayList<Comercio> recuperaComercios(){
        ArrayList<Comercio> comercios = new ArrayList<Comercio>();

        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream
                    (new FileInputStream("C:\\Users\\norto\\IdeaProjects\\projeto_poo\\src\\Comercios.txt"));
            Object obj = null;
            while ((obj = inputStream.readObject()) != null) {
                if (obj instanceof Comercio) {
                    comercios.add((Comercio) obj);
                }
            }
        } catch (EOFException ex) { // when EOF is reached
            System.out.println("End of file reached.");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Arquivo com produtos NÃO existe!");
            ex.printStackTrace();
            throw new RuntimeException("File doesn't exists!");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {  //Close the ObjectInputStream
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
            return comercios;
        }
    }

    public void menuComercios(){
        ArrayList<Comercio> comercios = new ArrayList<>();

        String menu = "";
        String entrada;
        int opc1, opc2;

        do {
            menu = "Entrada de Dados\n" +
                    "Opções:\n\n" +
                    "1. INCLUIR \n" +
                    "2. LISTAR \n" +
                    "3. EXCLUIR\n" +
                    "4. SALVAR \n" +
                    "5. RECUPERAR ARQUIVO \n" +
                    "6. ALTERAR \n" +
                    "7. CONSULTAR \n" +
                    "9. SAIR";
            entrada = JOptionPane.showInputDialog (menu + "\n\n");

            if (entrada == null){
                entrada = "9";
                opc1 = Integer.parseInt(entrada);
            }

            while (!numeroInteiroValido(entrada)) {
                entrada = JOptionPane.showInputDialog(null, menu +
                        "\n\nEntrada inválida! Digite um número inteiro.");
            }
            opc1 = Integer.parseInt(entrada);

            switch (opc1) {
                case 1:// Entrar dados
                    menu = "Entrada de Atletas\n" +
                            "Opções:\n" +
                            "1. Alimentício\n" +
                            "2. Serviço\n" +
                            "3. Fábrica\n";
                    entrada = JOptionPane.showInputDialog (menu + "\n\n");

                    while (!numeroInteiroValido(entrada)) {
                        entrada = JOptionPane.showInputDialog(null, menu +
                                "\n\nEntrada inválida! Digite um número inteiro.");
                    }
                    opc2 = Integer.parseInt(entrada);

                    switch (opc2){
                        case 1: comercios.add((Comercio) leComercio(opc2));
                            break;
                        case 2: comercios.add((Comercio) leComercio(opc2));
                            break;
                        case 3: comercios.add((Comercio) leComercio(opc2));
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Comércio para entrada NÃO escolhido!");
                    }

                    break;
                case 2: // Exibir dados
                    if (comercios.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Entre com comércios primeiramente");
                        break;
                    }
                    String dados = "";
                    for (int i=0; i < comercios.size(); i++) {
                        dados += comercios.get(i).toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null,dados);
                    break;
                case 3: // Limpar Dados
                    if (comercios.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Entre com comércios primeiramente");
                        break;
                    }
                    comercios.clear();
                    JOptionPane.showMessageDialog(null,"Dados LIMPOS com sucesso!");
                    break;
                case 4: // Grava Dados
                    if (comercios.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Entre com comércios primeiramente");
                        break;
                    }
                    salvaComercio(comercios);
                    JOptionPane.showMessageDialog
                            (null,"Dados SALVOS com sucesso!");
                    break;
                case 5: // Recupera Dados
                    comercios = recuperaComercios();
                    if (comercios.size() == 0) {
                        JOptionPane.showMessageDialog(null,"Sem dados para apresentar.");
                        break;
                    }
                    JOptionPane.showMessageDialog(null,"Dados RECUPERADOS com sucesso!");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Fim do aplicativo Cadastro de Comércio");
                    break;
            }
        } while (opc1 != 9);
    }

    public String[] leValores (String [] dadosIn){
        String [] dadosOut = new String [dadosIn.length];

        for (int i = 0; i < dadosIn.length; i++){
            if(dadosIn[i] != null)
                dadosOut[i] = JOptionPane.showInputDialog  ("Entre com " + dadosIn[i]+ ": ");
            else
                break;
        }

        return dadosOut;
    }

    public Object leComercio(int tipoComercio) {

        String[] atributos = new String[6];
        String[] nomeVal = new String[6];
        nomeVal[0] = "Nome";
        nomeVal[1] = "Endereço";
        nomeVal[2] = "Telefone";
        nomeVal[3] = "Horário de Funcionamento do Comércio";

        if (tipoComercio == 1) {
            nomeVal[4] = "Tipo de Comida";
            atributos = leValores(nomeVal);
            Alimenticio alimenticio = new Alimenticio(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4]);
            return alimenticio;
        } else if (tipoComercio == 2) {
            nomeVal[4] = "Tipo de Serviço";
            atributos = leValores(nomeVal);
            Servico servico = new Servico(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4]);
            return servico;
        } else {
            nomeVal[4] = "Tipo de Produto";
            nomeVal[5] = "Setor";
            atributos = leValores(nomeVal);
            Fabrica fabrica = new Fabrica(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4], atributos[5]);
            return fabrica;
        }
    }

    private boolean numeroInteiroValido(String s) {
        boolean resultado;
        try {
            Integer.parseInt(s);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return resultado;
    }
}

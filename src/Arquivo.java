import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Arquivo {
    public static String ler(String Caminho){
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: Arquivo não encontrado!");
            return "";
        }
    }

    public static boolean escrever(String Caminho,String Texto){
        try {
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static String Atualizar(String Caminho, String Texto){
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erro: Arquivo não encontrado!");
            return "";
        }
    }

    public static String Delete(String Caminho, String Texto){
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                javax.swing.JOptionPane.showMessageDialog(null, "Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Erro: Arquivo não encontrado!");
            return "";
        }
    }

}
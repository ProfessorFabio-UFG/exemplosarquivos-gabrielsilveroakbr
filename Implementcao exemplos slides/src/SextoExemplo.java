import java.io.*;
import javax.swing.*;
public class SextoExemplo {
    public static void main(String[] args){
         try{
             File diretorio = new File("c:\\Digitados");
             diretorio.mkdir();
             File arquivo = new File(diretorio,"Texto.txt");
             if(!arquivo.exists()){
                 arquivo.createNewFile();
             }
             // Cria com a referência para o arquivo físico de gravação
             FileWriter fw = new FileWriter(arquivo);
             // Abre um fluxo associado ao arquivo
             PrintWriter pw = new PrintWriter(fw);
             // para cada linha digitada, grava a linha no arquivo
             String linha = JOptionPane.showInputDialog("linha:");
             while(!linha.equals("fim") ){
                 pw.println(linha); // Escreve no arquivo
                 pw.flush(); // Confirma a gravação
                 linha = JOptionPane.showInputDialog("linha:");
             }
             pw.close(); // fecha o fluxo de impressão
         }catch (IOException e){
             throw new RuntimeException(e);
         }
    }
}

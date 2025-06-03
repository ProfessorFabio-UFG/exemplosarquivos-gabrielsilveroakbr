import java.io.*;
import javax.swing.*;
public class QuintoExemplo {
    public static void main(String[] args){
        // Cria objeto para utilizar a escolha de arquivos
        JFileChooser fc = new JFileChooser(); //Bem legal a GUI
// Mostra a janela de dialogo para escolha do arquivo
        int result = fc.showOpenDialog(null);
// Verifica se foi selecionada a opção Cancela da janela
        if (result == JFileChooser.CANCEL_OPTION)
            System.exit(0);
        else {
            // Cria objeto com referência para o arquivo físico selecionado
            File farqEnt = fc.getSelectedFile();
            try {
                // Abre o arquivo para Leitura
                FileReader f = new FileReader(farqEnt);
                // Classe BufferedReader permite a leitura linha a linha
                BufferedReader in = new BufferedReader(f);
                // Lê linha a linha e mostra na console
                String linha = in.readLine();
                while(linha !=null ){
                    System.out.println(linha);
                    linha = in.readLine();
                }
                in.close();
            } catch (Exception e) { System.out.println(e); }
        }

    }
}

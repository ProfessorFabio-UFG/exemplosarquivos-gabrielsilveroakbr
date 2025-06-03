import java.io.*;
public class SegundoExemplo {
    public static void main(String[] args){
        try{
            File diretorio = new File("c:\\Sopa");
            diretorio.mkdir();
            // Cria um objeto com referência para o arquivo “lixo.txt”
            File arquivo = new File( diretorio, "lixo.txt");
            // Cria um objeto out associando ao arquivo um fluxo de saída
            FileOutputStream out = new FileOutputStream(arquivo);
            // grava “lixo” no arquivo
            out.write( new byte[]{ 'l', 'i', 'x', 'o'} );
            File subdir = new File( diretorio, "subdir");
            subdir.mkdir(); // cria o diretório c:\tmp\subdir
            String[] arquivos = diretorio.list();
            for (int i =0;i<arquivos.length; i++) { // lista o diretório
                File filho = new File( diretorio, arquivos[ i]);
                System. out. println(filho.getAbsolutePath());
            }
            if (arquivo.exists()) { // verifica se o arquivo existe
                arquivo.delete(); // e o deleta
            }
            out.close();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}

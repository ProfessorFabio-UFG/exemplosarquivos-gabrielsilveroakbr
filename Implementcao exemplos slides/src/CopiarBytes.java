import java.io.*;
public class CopiarBytes {
    public static void main(String[] args){
        try{
            File diretorio = new File("c:\\Copiador");
            diretorio.mkdir();
            File oi = new File(diretorio,"oi.txt");
            File ola = new File(diretorio,"ola.txt");
            if(!oi.exists()){
                oi.createNewFile();
            }
            if(!ola.exists()){
                ola.createNewFile();
            }
            FileReader arquivodeentrada = new FileReader(oi);
            FileWriter arquivodesaida = new FileWriter(ola);
            BufferedReader entrada = new BufferedReader(arquivodeentrada);
            PrintWriter saida = new PrintWriter(arquivodesaida);
            String s;
            while ((s = entrada.readLine()) != null)
                saida.println(s);
            saida.flush();
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}

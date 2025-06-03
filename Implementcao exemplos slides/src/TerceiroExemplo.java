import java.io.*;
public class TerceiroExemplo {
    public static void main(String[] args){
        try{
            System.out.print("Digite o texto");
            // Cria um objeto f0 associando ao arquivo um fluxo de saída
            FileOutputStream f0 = new FileOutputStream("c:\\Sopa\\Saida0.txt");
            // Leitura de 1 byte do console padrão – teclado
            byte a = (byte)System.in.read();
            while(a!='\n'){
                f0.write(a);
                a=(byte)System.in.read();
            }
            /* Arquivo Saida0.txt terá o conteúdo digitado no teclado.*/
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class CopyBytes {

    static double soma(Scanner scanner) {
          double a = scanner.nextDouble();
          double b = scanner.nextDouble();

          return a + b;
    }

    public static void main(String[] args) throws IOException {
        
        int pares = 2;

        try {

            // in = new FileInputStream("arquivo_de_entrada.txt");
            // out = new FileOutputStream("arquivo_de.txt");
            PrintWriter saida;
            Scanner scanner = new Scanner(new FileReader(args[0]));
            if (args.length < 2) {
                saida = new PrintWriter(System.out);
            } else {
                saida = new PrintWriter(new FileWriter(args[1]));
            }

            for(int i = 0; i < pares; i++){
                saida.println(soma(scanner));
            }
            scanner.close();
            saida.close();

        } catch (FileSystemNotFoundException e){
            System.out.println("ARQUIVO DE ENTRADA NAO ENCONTRADO");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("ARQUIVO DE SAIDA NAO PODE SER CRIADO");
            e.printStackTrace();
        }
        
    }
}

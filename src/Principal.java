import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite seu cep:");
        var cep = scanner.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.geraJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cep = "";
        System.out.print("Insira o CEP a ser pesquisado: ");
        cep = scanner.nextLine().replace(".", "");
        cep = cep.replace("-", "");
        BuscarEndereco buscarEndereco = new BuscarEndereco();
        Endereco endereco = buscarEndereco.buscarEndereco(cep);
        System.out.println(endereco);
        GerarArquivoJson geradorDeJson = new GerarArquivoJson();
        geradorDeJson.gerarJson(endereco);
    }
}
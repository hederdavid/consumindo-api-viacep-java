import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;


public class GerarArquivoJson {

    public void gerarJson(Endereco endereco) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(endereco);
        try (FileWriter writer = new FileWriter(endereco.getCep() + ".json")) {
            writer.write(json);
            System.out.println("JSON gravado com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever o JSON no arquivo: " + e.getMessage());
        }
    }
}

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateFile {
    String nomeMod;
    String nomeItem;
    String nomeArquivo;

    public CreateFile(String nomeMod, String nomeItem) {
        this.nomeMod = nomeMod;
        this.nomeItem = nomeItem;
    }

    protected void writeFile(String[] texto, String nomeArquivo) {
        try(BufferedWriter arquivo = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for(String linha : texto) {
                arquivo.write(linha);
                arquivo.newLine();
            }
        } catch (Exception e) {
            System.out.println("Moiô: " + e);
        }
    }
}

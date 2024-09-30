import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateItem extends CreateFile {

    public CreateItem(String nomeMod, String nomeItem) {
        super(nomeMod, nomeItem);
        nomeArquivo = "assets/"+ nomeMod + "/models/items/" + nomeItem + ".json";
    }
    
    public void createGenericItem() {
        String[] texto = {
            "{",
            "   \"parent\": \"item/generated\",",
            "   \"textures\": {",
            "       \"layer0\": \"" + nomeMod + ":item/" + nomeItem + "\"",
            "   }",
            "}"
        };
        
        writeFile(texto, nomeArquivo);
    }

    public void createToolItem() {
        String[] texto = {
            "{",
            "   \"parent\": \"minecraft:item/handheld\",",
            "   \"textures\": {",
            "       \"layer0\": \"" + nomeMod + ":item/" + nomeItem + "\"",
            "   }",
            "}"
        };

        writeFile(texto, nomeArquivo);
    }
}

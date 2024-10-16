public class CreateBlock extends CreateFile {

    public CreateBlock(String nomeMod, String nomeItem) {
        super(nomeMod, nomeItem);
        nomeArquivo = "assets/" + nomeMod + "/models/blocks/" + nomeItem + ".json";
    }

    public void createBlockItem() {
        String[] texto = {
            "{",
            "   \"parent\": \"" + nomeMod + ":block/" + nomeItem + "\"",
            "}"
        };

        createBlockState();
        writeFile(texto, nomeArquivo);
    }

    private void createBlockState() {
        String nomeArquivo = "assets/" + nomeMod + "/blockstates/" + nomeItem + ".json";
        String[] texto = {
            "{",
            "   \"variants\": {",
            "       \"\": {",
            "           \"model\": \"" + nomeMod + ":block/" + nomeItem + "\"",
            "       }",
            "   }",
            "}"
        };

        writeFile(texto, nomeArquivo);
    }
}

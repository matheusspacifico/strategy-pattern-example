package compression;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arquivos = Arrays.asList("foto.png", "documento.txt", "apresentacao.pptx");

        FileCompressor compressor = new FileCompressor();

        // Usando a estratégia ZIP
        compressor.setStrategy(new ZipCompression());
        compressor.compressFiles(arquivos, "meus_arquivos.zip");

        // Mudando para a estratégia RAR
        compressor.setStrategy(new RarCompression());
        compressor.compressFiles(arquivos, "meus_arquivos.rar");
    }
}
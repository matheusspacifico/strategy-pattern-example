package compression;

import java.util.List;

public class RarCompression implements CompressionStrategy {
    @Override
    public void compress(List<String> files, String outputFile) {
        System.out.println("Comprimindo arquivos em RAR: " + outputFile);
        // Lógica real de compressão seria implementada aqui
    }
}
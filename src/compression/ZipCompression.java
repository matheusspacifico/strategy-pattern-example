package compression;

import java.util.List;

public class ZipCompression implements CompressionStrategy {
    @Override
    public void compress(List<String> files, String outputFile) {
        System.out.println("Comprimindo arquivos em ZIP: " + outputFile);
        // Lógica real de compressão seria implementada aqui
    }
}
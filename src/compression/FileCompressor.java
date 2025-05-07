package compression;

import java.util.List;
import java.util.Objects;

public class FileCompressor {
    private CompressionStrategy strategy;

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compressFiles(List<String> files, String outputFile) {
        Objects.requireNonNull(strategy, "Compression strategy must be set before execution.");
        strategy.compress(files, outputFile);
    }
}
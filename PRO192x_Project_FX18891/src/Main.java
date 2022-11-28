import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        load("texts.txt");
    }
    public static void load (String filename) throws IOException {
        Path file = FileSystems.getDefault().getPath("", filename);
        List<String> lines = Files.readAllLines(file);
        lines.forEach(System.out::println);
    }

}

import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilePathTest {

    @Test
    public void testFileExists_CrossPlatform() {
        // REFACTOR: Sử dụng Path.of (Java 11+) hoặc Paths.get để tự động xử lý separator
        Path filePath = Paths.get("src", "test", "resources", "config.txt");

        // Sử dụng Files.exists của NIO thay vì File.exists
        assertTrue(Files.exists(filePath), "File cấu hình phải tồn tại trên mọi OS!");
    }
}
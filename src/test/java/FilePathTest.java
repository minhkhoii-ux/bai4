import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilePathTest {

    @Test
    public void testFileExists_CrossPlatform() {
        // Xóa dòng đường dẫn bị hardcode lỗi đi và thay bằng dòng này:
        Path filePath = Paths.get("src", "test", "resources", "config.txt");

        // Kiểm tra file tồn tại
        assertTrue(Files.exists(filePath), "File cấu hình phải tồn tại trên mọi OS!");
    }
}
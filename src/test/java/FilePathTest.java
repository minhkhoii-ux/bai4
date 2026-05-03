import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilePathTest {

    @Test
    public void testFileExists_HardcodedPath() {
        // CỐ TÌNH LỖI: Cố định đường dẫn theo kiểu Windows
        String filePath = "src\\test\\resources\\config.txt";
        File file = new File(filePath);

        // Kiểm tra xem file có tồn tại không
        assertTrue(file.exists(), "File cấu hình phải tồn tại!");
    }
}
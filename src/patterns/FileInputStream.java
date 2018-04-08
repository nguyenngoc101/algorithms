package patterns;

public class FileInputStream implements InputStream {

    String filePath;

    public FileInputStream(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public int read(byte[] buffer, int offset, int length) {
        return 0;
    }
}

import java.io.File;
import java.io.IOException;

class Ls {
    public static void main(String[] args) throws IOException {
        File d = new File(".");
        for (File f : d.listFiles()) {
            System.out.printf("%s: %b\n", f.getName(), f.exists());
        }
    }
}

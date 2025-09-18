import java.io.File;
import java.io.FileReader;

class fileReader {
    public static void main(String asd[]) throws Exception {
        FileReader fr = new FileReader(new File(asd[0]));
        int i = fr.read();
        while (i != -1) {
            System.out.print((char) i);
            i = fr.read();
        }
        fr.close();  // Good practice to close the FileReader
    }
}

package textfiles;
import java.io.IOException;

/**
 * Created by zacha on 2/1/2017.
 */
public class Student {
    public static void main(String[] args) throws IOException {
        String fileName= "TestFile1";

        try{
            ReadFile file = new ReadFile(fileName);
            String[] arrayLines = file.OpenFile();

            int i;
            for (i=0; i < arrayLines.length; i++) {
                System.out.println(arrayLines[i]);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage() );
        }

    }
}

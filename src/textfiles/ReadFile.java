package textfiles;
import java.io.*;

/**
 * Created by zacha on 2/1/2017.
 */
public class ReadFile {
private String path;
    public ReadFile(String filePush) {
        path = filePush;
    }
    public String[] OpenFile() throws IOException{
       FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        int numberOfLines= 3;
        String[] textData = new String[numberOfLines];
        int i;
        for (i = 0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }
        textReader.close();
        return textData;
    }
    int readLines() throws IOException {
        FileReader fileToRead = new FileReader(path);
        BufferedReader bf = new BufferedReader(fileToRead);
        String Line;
        int numberOfLines = 0;
        while ((Line =bf.readLine()) !=null) {
            numberOfLines++;
        }
        bf.close();
        return numberOfLines;
    }
}


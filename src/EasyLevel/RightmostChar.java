package EasyLevel;

import java.io.*;

public class RightmostChar {

    public static void findRightmostChar(String line) {
        String[] info = line.split(",");
        String phrase = info[0];
        String character = info[1];

        System.out.println(phrase.lastIndexOf(character));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        while((line = reader.readLine()) != null)
        {
            findRightmostChar(line.trim());
        }
    }

}

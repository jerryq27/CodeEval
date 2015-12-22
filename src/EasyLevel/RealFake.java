package EasyLevel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RealFake {

    public static void main(String[] args) {
        String[] creditList = readFile(new File(args[0]));
        for(int i = 0; i < creditList.length; i++)
        {
            printCardStatus(creditList[i]);
        }
    }

    public static String[] readFile(File file) {
        String[] list;
        Scanner fileScanner = setUpConnection(file);
        int count = 0;
        while(fileScanner.hasNextLine())
        {
            count++;
            fileScanner.nextLine();
        }
        fileScanner.close();
        list = new String[count];
        fileScanner = setUpConnection(file);
        for(int i = 0; i < count; i++)
        {
            list[i] = fileScanner.nextLine();
        }
        return list;
    }

    public static void printCardStatus(String card) {
        String cleanNumber = card.replaceAll("\\s","");
        int total = 0, numLength = cleanNumber.length();

        for(int i = 0; i < numLength; i++)
        {
            if(i == 0 || i % 2 == 0)
                total += Integer.parseInt(String.valueOf(cleanNumber.charAt(i))) * 2;
            else
                total += Integer.parseInt(String.valueOf(cleanNumber.charAt(i)));
        }
        if(total % 10 == 0)
            System.out.println("Real");
        else
            System.out.println("Fake");
    }

    public static Scanner setUpConnection(File file) {
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error in file input process: ");
            e.printStackTrace();
            System.exit(0);
        }
        return fileScanner;
    }
}
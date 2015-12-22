package EasyLevel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        if(args.length > 1)
        {
            System.out.println("Args size bigger than expected.");
            System.exit(0);
        }
        File testFile = new File(args[0]);
        readFileData(testFile);
    }

    public static void readFileData(File file) {
        int[] xVals, yVals, nVals;

        Scanner fileScanner = setUpConnection(file);

        int count = 0;
        while(fileScanner.hasNextLine())
        {
            count++;
            fileScanner.nextLine();
        }
        fileScanner.close();
        fileScanner = setUpConnection(file);

        xVals = new int[count];
        yVals = new int[count];
        nVals = new int[count];
        count = 0;
        while(fileScanner.hasNext())
        {
            xVals[count] = fileScanner.nextInt();
            yVals[count] = fileScanner.nextInt();
            nVals[count] = fileScanner.nextInt();
            count++;
        }
        printValues(xVals, yVals, nVals);
    }

    public static void printValues(int[] x, int[] y, int[] n) {

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

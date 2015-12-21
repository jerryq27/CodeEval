package EasyLevel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.print("Enter test file: ");
        File testFile = new File(new Scanner(System.in).next());
        readFileData(testFile);
    }

    public static void readFileData(File file) {
        int[] xVals, yVals, nVals;

        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error in file input process: ");
            e.printStackTrace();
            System.exit(0);
        }
        int count = 0;
        while(fileScanner.hasNextLine())
        {
            count++;
            fileScanner.nextLine();
        }
        fileScanner.close();
        try {
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error in file input process: ");
            e.printStackTrace();
            System.exit(0);
        }
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

}

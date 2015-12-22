package EasyLevel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        readFileData(new File(args[0]));
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
        for(int i = 0; i < nVals.length; i++)
        {
            printValues(xVals[i], yVals[i], nVals[i]);
        }
    }

    public static void printValues(int x, int y, int n) {
        String[] printList = new String[n];

        for(int dex = 0; dex < n; dex++)
        {
            int count = dex + 1;
            if(count % x == 0 && count % y == 0)
            {
                printList[dex] = "FB";
            }
            else if(count % x == 0)
            {
                printList[dex] = "F";
            }
            else if(count % y == 0)
            {
                printList[dex] = "B";
            }
            else
            {
                printList[dex] = String.valueOf(count);
            }
        }

        for(int i = 0; i < printList.length; i++)
        {
            System.out.print(printList[i] + " ");
            if(i == printList.length - 1)
                System.out.print("\n");
        }
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
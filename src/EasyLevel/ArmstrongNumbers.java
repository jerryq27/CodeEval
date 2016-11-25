package EasyLevel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArmstrongNumbers {

    public static boolean isArmstrongNumber(String numberString) {
        String[] strArray = numberString.split("");
        int numberLength = strArray.length;
        int[] numbers = new int[numberLength];
        for(int i = 0; i < numberLength; i++)
            numbers[i] = Integer.parseInt(strArray[i]);

        int total = 0;
        for(int num : numbers)
            total += Math.pow(num, numberLength);
        return numberString.equals(String.valueOf(total));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        while((line = reader.readLine()) != null)
        {
            if(isArmstrongNumber(line.trim()))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }

}
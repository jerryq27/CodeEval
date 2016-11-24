package EasyLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class SelfDescribingNumbers {

    public static void findSelfDescribingNumber(String number) {
        String[] numbers = number.split("");
        int selfDescribingNumber = 0; //Initial value of 'false'.
        for(int i = 0; i < numbers.length; i++)
        {
            int numCount = 0;
            for(String num : numbers)
            {
                if(num.equals(String.valueOf(i)))
                {
                    numCount++;
                }
            }
            selfDescribingNumber = numbers[i].equals(String.valueOf(numCount)) ? 1 : 0;
            if(selfDescribingNumber == 0)
                break;
        }
        System.out.println(selfDescribingNumber);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String line;
        while((line = reader.readLine()) != null)
        {
            findSelfDescribingNumber(line);
        }
    }
}
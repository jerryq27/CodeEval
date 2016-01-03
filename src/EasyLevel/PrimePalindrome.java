package EasyLevel;

public class PrimePalindrome {

    public static void main(String[] args) {
        int largestPrime = 0;

        for(int i = 4; i <= 1000; i++)
        {
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0)
                continue;
            if(isPrime(i) && isPalindrome(i))
            {
                if(i > largestPrime)
                    largestPrime = i;
            }
        }
        System.out.println(largestPrime);

    }

    public static boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);
        String compareString = "";
        int length = numberString.length();

        for(int i = length - 1; i >= 0; i--)
        {
            compareString += numberString.charAt(i);
        }
        return numberString.equals(compareString);
    }

    public static boolean isPrime(int number)
    {
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
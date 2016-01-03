package EasyLevel;

public class SumOfPrimes {

    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        int primeCount = 0;
        while(primeCount != 1000)
        {
            if(isPrime(count))
            {
                sum += count;
                primeCount++;
            }
            count++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int number)
    {
        if(number == 1) //1 is not considered a prime number.
            return false;
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
                return false;
        }
        return true;
    }

}
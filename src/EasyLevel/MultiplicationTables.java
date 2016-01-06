package EasyLevel;

public class MultiplicationTables {

    public static void main(String[] args) {
        printTable(12);
    }

    public static void printTable(int limit) {
        int[][] multiplicationTable = new int[limit][limit];
        for(int rows = 0; rows < multiplicationTable.length; rows++)
        {
            multiplicationTable[rows][0] = rows + 1;
        }
        for(int cols = 0; cols < multiplicationTable[0].length; cols++)
        {
            multiplicationTable[0][cols] = cols + 1;
        }

        int start = 2, multiplier = 2;
        for(int rows = 1; rows < multiplicationTable.length; rows++)
        {
            for (int cols = 1; cols < multiplicationTable[rows].length; cols++)
            {
                multiplicationTable[rows][cols] = start * multiplier;
                multiplier++;
                if(cols == multiplicationTable[rows].length - 1)
                    multiplier = 2;
            }
            start++;
        }
        for(int rows = 0; rows < multiplicationTable.length; rows++)
        {
            for (int cols = 0; cols < multiplicationTable[rows].length; cols++)
            {
                System.out.print(multiplicationTable[rows][cols] + "\t");
                if(cols == multiplicationTable[rows].length - 1)
                    System.out.print("\n");
            }
        }
    }
}
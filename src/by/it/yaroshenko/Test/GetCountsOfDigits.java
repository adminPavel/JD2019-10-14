package by.it.yaroshenko.Test;

public class GetCountsOfDigits {
    public static void main(String[] args) {
       // getCountsOfDigits(123466564);
        System.out.println(getCountsOfDigits(1230908735));
    }
    static int getCountsOfDigits(int number) // Count number of char in Integer
    {
        int count = (number == 0) ? 1 : 0;
        while (number != 0)
        {
            count++;
            number /= 10;
        }
        return count;
    }
}

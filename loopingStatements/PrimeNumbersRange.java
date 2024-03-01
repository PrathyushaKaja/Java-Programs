package loopingStatements;

public class PrimeNumbersRange {

    public static void main(String[] args) {
    	int i = 20;
        int z;
        int k;
        int count;
        System.out.println("Prime numbers between 50 and 150:");
        
        while (i <= 150) {
            z = i;
            k = 2;
            count = 0;
            
            while (k < z) {
                if (z % k == 0) {
                    count++;
                    break;
                }
                k++;
            }

            if (count == 0) {
                System.out.print(z + " ");
            }

            i++;
        }
    }
}

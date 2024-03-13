package listInterface.programs;

import java.util.ArrayList;

public class DuplicatesElementHighestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(1);
        al.add(9);
        al.add(4);
        al.add(8);
        al.add(0);
        al.add(5);
        al.add(8);
        al.add(1);
        al.add(8);
        al.add(6);

        System.out.println("Highest number of duplicate elements in a list is:");
        int maxCount = 0;
        int numberWithMaxCount = -1;
        for (int i = 0; i < al.size(); i++) {
            int number = al.get(i);
            int count = 0;

            // Count occurrences of the current number
            for (int j = 0; j < al.size(); j++) {
                if (al.get(j) == number) {
                    count++;
                }
            }

            if (count > 1 && count > maxCount) {
                maxCount = count;
                numberWithMaxCount = number;
            }
        }

        if (maxCount > 0) {
            System.out.println("Number with the highest number of duplicates: " + numberWithMaxCount);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}

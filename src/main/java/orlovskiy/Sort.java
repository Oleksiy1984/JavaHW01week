package orlovskiy;


import orlovskiy.SortArrays.*;


import java.util.Scanner;

public class Sort {
    public static void print() {

        int tenNums[]=new int[10];

        //User input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 integers : ");
        for (int i=0;i<tenNums.length;i++)
        {
            System.out.print(i+1+"=> ");
            tenNums[i] = scan.nextInt();
        }
        System.out.println();

        //Sort

        Bubble.sort(tenNums);
        //2. Quicksort.sort(tenNums);
        //3. Insertion.sort(tenNums);
        //4. Selection.sort(tenNums);

/*
        //Find MAX and MIN
        int max = tenNums[0];
        int min = tenNums[0];
        for (int i = 1; i < tenNums.length; i++) {
            if (tenNums[i] > max) {
                max = tenNums[i];
            }
            if (tenNums[i] < min) {
                min = tenNums[i];
            }
        }
        System.out.println("MIN: "+min+" MAX: "+max);
 */

    }
}

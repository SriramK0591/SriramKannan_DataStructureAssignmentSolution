import java.util.Scanner;
import java.util.Stack;
import  java.util.ListIterator;
import java.util.*;

public class Floor {

    private int i, size;
    private int array[];
    int total = 0;
    int count = 1;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter the total number of floors in the building");
        size = sc.nextInt();
        array = new int[size];
        //System.out.println("Enter the values of array.");
        insertValues();
        //System.out.println("Enter the total no of targets that need to be achieved");
        //int tgt = sc.nextInt();
        func(array);
    }

    public void insertValues() {
        for (i = 0; i < array.length; i++) {
            int a =i+1;
            System.out.print("Enter the floor size on Day " + a + ": ");
            array[i] = sc.nextInt();
        }
    }

    public static void func(int[] input) {
        Stack<Integer> temp = new Stack<>();
        int expected = input.length;
        for(int i =0 ; i<input.length; i++) {
            temp.push(input[i]);
            Collections.sort(temp);
            System.out.print("Day "+ (i+1)+": ");
            while(!temp.isEmpty() && temp.peek() == expected && expected>0) {
                System.out.print(temp.pop());
                System.out.print(" ");
                expected--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
        {
            Floor cls = new Floor();
            cls.input();
        }
}

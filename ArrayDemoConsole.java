/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04a;

import javax.swing.*;

/**
 *
 * @author atkins01
 */
public class ArrayDemoConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int LIMIT = 12;       // Max size of array
        int A[] = new int[LIMIT];  // Array declaration and creation
        int B[] = new int[LIMIT];
        int countA = 0;         // Count the numbers entered into array A
        int countB = 0;
        String numbStr;         // The number entered by user, as a string
        int numb;               // The number entered by user, as an int
        String promptStr = ""; // String to prompt user for data entry
        String arrayStr = "";  // String comprised of array elements  
        String outputStr = "";  // String to display output to user
        

        for (int i = 0; i < A.length; i++) {
            // Prompt and get number from user as a string
            arrayStr = toString(A, countA);
            promptStr = "Array elements: " + arrayStr + "\n"
                    + "Enter integer #" + i + " to insert into first array A\n";
            numbStr = JOptionPane.showInputDialog(promptStr);
            // Convert the number from type String to type int
            numb = Integer.parseInt(numbStr);
            // Insert the number into the next available position in array
            A[countA] = numb;
            // Increment the counter that keeps track of the number of entries
            countA++;

        }
       
        for(int i = 0; i < B.length; i++)
        {
            arrayStr = toString(B, countB);
            promptStr = "Array elements: " + arrayStr + "\n"
                    + "Enter integer #" + i + " to insert into second array B\n";
            numbStr = JOptionPane.showInputDialog(promptStr);
            numb = Integer.parseInt(numbStr);
            B[countB] = numb;
            countB++;
        }
        outputStr = "\nThe number of elements in the array A is: " + A.length + "\n"
                + "The elements of array A: " + toString(A, countA) + "\n"
                + "Sum of the elements of array A: " + arraySum(A);
        outputStr = outputStr + "\nThe number of elements in the array B is: " + B.length + "\n"
                + "The elements of array B: " + toString(B, countB) + "\n"
                + "Sum of the elements of array B: " + arraySum(B);
        JOptionPane.showMessageDialog(null, outputStr, "Arrays", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(outputStr);
        
        insertionSort(A);
        insertionSort(B);
        
        outputStr = "\nThe array A sorted: " + toString(A, countA)
                + "\nThe array B sorted: " + toString(B, countB);
        
        JOptionPane.showMessageDialog(null, outputStr, "Sorted Arrays", JOptionPane.INFORMATION_MESSAGE);
        System.out.println(outputStr);
        
    }

    // Compute the sum of the elements in an array
    public static int arraySum(int Z[]) {
        int sum = 0;
        for (int i = 0; i < Z.length; i++) {
            sum += Z[i];
        }
        return sum;
    }

    public static String toString(int A[], int num) {
        String str = "";
        for (int i = 0; i < num; i++) {
            str += A[i] + " ";
        }
        return str;
    }
    
    public static void insertionSort(int A[])
    {
       
        for(int i = 1; i < A.length; i++)
        {
            int temp = A[i];
            int j = i - 1;
            
            while(j >= 0 && A[j] > temp)
            {
                
                A[j + 1] = A[j];
                j = j - 1;
            }
            
            A[j+1] = temp;
        }
    }
    
}

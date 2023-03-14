package Tugas1;

/**
 * @author Welsya Almaira Indra
 * NIM : 221524032
 * Kelas : 1A-TI4
 * @version 1.0
 * @since 2023-01-30
 */

import java.util.Arrays; //impor library arrays karena penggunaan method Arrays.deepToString() di program

public class MDArrayJava {
    public static void main(String[] args) {
        //One Dimensional Arrays
        int[] firstArray = {2, 5, 3}; 
        int[] secondArray = {9, 5, 3}; 
        int[] thirdArray = {2, 4, 9}; 
        int[] fourthArray = {10, 11, 12}; 
        int[] fifthArray = {13, 14, 15}; 
        int[] sixthArray = {16, 17, 18}; 
        int[] seventhArray = {19, 20, 21}; 
        int[] eighthArray = {22, 23, 24}; 
        int[] ninthArray = {25, 26, 27}; 
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {firstArray, secondArray, 
       thirdArray}; 
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray, 
       sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray, 
       ninthArray};
        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1, 
       twoDimensionalArray2, twoDimensionalArray3};
       
    // gunakan method Arrays.deepToString() untuk array dua dimensi
    System.out.println(Arrays.deepToString(twoDimensionalArray1));
    System.out.println(Arrays.deepToString(twoDimensionalArray2));
    System.out.println(Arrays.deepToString(twoDimensionalArray3));
    System.out.println(Arrays.deepToString(threeDimensionalArray));
    }
    
    
}




/*for (int i = 0; i >= firstArray.length; i++) {
           System.out.print(firstArray[i]);

for (int element : firstArray) {
           System.out.print(element);
    }
       }*/
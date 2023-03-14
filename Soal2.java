package Tugas1;

import java.util.Scanner; //impor Scanner ke dalam program

/**
 * @author Welsya Almaira Indra 
 * NIM : 221524032 
 * Kelas : 1A-TI4
 * @version 1.0
 * @since 2023-01-30
 */
public class Soal2 {

    public static void main(String[] args) {
        //deklarasi variabel
        String str1, str2, str3;
        int num1, num2, num3;

        //membuat scanner
        Scanner read = new Scanner(System.in);
        
        //scan inputan user
        str1 = read.next();
        num1 = read.nextInt();
        str2 = read.next();
        num2 = read.nextInt();
        str3 = read.next();
        num3 = read.nextInt();

        //menampilkan output ke user
        //specifier %-15s digunakan untuk memformat left justify string sebanyak 15 character
        //specifier %03d digunakan untuk bilangan int agar hanya menampilkan 3 angka dan mengisi dgn 0 apabila kurang dari 3 angka
        System.out.println("================================");
        System.out.printf("%-15s %03d %n", str1, num1); 
        System.out.printf("%-15s %03d %n", str2, num2); 
        System.out.printf("%-15s %03d %n", str3, num3);
        System.out.println("================================");
    
}
}

package Tugas1;

import java.util.Scanner;
import java.math.BigInteger; //impor penggunaan BigInteger ke dalam program

/**
 * @author Welsya Almaira Indra
 * NIM : 221524032 
 * Kelas : 1A-TI4
 * @version 1.0
 */

public class BigNumber {
    public static void main (String[] args) {
        //deklarasi variabel menggunakan type data Big Integer
        BigInteger a, b, jmlh, kali;
        
        Scanner read = new Scanner (System.in);
        //membaca inputan user
        System.out.print("Masukkan angka pertama : ");
        a = read.nextBigInteger();
        System.out.print("Masukkan angka kedua : ");
        b = read.nextBigInteger();
        
        //pengoperasian jumlah dan kali BigInteger
        jmlh = a.add(b);
        kali = a.multiply(b);
        
        //menampilkan output
        System.out.println(jmlh);
        System.out.println(kali);
    }
}

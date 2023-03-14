package Tugas1;

import java.util.Arrays; //impor array ke dalam program, dibutuhkan untuk convert array menjadi string
import java.util.Scanner;

/**
 * @author Welsya Almaira Indra
 * NIM : 221524032 
 * Kelas : 1A-TI4
 * @version 1.0
 */

public class bukaTutupJalan1 {
    public static void main(String[] args) {
        // deklarasi array
        int[] plat = new int[4];
        
        Scanner read = new Scanner (System.in);
        for(int i=0; i<4; i++ ){
            System.out.printf("plat[%d] : ", i+1);
            plat[i] = read.nextInt(); //scan inputan user dan memasukkannya ke array
        }
        
        String str = Arrays.toString(plat); //convert array menjadi string
        str = str.replaceAll("[\\[|\\]|,|\\s]", ""); //menghapus karakter spasi di string
        
        long bil = Long.parseLong(str); //convert string menjadi bilangan agar dapat dilakukan operasi matematika
        System.out.println("Hasil gabungan angka : " +bil);
        
        if((bil-999999)%5==0){
            System.out.println("jalan");
        }else {
            System.out.println("berhenti");
        }
    }
}

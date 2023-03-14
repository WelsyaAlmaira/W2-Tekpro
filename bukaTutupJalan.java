package Tugas1;

import java.util.*;

/**
 * @author Welsya Almaira Indra
 * NIM : 221524032 
 * Kelas : 1A-TI4
 * @version 1.0
 */

public class bukaTutupJalan {
    public static void main(String[] args){
    	
        // Membuat Scanner baru
        Scanner scan = new Scanner(System.in);
        
        //membuat array int
        int[] arr = new int[4];
        
        //memasukan scanner kedalam array int
        for(int i=0; i<4; i++ ){
            arr[i] = scan.nextInt();
        }
        
        //membuat string untuk menampung hasil array int menjadi string.
        String x = Arrays.toString(arr).replaceAll("\\[|\\]|,|\\s", "");	//(replaceAll()) u/menghapus karakter "[", ",", dan "]" dari output toString()
        
        //untuk mengconvert tipe string ke tipe data long
        long bil = Long.parseLong(x);
        
        System.out.println(bil);
        // Cek kondisi 
        if((bil-999999)%5==0){
            System.out.println("jalan");
        }else {
            System.out.println("berhenti");
        }
    }
}

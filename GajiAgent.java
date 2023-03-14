package Tugas1;

import java.util.Scanner;
        
/**
 * @author Welsya Almaira Indra
 * NIM : 221524032 
 * Kelas : 1A-TI4
 * @version 1.0
 */

public class GajiAgent {
    public static void main (String[] args) {
        //deklarasi variabel
        int jmlhJual;
        long gajiAgent = 0;
        int gajiPokok = 500000;
        int hargaItem = 50000;
        
        System.out.print("Jumlah penjualan bulan ini : ");
        Scanner read = new Scanner(System.in);
        jmlhJual = read.nextInt();
        
        //menambahkan kondisi sesuai soal
        if ((jmlhJual >= 40) && (jmlhJual <= 80)) {
            gajiAgent = (int) (gajiPokok + (0.25 * jmlhJual * hargaItem));
        } else if (jmlhJual > 80) {
            gajiAgent = (long) (gajiPokok + (0.35 * jmlhJual * hargaItem));
        } else if (jmlhJual < 15) {
            gajiAgent = (int) (gajiPokok - (0.15 * (15-jmlhJual) * hargaItem));
        } else if ((jmlhJual >= 15) && (jmlhJual < 40)){
            gajiAgent = (int) (gajiPokok + (0.10 * jmlhJual * hargaItem));
        }
        
        System.out.println("Gaji : " +gajiAgent);
    }
}

package Tugas1;

import java.util.Scanner; //impor Scanner ke dalam program

/**
 *
 * @author Welsya ALmaira Indra 
 * @version 1.0
 * @since 2023-01-30
 */

public class Soal1 {
    public static void main(String[] args) {
        //deklarasi variabel
        int n, i;
        String[] s;
        String str;
        
        //menampilkan output ke user
        try ( //membuat scanner baru
                Scanner keyboard = new Scanner(System.in)) {
            //menampilkan output ke user
            System.out.print("Input string : ");
            
            //menggunakan scanner dan menyimpan inputan user ke variabel str
            str = keyboard.nextLine().trim();
        }
        s = str.split("[ !,?._'@]+"); //split string ketika terdapat karakter atau simbol seperti ini
        
        n = s.length; //menyimpan ukuran dari array of string ke variabel n
        
        System.out.println(n);
        for (i = 0; i < n; i++) {
            System.out.println(s[i]);
        } 
    }
}

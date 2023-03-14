package Tugas1;


/**
 * @author Welsya Almaira Indra
 * NIM : 221524032 
 * Kelas : 1A-TI4
 * @version 1.0
 */

import java.util.Scanner; 

public class Berhitung {
    public static void main(String[] args)
    {
        
        //deklarasi variabel
        int A, B;
        int hasil = 0;
        
        //membuat scanner
        Scanner read = new Scanner(System.in); 
        
        //membaca inputan user
        A = read.nextInt(); //membaca bilangan ke 1
        char opr = read.next().charAt(0); //membaca operator yang dipilih
        B = read.nextInt(); //membaca bilangan ke 2
        
        if ((A>=1)&&(B<=1000)) {
            switch (opr) { //mengoperasikan bilangan sesuai dengan operator yang diinput user
                case '+':
                    hasil = A+B;
                    break;
                case '-':
                    hasil = A-B;
                    break;
                case '*':
                    hasil = A*B;
                    break;
                case '/':
                    hasil = A/B;
                    break;
                case '%':
                    hasil = A%B;
                    break;
                default:
                    break;
            }
        }
        System.out.println(hasil);
        
    }
}

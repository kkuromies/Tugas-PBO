/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo;

/**
 *
 * @author adindapuspita
 */
import java.util.Scanner;
public class Percabangan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int belanja = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukan total belanjaan: Rp ");
        belanja = scan.nextInt();
        
        if (belanja > 100000){
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }
        System.out.println("Terima kasih...");
    }
    
}

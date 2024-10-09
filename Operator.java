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
public class Operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        //Penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil = "+hasil);
        
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        //Pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil = "+hasil);
        
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        //Perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil = "+hasil);
        
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        //Pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil = "+hasil);
        
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        //Sisa Bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil = "+hasil);
        
        
    }
    
}

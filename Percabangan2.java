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
public class Percabangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);
                System.out.print("Masukan Nama: ");
                nama = scan.nextLine();
                System.out.print("Masukan nilai: ");
                nilai = scan.nextInt();
                
            if(nilai >= 70){
                System.out.println("Selamat "+nama+", anda lulus!");
            }else{
                System.out.println("Maaf "+nama+", anda gagal");
            }
    }
    
}

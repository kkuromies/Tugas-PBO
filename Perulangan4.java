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
public class Perulangan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);
        while(running){
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");
            jawab = scan.nextLine();
            //Cek jawabtannya, kalau ya maka berhenti mengulang
            if (jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            counter++;
        }
        System.out.println("anda sudah melakukan perulangan sebanyak "+counter+" kali");
    }
    
}

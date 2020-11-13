/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan46;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi: Program ini berisi program untuk menampilkan karakter seseorang melalui usia
 */
public class PBO10119042LATIHAN46 {

    /**    * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Age umur = new Age(2020);
        
        System.out.print("Masukan Tahun Lahir Anda : ");
        umur.setYearBirth(scanner.nextInt());
        
        System.out.println(); 
        System.out.println();
        System.out.println("=====Hasil Perhitungan Umur=====");
        int yearBirth = umur.getYearBirth();
        System.out.println("Tahun Lahir Anda : "+ yearBirth);
        int yearNow = umur.getYearNow();
        System.out.println("Hari ini Tahun : " + yearNow);
        int usia = umur.hitungUmur();
        
        System.out.println("Umur kamu sampai hari ini adalah " + usia + " tahun");
        System.out.println("Tandanya Kamu " + umur.tandanyaKamu(usia));
    }
    
}

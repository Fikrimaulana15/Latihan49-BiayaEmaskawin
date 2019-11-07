/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan49.biayaemaskawin;
    
    import java.util.Scanner;
/**
 *
 * @author ASUS
 * NAMA : fikrimaulana
 * KELAS : if2
 * NIM : 10118074
 */
public class PBO210118074LATIHAN49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   Scanner scanner = new Scanner(System.in);
        EmasKawin emasKawin = new EmasKawin();
        
        System.out.println("====Program Hitung Emas Kawin====");
        System.out.print("Masukkan harga emas pergram = Rp. ");
        emasKawin.setHargaPerGram(scanner.nextDouble());
        System.out.print("Masukkan berat (gram) = ");
        emasKawin.setBerat(scanner.nextDouble());
        
        System.out.println("Total yang harus dibayar = Rp. "
                + emasKawin.hitungTotalHarga());
        
        System.out.println("developed by : fikri maulana");
    }
    
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author n
 */
public class utama {
    public static void main(String[] args) {
	
        Scanner input = new Scanner (System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
        int i = 0;
        int hargatotal = 0;
        int penampung = 0;
        String menu[] = new String [100];
        int harga[] = new int [100];
        String keputusan="Y";

        System.out.println("Daftar Menu Makanan ");
        System.out.println("----------------------------- ");
        System.out.println("1. Batagor         = Rp 5000 ");
        System.out.println("2. Roti bakar      = Rp 12000 ");
        System.out.println("3. Indomie+Telor   = Rp 10000 ");
        System.out.println("4. Kwetiaw         = Rp.12000");
        System.out.println("5. Nasi Goreng     = Rp.12000");
        System.out.println("6. Air Mineral     = Rp 3000 ");
        System.out.println("7. Teh Manis       = Rp 4000 ");
        System.out.println("8. Jus Alpukat     = Rp 8000 ");
        System.out.println("9. Teh Botol       = Rp.5000");
        System.out.println("10.Kopi            = Rp.3000");



        while (keputusan.equals("Y")||keputusan.equals("y"))
        {
        System.out.print("Pilihan menu anda  = ");
        int pil = input.nextInt();
        if (pil==1){
            menu[i] = "Batagor";
            harga[i] = 5000;
        } else if (pil==2) {
            menu[i]= "Roti Bakar";
            harga[i] = 12000;
        } else if (pil==3) {
            menu[i]="Indomie+Telor";
            harga[i] = 10000;
        } else if (pil==4) {
            menu[i]= "Kwetiaw";
            harga[i] = 12000;
        } else if (pil==5){
            menu[i] = "Nasi Goreng";
            harga[i] = 12000;
        } else if (pil==6) {
            menu[i]= "Air Mineral";
            harga[i] = 3000;
        } else if (pil==7) {
            menu[i]="Teh Manis";
            harga[i] = 4000;
        } else if (pil==8) {
            menu[i]= "Jus Alpukat";
            harga[i] = 8000;
        } else if (pil==9) {
            menu[i]= "Teh Botol";
            harga[i] = 5000;
       } else if (pil==10) {
            menu[i]= "Kopi";
            harga[i] = 3000;
        } else {
            System.out.println("Maaf pilihan menu anda tidak tepat ");
            menu[i]= "Tidak Ada";
        }
            System.out.println("Menu yang anda pesan adalah          : "+menu[i]);
            System.out.println("Harga yang harus dibayar             : "+harga[i]);
            System.out.print("Apakah anda ingin memesan lagi ? Y/T : ");
            try{
                keputusan = input2.readLine();
            }catch(IOException e){
                 System.out.println("Gagal Membaca Keyboard");
            }
            i++;
        }
        System.out.println("");
        System.out.println("Menu yang anda pesan adalah          : "+i);
        for (int a = 0; a<i;a++){
            System.out.print(menu[a]+", ");
        }
        System.out.println("");
        for (int b = 0; b<i;b++){
            hargatotal = hargatotal + harga[b];
        }
        System.out.println("Total yang harus anda bayar adalah   : Rp."+hargatotal);
    }
	
    }


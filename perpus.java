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
public class perpus {
    public static void main(String[] args) {
	
        Scanner input = new Scanner (System.in);
        BufferedReader input2 = new BufferedReader (new InputStreamReader (System.in));
        int i = 0;
        int penampung = 0;
        String Buku[] = new String [100];
        String penulis[] = new String [100];
        String keputusan="Y";
        System.out.println("----------------------------- ");
        System.out.println("Daftar Buku ");
        System.out.println("----------------------------- ");
        System.out.println("1. buku1 ");
        System.out.println("2. Buku2, ");
        System.out.println("3. Buku3 ");
        System.out.println("4. Buku4");
        System.out.println("5. Buku5");
        System.out.println("6. Buku6 ");
        System.out.println("7. Buku7 ");
        System.out.println("8. Buku8 ");
        System.out.println("9. Buku9");
        System.out.println("10.Buku10");



        while (keputusan.equals("Y")||keputusan.equals("y"))
        {
        System.out.print("Pilih buku yang akan dipinjam  = ");
        int pil = input.nextInt();
        if (pil==1){
            Buku[i] = "Buku1";
            penulis[i] = "penulis 1";
        } else if (pil==2) {
            Buku[i]= "Buku2";
            penulis[i] = "penulis 2";
        } else if (pil==3) {
            Buku[i]="Buku3";
            penulis[i] = "penulis 3";
        } else if (pil==4) {
            Buku[i]= "Buku4";
            penulis[i] = "penulis 4";
        } else if (pil==5){
            Buku[i] = "Buku5";
            penulis[i] = "penulis 5";
        } else if (pil==6) {
            Buku[i]= "Buku6";
            penulis[i] = "penulis 6";
        } else if (pil==7) {
            Buku[i]="Buku7";
            penulis[i] = "penulis 7";
        } else if (pil==8) {
            Buku[i]= "Buku8";
            penulis[i] = "penulis 8";
        } else if (pil==9) {
            Buku[i]= "Buku9";
            penulis[i] = "penulis 9";
       } else if (pil==10) {
            Buku[i]= "Buku10";
            penulis[i] = "penulis 10";
        } else {
            System.out.println("Maaf pilihan menu anda tidak tepat ");
            Buku[i]= "Tidak Ada";
        }
            System.out.println("Buku yang anda pinjam adalah          : "+Buku[i]);
            System.out.println("Nama penulis             : "+penulis[i]);
            System.out.print("Apakah anda ingin meminjam lagi ? Y/T : ");
            try{
                keputusan = input2.readLine();
            }catch(IOException e){
                 System.out.println("Gagal Membaca Keyboard");
            }
            i++;
        }
        System.out.println("");
        System.out.println("Buku yang anda pinjam adalah          : "+i);
        for (int a = 0; a<i;a++){
            System.out.print(Buku[a]+", ");

        }
        System.out.println("terimakasih");
        }
	
    }


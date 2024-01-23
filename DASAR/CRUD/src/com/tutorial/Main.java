package com.tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isUlang = true;

        while(isUlang) {
        clearScreen();
        System.out.println("Database Perpustakaan\n");
        System.out.println("1.\tLihat seluruh buku");
        System.out.println("2.\tCari data buku");
        System.out.println("3.\tTambah data buku");
        System.out.println("4.\tUbah data buku");
        System.out.println("5.\tHapus data buku");

        System.out.print("\n\nPilihan anda: ");
        pilihanUser = terminalInput.next();

        switch (pilihanUser){
            case "1":
                System.out.println("LIST SELURUH BUKU");
//                    Tampilkan data
                tampilkanData();
                break;
            case "2":
                System.out.println("CARI BUKU");
//                Cari data buku
                break;
            case "3":
                System.out.println("TAMBAH BUKU");
//                Tambah data buku
                break;
            case "4":
                System.out.println("UBAH BUKU");
//                ubah data buku
                break;
            case "5":
                System.out.println("HAPUS BUKU");
//                hapus data buku
                break;
            default:
                System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih 1-5");
        }

        isUlang = getYesorNo("Apakah anda ingin mengulang?");

        }
    }

    private static void tampilkanData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;

        try{
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        }catch (Exception e){
            System.err.println("Database tidak di temukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        String data = bufferInput.readLine();

        System.out.println("\n| No |\tTahun |\tPenulis        |\tPenerbit    |\tJudul Buku");
        System.out.println("-----------------------------------------------------");

        int no = 1;
        while(data != null) {
            StringTokenizer stringToken = new StringTokenizer(data, ",");

            stringToken.nextToken();
            System.out.printf("| %2d ", no++);
            System.out.printf("|\t%4s ", stringToken.nextToken());
            System.out.printf("|\t%s  ", stringToken.nextToken());
            System.out.printf("|\t%s  ", stringToken.nextToken());
            System.out.printf("|\t%s  ", stringToken.nextToken());
            System.out.print("\n");

            data = bufferInput.readLine();
        }

        System.out.println("Akhir dari database");
    }

    private static boolean getYesorNo(String message){
        Scanner terminalInput = new Scanner(System.in);
//        String pilihanUser;
        System.out.print("\n" + message + " (y/n)?");
        String pilihanUser = terminalInput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan y atau n!");
            System.out.print("\n" + message + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }

        return pilihanUser.equalsIgnoreCase("y");
    }

    private static void clearScreen(){
        try{
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.println("\033\143");
            }
        }catch (Exception ex){
            System.out.println("tidak bisa clear screen");
        }
    }

}

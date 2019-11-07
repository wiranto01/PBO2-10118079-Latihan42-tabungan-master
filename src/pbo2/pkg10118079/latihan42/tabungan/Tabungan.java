/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tabungan {
    private int saldo;
            public int saldoakhir,ambiluang;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getAmbiluang() {
        return saldo-saldoakhir;
    }

    public void setAmbiluang(int ambiluang) {
        this.ambiluang = ambiluang;
    }
            
    
    public void Tabungan(int saldo){
        Scanner userInput = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.println("Masukan Saldo Awal:");
       this.saldo = userInput.nextInt();
        System.out.println("Jumlah uang yang  diambil:");
        saldoakhir = userInput.nextInt();
     }
    public void tampilhasil(){
        System.out.println("====Program Penarikan Uang====");
        System.out.println("Masukan Saldo Awal:"+getSaldo());
        System.out.println("Jumlah uang yang  diambil:"+getSaldoakhir());
        System.out.println("Saldo Anda Sekarang:"+getAmbiluang());   
    }

    public int getSaldoakhir() {
        return saldoakhir;
    }

    public void setSaldoakhir(int saldoakhir) {
        this.saldoakhir = saldoakhir;
    }
   }
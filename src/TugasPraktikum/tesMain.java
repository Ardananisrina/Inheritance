/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Nisrina Izdihar
 */
public class tesMain {
    public static void main(String[] args){
        
        Jurusan IT1 = new Jurusan();
        System.out.println("----------------------------------------");
        IT1.cetakSekolah("SMK Telkom Malang");
        IT1.cetakJurusan(2);
        IT1.cetakGuru(50);
        System.out.println("----------------------------------------");
        
    }
}
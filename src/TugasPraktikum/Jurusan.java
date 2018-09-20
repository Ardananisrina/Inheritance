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
public class Jurusan extends Sekolah {
    int jurusan = 0;
    int guru = 0;
    
    void cetakJurusan (int Jurusan){
        jurusan = Jurusan;
        System.out.println("Jumlah jurusan : " + jurusan);
    }
    
    void cetakGuru(int Guru){
        guru = Guru;
        System.out.println("Jumlah guru : " + guru);
    }
}
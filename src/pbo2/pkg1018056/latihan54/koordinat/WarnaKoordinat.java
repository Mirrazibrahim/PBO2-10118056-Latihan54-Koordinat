/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1018056.latihan54.koordinat;

/**
 *
 * @author 
 * Nama : Mirraz Ibrahim
 * Nim : 10118056
 * Kelas: IF-2
 */
public class WarnaKoordinat extends Koordinat{
    protected String namaWarna;

    public WarnaKoordinat(String namaWarna, int x, int y) {
        super(x, y);
        this.namaWarna = namaWarna;
    }

    public String getNamaWarna() {
        return namaWarna;
    }

   
    
    
    
}

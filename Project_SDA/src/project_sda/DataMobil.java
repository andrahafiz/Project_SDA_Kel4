/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_sda;

/**
 *
 * @author LAB-316-20
 */
public class DataMobil {
    private String jenis, warna,merek,no_mesin,noantrian;

    public DataMobil(String noantrian,String jenis, String warna, String merek, String no_mesin) {
        this.noantrian = noantrian;
        this.jenis = jenis;
        this.warna = warna;
        this.merek = merek;
        this.no_mesin = no_mesin;
    }

    public String getNoantrian() {
        return noantrian;
    }

    public void setNoantrian(String noantrian) {
        this.noantrian = noantrian;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getNo_mesin() {
        return no_mesin;
    }

    public void setNo_mesin(String no_mesin) {
        this.no_mesin = no_mesin;
    }
    public String toString(){
        return " Jenis : " + jenis +"\n Warna : " + warna 
                + "\n Merek : " + merek 
                + "\n No_mesin : " + no_mesin ;
    }
}

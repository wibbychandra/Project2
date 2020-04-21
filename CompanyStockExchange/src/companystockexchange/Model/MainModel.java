/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companystockexchange.Model;

import java.util.Date;

/**
 *
 * @author Wibby Chandra
 */
public class MainModel {
    private String name;
    private Date tanggal;
    private String lembar;
    private String persen;
    private String harga;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setLembar(String lembar) {
        this.lembar = lembar;
    }

    public String getLembar() {
        return lembar;
    }

    public void setPersen(String persen) {
        this.persen = persen;
    }

    public String getPersen() {
        return persen;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getHarga() {
        return harga;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companystockexchange.Query;

/**
 *
 * @author Wibby Chandra
 */
public class MainQuery {
    public String create = "INSERT INTO pemegang (nama, tanggal_catat, "
            +"banyak_lembar, presentase, harga_jual) VALUES (?,?,?,?,?)";
    
    public String getShareholder = "SELECT * FROM pemegang";
    public String showById = "SELECT * FROM pemegang WHERE id_pemegang = ?";
    public String showByName = "SELECT * FROM pemegang WHERE nama LIKE ?";
    
    public String update = "UPDATE product SET nama = ?, tanggal_catat = ?, "
            + "banyak_lembar = ?, presentase = ?, harga_jual = ?"
            + " WHERE id_pemegang = ?";
    public String delete = "DELETE FROM pemegang WHERE id_pemegang = ?";
}
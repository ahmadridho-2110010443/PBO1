/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class produk {
    
    private String id, NamaProduk;
    private String deskripsi, harga, kategori;
    
    public produk () {}
    
    public void setIdProduk(String id){
    this.id=id;
    }
    
    public String getIdProduk(){
    return this.id;
    }
    
    public void setNamaProduk(String NamaProduk){
    this.NamaProduk=NamaProduk;
    }
    
    public String getNamaProduk(){
    return this.NamaProduk;
    }
    
    public void setDeskripsi(String deskripsi){
    this.deskripsi=deskripsi;
    }
    
    public String getDeskripsi(){
    return this.deskripsi;
    }
    
    public void setHarga(String harga){
    this.harga=harga;
    }
    
    public String getHarga(){
    return this.harga;
    }
    
    public void setKategori(String kategori){
    this.kategori=kategori;
    }
    
    public String getKategori(){
    return this.kategori;
    }
}

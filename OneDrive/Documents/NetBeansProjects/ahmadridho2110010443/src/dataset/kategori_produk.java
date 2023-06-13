package dataset;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author HP
 */ 
public class kategori_produk {
    private ArrayList<String> idkategori;
    private ArrayList<String> namakategori;
    private ArrayList<String> deskripsi;
    
    
    public kategori_produk() {
    
        idkategori = new ArrayList<>();
        namakategori = new ArrayList<>();
        deskripsi = new ArrayList<>();
    
    
    }
    
    public void addIdKategori(String value){
    this.idkategori.add(value);
    }
    
    public ArrayList<String> getIdProduk(){
    return this.idkategori;
    }
    
    public void addNamaKategori(String value){
    this.namakategori.add(value);
    }
    
    public ArrayList<String> getNamaKategori(){
    return this.namakategori;
    }
    
    public void addDeskripsii(String value){
    this.deskripsi.add(value);
    }
    
    public ArrayList<String> getDeskripsi(){
    return this.deskripsi;
    }
    
    
    
    
}

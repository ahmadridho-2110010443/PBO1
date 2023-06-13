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
public class datasetProduk {
    
    public ArrayList<String> idproduk;
    public ArrayList<String> namaproduk;
    public ArrayList<String> deskripsi;
    public ArrayList<String> harga;
    public ArrayList<String> kategori;
    
    public datasetProduk () {
    idproduk = new ArrayList<>();
    namaproduk = new ArrayList<>();
    deskripsi = new ArrayList<>();
    harga = new ArrayList<>();
    kategori = new ArrayList<>();
    }
    
    public void addIdProduk(String value){
    this.idproduk.add(value);
    }
    
    public ArrayList<String> getIdProduk(){
    return this.idproduk;
    }
    
    public void addNamaProduk(String value){
    this.namaproduk.add(value);
    }
    
    public ArrayList<String> getNamaProduk(){
    return this.namaproduk;
    }
    
    public void addDeskripsi(String value){
    this.deskripsi.add(value);
    }
    
    public ArrayList<String> getDeskripsi(){
    return this.deskripsi;
    }
    
    public void addHarga(String value){
    this.harga.add(value);
    }
    
    public ArrayList<String> getHarga(){
    return this.harga;
    }
    
    public void addKategori(String value){
    this.kategori.add(value);
    }
    
    public ArrayList<String> getKategori(){
    return this.kategori;
    }
}

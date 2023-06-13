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
public class datasetPesanan {
    
    public ArrayList<String> idpesanan;
    public ArrayList<String> tglpesanan;
    public ArrayList<String> namapemesan;
    public ArrayList<String> alamat;
    public ArrayList<String> ongkir;
    public ArrayList<String> kota;
    public ArrayList<String> telppemesan;
    public ArrayList<String> status;
    
    public datasetPesanan () {
    
    idpesanan = new ArrayList<>();
    tglpesanan = new ArrayList<>();
    namapemesan = new ArrayList<>();
    alamat = new ArrayList<>();
    ongkir = new ArrayList<>();
    kota = new ArrayList<>();
    telppemesan = new ArrayList<>();
    status = new ArrayList<>();
        
    }
    
    public void addIdPesanan(String value){
    this.idpesanan.add(value);
    }
    
    public ArrayList<String> getIdPesanan(){
    return this.idpesanan;
    }
    
    public void addTanggalPesanan(String value){
    this.tglpesanan.add(value);
    }
    
    public ArrayList<String> getTanggalPesanan(){
    return this.tglpesanan;
    }
    
    public void addNamaPemesan(String value){
    this.namapemesan.add(value);
    }
    
    public ArrayList<String> getNamaPemesan(){
    return this.namapemesan;
    }
    
    public void addAlamat(String value){
    this.alamat.add(value);
    }
    
    public ArrayList<String> getAlamat(){
    return this.alamat;
    }
       
     public void addOngkir(String value){
    this.ongkir.add(value);
    }
    
    public ArrayList<String> getOngkir(){
    return this.ongkir;
    }
    
    public void addKota(String value){
    this.kota.add(value);
    }
    
    public ArrayList<String> getKota(){
    return this.kota;
    }
    
     public void addTeleponPemesan(String telepon){
    this.telppemesan.add(telepon);
    }
    
    public ArrayList<String> getTeleponPemesan(){
    return this.telppemesan;
    }
    
     public void addStatus(String value){
    this.status.add(value);
    }
    
    public ArrayList<String> getStatus(){
    return this.status;
    }
    
}

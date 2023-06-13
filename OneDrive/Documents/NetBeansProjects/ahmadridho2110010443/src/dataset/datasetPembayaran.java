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
public class datasetPembayaran {  
    private ArrayList<String> idpembayaran;
    private ArrayList<String> totalpembayaran;
    private ArrayList<String> keterangan;
    private ArrayList<String> status;
    
    public datasetPembayaran () {
    idpembayaran = new ArrayList<>();
    totalpembayaran = new ArrayList<>();
    keterangan = new ArrayList<>();
    status = new ArrayList<>();
    }
    
    public void aadIdPembayaran(String value){
    this.idpembayaran.add(value);
    }
    
    public ArrayList<String> getIdPembayaran (){
    return this.idpembayaran;
    }
    
    public void addTotalPembayaran (String value){
    this.totalpembayaran.add(value);
    }
    
    public ArrayList<String> getTotalPembayaran (){
    return this.totalpembayaran;
    }
    
     public void addKeterangan (String value){
    this.keterangan.add(value);
    }
    
    public ArrayList<String> getKeterangan (){
    return this.keterangan;
    }
    
     public void addStatus (String value){
    this.status.add(value);
    }
    
    public ArrayList<String> getStatus (){
    return this.status;
    }
    
    
}

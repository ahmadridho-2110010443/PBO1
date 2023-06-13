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
public class datasetKontak {
    
    private ArrayList<String> idkontak;
    private ArrayList<String> namakontak;
    private ArrayList<String> email;
    private ArrayList<String> subjek;
    private ArrayList<String> pesan;
    
    
    
    
    public datasetKontak () {
       idkontak = new ArrayList<>();
       namakontak = new ArrayList<>();
       email = new ArrayList<>();
       subjek = new ArrayList<>();
       pesan = new ArrayList<>();
    
    }
    
    public void addIdKontak(String value){
    this.idkontak.add(value);
    }
    
    public ArrayList<String> getIdKontak(){
    return this.idkontak;
    }
    
    public void addNamaKontak (String value){
    this.idkontak.add(value);
    }
    
    public ArrayList<String> getNamaKontak(){
    return this.namakontak;
    }
    
    public void addEmail (String value){
    this.email.add(value);
    }
    
    public ArrayList<String> getEmail (){
    return this.email;
    }
    
    public void addSubjek (String value){
    this.subjek.add(value);
    }
    
    public ArrayList<String> getSubjek(){
    return this.subjek;
    }
    
    public void addPesan (String value){
    this.pesan.add(value);
    }
    
    public ArrayList<String> getPesan(){
    return this.pesan;
    }
    
    
}

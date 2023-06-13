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
public class datasetRekening {
    
    public ArrayList<String> idrek;
    public ArrayList<Integer> norek;
    public ArrayList<String> namarek;
    public ArrayList<String> bank;
    
    public datasetRekening (){
    idrek = new ArrayList<>();
    norek = new ArrayList<>();
    namarek = new ArrayList<>();
    bank = new ArrayList<>();
    }
    
    public void addIdRek(String value){
        this.idrek.add(value);
    }
    
    public ArrayList<String> getIdRek(){
    return this.idrek;
    }
    
     public void addNoRek(int value){
        this.norek.add(value);
    }
    
    public ArrayList<Integer> getNoRek(){
    return this.norek;
    }
    
      public void addNamaRek(String value){
        this.namarek.add(value);
    }
    
    public ArrayList<String> getNamaRek(){
    return this.namarek;
    }
    
      public void addBank(String value){
        this.bank.add(value);
    }
    
    public ArrayList<String> getBank(){
    return this.bank;
    }
    
    
}

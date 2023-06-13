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
public class datasetUserr {
    
    public ArrayList<String> iduser;
    public ArrayList<String> namauser;
    public ArrayList<String> email;
    public ArrayList<String> telp;
    public ArrayList<String> alamat;
    public ArrayList<String> password;
    public ArrayList<String> status;
    
    public datasetUserr() {
    iduser = new ArrayList<>();
    namauser = new ArrayList<>();
    email = new ArrayList<>();
    telp = new ArrayList<>();
    alamat = new ArrayList<>();
    password = new ArrayList<>();
    status = new ArrayList<>();
    }
    
    public void addIdUser(String value){
    this.iduser.add(value);
   }
    
    public ArrayList<String> getIdUser(){
    return this.iduser;
    }
    
    public void addNamaUser(String value){
    this.namauser.add(value);
   }
    
    public ArrayList<String> getNamaUser(){
    return this.namauser;
    }
    
    public void addEmail(String value){
    this.email.add(value);
   }
    
    public ArrayList<String> getEmail(){
    return this.email;
    }
    
    public void addTelepon(String value){
    this.telp.add(value);
   }
    
    public ArrayList<String> getTelepon(){
    return this.telp;
    }
    
    public void addAlamat(String value){
    this.alamat.add(value);
   }
    
    public ArrayList<String> getAlamat(){
    return this.alamat;
    }
    
    public void addPassword(String value){
    this.password.add(value);
   }
    
    public ArrayList<String> getPassword(){
    return this.password;
    }
    
     public void addStatus(String value){
    this.status.add(value);
   }
    
    public ArrayList<String> getStatus(){
    return this.status;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class datasetLogin {
    
    public ArrayList<String> id;
    public ArrayList<String> password;
    
    public datasetLogin(){
    id = new ArrayList<>();
    password = new ArrayList<>();
    }
    
    public void addId (String value){
    this.id.add(value);
    }
    
    public ArrayList<String> getID (){
    return this.id;
    }
    
    public void addPassword (String value){
    this.password.add(value);
    }
    
    public ArrayList<String> getPassword(){
    return this.password;
    }
    
}

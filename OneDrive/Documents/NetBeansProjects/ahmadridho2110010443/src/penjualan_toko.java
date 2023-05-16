/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class penjualan_toko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        userr obj = new userr();
        
        obj.setIdUser("1");
        obj.setNama("edo");
        obj.setEmail("edo@gmail.com");
        obj.setTelepon("0893642434");
        obj.setAlamat("jl.kelayan");
        obj.setPassword("123");
        obj.setStatus("active");
        System.out.println("Id_User : "+obj.getIdUser());
        System.out.println("Nama_User : "+obj.getNama());
        System.out.println("Email : " +obj.getEmail());
        System.out.println("Telepon : " +obj.getTelepon());
        System.out.println("Alamat : "+obj.getAlamat());
        System.out.println("Password : "+obj.getPassword());
        System.out.println("Status : " +obj.getStatus());
        System.out.println("Id_User "+obj.getIdUser()+"\n Nama_User "+obj.getNama()+"\n Email " +obj.getEmail()+"\n Telepon "+obj.getTelepon()+"\n Alamat "+obj.getAlamat()+"\n Password "+obj.getPassword()+"\n Status "+obj.getStatus());
         
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.*;

class connect {
        private static Connection con = null;
    public static Connection connection(){
        try{
           Class.forName("org.sqlite.JDBC");
           String url= "jdbc:sqlite:C:\\Users\\HP\\OneDrive - IZU\\Belgeler\\NetBeansProjects\\Kutuphane\\Kutuphane.db";
            con = DriverManager.getConnection(url);
            System.out.println("Bağlanti basarili.");
            return con;
        }
        
    
    catch(Exception e ){
    System.out.println("Bağlantı hatası!");
    return null;
    }
        
}
}

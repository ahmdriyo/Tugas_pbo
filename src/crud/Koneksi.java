/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author ahmad
 */
public class Koneksi {
    private String database_name = "ahmadriyokusuma_2210010085";
    private String username = "root";
    private String password = "";
    public Connection koneksiDB; 
    
    public Koneksi(){
    
        try {  
            String lokasi = "jdbc:mysql://localhost/" + database_name ;
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksiDB = DriverManager.getConnection(lokasi, username, password);
            
            System.out.println("Database Terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());          
        }
        
    }
    //travel_agen
    public void SimpanTravelAgen (String id, String nama_agen, String slogan, String deskripsi, String nama_domain){
        try {
            String sql = "INSERT INTO travel_agen (id, nama_agen, slogan, deskripsi,nama_domain) VALUE (?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, id);
            perintah.setString(2, nama_agen);
            perintah.setString(3, slogan);
            perintah.setString(4, deskripsi);
            perintah.setString(5, nama_domain);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahTravelAgen(String id, String nama_agen, String slogan, String deskripsi, String nama_domain){
        try {
            String sql = "UPDATE travel_agen SET nama_agen=?, slogan=?, deskripsi=?,nama_domain=? where id=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            
            perintah.setString(1, nama_agen);
            perintah.setString(2, slogan);
            perintah.setString(3, deskripsi);
            perintah.setString(4, nama_domain);
            perintah.setString(5, id);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusTravelAgen(String id){
        try {
            String sql = "DELETE FROM travel_agen where id=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setString(1, id);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    // travel_pelanggan
    public void SimpanTravelPelanggan (String id, String nama_pelanggan, String jenis_kelamin, String umur, String no_hp){
        try {
            String sql = "INSERT INTO travel_pelanggan (id, nama_pelanggan, jenis_kelamin, umur,no_hp) VALUE (?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, id);
            perintah.setString(2, nama_pelanggan);
            perintah.setString(3, jenis_kelamin);
            perintah.setString(4, umur);
            perintah.setString(5, no_hp);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahTravelPelanggan(String id, String nama_pelanggan, String jenis_kelamin, String umur, String no_hp){
        try {
            String sql = "UPDATE travel_pelanggan SET nama_pelanggan=?, jenis_kelamin=?, umur=?,no_hp=? where id=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            
            perintah.setString(1, nama_pelanggan);
            perintah.setString(2, jenis_kelamin);
            perintah.setString(3, umur);
            perintah.setString(4, no_hp);
            perintah.setString(5, id);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusTravelPelanggan(String id){
        try {
            String sql = "DELETE FROM travel_pelanggan where id=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setString(1, id);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    
    // travel_tiket
    public void SimpanTravelTiket (String kode_tiket, String tgl_berangkat, String dari, String kota_tujuan, String jam, String harga){
        try {
            String sql = "INSERT INTO travel_tiket (kode_tiket, tgl_berangkat, dari, kota_tujuan,jam,harga) VALUE (?,?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, kode_tiket);
            perintah.setString(2, tgl_berangkat);
            perintah.setString(3, dari);
            perintah.setString(4, kota_tujuan);
            perintah.setString(5, jam);
            perintah.setString(6, harga);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahTravelTiket(String kode_tiket, String tgl_berangkat, String dari, String kota_tujuan, String jam, String harga){
        try {
            String sql = "UPDATE travel_tiket SET tgl_berangkat=?, dari=?, kota_tujuan=?,jam=?,harga=? where kode_tiket=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            
            perintah.setString(1, tgl_berangkat);
            perintah.setString(2, dari);
            perintah.setString(3, kota_tujuan);
            perintah.setString(4, jam);
            perintah.setString(5, harga);
            perintah.setString(6, kode_tiket);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusTravelTiket(String kode_tiket){
        try {
            String sql = "DELETE FROM travel_tiket where kode_tiket=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setString(1, kode_tiket);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    //travel_pegawai
    public void SimpanTravePegawai (String nik, String id, String nama, String jenis_kelamin, String tgl_lahir, String alamat, String kontak, String jabatan){
        try {
            String sql = "INSERT INTO travel_pegawai (nik, id, nama, jenis_kelamin, tgl_lahir,alamat,kontak,jabatan) VALUE (?,?,?,?,?,?,?,?)";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            perintah.setString(1, nik);
            perintah.setString(2, id);
            perintah.setString(3, nama);
            perintah.setString(4, jenis_kelamin);
            perintah.setString(5, tgl_lahir);
            perintah.setString(6, alamat);
            perintah.setString(7, kontak);
            perintah.setString(8, jabatan);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Disimpan");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void UbahTravelPegawai(String nik, String id, String nama, String jenis_kelamin, String tgl_lahir, String alamat, String kontak, String jabatan){
        try {
            String sql = "UPDATE travel_pegawai SET id=?, nama=?, jenis_kelamin=?,tgl_lahir=?,alamat=?,kontak=? ,jabatan=?  where nik=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);
            
            
            perintah.setString(1, id);
            perintah.setString(2, nama);
            perintah.setString(3, jenis_kelamin);
            perintah.setString(4, tgl_lahir);
            perintah.setString(5, alamat);
            perintah.setString(6, kontak);
            perintah.setString(7, jabatan);
            perintah.setString(8, nik);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Diubah");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    public void HapusTravelPegawai(String nik){
        try {
            String sql = "DELETE FROM travel_pegawai where nik=?";
            PreparedStatement perintah = koneksiDB.prepareStatement(sql);

            perintah.setString(1, nik);
            
            perintah.executeUpdate();
            System.out.println("Berhasil Dihapus ");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
}


package asm.repo;

import asm.model.SinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SinhVienRepo {

    public ArrayList<SinhVien> getlistfromDB(){
        ArrayList<SinhVien> list = new ArrayList<>();
        String sql = "select students.masv, students.hoten, students.email, students.sdt, students.gioitinh, students.diachi, students.hinh from students";
        try(Connection con = DBConnector.connection()){
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                SinhVien sv = new SinhVien();
                sv.setMasv(rs.getString(1));
                sv.setHoten(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setSdt(rs.getString(4));
                sv.setGioitinh(rs.getInt(5));
                sv.setDiachi(rs.getString(6));
                sv.setHinh(rs.getString(7));
                list.add(sv);
            }
            
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public boolean insert(SinhVien sv){
        
        String sqlcode = "insert into students(masv,hoten,email,sdt,gioitinh,diachi,hinh) values(?,?,?,?,?,?,?)";
        try (
            Connection con = DBConnector.connection();
            PreparedStatement ps = con.prepareStatement(sqlcode);
                ){
        ps.setString(1, sv.getMasv());
        ps.setString(2, sv.getHoten());
        ps.setString(3, sv.getEmail());
        ps.setString(4, sv.getSdt());
        ps.setInt(5, sv.getGioitinh());
        ps.setString(6, sv.getDiachi());
        ps.setString(7, sv.getHinh());
        
        
        return ps.executeUpdate() > 0;
    }   catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    
    public boolean delete(String masv){
        String sqlcode = "delete from grade where masv = ? ";
        String sqlcode2 = "delete from students where masv = ?";
        int i = 0;
        try (
            Connection con = DBConnector.connection();
            PreparedStatement ps = con.prepareStatement(sqlcode);
                
                ){
        ps.setString(1, masv);
        i += ps.executeUpdate();
    }   catch (SQLException ex) {
            Logger.getLogger(SinhVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try(Connection con = DBConnector.connection();
                PreparedStatement ps5 = con.prepareStatement(sqlcode2);
                ){
            ps5.setString(1, masv);
            i += ps5.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
        return i > 0;
    }
    

    public boolean update(SinhVien sv){
        String sql = "update students set hoten = ?, email = ?, sdt = ?, gioitinh = ?,diachi = ?, hinh = ? where masv = ?";
        try(Connection con = DBConnector.connection()){
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sv.getHoten());
            ps.setString(2, sv.getEmail());
            ps.setString(3, sv.getSdt());
            ps.setInt(4, sv.getGioitinh());
            ps.setString(5, sv.getDiachi());
            ps.setString(6, sv.getHinh());
            ps.setString(7, sv.getMasv());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}

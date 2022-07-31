
package asm.repo;

import asm.model.SinhVien;
import asm.model.Diem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DiemRepo {
    public ArrayList<Diem> getlistfromDB() {
        ArrayList<Diem> list = new ArrayList<>();
        String sql = "select grade.masv, grade.tienganh, grade.tinhoc, grade.gdtc, students.hoten from grade join students on grade.masv = students.masv group by grade.masv,grade.tienganh,grade.tinhoc,grade.gdtc,students.hoten";
        try(Connection conn = DBConnector.connection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Diem diem = new Diem();
                SinhVien sv = new SinhVien();
                diem.setMasv(rs.getString(1));
                diem.setTienganh(rs.getInt(2));
                diem.setTinhoc(rs.getInt(3));
                diem.setGdtc(rs.getInt(4));
                sv.setHoten(rs.getString(5));
                diem.setSinhvien(sv);
                list.add(diem);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public boolean insert(Diem diem){
        
        String sqlcode = "insert into grade(masv,tienganh,tinhoc,gdtc) values(?,?,?,?)";
        try (
            Connection con = DBConnector.connection();
            PreparedStatement ps = con.prepareStatement(sqlcode);
                ){
        ps.setString(1, diem.getMasv());
        ps.setString(2, String.valueOf(diem.getTienganh()));
        ps.setString(3, String.valueOf(diem.getTinhoc()));
        ps.setString(4, String.valueOf(diem.getGdtc()));
        return ps.executeUpdate() > 0;
    }   catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
    }
    
    public Diem timkiemtheomasv(String masv){
        try{
            String sqlcode = "select grade.masv,grade.tienganh,grade.tinhoc,grade.gdtc,students.hoten from grade join students on grade.masv = students.masv where grade.masv = ? group by grade.masv,grade.tienganh,grade.tinhoc,grade.gdtc,students.hoten";
            Connection con = DBConnector.connection();
            PreparedStatement ps = con.prepareStatement(sqlcode);
            ps.setString(1,masv);
            try(ResultSet rs = ps.executeQuery();){
                if(rs.next()){
                    Diem diem = new Diem();
                    SinhVien sv = new SinhVien();
                    diem.setMasv(rs.getString(1));
                    diem.setTienganh(rs.getInt(2));
                    diem.setTinhoc(rs.getInt(3));
                    diem.setGdtc(rs.getInt(4));
                    sv.setHoten(rs.getString(5));
                    diem.setSinhvien(sv);
                    return diem;
                }
            }
            return null;
        }   catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    
    
        public boolean update(Diem diem,String masv){
        
        String sqlcode = "update grade set  tinhoc = ?, tienganh = ?, gdtc = ? where masv = ? ";
        try (
            Connection con = DBConnector.connection();
            PreparedStatement ps = con.prepareStatement(sqlcode);
                ){
            ps.setString(2, String.valueOf(diem.getTienganh()));
            ps.setString(1, String.valueOf(diem.getTinhoc()));
            ps.setString(3, String.valueOf(diem.getGdtc()));
            ps.setString(4, masv);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        }
        
        public boolean delete(String masv){
            String sqlcode = "delete from grade where masv = ?";
            try (
            Connection con = DBConnector.connection();
            PreparedStatement ps = con.prepareStatement(sqlcode);
                ){
            ps.setString(1, masv);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        }
        
        public ArrayList<Diem> testdiem(){
            String sql = "select top 3 * from grade order by ((grade.gdtc+grade.tienganh+grade.tinhoc)/3) desc";
            ArrayList<Diem> list = new ArrayList<>();
            try(Connection conn = DBConnector.connection()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Diem diem = new Diem();
                diem.setMasv(rs.getString(2));
                diem.setTienganh(rs.getInt(3));
                diem.setTinhoc(rs.getInt(4));
                diem.setGdtc(rs.getInt(5));
                list.add(diem);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        }
}


package asm.service;

import asm.model.SinhVien;
import java.sql.SQLException;
import java.util.ArrayList;


public interface SinhVienService {
    public ArrayList<SinhVien> getlistfromDB();
    public boolean insert(SinhVien sv)  throws SQLException;
    public boolean delete(String masv) throws SQLException;
    public boolean update(SinhVien sv)  throws SQLException;
}

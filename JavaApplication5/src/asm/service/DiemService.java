
package asm.service;

import asm.model.Diem;
import java.sql.SQLException;
import java.util.ArrayList;


public interface DiemService {
    public ArrayList<Diem> getlistfromDB()  throws SQLException;
    public boolean insert(Diem diem) throws SQLException;
    public Diem timkiemtheomasv(String masv) throws SQLException;
    public boolean update(Diem diem,String masv) throws SQLException;
    public boolean delete(String masv) throws SQLException;
}

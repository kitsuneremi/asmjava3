
package asm.service.impl;
import asm.model.Diem;
import asm.repo.DiemRepo;
import java.sql.*;
import java.util.ArrayList;
import asm.service.DiemService;

public class DiemServiceImpl implements DiemService{

    @Override
    public ArrayList<Diem> getlistfromDB() {
        ArrayList<Diem> list = new DiemRepo().getlistfromDB();
        return list;
    }
    
    @Override
    public boolean insert(Diem diem) throws SQLException{
        boolean x = new DiemRepo().insert(diem);
        return x;
    }
    
    @Override
    public Diem timkiemtheomasv(String masv) throws SQLException{
        Diem diem = new DiemRepo().timkiemtheomasv(masv);
        return diem;
    }
    
    @Override
        public boolean update(Diem diem,String masv){
            boolean x = new DiemRepo().update(diem, masv);
            return x;
        }
        
    @Override
        public boolean delete(String masv){
            boolean x = new DiemRepo().delete(masv);
            return x;
        }
        
        public ArrayList<Diem> testdiem(){
            ArrayList<Diem> list = new DiemRepo().testdiem();
            return list;
        }
        
}

    


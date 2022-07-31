
package asm.service.impl;

import asm.model.SinhVien;
import asm.repo.SinhVienRepo;
import java.util.ArrayList;
import asm.service.SinhVienService;


public class SinhVienServiceImpl implements SinhVienService{
    
    @Override
    public ArrayList<SinhVien> getlistfromDB(){
        ArrayList<SinhVien> list = new SinhVienRepo().getlistfromDB();
        return list;
    }
    
    
    @Override
    public boolean insert(SinhVien sv){
        boolean x = new SinhVienRepo().insert(sv);
        return x;
    }

    @Override
    public boolean delete(String masv){
        boolean x = new SinhVienRepo().delete(masv);
        return x;
    }
    
    @Override
    public boolean update(SinhVien sv){
        boolean x = new SinhVienRepo().update(sv);
        return x;
    }
}

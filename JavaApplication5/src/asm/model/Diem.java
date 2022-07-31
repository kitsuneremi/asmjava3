
package asm.model;

public class Diem {
    private int id;
    private String masv;
    private int tienganh;
    private int tinhoc;
    private int gdtc;
    private SinhVien sinhvien;

    public Diem(int id, String masv, int tienganh, int tinhoc, int gdtc, SinhVien sinhvien) {
        this.id = id;
        this.masv = masv;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
        this.sinhvien = sinhvien;
    }

    public Diem() {
    }

    public Diem(String masv, int tienganh, int tinhoc, int gdtc) {
        this.masv = masv;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }


    public int getTienganh() {
        return tienganh;
    }

    public void setTienganh(int tienganh) {
        this.tienganh = tienganh;
    }

    public int getTinhoc() {
        return tinhoc;
    }

    public void setTinhoc(int tinhoc) {
        this.tinhoc = tinhoc;
    }

    public int getGdtc() {
        return gdtc;
    }

    public void setGdtc(int gdtc) {
        this.gdtc = gdtc;
    }
    
    public float diemtb(){
        return (tienganh + tinhoc + gdtc)/3;
    }

    public SinhVien getSinhvien() {
        return sinhvien;
    }

    public void setSinhvien(SinhVien sinhvien) {
        this.sinhvien = sinhvien;
    }

    
    
    
}

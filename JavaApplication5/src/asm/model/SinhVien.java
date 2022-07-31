
package asm.model;

public class SinhVien {
    String masv;
    String hoten;
    String email;
    String sdt;
    int gioitinh;
    String diachi;
    String hinh;

    public SinhVien() {
    }

    public SinhVien(String masv, String hoten, String email, String sdt, int gioitinh, String diachi, String hinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.email = email;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.hinh = hinh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    
    
}

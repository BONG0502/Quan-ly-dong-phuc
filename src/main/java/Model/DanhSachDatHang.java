package Model;

import Data.DongPhuc_DA;
import Data.KhachHang_DA;

/**
 *
 * @author Nguyen Thanh Tung
 */
public class DanhSachDatHang {
    private String masv, masp, ghichu, ngaydat, ngayhen, trangthai;
    private int thanhtoan, tiendu, soluong, thanhtien;
    private DongPhuc_DA dpda = new DongPhuc_DA();
    private KhachHang_DA khda = new KhachHang_DA();

    public KhachHang_DA getKhda() {
        return khda;
    }

    public void setKhda(KhachHang_DA khda) {
        this.khda = khda;
    }
    public DanhSachDatHang() {
        thanhtoan = 0;
        tiendu = 0;
    }
    
    public DanhSachDatHang(String masv,String masp, String ghichu, String ngaydat, String ngayhen, String trangthai, int thanhtoan, int soluong) {
        this.masv =masv;
        this.masp = masp;
        this.ghichu = ghichu;
        this.ngaydat = ngaydat;
        this.ngayhen = ngayhen;
        this.trangthai = trangthai;
        this.thanhtoan = thanhtoan;
        this.soluong = soluong;
        
        thanhtoan = 0;
        tiendu = 0;
    }

    public DongPhuc_DA getDpda() {
        return dpda;
    }

    public void setDpda(DongPhuc_DA dpda) {
        this.dpda = dpda;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getNgaydat() {
        return ngaydat;
    }

    public void setNgaydat(String ngaydat) {
        this.ngaydat = ngaydat;
    }

    public String getNgayhen() {
        return ngayhen;
    }

    public void setNgayhen(String ngayhen) {
        this.ngayhen = ngayhen;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public int getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(int thanhtoan) {
        this.thanhtoan = thanhtoan;
    }


    public void setTiendu(int tiendu) {
        this.tiendu = tiendu;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public int thanhtien(){
        return soluong*dpda.getTtdp(masp).getGia();
    }
    public int tratien(){
        return thanhtoan - thanhtien() <= 0 ? 0 : thanhtoan - thanhtien();
    }
}
package Model;

/**
 *
 * @author Nguyen Thanh Tung
 */
public class KhachHang {
    private String makh, ten, sdt, lop;

    public KhachHang() {
    }

    public KhachHang(String makh, String ten, String sdt, String lop) {
        this.makh = makh;
        this.ten = ten;
        this.sdt = sdt;
        this.lop = lop;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
}
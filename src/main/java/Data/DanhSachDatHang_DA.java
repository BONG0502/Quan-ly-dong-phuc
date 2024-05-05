package Data;

import Model.DanhSachDatHang;
import Model.DongPhuc;
import Model.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Thanh Tung
 */
public class DanhSachDatHang_DA {
    private ArrayList<DanhSachDatHang> dh = new ArrayList();
    
    public DanhSachDatHang_DA() {
        dh.add(new DanhSachDatHang("2021608149","1DPMH_NAM","20 XL, 10 XXL","01/06/2024","12/06/2024", "Chưa thanh toán",0, 30));
        dh.add(new DanhSachDatHang("2021608148","1DPMH_NAM","3 XL, 4 XXL","01/06/2024","12/06/2024", "Đã thanh toán",500000, 7));
        dh.add(new DanhSachDatHang("2021608147","1DPMH_NU","16 XXL, 10 XXL","01/06/2024","12/06/2024", "Chưa thanh toán",0, 36));
        dh.add(new DanhSachDatHang("2021608146","2DPMD_NU","20 XL, 7 XXL","03/06/2024","12/06/2024", "Đã thanh toán",500000, 27));
        dh.add(new DanhSachDatHang("2021608145","1DPMH_NU","20 XL, 8 XXL","01/06/2024","12/06/2024", "Chưa thanh toán",0, 28));
        dh.add(new DanhSachDatHang("2021608144","1DPMD_NU","10 XL, 9 XXL","06/06/2024","12/06/2024", "Chưa thanh toán",0, 19));
        dh.add(new DanhSachDatHang("2021608143","2DPMH_NAM","7 XL, 8 XXL","01/06/2024","12/06/2024", "Chưa thanh toán",0, 15));
        dh.add(new DanhSachDatHang("2021608142","1DPMD_NAM","20 XL, 10 XXL","01/06/2024","12/06/2024", "Chưa thanh toán",0, 30));
        dh.add(new DanhSachDatHang("2021608141","2DPMH_NU","17 XX, 10 XL","02/06/2024","12/06/2024", "Chưa thanh toán",0, 37));
        dh.add(new DanhSachDatHang("2021608140","1DPMH_NAM","20 XL, 10 XXL","01/06/2024","12/06/2024", "Chưa thanh toán",780000, 30));
        dh.add(new DanhSachDatHang("2021608139","2DPMH_NAM","2 XL, 1 XXL","01/06/2024","12/06/2024", "Đã thanh toán",100000, 3));
        dh.add(new DanhSachDatHang("2021608138","1DPMH_NU","20 XL, 6 XXL","01/06/2024","12/06/2024", "Đã thanh toán",680000, 26));
        dh.add(new DanhSachDatHang("2021608137","2DPMD_NAM","2 XL, 11 XXL","03/06/2024","12/06/2024", "Chưa thanh toán",0, 13));
        dh.add(new DanhSachDatHang("2021608136","2DPMH_NAM","20 XL, 1 XXL","01/06/2024","12/06/2024", "Đã thanh toán",450000, 21));
    }
    
    public void xoa_don(DanhSachDatHang temp){
        dh.remove(temp);
    }
    
    public void them_don(DanhSachDatHang temp){
        dh.add(temp);
    }
    
    public DanhSachDatHang tt_don(DanhSachDatHang temp){
        return dh.get(dh.indexOf(temp));
    }
    
    public ArrayList<DanhSachDatHang> getDh() {
        return dh;
    }

    public void setDh(ArrayList<DanhSachDatHang> dh) {
        this.dh = dh;
    }
    
};
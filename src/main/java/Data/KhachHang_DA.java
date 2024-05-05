package Data;

import Model.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author Nguyen Thanh Tung
 */
public class KhachHang_DA {
    ArrayList<KhachHang> kh = new ArrayList();
    KhachHang temp;

    public KhachHang_DA() {
        kh.add(new KhachHang("2020605078","Nguyễn Thanh Tung","0934697825","KHMT1"));
        kh.add(new KhachHang("2019605151","Phạm Dình Long","0934697824","KHMT1"));
        kh.add(new KhachHang("2021608147","Nguyễn Văn Anh Thắng","0934697823","KHMT1"));
        kh.add(new KhachHang("2021608146","Nguyễn Thu Huyền","0934697822","KHMT1"));
        kh.add(new KhachHang("2021608145","Lê Trần Anh Tú","0934697821","KHMT2"));
        kh.add(new KhachHang("2021608144","Lữ Sơn Trương","0934697820","KTPM2"));
        kh.add(new KhachHang("2021608143","Nguyễn Văn Tú","0934697819","KT2"));
        kh.add(new KhachHang("2021608142","Nguyễn Văn Anh","0934697818","KHMT1"));
        kh.add(new KhachHang("2021608141","Phạm Quốc Bảo","0934697817","KTPM1"));
        kh.add(new KhachHang("2021608140","Nguyễn Thế Anh","0934697816","KHMT1"));
        kh.add(new KhachHang("2021608139","Hồ Việt Hoàng","0934697815","KHMT1"));
        kh.add(new KhachHang("2021608138","Hoàng Minh Anh","0934697814","KTPM1"));
        kh.add(new KhachHang("2021608137","Phạm Văn Tuấn","0934697813","KT1"));
        kh.add(new KhachHang("2021608136","Nguyễn Tự Đức","0934697812","TDH1"));
    }

    public ArrayList<KhachHang> getKh() {
        return kh;
    }

    public KhachHang getTemp() {
        temp = new KhachHang();
        return temp;
    }

    public KhachHang getTtkh(String msv) {
        for(KhachHang i : kh){
            if(i.getMakh().equals(msv)){
                temp = new KhachHang(msv,i.getTen(), i.getSdt(), i.getLop());
                return temp;
            }
        }
        return temp;
    }
    
}
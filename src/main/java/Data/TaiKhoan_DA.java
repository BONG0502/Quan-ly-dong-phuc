package Data;

import Model.User;
import View.DangNhap;
import java.util.ArrayList;
/**
 *
 * @author Nguyen Thanh Tung
 */
public class TaiKhoan_DA {
    public ArrayList<User> ql = new ArrayList();

    public TaiKhoan_DA(){
        ql.add(new User("Nguyen Thanh Tung","2020605078","Quản trị viên", "Hoạt động","user1", "1234"));
        ql.add(new User("Nguyen Van A","2021608148","Nhân Viên", "Hoạt động", "user2", "1234"));
        ql.add(new User("Nguyen Van B","2021608147","Nhân Viên", "Hoạt động", "user3", "1234"));
        ql.add(new User("Nguyen Van C","2021608146","Nhân Viên", "Hoạt động", "user4", "1234"));
    }

    public ArrayList<User> getQl() {
        return ql;
    }
    public void deleteTK(User temp){
        ql.remove(temp);
    }
    public void addTk(User temp){
        ql.add(temp);
    }
    
}
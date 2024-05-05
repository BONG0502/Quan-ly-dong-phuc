package Main;
import View.DangNhap; 
/**
 *
 * @author Nguyen Thanh Tung
 */
public class Main {
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new DangNhap().setVisible(true);
                }
        });
    }
}
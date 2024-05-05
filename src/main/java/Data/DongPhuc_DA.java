package Data;

import Model.DongPhuc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author Nguyen Thanh Tung
 */
public class DongPhuc_DA {
    ArrayList<DongPhuc> dp = new ArrayList();
    DongPhuc temp;

    public DongPhuc_DA() {
        dp.add(new DongPhuc("1DPMH_NAM","Đồng phục mùa hè nam ngắn", "Nam", 50000, "XL", 2000));
        dp.add(new DongPhuc("2DPMH_NAM","Đồng phục mùa hè nam dài", "Nam", 55000, "XL", 2000));
        dp.add(new DongPhuc("1DPMH_NU","Đồng phục mùa hè nữ ngắn", "Nữ", 60000, "XL", 2000));
        dp.add(new DongPhuc("2DPMH_NU","Đồng phục mùa hè nữ dài", "Nữ", 65000, "XL", 2000));
        dp.add(new DongPhuc("1DPMD_NAM","Đồng phục mùa đông nam ngắn", "Nam", 70000, "XL", 2000));
        dp.add(new DongPhuc("2DPMD_NAM","Đồng phục mùa đông nam dài", "Nam", 75000, "XL", 2000));
        dp.add(new DongPhuc("1DPMD_NU","Đồng phục mùa đông nữ ngắn", "Nữ", 80000, "XL", 2000));
        dp.add(new DongPhuc("2DPMD_NU","Đồng phục mùa đông nữ dài", "Nữ", 85000, "XL", 2000));
    }

    public ArrayList<DongPhuc> getDp() {
        return dp;
    }
    public void add_dp(DongPhuc temp){
        dp.add(temp);
    }
    public void remove_dp(DongPhuc temp){
        dp.remove(temp);
    }
    public void sort_dp(){
        Collections.sort(dp);
    }

    public DongPhuc getTtdp(String msp) {
        for(DongPhuc i : dp){
            if(i.getMasp().equals(msp)){
                temp = new DongPhuc(i.getTen(), msp, i.getGia());
                return temp;
            }
        }
        return temp;
    }
}
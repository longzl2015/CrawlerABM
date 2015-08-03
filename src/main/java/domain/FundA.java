package domain;


import java.util.List;

/**
 * Created by hadoop on 2015/7/21.
 */
public class FundA extends Fund{

    private String funda_id;                        //ID
    private String funda_name;                      //基金名称
    private String funda_current_price;             //现价
    private String funda_increase_rt;               //涨幅
    private String funda_volume;                    //成交量
    private String funda_value;                     //净值
    private String funda_discount_rt;               //折价率
    private String coupon_descr_s;                  //利率规则
    private String funda_coupon;                    //本期利率
    private String funda_coupon_next;               //下期利率
    private String funda_profit_rt_next;            //修正收益率
    private String funda_left_year;                 //剩余年限
    private String funda_index_id;                  //参考指数ID
    private String funda_index_name;                //参考指数
    private String funda_lower_recalc_rt;           //下折母基虚跌
    private String lower_recalc_profit_rt;          //理论下折收益
    private String fundb_upper_recalc_rt;           //上折母基需涨
    private String funda_base_est_dis_rt;           // 整体溢价率
    private String funda_base_est_dis_rt_t1;        // T-1溢价率
    private String funda_base_est_dis_rt_t2;        // T-2溢价率
    private String funda_amount;                    // A份额(万份)
    private String funda_amount_increase_rt;        // A份额增长率
    private String abrate;                          //A-B
    private String funda_index_increase_rt1;        //指数涨幅
    private String coupon_descr;
    private String calc_infonull;
    private String funda_base_fund_id;              //母基ID
    private String last_time;                                      //更新时间但是不知道是什么的更新时间
    private String funda_nav_dt;                                   //      ??????
    private String funda_profit_rt;                                  //    ???????
    private String funda_base_est_dis_rt_tip;                         //    ???????


    private String fund_descr;
    private String left_recalc_year;                                    //  ???????????????
    private String status_cdN;                                            //   ???????????????
    private String next_recalc_dt;                                        //       ???????
    private String funda_amount_increase;           // A新增(万份)



    public String getCoupon_descr_s() {
        return coupon_descr_s;
    }

    public void setCoupon_descr_s(String coupon_descr_s) {
        this.coupon_descr_s = coupon_descr_s;
    }

    public String getCoupon_descr() {
        return coupon_descr;
    }

    public void setCoupon_descr(String coupon_descr) {
        this.coupon_descr = coupon_descr;
    }

    public String getCalc_infonull() {
        return calc_infonull;
    }

    public void setCalc_infonull(String calc_infonull) {
        this.calc_infonull = calc_infonull;
    }

    public String getFunda_volume() {
        return funda_volume;
    }

    public void setFunda_volume(String funda_volume) {
        this.funda_volume = funda_volume;
    }

    public String getFunda_index_increase_rt1() {
        return funda_index_increase_rt1;
    }

    public void setFunda_index_increase_rt1(String funda_index_increase_rt1) {
        this.funda_index_increase_rt1 = funda_index_increase_rt1;
    }

    public String getFunda_lower_recalc_rt() {
        return funda_lower_recalc_rt;
    }

    public void setFunda_lower_recalc_rt(String funda_lower_recalc_rt) {
        this.funda_lower_recalc_rt = funda_lower_recalc_rt;
    }

    public String getFundb_upper_recalc_rt() {
        return fundb_upper_recalc_rt;
    }

    public void setFundb_upper_recalc_rt(String fundb_upper_recalc_rt) {
        this.fundb_upper_recalc_rt = fundb_upper_recalc_rt;
    }

    public String getFunda_increase_rt() {
        return funda_increase_rt;
    }

    public void setFunda_increase_rt(String funda_increase_rt) {
        this.funda_increase_rt = funda_increase_rt;
    }

    public String getFunda_left_year() {
        return funda_left_year;
    }

    public void setFunda_left_year(String funda_left_year) {
        this.funda_left_year = funda_left_year;
    }

    public String getFunda_base_fund_id() {
        return funda_base_fund_id;
    }

    public void setFunda_base_fund_id(String funda_base_fund_id) {
        this.funda_base_fund_id = funda_base_fund_id;
    }

    public String getFunda_id() {
        return funda_id;
    }

    public void setFunda_id(String funda_id) {
        this.funda_id = funda_id;
    }

    public String getFunda_name() {
        return funda_name;
    }

    public void setFunda_name(String funda_name) {
        this.funda_name = funda_name;
    }

    public String getLast_time() {
        return last_time;
    }

    public void setLast_time(String last_time) {
        this.last_time = last_time;
    }

    public String getFunda_current_price() {
        return funda_current_price;
    }

    public void setFunda_current_price(String funda_current_price) {
        this.funda_current_price = funda_current_price;
    }

    public String getFunda_nav_dt() {
        return funda_nav_dt;
    }

    public void setFunda_nav_dt(String funda_nav_dt) {
        this.funda_nav_dt = funda_nav_dt;
    }

    public String getFunda_value() {
        return funda_value;
    }

    public void setFunda_value(String funda_value) {
        this.funda_value = funda_value;
    }

    public String getFunda_discount_rt() {
        return funda_discount_rt;
    }

    public void setFunda_discount_rt(String funda_discount_rt) {
        this.funda_discount_rt = funda_discount_rt;
    }

    public String getFunda_coupon() {
        return funda_coupon;
    }

    public void setFunda_coupon(String funda_coupon) {
        this.funda_coupon = funda_coupon;
    }

    public String getFunda_coupon_next() {
        return funda_coupon_next;
    }

    public void setFunda_coupon_next(String funda_coupon_next) {
        this.funda_coupon_next = funda_coupon_next;
    }

    public String getFunda_profit_rt() {
        return funda_profit_rt;
    }

    public void setFunda_profit_rt(String funda_profit_rt) {
        this.funda_profit_rt = funda_profit_rt;
    }

    public String getFunda_profit_rt_next() {
        return funda_profit_rt_next;
    }

    public void setFunda_profit_rt_next(String funda_profit_rt_next) {
        this.funda_profit_rt_next = funda_profit_rt_next;
    }

    public String getFunda_index_id() {
        return funda_index_id;
    }

    public void setFunda_index_id(String funda_index_id) {
        this.funda_index_id = funda_index_id;
    }

    public String getFunda_index_name() {
        return funda_index_name;
    }

    public void setFunda_index_name(String funda_index_name) {
        this.funda_index_name = funda_index_name;
    }

    public String getAbrate() {
        return abrate;
    }

    public void setAbrate(String abrate) {
        this.abrate = abrate;
    }

    public String getFunda_base_est_dis_rt_tip() {
        return funda_base_est_dis_rt_tip;
    }

    public void setFunda_base_est_dis_rt_tip(String funda_base_est_dis_rt_tip) {
        this.funda_base_est_dis_rt_tip = funda_base_est_dis_rt_tip;
    }

    public String getFunda_base_est_dis_rt() {
        return funda_base_est_dis_rt;
    }

    public void setFunda_base_est_dis_rt(String funda_base_est_dis_rt) {
        this.funda_base_est_dis_rt = funda_base_est_dis_rt;
    }

    public String getFund_descr() {
        return fund_descr;
    }

    public void setFund_descr(String fund_descr) {
        this.fund_descr = fund_descr;
    }

    public String getLeft_recalc_year() {
        return left_recalc_year;
    }

    public void setLeft_recalc_year(String left_recalc_year) {
        this.left_recalc_year = left_recalc_year;
    }

    public String getStatus_cdN() {
        return status_cdN;
    }

    public void setStatus_cdN(String status_cdN) {
        this.status_cdN = status_cdN;
    }

    public String getNext_recalc_dt() {
        return next_recalc_dt;
    }

    public void setNext_recalc_dt(String next_recalc_dt) {
        this.next_recalc_dt = next_recalc_dt;
    }

    public String getLower_recalc_profit_rt() {
        return lower_recalc_profit_rt;
    }

    public void setLower_recalc_profit_rt(String lower_recalc_profit_rt) {
        this.lower_recalc_profit_rt = lower_recalc_profit_rt;
    }

    public String getFunda_amount_increase() {
        return funda_amount_increase;
    }

    public void setFunda_amount_increase(String funda_amount_increase) {
        this.funda_amount_increase = funda_amount_increase;
    }

    public String getFunda_amount() {
        return funda_amount;
    }

    public void setFunda_amount(String funda_amount) {
        this.funda_amount = funda_amount;
    }

    public String getFunda_amount_increase_rt() {
        return funda_amount_increase_rt;
    }

    public void setFunda_amount_increase_rt(String funda_amount_increase_rt) {
        this.funda_amount_increase_rt = funda_amount_increase_rt;
    }

    public String getFunda_base_est_dis_rt_t1() {
        return funda_base_est_dis_rt_t1;
    }

    public void setFunda_base_est_dis_rt_t1(String funda_base_est_dis_rt_t1) {
        this.funda_base_est_dis_rt_t1 = funda_base_est_dis_rt_t1;
    }

    public String getFunda_base_est_dis_rt_t2() {
        return funda_base_est_dis_rt_t2;
    }

    public void setFunda_base_est_dis_rt_t2(String funda_base_est_dis_rt_t2) {
        this.funda_base_est_dis_rt_t2 = funda_base_est_dis_rt_t2;
    }

    /**
     * 一次性对fundA赋值
     *
     * @param list 包含所有fundA信息的长度为36的列表
     */
    public void setAllValue(List<String> list) {
        this.setCoupon_descr_s(list.get(1));
        this.setCoupon_descr(list.get(2));
        this.setCalc_infonull(list.get(3));
        this.setFunda_volume(list.get(4));
        this.setFunda_index_increase_rt1(list.get(5));
        this.setFunda_lower_recalc_rt(list.get(6));           //下折母基虚跌
        this.setFundb_upper_recalc_rt(list.get(7));           //上折母基需涨
        this.setFunda_increase_rt(list.get(8));               //涨幅
        this.setFunda_left_year(list.get(9));                 //剩余年限
        this.setFunda_base_fund_id(list.get(10));              //母基ID
        this.setFunda_id(list.get(11));                        //ID
        this.setFunda_name(list.get(12));                      //基金名称
        this.setLast_time(list.get(13));                                      //更新时间但是不知道是什么的更新时间
        this.setFunda_current_price(list.get(14));             //现价
        this.setFunda_nav_dt(list.get(15));                                   //      ??????
        this.setFunda_value(list.get(16));                     //净值
        this.setFunda_discount_rt(list.get(17));               //折价率
        this.setFunda_coupon(list.get(18));                    //本期利率
        this.setFunda_coupon_next(list.get(19));               //下期利率
        this.setFunda_profit_rt(list.get(20));                                  //    ???????
        this.setFunda_profit_rt_next(list.get(21));            //修正收益率
        this.setFunda_index_id(list.get(22));                  //参考指数ID
        this.setFunda_index_name(list.get(23));                //参考指数
        this.setAbrate(list.get(24));                          //A-B
        this.setFunda_base_est_dis_rt_tip(list.get(25));                         //    ???????
        this.setFunda_base_est_dis_rt(list.get(26));           // 整体溢价率
        this.setFund_descr(list.get(27));
        this.setLeft_recalc_year(list.get(28));                                    //  ???????????????
        this.setStatus_cdN(list.get(29));                                            //   ???????????????
        this.setNext_recalc_dt(list.get(30));                                        //       ???????
        this.setLower_recalc_profit_rt(list.get(31));          //理论下折收益
        this.setFunda_amount_increase(list.get(32));           // A新增(万份)
        this.setFunda_amount(list.get(33));                    // A份额(万份)
        this.setFunda_amount_increase_rt(list.get(34));        // A份额增长率
        this.setFunda_base_est_dis_rt_t1(list.get(35));        // T-1溢价率
        this.setFunda_base_est_dis_rt_t2(list.get(36));        // T-2溢价率
    }

    @Override
    public String toString() {
        return "FundA{" +
                "coupon_descr_s='" + coupon_descr_s + '\'' +
                ", coupon_descr='" + coupon_descr + '\'' +
                ", calc_infonull='" + calc_infonull + '\'' +
                ", funda_volume='" + funda_volume + '\'' +
                ", funda_index_increase_rt1='" + funda_index_increase_rt1 + '\'' +
                ", funda_lower_recalc_rt='" + funda_lower_recalc_rt + '\'' +
                ", fundb_upper_recalc_rt='" + fundb_upper_recalc_rt + '\'' +
                ", funda_increase_rt='" + funda_increase_rt + '\'' +
                ", funda_left_year='" + funda_left_year + '\'' +
                ", funda_base_fund_id='" + funda_base_fund_id + '\'' +
                ", funda_id='" + funda_id + '\'' +
                ", funda_name='" + funda_name + '\'' +
                ", last_time='" + last_time + '\'' +
                ", funda_current_price='" + funda_current_price + '\'' +
                ", funda_nav_dt='" + funda_nav_dt + '\'' +
                ", funda_value='" + funda_value + '\'' +
                ", funda_discount_rt='" + funda_discount_rt + '\'' +
                ", funda_coupon='" + funda_coupon + '\'' +
                ", funda_coupon_next='" + funda_coupon_next + '\'' +
                ", funda_profit_rt='" + funda_profit_rt + '\'' +
                ", funda_profit_rt_next='" + funda_profit_rt_next + '\'' +
                ", funda_index_id='" + funda_index_id + '\'' +
                ", funda_index_name='" + funda_index_name + '\'' +
                ", abrate='" + abrate + '\'' +
                ", funda_base_est_dis_rt_tip='" + funda_base_est_dis_rt_tip + '\'' +
                ", funda_base_est_dis_rt='" + funda_base_est_dis_rt + '\'' +
                ", fund_descr='" + fund_descr + '\'' +
                ", left_recalc_year='" + left_recalc_year + '\'' +
                ", status_cdN='" + status_cdN + '\'' +
                ", next_recalc_dt='" + next_recalc_dt + '\'' +
                ", lower_recalc_profit_rt='" + lower_recalc_profit_rt + '\'' +
                ", funda_amount_increase='" + funda_amount_increase + '\'' +
                ", funda_amount='" + funda_amount + '\'' +
                ", funda_amount_increase_rt='" + funda_amount_increase_rt + '\'' +
                ", funda_base_est_dis_rt_t1='" + funda_base_est_dis_rt_t1 + '\'' +
                ", funda_base_est_dis_rt_t2='" + funda_base_est_dis_rt_t2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FundA)) return false;

        FundA fundA = (FundA) o;

        if (coupon_descr_s != null ? !coupon_descr_s.equals(fundA.coupon_descr_s) : fundA.coupon_descr_s != null)
            return false;
        if (coupon_descr != null ? !coupon_descr.equals(fundA.coupon_descr) : fundA.coupon_descr != null) return false;
        if (calc_infonull != null ? !calc_infonull.equals(fundA.calc_infonull) : fundA.calc_infonull != null)
            return false;
        if (funda_volume != null ? !funda_volume.equals(fundA.funda_volume) : fundA.funda_volume != null) return false;
        if (funda_index_increase_rt1 != null ? !funda_index_increase_rt1.equals(fundA.funda_index_increase_rt1) : fundA.funda_index_increase_rt1 != null)
            return false;
        if (funda_lower_recalc_rt != null ? !funda_lower_recalc_rt.equals(fundA.funda_lower_recalc_rt) : fundA.funda_lower_recalc_rt != null)
            return false;
        if (fundb_upper_recalc_rt != null ? !fundb_upper_recalc_rt.equals(fundA.fundb_upper_recalc_rt) : fundA.fundb_upper_recalc_rt != null)
            return false;
        if (funda_increase_rt != null ? !funda_increase_rt.equals(fundA.funda_increase_rt) : fundA.funda_increase_rt != null)
            return false;
        if (funda_left_year != null ? !funda_left_year.equals(fundA.funda_left_year) : fundA.funda_left_year != null)
            return false;
        if (funda_base_fund_id != null ? !funda_base_fund_id.equals(fundA.funda_base_fund_id) : fundA.funda_base_fund_id != null)
            return false;
        if (!funda_id.equals(fundA.funda_id)) return false;
        if (funda_name != null ? !funda_name.equals(fundA.funda_name) : fundA.funda_name != null) return false;
        if (last_time != null ? !last_time.equals(fundA.last_time) : fundA.last_time != null) return false;
        if (funda_current_price != null ? !funda_current_price.equals(fundA.funda_current_price) : fundA.funda_current_price != null)
            return false;
        if (funda_nav_dt != null ? !funda_nav_dt.equals(fundA.funda_nav_dt) : fundA.funda_nav_dt != null) return false;
        if (funda_value != null ? !funda_value.equals(fundA.funda_value) : fundA.funda_value != null) return false;
        if (funda_discount_rt != null ? !funda_discount_rt.equals(fundA.funda_discount_rt) : fundA.funda_discount_rt != null)
            return false;
        if (funda_coupon != null ? !funda_coupon.equals(fundA.funda_coupon) : fundA.funda_coupon != null) return false;
        if (funda_coupon_next != null ? !funda_coupon_next.equals(fundA.funda_coupon_next) : fundA.funda_coupon_next != null)
            return false;
        if (funda_profit_rt != null ? !funda_profit_rt.equals(fundA.funda_profit_rt) : fundA.funda_profit_rt != null)
            return false;
        if (funda_profit_rt_next != null ? !funda_profit_rt_next.equals(fundA.funda_profit_rt_next) : fundA.funda_profit_rt_next != null)
            return false;
        if (funda_index_id != null ? !funda_index_id.equals(fundA.funda_index_id) : fundA.funda_index_id != null)
            return false;
        if (funda_index_name != null ? !funda_index_name.equals(fundA.funda_index_name) : fundA.funda_index_name != null)
            return false;
        if (abrate != null ? !abrate.equals(fundA.abrate) : fundA.abrate != null) return false;
        if (funda_base_est_dis_rt_tip != null ? !funda_base_est_dis_rt_tip.equals(fundA.funda_base_est_dis_rt_tip) : fundA.funda_base_est_dis_rt_tip != null)
            return false;
        if (funda_base_est_dis_rt != null ? !funda_base_est_dis_rt.equals(fundA.funda_base_est_dis_rt) : fundA.funda_base_est_dis_rt != null)
            return false;
        if (fund_descr != null ? !fund_descr.equals(fundA.fund_descr) : fundA.fund_descr != null) return false;
        if (left_recalc_year != null ? !left_recalc_year.equals(fundA.left_recalc_year) : fundA.left_recalc_year != null)
            return false;
        if (status_cdN != null ? !status_cdN.equals(fundA.status_cdN) : fundA.status_cdN != null) return false;
        if (next_recalc_dt != null ? !next_recalc_dt.equals(fundA.next_recalc_dt) : fundA.next_recalc_dt != null)
            return false;
        if (lower_recalc_profit_rt != null ? !lower_recalc_profit_rt.equals(fundA.lower_recalc_profit_rt) : fundA.lower_recalc_profit_rt != null)
            return false;
        if (funda_amount_increase != null ? !funda_amount_increase.equals(fundA.funda_amount_increase) : fundA.funda_amount_increase != null)
            return false;
        if (funda_amount != null ? !funda_amount.equals(fundA.funda_amount) : fundA.funda_amount != null) return false;
        if (funda_amount_increase_rt != null ? !funda_amount_increase_rt.equals(fundA.funda_amount_increase_rt) : fundA.funda_amount_increase_rt != null)
            return false;
        if (funda_base_est_dis_rt_t1 != null ? !funda_base_est_dis_rt_t1.equals(fundA.funda_base_est_dis_rt_t1) : fundA.funda_base_est_dis_rt_t1 != null)
            return false;
        return !(funda_base_est_dis_rt_t2 != null ? !funda_base_est_dis_rt_t2.equals(fundA.funda_base_est_dis_rt_t2) : fundA.funda_base_est_dis_rt_t2 != null);

    }

    @Override
    public int hashCode() {
        int result = coupon_descr_s != null ? coupon_descr_s.hashCode() : 0;
        result = 31 * result + (coupon_descr != null ? coupon_descr.hashCode() : 0);
        result = 31 * result + (calc_infonull != null ? calc_infonull.hashCode() : 0);
        result = 31 * result + (funda_volume != null ? funda_volume.hashCode() : 0);
        result = 31 * result + (funda_index_increase_rt1 != null ? funda_index_increase_rt1.hashCode() : 0);
        result = 31 * result + (funda_lower_recalc_rt != null ? funda_lower_recalc_rt.hashCode() : 0);
        result = 31 * result + (fundb_upper_recalc_rt != null ? fundb_upper_recalc_rt.hashCode() : 0);
        result = 31 * result + (funda_increase_rt != null ? funda_increase_rt.hashCode() : 0);
        result = 31 * result + (funda_left_year != null ? funda_left_year.hashCode() : 0);
        result = 31 * result + (funda_base_fund_id != null ? funda_base_fund_id.hashCode() : 0);
        result = 31 * result + funda_id.hashCode();
        result = 31 * result + (funda_name != null ? funda_name.hashCode() : 0);
        result = 31 * result + (last_time != null ? last_time.hashCode() : 0);
        result = 31 * result + (funda_current_price != null ? funda_current_price.hashCode() : 0);
        result = 31 * result + (funda_nav_dt != null ? funda_nav_dt.hashCode() : 0);
        result = 31 * result + (funda_value != null ? funda_value.hashCode() : 0);
        result = 31 * result + (funda_discount_rt != null ? funda_discount_rt.hashCode() : 0);
        result = 31 * result + (funda_coupon != null ? funda_coupon.hashCode() : 0);
        result = 31 * result + (funda_coupon_next != null ? funda_coupon_next.hashCode() : 0);
        result = 31 * result + (funda_profit_rt != null ? funda_profit_rt.hashCode() : 0);
        result = 31 * result + (funda_profit_rt_next != null ? funda_profit_rt_next.hashCode() : 0);
        result = 31 * result + (funda_index_id != null ? funda_index_id.hashCode() : 0);
        result = 31 * result + (funda_index_name != null ? funda_index_name.hashCode() : 0);
        result = 31 * result + (abrate != null ? abrate.hashCode() : 0);
        result = 31 * result + (funda_base_est_dis_rt_tip != null ? funda_base_est_dis_rt_tip.hashCode() : 0);
        result = 31 * result + (funda_base_est_dis_rt != null ? funda_base_est_dis_rt.hashCode() : 0);
        result = 31 * result + (fund_descr != null ? fund_descr.hashCode() : 0);
        result = 31 * result + (left_recalc_year != null ? left_recalc_year.hashCode() : 0);
        result = 31 * result + (status_cdN != null ? status_cdN.hashCode() : 0);
        result = 31 * result + (next_recalc_dt != null ? next_recalc_dt.hashCode() : 0);
        result = 31 * result + (lower_recalc_profit_rt != null ? lower_recalc_profit_rt.hashCode() : 0);
        result = 31 * result + (funda_amount_increase != null ? funda_amount_increase.hashCode() : 0);
        result = 31 * result + (funda_amount != null ? funda_amount.hashCode() : 0);
        result = 31 * result + (funda_amount_increase_rt != null ? funda_amount_increase_rt.hashCode() : 0);
        result = 31 * result + (funda_base_est_dis_rt_t1 != null ? funda_base_est_dis_rt_t1.hashCode() : 0);
        result = 31 * result + (funda_base_est_dis_rt_t2 != null ? funda_base_est_dis_rt_t2.hashCode() : 0);
        return result;
    }
}

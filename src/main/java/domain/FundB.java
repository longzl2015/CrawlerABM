package domain;


import java.util.List;

/**
 * Created by hadoop on 2015/7/21.
 */
public class FundB extends Fund{
    private String fundb_base_fund_id;
    private String fundb_id;
    private String fundb_name;
    private String status_cd;
    private String recalc_to;
    private String calc_info;
    private String upper_recalc_price;
    private String maturity_dt;
    private String fundb_current_price;
    private String fundb_increase_rt;
    private String fundb_volume;
    private String fundb_value;
    private String fundb_nav_dt;
    private String fundb_discount_rt;
    private String fundb_price_leverage_rt;
    private String fundb_net_leverage_rt;
    private String fundb_capital_rasising_rt;
    private String fundb_lower_recalc_rt;
    private String fundb_upper_recalc_rt;
    private String fundb_left_year;
    private String b_est_val;
    private String fundb_index_id;
    private String fundb_index_name;
    private String fundb_index_increase_rt;
    private String funda_ratio;
    private String fundb_ratio;
    private String fundb_base_price;
    private String fundb_base_est_dis_rt;
    private String last_time;
    private String owned;
    private String abrate;
    private String fundb_base_est_dis_rt_tip;


    public String getStatus_cd() {
        return status_cd;
    }

    public void setStatus_cd(String status_cd) {
        this.status_cd = status_cd;
    }

    public String getFundb_base_fund_id() {
        return fundb_base_fund_id;
    }

    public void setFundb_base_fund_id(String fundb_base_fund_id) {
        this.fundb_base_fund_id = fundb_base_fund_id;
    }

    public String getFundb_id() {
        return fundb_id;
    }

    public void setFundb_id(String fundb_id) {
        this.fundb_id = fundb_id;
    }

    public String getFundb_name() {
        return fundb_name;
    }

    public void setFundb_name(String fundb_name) {
        this.fundb_name = fundb_name;
    }

    public String getRecalc_to() {
        return recalc_to;
    }

    public void setRecalc_to(String recalc_to) {
        this.recalc_to = recalc_to;
    }

    public String getCalc_info() {
        return calc_info;
    }

    public void setCalc_info(String calc_info) {
        this.calc_info = calc_info;
    }

    public String getUpper_recalc_price() {
        return upper_recalc_price;
    }

    public void setUpper_recalc_price(String upper_recalc_price) {
        this.upper_recalc_price = upper_recalc_price;
    }

    public String getMaturity_dt() {
        return maturity_dt;
    }

    public void setMaturity_dt(String maturity_dt) {
        this.maturity_dt = maturity_dt;
    }

    public String getFundb_current_price() {
        return fundb_current_price;
    }

    public void setFundb_current_price(String fundb_current_price) {
        this.fundb_current_price = fundb_current_price;
    }

    public String getFundb_increase_rt() {
        return fundb_increase_rt;
    }

    public void setFundb_increase_rt(String fundb_increase_rt) {
        this.fundb_increase_rt = fundb_increase_rt;
    }

    public String getFundb_volume() {
        return fundb_volume;
    }

    public void setFundb_volume(String fundb_volume) {
        this.fundb_volume = fundb_volume;
    }

    public String getFundb_value() {
        return fundb_value;
    }

    public void setFundb_value(String fundb_value) {
        this.fundb_value = fundb_value;
    }

    public String getFundb_nav_dt() {
        return fundb_nav_dt;
    }

    public void setFundb_nav_dt(String fundb_nav_dt) {
        this.fundb_nav_dt = fundb_nav_dt;
    }

    public String getFundb_discount_rt() {
        return fundb_discount_rt;
    }

    public void setFundb_discount_rt(String fundb_discount_rt) {
        this.fundb_discount_rt = fundb_discount_rt;
    }

    public String getFundb_price_leverage_rt() {
        return fundb_price_leverage_rt;
    }

    public void setFundb_price_leverage_rt(String fundb_price_leverage_rt) {
        this.fundb_price_leverage_rt = fundb_price_leverage_rt;
    }

    public String getFundb_net_leverage_rt() {
        return fundb_net_leverage_rt;
    }

    public void setFundb_net_leverage_rt(String fundb_net_leverage_rt) {
        this.fundb_net_leverage_rt = fundb_net_leverage_rt;
    }

    public String getFundb_capital_rasising_rt() {
        return fundb_capital_rasising_rt;
    }

    public void setFundb_capital_rasising_rt(String fundb_capital_rasising_rt) {
        this.fundb_capital_rasising_rt = fundb_capital_rasising_rt;
    }

    public String getFundb_lower_recalc_rt() {
        return fundb_lower_recalc_rt;
    }

    public void setFundb_lower_recalc_rt(String fundb_lower_recalc_rt) {
        this.fundb_lower_recalc_rt = fundb_lower_recalc_rt;
    }

    public String getFundb_upper_recalc_rt() {
        return fundb_upper_recalc_rt;
    }

    public void setFundb_upper_recalc_rt(String fundb_upper_recalc_rt) {
        this.fundb_upper_recalc_rt = fundb_upper_recalc_rt;
    }

    public String getFundb_left_year() {
        return fundb_left_year;
    }

    public void setFundb_left_year(String fundb_left_year) {
        this.fundb_left_year = fundb_left_year;
    }

    public String getB_est_val() {
        return b_est_val;
    }

    public void setB_est_val(String b_est_val) {
        this.b_est_val = b_est_val;
    }

    public String getFundb_index_id() {
        return fundb_index_id;
    }

    public void setFundb_index_id(String fundb_index_id) {
        this.fundb_index_id = fundb_index_id;
    }

    public String getFundb_index_name() {
        return fundb_index_name;
    }

    public void setFundb_index_name(String fundb_index_name) {
        this.fundb_index_name = fundb_index_name;
    }

    public String getFundb_index_increase_rt() {
        return fundb_index_increase_rt;
    }

    public void setFundb_index_increase_rt(String fundb_index_increase_rt) {
        this.fundb_index_increase_rt = fundb_index_increase_rt;
    }

    public String getFunda_ratio() {
        return funda_ratio;
    }

    public void setFunda_ratio(String funda_ratio) {
        this.funda_ratio = funda_ratio;
    }

    public String getFundb_ratio() {
        return fundb_ratio;
    }

    public void setFundb_ratio(String fundb_ratio) {
        this.fundb_ratio = fundb_ratio;
    }

    public String getFundb_base_price() {
        return fundb_base_price;
    }

    public void setFundb_base_price(String fundb_base_price) {
        this.fundb_base_price = fundb_base_price;
    }

    public String getFundb_base_est_dis_rt() {
        return fundb_base_est_dis_rt;
    }

    public void setFundb_base_est_dis_rt(String fundb_base_est_dis_rt) {
        this.fundb_base_est_dis_rt = fundb_base_est_dis_rt;
    }

    public String getLast_time() {
        return last_time;
    }

    public void setLast_time(String last_time) {
        this.last_time = last_time;
    }

    public String getOwned() {
        return owned;
    }

    public void setOwned(String owned) {
        this.owned = owned;
    }

    public String getAbrate() {
        return abrate;
    }

    public void setAbrate(String abrate) {
        this.abrate = abrate;
    }

    public String getFundb_base_est_dis_rt_tip() {
        return fundb_base_est_dis_rt_tip;
    }

    public void setFundb_base_est_dis_rt_tip(String fundb_base_est_dis_rt_tip) {
        this.fundb_base_est_dis_rt_tip = fundb_base_est_dis_rt_tip;
    }

    @Override
    public String toString() {
        return "FundB{" +
                "fundb_base_fund_id='" + fundb_base_fund_id + '\'' +
                ", fundb_id='" + fundb_id + '\'' +
                ", fundb_name='" + fundb_name + '\'' +
                ", status_cd='" + status_cd + '\'' +
                ", recalc_to='" + recalc_to + '\'' +
                ", calc_info='" + calc_info + '\'' +
                ", upper_recalc_price='" + upper_recalc_price + '\'' +
                ", maturity_dt='" + maturity_dt + '\'' +
                ", fundb_current_price='" + fundb_current_price + '\'' +
                ", fundb_increase_rt='" + fundb_increase_rt + '\'' +
                ", fundb_volume='" + fundb_volume + '\'' +
                ", fundb_value='" + fundb_value + '\'' +
                ", fundb_nav_dt='" + fundb_nav_dt + '\'' +
                ", fundb_discount_rt='" + fundb_discount_rt + '\'' +
                ", fundb_price_leverage_rt='" + fundb_price_leverage_rt + '\'' +
                ", fundb_net_leverage_rt='" + fundb_net_leverage_rt + '\'' +
                ", fundb_capital_rasising_rt='" + fundb_capital_rasising_rt + '\'' +
                ", fundb_lower_recalc_rt='" + fundb_lower_recalc_rt + '\'' +
                ", fundb_upper_recalc_rt='" + fundb_upper_recalc_rt + '\'' +
                ", fundb_left_year='" + fundb_left_year + '\'' +
                ", b_est_val='" + b_est_val + '\'' +
                ", fundb_index_id='" + fundb_index_id + '\'' +
                ", fundb_index_name='" + fundb_index_name + '\'' +
                ", fundb_index_increase_rt='" + fundb_index_increase_rt + '\'' +
                ", funda_ratio='" + funda_ratio + '\'' +
                ", fundb_ratio='" + fundb_ratio + '\'' +
                ", fundb_base_price='" + fundb_base_price + '\'' +
                ", fundb_base_est_dis_rt='" + fundb_base_est_dis_rt + '\'' +
                ", last_time='" + last_time + '\'' +
                ", owned='" + owned + '\'' +
                ", abrate='" + abrate + '\'' +
                ", fundb_base_est_dis_rt_tip='" + fundb_base_est_dis_rt_tip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FundB fundB = (FundB) o;

        if (fundb_base_fund_id != null ? !fundb_base_fund_id.equals(fundB.fundb_base_fund_id) : fundB.fundb_base_fund_id != null)
            return false;
        if (!fundb_id.equals(fundB.fundb_id)) return false;
        if (fundb_name != null ? !fundb_name.equals(fundB.fundb_name) : fundB.fundb_name != null) return false;
        if (status_cd != null ? !status_cd.equals(fundB.status_cd) : fundB.status_cd != null) return false;
        if (recalc_to != null ? !recalc_to.equals(fundB.recalc_to) : fundB.recalc_to != null) return false;
        if (calc_info != null ? !calc_info.equals(fundB.calc_info) : fundB.calc_info != null) return false;
        if (upper_recalc_price != null ? !upper_recalc_price.equals(fundB.upper_recalc_price) : fundB.upper_recalc_price != null)
            return false;
        if (maturity_dt != null ? !maturity_dt.equals(fundB.maturity_dt) : fundB.maturity_dt != null) return false;
        if (fundb_current_price != null ? !fundb_current_price.equals(fundB.fundb_current_price) : fundB.fundb_current_price != null)
            return false;
        if (fundb_increase_rt != null ? !fundb_increase_rt.equals(fundB.fundb_increase_rt) : fundB.fundb_increase_rt != null)
            return false;
        if (fundb_volume != null ? !fundb_volume.equals(fundB.fundb_volume) : fundB.fundb_volume != null) return false;
        if (fundb_value != null ? !fundb_value.equals(fundB.fundb_value) : fundB.fundb_value != null) return false;
        if (fundb_nav_dt != null ? !fundb_nav_dt.equals(fundB.fundb_nav_dt) : fundB.fundb_nav_dt != null) return false;
        if (fundb_discount_rt != null ? !fundb_discount_rt.equals(fundB.fundb_discount_rt) : fundB.fundb_discount_rt != null)
            return false;
        if (fundb_price_leverage_rt != null ? !fundb_price_leverage_rt.equals(fundB.fundb_price_leverage_rt) : fundB.fundb_price_leverage_rt != null)
            return false;
        if (fundb_net_leverage_rt != null ? !fundb_net_leverage_rt.equals(fundB.fundb_net_leverage_rt) : fundB.fundb_net_leverage_rt != null)
            return false;
        if (fundb_capital_rasising_rt != null ? !fundb_capital_rasising_rt.equals(fundB.fundb_capital_rasising_rt) : fundB.fundb_capital_rasising_rt != null)
            return false;
        if (fundb_lower_recalc_rt != null ? !fundb_lower_recalc_rt.equals(fundB.fundb_lower_recalc_rt) : fundB.fundb_lower_recalc_rt != null)
            return false;
        if (fundb_upper_recalc_rt != null ? !fundb_upper_recalc_rt.equals(fundB.fundb_upper_recalc_rt) : fundB.fundb_upper_recalc_rt != null)
            return false;
        if (fundb_left_year != null ? !fundb_left_year.equals(fundB.fundb_left_year) : fundB.fundb_left_year != null)
            return false;
        if (b_est_val != null ? !b_est_val.equals(fundB.b_est_val) : fundB.b_est_val != null) return false;
        if (fundb_index_id != null ? !fundb_index_id.equals(fundB.fundb_index_id) : fundB.fundb_index_id != null)
            return false;
        if (fundb_index_name != null ? !fundb_index_name.equals(fundB.fundb_index_name) : fundB.fundb_index_name != null)
            return false;
        if (fundb_index_increase_rt != null ? !fundb_index_increase_rt.equals(fundB.fundb_index_increase_rt) : fundB.fundb_index_increase_rt != null)
            return false;
        if (funda_ratio != null ? !funda_ratio.equals(fundB.funda_ratio) : fundB.funda_ratio != null) return false;
        if (fundb_ratio != null ? !fundb_ratio.equals(fundB.fundb_ratio) : fundB.fundb_ratio != null) return false;
        if (fundb_base_price != null ? !fundb_base_price.equals(fundB.fundb_base_price) : fundB.fundb_base_price != null)
            return false;
        if (fundb_base_est_dis_rt != null ? !fundb_base_est_dis_rt.equals(fundB.fundb_base_est_dis_rt) : fundB.fundb_base_est_dis_rt != null)
            return false;
        if (last_time != null ? !last_time.equals(fundB.last_time) : fundB.last_time != null) return false;
        if (owned != null ? !owned.equals(fundB.owned) : fundB.owned != null) return false;
        if (abrate != null ? !abrate.equals(fundB.abrate) : fundB.abrate != null) return false;
        return !(fundb_base_est_dis_rt_tip != null ? !fundb_base_est_dis_rt_tip.equals(fundB.fundb_base_est_dis_rt_tip) : fundB.fundb_base_est_dis_rt_tip != null);

    }

    @Override
    public int hashCode() {
        int result = fundb_base_fund_id != null ? fundb_base_fund_id.hashCode() : 0;
        result = 31 * result + fundb_id.hashCode();
        result = 31 * result + (fundb_name != null ? fundb_name.hashCode() : 0);
        result = 31 * result + (status_cd != null ? status_cd.hashCode() : 0);
        result = 31 * result + (recalc_to != null ? recalc_to.hashCode() : 0);
        result = 31 * result + (calc_info != null ? calc_info.hashCode() : 0);
        result = 31 * result + (upper_recalc_price != null ? upper_recalc_price.hashCode() : 0);
        result = 31 * result + (maturity_dt != null ? maturity_dt.hashCode() : 0);
        result = 31 * result + (fundb_current_price != null ? fundb_current_price.hashCode() : 0);
        result = 31 * result + (fundb_increase_rt != null ? fundb_increase_rt.hashCode() : 0);
        result = 31 * result + (fundb_volume != null ? fundb_volume.hashCode() : 0);
        result = 31 * result + (fundb_value != null ? fundb_value.hashCode() : 0);
        result = 31 * result + (fundb_nav_dt != null ? fundb_nav_dt.hashCode() : 0);
        result = 31 * result + (fundb_discount_rt != null ? fundb_discount_rt.hashCode() : 0);
        result = 31 * result + (fundb_price_leverage_rt != null ? fundb_price_leverage_rt.hashCode() : 0);
        result = 31 * result + (fundb_net_leverage_rt != null ? fundb_net_leverage_rt.hashCode() : 0);
        result = 31 * result + (fundb_capital_rasising_rt != null ? fundb_capital_rasising_rt.hashCode() : 0);
        result = 31 * result + (fundb_lower_recalc_rt != null ? fundb_lower_recalc_rt.hashCode() : 0);
        result = 31 * result + (fundb_upper_recalc_rt != null ? fundb_upper_recalc_rt.hashCode() : 0);
        result = 31 * result + (fundb_left_year != null ? fundb_left_year.hashCode() : 0);
        result = 31 * result + (b_est_val != null ? b_est_val.hashCode() : 0);
        result = 31 * result + (fundb_index_id != null ? fundb_index_id.hashCode() : 0);
        result = 31 * result + (fundb_index_name != null ? fundb_index_name.hashCode() : 0);
        result = 31 * result + (fundb_index_increase_rt != null ? fundb_index_increase_rt.hashCode() : 0);
        result = 31 * result + (funda_ratio != null ? funda_ratio.hashCode() : 0);
        result = 31 * result + (fundb_ratio != null ? fundb_ratio.hashCode() : 0);
        result = 31 * result + (fundb_base_price != null ? fundb_base_price.hashCode() : 0);
        result = 31 * result + (fundb_base_est_dis_rt != null ? fundb_base_est_dis_rt.hashCode() : 0);
        result = 31 * result + (last_time != null ? last_time.hashCode() : 0);
        result = 31 * result + (owned != null ? owned.hashCode() : 0);
        result = 31 * result + (abrate != null ? abrate.hashCode() : 0);
        result = 31 * result + (fundb_base_est_dis_rt_tip != null ? fundb_base_est_dis_rt_tip.hashCode() : 0);
        return result;
    }

    public void setAllValue(List<String> list) {
        this.setFundb_base_fund_id(list.get(0));
        this.setFundb_id(list.get(1));
        this.setFundb_name(list.get(2));
        this.setStatus_cd(list.get(3));
        this.setRecalc_to(list.get(4));
        this.setCalc_info(list.get(5));
        this.setUpper_recalc_price(list.get(6));
        this.setMaturity_dt(list.get(7));
        this.setFundb_current_price(list.get(8));
        this.setFundb_increase_rt(list.get(9));
        this.setFundb_volume(list.get(10));
        this.setFundb_value(list.get(11));
        this.setFundb_nav_dt(list.get(12));
        this.setFundb_discount_rt(list.get(13));
        this.setFundb_price_leverage_rt(list.get(14));
        this.setFundb_net_leverage_rt(list.get(15));
        this.setFundb_capital_rasising_rt(list.get(16));
        this.setFundb_lower_recalc_rt(list.get(17));
        this.setFundb_upper_recalc_rt(list.get(18));
        this.setFundb_left_year(list.get(19));
        this.setB_est_val(list.get(20));
        this.setFundb_index_id(list.get(21));
        this.setFundb_index_name(list.get(22));
        this.setFundb_index_increase_rt(list.get(23));
        this.setFunda_ratio(list.get(24));
        this.setFundb_ratio(list.get(25));
        this.setFundb_base_price(list.get(26));
        this.setFundb_base_est_dis_rt(list.get(27));
        this.setLast_time(list.get(28));
        this.setOwned(list.get(29));
        this.setAbrate(list.get(30));
        this.setFundb_base_est_dis_rt_tip(list.get(31));
    }
}

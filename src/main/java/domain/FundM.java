package domain;

import java.util.Date;
import java.util.List;

/**
 * Created by zl on 2015/7/31.
 */
public class FundM extends Fund{

    private String base_fund_id;
    private String base_fund_nm;
    private String price;
    private String price_dt;
    private String index_nm;
    private String upper_recalc_price;
    private String lower_recalc_price;
    private String base_lower_recalc_rt;
    private String issue_dt;
    private String fundA_id;
    private String fundA_nm;
    private String coupon;
    private String coupon_next;
    private String coupon_descr_s;
    private String fundB_id;
    private String fundB_nm;
    private String abrate;
    private String base_est_dis_rt;
    private String fund_company_nm;

    public String getBase_fund_id() {
        return base_fund_id;
    }

    public void setBase_fund_id(String base_fund_id) {
        this.base_fund_id = base_fund_id;
    }

    public String getBase_fund_nm() {
        return base_fund_nm;
    }

    public void setBase_fund_nm(String base_fund_nm) {
        this.base_fund_nm = base_fund_nm;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice_dt() {
        return price_dt;
    }

    public void setPrice_dt(String price_dt) {
        this.price_dt = price_dt;
    }

    public String getIndex_nm() {
        return index_nm;
    }

    public void setIndex_nm(String index_nm) {
        this.index_nm = index_nm;
    }

    public String getUpper_recalc_price() {
        return upper_recalc_price;
    }

    public void setUpper_recalc_price(String upper_recalc_price) {
        this.upper_recalc_price = upper_recalc_price;
    }

    public String getLower_recalc_price() {
        return lower_recalc_price;
    }

    public void setLower_recalc_price(String lower_recalc_price) {
        this.lower_recalc_price = lower_recalc_price;
    }

    public String getBase_lower_recalc_rt() {
        return base_lower_recalc_rt;
    }

    public void setBase_lower_recalc_rt(String base_lower_recalc_rt) {
        this.base_lower_recalc_rt = base_lower_recalc_rt;
    }

    public String getIssue_dt() {
        return issue_dt;
    }

    public void setIssue_dt(String issue_dt) {
        this.issue_dt = issue_dt;
    }

    public String getFundA_id() {
        return fundA_id;
    }

    public void setFundA_id(String fundA_id) {
        this.fundA_id = fundA_id;
    }

    public String getFundA_nm() {
        return fundA_nm;
    }

    public void setFundA_nm(String fundA_nm) {
        this.fundA_nm = fundA_nm;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public String getCoupon_next() {
        return coupon_next;
    }

    public void setCoupon_next(String coupon_next) {
        this.coupon_next = coupon_next;
    }

    public String getCoupon_descr_s() {
        return coupon_descr_s;
    }

    public void setCoupon_descr_s(String coupon_descr_s) {
        this.coupon_descr_s = coupon_descr_s;
    }

    public String getFundB_id() {
        return fundB_id;
    }

    public void setFundB_id(String fundB_id) {
        this.fundB_id = fundB_id;
    }

    public String getFundB_nm() {
        return fundB_nm;
    }

    public void setFundB_nm(String fundB_nm) {
        this.fundB_nm = fundB_nm;
    }

    public String getAbrate() {
        return abrate;
    }

    public void setAbrate(String abrate) {
        this.abrate = abrate;
    }

    public String getBase_est_dis_rt() {
        return base_est_dis_rt;
    }

    public void setBase_est_dis_rt(String base_est_dis_rt) {
        this.base_est_dis_rt = base_est_dis_rt;
    }

    public String getFund_company_nm() {
        return fund_company_nm;
    }

    public void setFund_company_nm(String fund_company_nm) {
        this.fund_company_nm = fund_company_nm;
    }

    @Override
    public String toString() {
        return "FundM{" +
                "base_fund_id='" + base_fund_id + '\'' +
                ", base_fund_nm='" + base_fund_nm + '\'' +
                ", price='" + price + '\'' +
                ", price_dt='" + price_dt + '\'' +
                ", index_nm='" + index_nm + '\'' +
                ", upper_recalc_price='" + upper_recalc_price + '\'' +
                ", lower_recalc_price='" + lower_recalc_price + '\'' +
                ", base_lower_recalc_rt='" + base_lower_recalc_rt + '\'' +
                ", issue_dt='" + issue_dt + '\'' +
                ", fundA_id='" + fundA_id + '\'' +
                ", fundA_nm='" + fundA_nm + '\'' +
                ", coupon='" + coupon + '\'' +
                ", coupon_next='" + coupon_next + '\'' +
                ", coupon_descr_s='" + coupon_descr_s + '\'' +
                ", fundB_id='" + fundB_id + '\'' +
                ", fundB_nm='" + fundB_nm + '\'' +
                ", abrate='" + abrate + '\'' +
                ", base_est_dis_rt='" + base_est_dis_rt + '\'' +
                ", fund_company_nm='" + fund_company_nm + '\'' +
                '}';
    }

    public void setAllValue(List<String> list) {
        this.setBase_fund_id(list.get(0));
        this.setBase_fund_nm(list.get(1));
        this.setPrice(list.get(40));
        this.setPrice_dt(list.get(41));
        this.setIndex_nm(list.get(10));
        this.setUpper_recalc_price(list.get(11));
        this.setLower_recalc_price(list.get(12));
        this.setBase_lower_recalc_rt(list.get(43));
        this.setIssue_dt(list.get(6));
        this.setFundA_id(list.get(19));
        this.setFundA_nm(list.get(20));
        this.setCoupon(list.get(23));
        this.setCoupon_next(list.get(24));
        this.setCoupon_descr_s(list.get(22));
        this.setFundB_id(list.get(26));
        this.setFundB_nm(list.get(27));
        this.setAbrate(list.get(46));
        this.setBase_est_dis_rt(list.get(44));
        this.setFund_company_nm(list.get(5));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FundM fundM = (FundM) o;

        if (base_fund_id != null ? !base_fund_id.equals(fundM.base_fund_id) : fundM.base_fund_id != null) return false;
        if (base_fund_nm != null ? !base_fund_nm.equals(fundM.base_fund_nm) : fundM.base_fund_nm != null) return false;
        if (price != null ? !price.equals(fundM.price) : fundM.price != null) return false;
        if (price_dt != null ? !price_dt.equals(fundM.price_dt) : fundM.price_dt != null) return false;
        if (index_nm != null ? !index_nm.equals(fundM.index_nm) : fundM.index_nm != null) return false;
        if (upper_recalc_price != null ? !upper_recalc_price.equals(fundM.upper_recalc_price) : fundM.upper_recalc_price != null)
            return false;
        if (lower_recalc_price != null ? !lower_recalc_price.equals(fundM.lower_recalc_price) : fundM.lower_recalc_price != null)
            return false;
        if (base_lower_recalc_rt != null ? !base_lower_recalc_rt.equals(fundM.base_lower_recalc_rt) : fundM.base_lower_recalc_rt != null)
            return false;
        if (issue_dt != null ? !issue_dt.equals(fundM.issue_dt) : fundM.issue_dt != null) return false;
        if (fundA_id != null ? !fundA_id.equals(fundM.fundA_id) : fundM.fundA_id != null) return false;
        if (fundA_nm != null ? !fundA_nm.equals(fundM.fundA_nm) : fundM.fundA_nm != null) return false;
        if (coupon != null ? !coupon.equals(fundM.coupon) : fundM.coupon != null) return false;
        if (coupon_next != null ? !coupon_next.equals(fundM.coupon_next) : fundM.coupon_next != null) return false;
        if (coupon_descr_s != null ? !coupon_descr_s.equals(fundM.coupon_descr_s) : fundM.coupon_descr_s != null)
            return false;
        if (fundB_id != null ? !fundB_id.equals(fundM.fundB_id) : fundM.fundB_id != null) return false;
        if (fundB_nm != null ? !fundB_nm.equals(fundM.fundB_nm) : fundM.fundB_nm != null) return false;
        if (abrate != null ? !abrate.equals(fundM.abrate) : fundM.abrate != null) return false;
        if (base_est_dis_rt != null ? !base_est_dis_rt.equals(fundM.base_est_dis_rt) : fundM.base_est_dis_rt != null)
            return false;
        return !(fund_company_nm != null ? !fund_company_nm.equals(fundM.fund_company_nm) : fundM.fund_company_nm != null);

    }

    @Override
    public int hashCode() {
        int result = base_fund_id != null ? base_fund_id.hashCode() : 0;
        result = 31 * result + (base_fund_nm != null ? base_fund_nm.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (price_dt != null ? price_dt.hashCode() : 0);
        result = 31 * result + (index_nm != null ? index_nm.hashCode() : 0);
        result = 31 * result + (upper_recalc_price != null ? upper_recalc_price.hashCode() : 0);
        result = 31 * result + (lower_recalc_price != null ? lower_recalc_price.hashCode() : 0);
        result = 31 * result + (base_lower_recalc_rt != null ? base_lower_recalc_rt.hashCode() : 0);
        result = 31 * result + (issue_dt != null ? issue_dt.hashCode() : 0);
        result = 31 * result + (fundA_id != null ? fundA_id.hashCode() : 0);
        result = 31 * result + (fundA_nm != null ? fundA_nm.hashCode() : 0);
        result = 31 * result + (coupon != null ? coupon.hashCode() : 0);
        result = 31 * result + (coupon_next != null ? coupon_next.hashCode() : 0);
        result = 31 * result + (coupon_descr_s != null ? coupon_descr_s.hashCode() : 0);
        result = 31 * result + (fundB_id != null ? fundB_id.hashCode() : 0);
        result = 31 * result + (fundB_nm != null ? fundB_nm.hashCode() : 0);
        result = 31 * result + (abrate != null ? abrate.hashCode() : 0);
        result = 31 * result + (base_est_dis_rt != null ? base_est_dis_rt.hashCode() : 0);
        result = 31 * result + (fund_company_nm != null ? fund_company_nm.hashCode() : 0);
        return result;
    }
}

package dao;

import domain.FundA;
import domain.FundB;
import domain.FundM;
import org.apache.commons.dbutils.QueryRunner;
import util.JDBCUtils;

import java.sql.SQLException;
import java.util.UUID;

/**
 * Created by hadoop on 2015/7/22.
 */
public class FundDaoImpl {

    private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

    public int addFund(FundB fundB,String currentDate) {

        String sql = "insert into fundb(" +
                "uuid," +
                "fundb_id," +
                "fundb_name," +
                "fundb_current_price," +
                "fundb_increase_rt," +
                "fundb_volume," +
                "fundb_value," +
                "fundb_discount_rt," +
                "fundb_left_year," +
                "fundb_price_leverage_rt," +
                "fundb_net_leverage_rt," +
                "fundb_capital_rasising_rt," +
                "fundb_index_name," +
                "fundb_index_increase_rt," +
                "fundb_lower_recalc_rt," +
                "fundb_upper_recalc_rt," +
                "fundb_base_est_dis_rt," +
                "abrate," +
                "fundb_base_price," +
                "crawl_time)" +
                "values( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        Object[] params = {
                UUID.randomUUID().toString(),
                fundB.getFundb_id(),
                fundB.getFundb_name(),
                fundB.getFundb_current_price(),
                fundB.getFundb_increase_rt(),
                fundB.getFundb_volume(),
                fundB.getFundb_value(),
                fundB.getFundb_discount_rt(),
                fundB.getFundb_left_year(),
                fundB.getFundb_price_leverage_rt(),
                fundB.getFundb_net_leverage_rt(),
                fundB.getFundb_capital_rasising_rt(),
                fundB.getFundb_index_name(),
                fundB.getFundb_index_increase_rt(),
                fundB.getFundb_lower_recalc_rt(),
                fundB.getFundb_upper_recalc_rt(),
                fundB.getFundb_base_est_dis_rt(),
                fundB.getAbrate(),
                fundB.getFundb_base_price(),
                currentDate
        };
            int r = 0;

        try {
            r = qr.update(sql, params);
        } catch (SQLException e) {
            if (e.getErrorCode() != 1062)
                System.out.println(e.getMessage());
        }
        return r;
    }

    public int addFund(FundA fundA,String currentDate) {

        String sql = "insert into funda(" +
                "uuid," +
                "funda_id ," +
                "funda_name ," +
                "funda_current_price ," +
                "funda_increase_rt," +
                "funda_volume," +
                "funda_value ," +
                "funda_discount_rt ," +
                "coupon_descr_s," +
                "funda_coupon ," +
                "funda_coupon_next ," +
                "funda_profit_rt_next ," +
                "funda_left_year," +
                "funda_index_name ," +
                "funda_index_increase_rt," +
                "funda_lower_recalc_rt," +
                "lower_recalc_profit_rt ," +
                "fundb_upper_recalc_rt," +
                "funda_base_est_dis_rt ," +
                "funda_base_est_dis_rt_t1 ," +
                "funda_base_est_dis_rt_t2," +
                "funda_amount," +
                "funda_amount_increase ," +
                "abrate ," +
                "crawl_time" +
                ") values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        Object[] params = {
                UUID.randomUUID().toString(),
                fundA.getFunda_id(),
                fundA.getFunda_name(),
                fundA.getFunda_current_price(),
                fundA.getFunda_increase_rt(),
                fundA.getFunda_volume(),
                fundA.getFunda_value(),
                fundA.getFunda_discount_rt(),
                fundA.getCoupon_descr_s(),
                fundA.getFunda_coupon(),
                fundA.getFunda_coupon_next(),
                fundA.getFunda_profit_rt_next(),
                fundA.getFunda_left_year(),
                fundA.getFunda_index_name(),
                fundA.getFunda_index_increase_rt1(),
                fundA.getFunda_lower_recalc_rt(),
                fundA.getLower_recalc_profit_rt(),
                fundA.getFundb_upper_recalc_rt(),
                fundA.getFunda_base_est_dis_rt(),
                fundA.getFunda_base_est_dis_rt_t1(),
                fundA.getFunda_base_est_dis_rt_t2(),
                fundA.getFunda_amount(),
                fundA.getFunda_amount_increase(),
                fundA.getAbrate(),
                currentDate
        };
        int r = 0;

        try {
            r = qr.update(sql, params);
        } catch (SQLException e) {
            if (e.getErrorCode() != 1062) {
                System.out.println(e.getMessage());
            }
        }
        return r;
    }

    public int addFund(FundM fund,String currentDate) {

        String sql = "insert into fundm(" +
                "uuid," +
                "base_fund_id," +
                "base_fund_nm," +
                "price," +
                "price_dt," +
                "index_nm," +
                "upper_recalc_price," +
                "lower_recalc_price," +
                "base_lower_recalc_rt," +
                "issue_dt," +
                "fundA_id," +
                "fundA_nm," +
                "coupon," +
                "coupon_next," +
                "coupon_descr_s," +
                "fundB_id," +
                "fundB_nm," +
                "abrate," +
                "base_est_dis_rt," +
                "fund_company_nm," +
                "crawl_time"+
                ") " +
                "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        Object[] params = {
                UUID.randomUUID().toString(),
                fund.getBase_fund_id(),
                fund.getBase_fund_nm(),
                fund.getPrice(),
                fund.getPrice_dt(),
                fund.getIndex_nm(),
                fund.getUpper_recalc_price(),
                fund.getLower_recalc_price(),
                fund.getBase_lower_recalc_rt(),
                fund.getIssue_dt(),
                fund.getFundA_id(),
                fund.getFundA_nm(),
                fund.getCoupon(),
                fund.getCoupon_next(),
                fund.getCoupon_descr_s(),
                fund.getFundB_id(),
                fund.getFundB_nm(),
                fund.getAbrate(),
                fund.getBase_est_dis_rt(),
                fund.getFund_company_nm(),
                currentDate
        };
        int r = 0;

        try {
            r = qr.update(sql, params);
        } catch (SQLException e) {
            if (e.getErrorCode() != 1062) {
                System.out.println(e.getMessage());
            }
        }
        return r;
    }
}

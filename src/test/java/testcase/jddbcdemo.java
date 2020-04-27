package testcase;

import utils.jdbctest;

import java.sql.ResultSet;
import java.sql.SQLException;

public class jddbcdemo {
    public static void main(String args[]) throws SQLException {
        ResultSet resultifon = null ;
        String sql = "SELECT * from HS_HPS.FUND_SETT_ACCOUNT_LOG a WHERE a.FUND_ACCOUNT_TRADE='0000000316502' AND a.TRANS_DATE='20200417'";

        jdbctest tt = new jdbctest();
        resultifon = tt.queryinfo(sql);
        while (resultifon.next()){
            System.out.println(resultifon.getString("id"));
            System.out.println(new StringBuffer().append(resultifon.getString("id")).append('\t').append(resultifon.getString("FUND_ACCOUNT_TRADE")));
        }

    }
}

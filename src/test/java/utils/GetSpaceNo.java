package utils;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GetSpaceNo {
    public static void main(String args[]) throws SQLException {
        ResultSet resultifon = null ;
        String sql = "SELECT * from HS_trade.trade_auction_space order by id desc";

        jdbctest tt = new jdbctest();
        resultifon = tt.queryinfo(sql);
        if (resultifon.next()){
            System.out.println(resultifon.getString("space_no"));
        }

    }
}

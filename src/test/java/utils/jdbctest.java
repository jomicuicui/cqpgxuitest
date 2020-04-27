package utils;


import org.testng.Assert;

import java.sql.*;

public class jdbctest {
    ResultSet resultifon = null;

    public ResultSet queryinfo(String sqlinfo) {
        try {
            //加载驱动
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //得到连接
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@172.18.246.235:1521:cqpgxcs", "hs_uc", "cqpgx");
            //创建PreparedStatement
            PreparedStatement pstmt = connection.prepareStatement(sqlinfo);
            //执行查询
            resultifon = pstmt.executeQuery();
//            while (resultifon.next()) {
//                String str1 = resultifon.getString("id");
//
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultifon;
    }

    public void check(String actualvalue, String expectedvalue) throws SQLException {
        while (resultifon.next()) {
            Assert.assertEquals(resultifon.getString(actualvalue), expectedvalue);

        }
    }


}

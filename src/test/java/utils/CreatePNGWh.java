package utils;

import testcase.Apply_PNGwhInsert01;

/**
 * @Authot: Jomi Gan
 * @Description: 新建PNG仓单入库
 * @Date: Create in 21:14 2020/1/3
 **/
public class CreatePNGWh {
    public void CreatePNGWh() throws InterruptedException {
        Apply_PNGwhInsert01 createPnGwh01 = new Apply_PNGwhInsert01();
        createPnGwh01.test01_loginback();
        createPnGwh01.test02_createPNGwh_one();
//        createPnGwh01.test03_login_wh();
//        createPnGwh01.test04_createPNGwh_two();
//        createPnGwh01.test05_login_wh();
//        createPnGwh01.test06_createPNGwh_three();
//        createPnGwh01.test07_login_wh();
//        createPnGwh01.test08_createPNGwh_four();

    }
}

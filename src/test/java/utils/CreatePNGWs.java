package utils;

import testcase.Apply_PNGwsInsert01;

/**
 * @Authot: Jomi Gan
 * @Description: 新建PNG仓单入库
 * @Date: Create in 21:14 2020/1/3
 **/
public class CreatePNGWs {
    public void CreatePNGWs() throws InterruptedException {
        Apply_PNGwsInsert01 createPnGws01 = new Apply_PNGwsInsert01();
        createPnGws01.test01_login_sell();
        createPnGws01.test02_stepone();
        createPnGws01.test03_login_wh();
        createPnGws01.test04_steptwo();
        createPnGws01.test05_login_sell();
        createPnGws01.test06_stepthree();
        createPnGws01.test07_login_wh();
        createPnGws01.test08_stepfour();
        createPnGws01.test09_loginback();
        createPnGws01.test10_stepfive();
        createPnGws01.test11_login_sell();
        createPnGws01.test12_stepsix();
    }
}

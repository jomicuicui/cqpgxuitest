package utils;

import testcase.Apply_LNGwsInsert01;

/**
 * @Authot: Jomi Gan
 * @Description:  新建LNG仓单入库
 * @Date: Create in 20:52 2020/1/3
 **/
public class CreateLNGWs {
    public void CreateLNGWs() throws InterruptedException {
        Apply_LNGwsInsert01 apply_lnGwsInsert01 = new Apply_LNGwsInsert01();
        apply_lnGwsInsert01.test01_login_sell();
        apply_lnGwsInsert01.test02_stepone();
        apply_lnGwsInsert01.test03_login_wh();
        apply_lnGwsInsert01.test04_steptwo();
        apply_lnGwsInsert01.test05_login_sell();
        apply_lnGwsInsert01.test06_stepthree();
        apply_lnGwsInsert01.test07_login_wh();
        apply_lnGwsInsert01.test08_stepfour();
        apply_lnGwsInsert01.test11_login_sell();
        apply_lnGwsInsert01.test12_stepsix();
    }

}

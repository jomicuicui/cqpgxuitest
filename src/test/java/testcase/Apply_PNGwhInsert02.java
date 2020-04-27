package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.Create_PNGwhObject;
import pageobject.LoginObject;
import utils.Utils;


/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 10:44 2019/11/20
 **/
//新建PNG仓单
public class Apply_PNGwhInsert02 {
    WebDriver driver;
    String url_front = "http://uc-test.chinacqpgx.com/login.htm";
    Utils utils = new Utils();
    String account_frontsell = utils.showConfig().getProperty("account_frontsell");
    String password_frontsell = utils.showConfig().getProperty("password_frontsell");
    String custname = utils.showConfig().getProperty("custname");
    String applywhweight = utils.showConfig().getProperty("applywhweight");
    String reasoninfo = utils.showConfig().getProperty("reasoninfo");
    String account_back = utils.showConfig().getProperty("account_back");
    String password_back = utils.showConfig().getProperty("password_back");


    //登录后台
    @Test(priority = 1)
    public void test01_loginback() throws InterruptedException {
        String url_back = "http://center-test.chinacqpgx.com/system/login.htm";
        driver = new ChromeDriver();
        driver.get(url_back);
        LoginObject LoginObject = new LoginObject(driver);
        LoginObject.login_back(account_back,password_back);
    }

    //后台注册及审核拒绝储单
    @Test(priority = 2)
    public void test02_createPNGwh_one() throws InterruptedException {
        Create_PNGwhObject createPnGwhObject = new Create_PNGwhObject(driver);
        createPnGwhObject.createPNGwh_one(custname,applywhweight);
        createPnGwhObject.createPNGwh_tworefuse(reasoninfo);
    }

}

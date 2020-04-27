package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.Create_LNGwsObject;
import pageobject.Create_PNGwsObject;
import pageobject.LoginObject;
import utils.Utils;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 10:44 2019/11/20
 **/
//新建LNG仓单
public class Apply_LNGwsInsert01 {
    WebDriver driver;
    String url_front = "http://uc-test.chinacqpgx.com/login.htm";
    Utils utils = new Utils();
    String account_frontsell = utils.showConfig().getProperty("account_frontsell");
    String password_frontsell = utils.showConfig().getProperty("password_frontsell");
    String account_frontsell3 = utils.showConfig().getProperty("account_frontsell3");
    String password_frontsell3 = utils.showConfig().getProperty("password_frontsell3");
    String preweight = utils.showConfig().getProperty("preweight");
    String position_duo = utils.showConfig().getProperty("position_duo");
    String position_store = utils.showConfig().getProperty("position_store");
    String gasRatenum = utils.showConfig().getProperty("gasRatenum");

    //卖家登录
    @Test(priority = 1)
    public void test01_login_sell() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell,password_frontsell);
    }

    //卖家申请入库
    @Test(priority = 2)
    public void test02_stepone() throws InterruptedException {
        Create_LNGwsObject create_lnGwsObject = new Create_LNGwsObject(driver);
        create_lnGwsObject.Createws_stepone(preweight,gasRatenum);
    }

    //仓库管理员登录
    @Test(priority = 3)
    public void test03_login_wh() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell3,password_frontsell3);

    }
    //仓库管理员审批、验收
    @Test(priority = 4)
    public void test04_steptwo() throws InterruptedException {
        Create_PNGwsObject createPnGwsObject = new Create_PNGwsObject(driver);
        createPnGwsObject.Createws_steptwo(preweight);
    }
    //卖家登录
    @Test(priority = 5)
    public void test05_login_sell() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell,password_frontsell);
    }
    //卖家入库管理：入库确认
    @Test(priority = 6)
    public void test06_stepthree() throws InterruptedException {
        Create_PNGwsObject createPnGwsObject = new Create_PNGwsObject(driver);
        createPnGwsObject.Createws_stepthree();
    }
    //仓库管理员登录
    @Test(priority = 7)
    public void test07_login_wh() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell3,password_frontsell3);
    }
    //仓库管理员：入库管理-入库管理
    @Test(priority = 8)
    public void test08_stepfour() throws InterruptedException {
        Create_LNGwsObject create_lnGwsObject = new Create_LNGwsObject(driver);
        create_lnGwsObject.Createws_steptfour(preweight,position_duo);
    }
    //这里验证了后台不设置品种审核的情况，所以没有后台审核的步骤

    //卖家登录进行入库验收
    @Test(priority = 11)
    public void test11_login_sell() throws InterruptedException {
        String url_front = "http://uc-test.chinacqpgx.com/login.htm";
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell,password_frontsell);
    }
    @Test(priority = 12)
    public void test12_stepsix() throws InterruptedException {
        Create_PNGwsObject createPnGwsObject = new Create_PNGwsObject(driver);
        createPnGwsObject.Createws_steptsix();
    }

}

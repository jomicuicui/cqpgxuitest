package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.Create_PNGwsObject;
import pageobject.LoginObject;
import utils.Utils;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 10:44 2019/11/20
 **/
//新建PNG仓单
public class Apply_PNGwsInsert01 {
    WebDriver driver;
    String url_front = "http://uc-test.chinacqpgx.com/login.htm";
    Utils utils = new Utils();
    String account_frontsell = utils.showConfig().getProperty("account_frontsell");
    String password_frontsell = utils.showConfig().getProperty("password_frontsell");
    String account_frontsell3 = utils.showConfig().getProperty("account_frontsell3");
    String password_frontsell3 = utils.showConfig().getProperty("password_frontsell3");
    String account_back = utils.showConfig().getProperty("account_back");
    String password_back = utils.showConfig().getProperty("password_back");
    String preweight = utils.showConfig().getProperty("preweight");
    String position_duo = utils.showConfig().getProperty("position_duo");
    String position_store = utils.showConfig().getProperty("position_store");


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
        Create_PNGwsObject create_PNGwsObject = new Create_PNGwsObject(driver);
        create_PNGwsObject.Createws_stepone(preweight);
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
        Create_PNGwsObject createWsObject = new Create_PNGwsObject(driver);
        createWsObject.Createws_steptwo(preweight);
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
        Create_PNGwsObject create_PNGwsObject = new Create_PNGwsObject(driver);
        create_PNGwsObject.Createws_stepthree();
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
        Create_PNGwsObject createWsObject = new Create_PNGwsObject(driver);
        createWsObject.Createws_steptfour(preweight,position_duo,position_store);
    }
    //登录后台
    @Test(priority = 9)
    public void test09_loginback() throws InterruptedException {
        String url_back = "http://center-test.chinacqpgx.com/system/login.htm";
        driver = new ChromeDriver();
        driver.get(url_back);
        LoginObject LoginObject = new LoginObject(driver);
        LoginObject.login_back(account_back,password_back);
    }
    //后台预制仓单审核
    @Test(priority = 10)
    public void test10_stepfive() throws InterruptedException {
        Create_PNGwsObject createWsObject = new Create_PNGwsObject(driver);
        createWsObject.Createws_steptfive();
    }
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
        Create_PNGwsObject createWsObject = new Create_PNGwsObject(driver);
        createWsObject.Createws_steptsix();
    }
}

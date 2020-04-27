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
public class Apply_PNGwhInsert01 {
    WebDriver driver;
    String url_front = "http://uc-test.chinacqpgx.com/login.htm";
    Utils utils = new Utils();
    String account_frontsell = utils.showConfig().getProperty("account_frontsell");
    String password_frontsell = utils.showConfig().getProperty("password_frontsell");
    String account_frontsell3 = utils.showConfig().getProperty("account_frontsell3");
    String password_frontsell3 = utils.showConfig().getProperty("password_frontsell3");
    String custname = utils.showConfig().getProperty("custname");
    String applywhweight = utils.showConfig().getProperty("applywhweight");
    String xtractinputtotal = utils.showConfig().getProperty("applywhweight");
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

    //后台注册及审核通过储单
    @Test(priority = 2)
    public void test02_createPNGwh_one() throws InterruptedException {
        Create_PNGwhObject createPnGwhObject = new Create_PNGwhObject(driver);
        createPnGwhObject.createPNGwh_one(custname,applywhweight);
        createPnGwhObject.createPNGwh_twopass();
    }

    //因为目前储单流程未定，所以目前只注册审核后进行交易即可

    //前台会员登录
    @Test(priority = 3)
    public void test03_login_wh() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell,password_frontsell);
    }
    //前台会员数申请提货
    @Test(priority = 4)
    public void test04_createPNGwh_two() throws InterruptedException {
        Create_PNGwhObject createPnGwhObject = new Create_PNGwhObject(driver);
        createPnGwhObject.createPNGwh_three(xtractinputtotal);
    }


    //仓库管理员登录
    @Test(priority = 5)
    public void test05_login_wh() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell3,password_frontsell3);
    }

    //仓库管理员出库操作
    @Test(priority = 6)
    public void test06_createPNGwh_three() throws InterruptedException {
        Create_PNGwhObject createPnGwhObject = new Create_PNGwhObject(driver);
        createPnGwhObject.createPNGwh_four();
    }

    //会员进行收货确认
    @Test(priority = 7)
    public void test07_login_wh() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell,password_frontsell);
    }
    @Test(priority = 8)
    public void test08_createPNGwh_four() throws InterruptedException {
        Create_PNGwhObject createPnGwhObject = new Create_PNGwhObject(driver);
        createPnGwhObject.createPNGwh_five();
    }
}

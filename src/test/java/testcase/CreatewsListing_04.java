package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreatewsListingObject;
import pageobject.LoginObject;
import pageobject.SettleStorageFeesObject;
import utils.CreateLNGWs;
import utils.ReviewListing;
import utils.Utils;


//卖家发起PNG仓单竞拍，买家jomisellbuy摘单

public class CreatewsListing_04 {
    WebDriver driver;
    String  url_front = "http://uc-test.chinacqpgx.com/login.htm";
    Utils utils = new Utils();
    String account_frontsell = utils.showConfig().getProperty("account_frontsell");
    String password_frontsell = utils.showConfig().getProperty("password_frontsell");
    String minweight = utils.showConfig().getProperty("minweight");
    String linkman = utils.showConfig().getProperty("linkman");
    String contactphone = utils.showConfig().getProperty("contactphone");
    String maxweight = utils.showConfig().getProperty("maxweight");
    String bidperpeight = utils.showConfig().getProperty("bidperpeight");
    String account_back = utils.showConfig().getProperty("account_back");
    String password_back = utils.showConfig().getProperty("password_back");
    String listunitprice = utils.showConfig().getProperty("listunitprice");
    String reviewnotpassmessageinfo = utils.showConfig().getProperty("bidweight");


    //新建LNG仓单入库
    @Test
    public void test01_createlngws() throws InterruptedException {
        CreateLNGWs createPNGWs = new CreateLNGWs();
        createPNGWs.CreateLNGWs();
    }

    //登录交易系统前台
    @Test
    public void test02_loginfront_sell() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell,password_frontsell);
    }

    //卖家提交竞标
    @Test
    public void test03_createbid() throws InterruptedException {
        //提前结清仓单仓储费
        SettleStorageFeesObject settleStorageFeesObject = new SettleStorageFeesObject(driver);
        settleStorageFeesObject.SettStorageFees();
        CreatewsListingObject createwsListingObject = new CreatewsListingObject(driver);
        createwsListingObject.sellercreatewsListing3(listunitprice, minweight, linkman, contactphone, maxweight, bidperpeight);
    }

    //后台审核拒绝该挂牌订单
    @Test
    public void test04_check() throws InterruptedException {
        ReviewListing reviewListing = new ReviewListing();
        reviewListing.loginback(account_back,password_back);
        reviewListing.litingreview_notpass(reviewnotpassmessageinfo);
    }

}

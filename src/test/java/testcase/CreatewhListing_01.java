package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreatewhListingObject;
import pageobject.LoginObject;
import utils.BuyerMarginListing;
import utils.CreatePNGWh;
import utils.Utils;


//卖家发起PNG储单挂牌，买家摘牌

public class CreatewhListing_01 {
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
    String listunitprice = utils.showConfig().getProperty("listunitprice");
    String account_frontbuy1 = utils.showConfig().getProperty("account_frontbuy1");
    String password_frontbuy1 = utils.showConfig().getProperty("password_frontbuy1");
    String buyerdelistingquantity = utils.showConfig().getProperty("bidweight");


    //新建PNG储单入库
    @Test
    public void test01_createpngwh() throws InterruptedException {
        CreatePNGWh createPNGWh = new CreatePNGWh();
        createPNGWh.CreatePNGWh();
    }

    //登录交易系统前台
    @Test
    public void test02_loginfront_sell() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell,password_frontsell);
    }

    //卖家提交储单挂牌
    @Test
    public void test03_createbid() throws InterruptedException {
        CreatewhListingObject createwhListingObject = new CreatewhListingObject(driver);
        createwhListingObject.CreatewhListingObject_01(listunitprice, minweight, linkman, contactphone, maxweight, bidperpeight);
    }

    //买家进行摘牌
    @Test
    public void test04_buyerlisting() throws InterruptedException {
        BuyerMarginListing buyerMarginListing = new BuyerMarginListing();
        buyerMarginListing.loginfront_buyer(account_frontbuy1,password_frontbuy1);
        buyerMarginListing.buyerMarginListing_buyer(buyerdelistingquantity);
    }

}

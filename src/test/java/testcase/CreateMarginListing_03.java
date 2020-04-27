package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreateMarginListingObject;
import pageobject.LoginObject;
import utils.BuyerMarginListing;
import utils.ReviewListing;
import utils.Utils;


//卖家发起PNG挂牌，买家一摘牌成功


public class CreateMarginListing_03 {
    WebDriver driver;
    String  url_front = "http://uc-test.chinacqpgx.com/login.htm";
    Utils utils = new Utils();
    String account_frontsell = utils.showConfig().getProperty("account_frontsell");
    String password_frontsell = utils.showConfig().getProperty("password_frontsell");
    String account_back = utils.showConfig().getProperty("account_back");
    String password_back = utils.showConfig().getProperty("password_back");
    String bidweight = utils.showConfig().getProperty("bidweight");
    String minweight = utils.showConfig().getProperty("minweight");
    String linkman = utils.showConfig().getProperty("linkman");
    String contactphone = utils.showConfig().getProperty("contactphone");
    String maxweight = utils.showConfig().getProperty("maxweight");
    String settlecycle = utils.showConfig().getProperty("settlecycleweek");
    String basepriceshow = utils.showConfig().getProperty("basepriceshow");
    String bidperprice = utils.showConfig().getProperty("bidperprice");
    String bidperpeight = utils.showConfig().getProperty("bidperpeight");
    String listunitprice = utils.showConfig().getProperty("listunitprice");
    String account_frontbuy1 = utils.showConfig().getProperty("account_frontbuy1");
    String password_frontbuy1 = utils.showConfig().getProperty("password_frontbuy1");
    String buyerdelistingquantity = utils.showConfig().getProperty("bidweight");




    //登录交易系统前台
    @Test
    public void test01_loginfront_sell() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell,password_frontsell);
    }

    //卖家提交挂牌
    @Test
    public void test02_createbid() throws InterruptedException {
        CreateMarginListingObject createMarginListingObject = new CreateMarginListingObject(driver);
        createMarginListingObject.sellercreateMarginListing2(listunitprice,bidweight, minweight, linkman, contactphone, maxweight, settlecycle, basepriceshow, bidperprice, bidperpeight);
    }

    //后台审核通过该挂牌订单
    @Test
    public void test03_check() throws InterruptedException {
        ReviewListing reviewListing = new ReviewListing();
        reviewListing.loginback(account_back,password_back);
        reviewListing.litingreview_pass();
    }

    //买家进行摘牌
    @Test
    public void test04_buyerlisting() throws InterruptedException {
        BuyerMarginListing buyerMarginListing = new BuyerMarginListing();
        buyerMarginListing.loginfront_buyer(account_frontbuy1,password_frontbuy1);
        buyerMarginListing.buyerMarginListing_buyer(buyerdelistingquantity);
    }


}










































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































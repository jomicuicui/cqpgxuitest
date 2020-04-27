package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreateMarginAuctionObject;
import pageobject.LoginObject;
import utils.BuyerAuctionbid;
import utils.Ordername;
import utils.ReviewBid;
import utils.Utils;


//发起保证金竞拍，后台竞价

//液化天然气（LNG）
//        价格类型：商品价
//        成交计价模式：申报价成交
//        交收方式：线下交收
//        交收周期：7
//        不指定执行单位
//        合同类型：周合同
//        商品运输：卖方包运

public class CreateMarginAuction_07 {
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
    String baseprice = utils.showConfig().getProperty("baseprice");
    String bidperprice = utils.showConfig().getProperty("bidperprice");
    String bidperpeight = utils.showConfig().getProperty("bidperpeight");
    String account_frontbuy1 = utils.showConfig().getProperty("account_frontbuy1");
    String password_frontbuy1 = utils.showConfig().getProperty("password_frontbuy1");
    String account_frontbuy2 = utils.showConfig().getProperty("account_frontbuy2");
    String password_frontbuy2 = utils.showConfig().getProperty("password_frontbuy2");
    String bid_rowprice1 = utils.showConfig().getProperty("bid_rowprice1");
    String bid_rowweight1 = utils.showConfig().getProperty("bid_rowweight1");
    String bid_rowprice2 = utils.showConfig().getProperty("bid_rowprice2");
    String bid_rowweight2 = utils.showConfig().getProperty("bid_rowweight2");
    String gasRatenum = utils.showConfig().getProperty("gasRatenum");

    //登录交易系统前台
    @Test
    public void test01_loginfront_sell() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell,password_frontsell);
    }

    //卖家提交竞标
    @Test
    public void test02_createbid() throws InterruptedException {
        String classname = this.getClass().getSimpleName();
        Ordername ordername = new Ordername();
        String marginordername = ordername.aotuordername(classname);
        CreateMarginAuctionObject createMarginAuctionObject = new CreateMarginAuctionObject(driver);
        createMarginAuctionObject.CreateAuction6( marginordername, bidweight, minweight, maxweight, linkman, contactphone, settlecycle, baseprice, bidperprice, bidperpeight,gasRatenum);

    }

    //后台审核审核通过该竞价订单
    @Test
    public void test03_check() throws InterruptedException {
        ReviewBid reviewBid = new ReviewBid();
        reviewBid.loginback(account_back,password_back);
        reviewBid.biddingreview_pass();
    }

    //买家竞拍购买
    @Test
    public void test04_buyerauction() throws InterruptedException {
        BuyerAuctionbid buyerauction = new BuyerAuctionbid();
        buyerauction.loginfront_buyer(account_frontbuy1,password_frontbuy1);
        buyerauction.PlaceAuctionwithoutadr(bid_rowprice1,bid_rowweight1);
        buyerauction.loginfront_buyer(account_frontbuy2,password_frontbuy2);
        buyerauction.PlaceAuctionwithoutadr(bid_rowprice1,bid_rowweight1);
    }

}

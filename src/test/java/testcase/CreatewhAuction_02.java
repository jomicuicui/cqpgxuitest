package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreatewhAuctionObject;
import pageobject.LoginObject;
import utils.*;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:59 2019/12/26
 **/


//提交储气库PNG产品竞拍，后台审核拒绝
/*
        储气库PNG1
        价格类型：商品价
        成交计价模式：申报价成交
        摘单方式：保证金摘单

 */

public class CreatewhAuction_02 {
    WebDriver driver;
    String  url_front = "http://uc-test.chinacqpgx.com/login.htm";
    //读取配置
    Utils utils = new Utils();
    String bid_rowprice1 = utils.showConfig().getProperty("bid_rowprice1");
    String bid_rowweight1 = utils.showConfig().getProperty("bid_rowweight1");
    String bid_rowprice2 = utils.showConfig().getProperty("bid_rowprice2");
    String bid_rowweight2 = utils.showConfig().getProperty("bid_rowweight2");
    String account_frontsell = utils.showConfig().getProperty("account_frontsell");
    String password_frontsell = utils.showConfig().getProperty("password_frontsell");
    String account_frontbuy1 = utils.showConfig().getProperty("account_frontbuy1");
    String password_frontbuy1 = utils.showConfig().getProperty("password_frontbuy1");
    String account_frontbuy2 = utils.showConfig().getProperty("account_frontbuy2");
    String password_frontbuy2 = utils.showConfig().getProperty("password_frontbuy2");
    String minweight = utils.showConfig().getProperty("minweight");
    String linkman = utils.showConfig().getProperty("linkman");
    String contactphone = utils.showConfig().getProperty("contactphone");
    String maxweight = utils.showConfig().getProperty("maxweight");
    String baseprice = utils.showConfig().getProperty("baseprice");
    String bidperprice = utils.showConfig().getProperty("bidperprice");
    String bidperpeight = utils.showConfig().getProperty("bidperpeight");
    String account_back = utils.showConfig().getProperty("account_back");
    String password_back = utils.showConfig().getProperty("password_back");


    //新建PNG储单入库
    @Test
    public void test01_createpngwh() throws InterruptedException {
        CreatePNGWh createPNGWh = new CreatePNGWh();
        createPNGWh.CreatePNGWh();
    }

    //登录交易系统前台（卖家）
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
        //卖家提交竞标
        String classname = this.getClass().getSimpleName();
        Ordername ordername = new Ordername();
        String whordername = ordername.aotuordername(classname);
        CreatewhAuctionObject createwhAuctionObject = new CreatewhAuctionObject(driver);
        createwhAuctionObject.CreatewhAuctionObject_01(minweight,linkman,contactphone,maxweight,baseprice,bidperprice,bidperpeight,whordername);

    }

    //后台审核通过该竞价订单
    @Test
    public void test04_check() throws InterruptedException {
        ReviewBid reviewBid = new ReviewBid();
        reviewBid.loginback(account_back,password_back);
        reviewBid.biddingreview_pass();
    }

    //买家竞拍购买
    @Test
    public void test05_buyerauction() throws InterruptedException {
        BuyerAuctionbid buyerauction = new BuyerAuctionbid();
        buyerauction.loginfront_buyer(account_frontbuy1,password_frontbuy1);
        buyerauction.PlaceAuctionwithoutadr(bid_rowprice1,bid_rowweight1);
    }


}

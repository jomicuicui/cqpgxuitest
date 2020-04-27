package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreatewsBidObject;
import pageobject.LoginObject;
import pageobject.SettleStorageFeesObject;
import utils.BuyerMarginbid;
import utils.Ordername;
import utils.ReviewBid;
import utils.Utils;


//卖家发起仓单竞标，后台审批通过，买家竞标

public class CreatewsBid_02 {
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

    //登录交易系统前台（卖家）
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
        //提前结清仓单仓储费
        SettleStorageFeesObject settleStorageFeesObject = new SettleStorageFeesObject(driver);
        settleStorageFeesObject.SettStorageFees();
        //卖家提交竞标
        String classname = this.getClass().getSimpleName();
        Ordername ordername = new Ordername();
        String wsordername = ordername.aotuordername(classname);
        CreatewsBidObject createwsBidObject = new CreatewsBidObject(driver);
        createwsBidObject.CreatewsBidObject_01(minweight,linkman,contactphone,maxweight,baseprice,bidperprice,bidperpeight,wsordername);
    }

    //后台审核通过该竞价订单
    @Test
    public void test03_reviewpass() throws InterruptedException {
        ReviewBid reviewBid = new ReviewBid();
        reviewBid.loginback(account_back,password_back);
        reviewBid.biddingreview_pass();
    }

    //买家进行竞价
    @Test
    public void test04_buyerbid() throws InterruptedException {
        BuyerMarginbid buyerbid = new BuyerMarginbid();
        buyerbid.loginfront_buyer(account_frontbuy1,password_frontbuy1);
        buyerbid.PlaceBidwithoutadr(bid_rowprice1,bid_rowweight1);
        buyerbid.loginfront_buyer(account_frontbuy2,password_frontbuy2);
        buyerbid.PlaceBidwithoutadr(bid_rowprice2,bid_rowweight2);
    }


}

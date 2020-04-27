package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreateMarginBidObject;
import pageobject.LoginObject;
import utils.BuyerMarginbid;
import utils.Ordername;
import utils.ReviewBid;
import utils.Utils;


//管道天然气（门站）
//        价格类型：升贴水
//        成交计价模式：单一底价成交
//        不指定执行单位
//        交收方式：协商交收
//        交收周期：日
//        合同类型：日合同
//        商品运输：卖方包运

//卖家发起竞标，后台审批通过
public class CreateMarginBid_02 {
    WebDriver driver;
    String  url_front = "http://uc-test.chinacqpgx.com/login.htm";
    String url_back = "http://center-test.chinacqpgx.com/system/login.htm";

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
    String account_back = utils.showConfig().getProperty("account_back");
    String password_back = utils.showConfig().getProperty("password_back");
    String bidweight = utils.showConfig().getProperty("bidweight");
    String minweight = utils.showConfig().getProperty("minweight");
    String linkman = utils.showConfig().getProperty("linkman");
    String contactphone = utils.showConfig().getProperty("contactphone");
    String maxweight = utils.showConfig().getProperty("maxweight");
    String settlecycle = utils.showConfig().getProperty("settlecycle");
    String basepriceshow = utils.showConfig().getProperty("basepriceshow");
    String bidperprice = utils.showConfig().getProperty("bidperprice");
    String bidperpeight = utils.showConfig().getProperty("bidperpeight");


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
        String classname = this.getClass().getSimpleName();
        Ordername ordername = new Ordername();
        String marginordername = ordername.aotuordername(classname);
        CreateMarginBidObject createMarginBidObject = new CreateMarginBidObject(driver);
        createMarginBidObject.CreateMarginBid1(marginordername,bidweight, minweight, linkman, contactphone, maxweight, settlecycle, basepriceshow, bidperprice, bidperpeight
        );
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
        buyerbid.PlaceBidwithadr(bid_rowprice1,bid_rowweight1);
    }

}

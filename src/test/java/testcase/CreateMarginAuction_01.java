package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreateMarginAuctionObject;
import pageobject.LoginObject;
import utils.Ordername;
import utils.ReviewBid;
import utils.Utils;


//卖家发起竞拍，后台拒绝
//管道天然气（门站）
//        价格类型：升贴水
//        成交计价模式：申报价成交
//        交收方式：协商交收
//        交收周期：日
//        不指定执行单位
//        合同类型：日合同
//        商品运输：卖方包运

public class CreateMarginAuction_01 {
    WebDriver driver;
    String  url_front = "http://uc-test.chinacqpgx.com/login.htm";
    String url_back = "http://center-test.chinacqpgx.com/system/login.htm";
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
    String settlecycle = utils.showConfig().getProperty("settlecycle");
    String basepriceshow = utils.showConfig().getProperty("basepriceshow");
    String bidperprice = utils.showConfig().getProperty("bidperprice");
    String bidperpeight = utils.showConfig().getProperty("bidperpeight");
    String refuseordermessage = utils.showConfig().getProperty("refuseordermessage");



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
        createMarginAuctionObject.CreateAuction1( marginordername, bidweight, minweight, maxweight, linkman, contactphone, settlecycle, basepriceshow, bidperprice, bidperpeight);
    }

    //后台审核拒绝该竞价订单
    @Test
    public void test03_check() throws InterruptedException {
        ReviewBid reviewBid = new ReviewBid();
        reviewBid.loginback(account_back,password_back);
        reviewBid.biddingreview_notpass(refuseordermessage);
    }


}

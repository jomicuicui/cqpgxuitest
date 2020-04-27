package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreatewsBidObject;
import pageobject.LoginObject;
import utils.CreatePNGWs;
import utils.Ordername;
import utils.ReviewBid;
import utils.Utils;


//卖家发起PNG仓单竞标，被后台拒绝

public class CreatewsBid_01 {
    WebDriver driver;
    String  url_front = "http://uc-test.chinacqpgx.com/login.htm";
    Utils utils = new Utils();
    String account_frontsell = utils.showConfig().getProperty("account_frontsell");
    String password_frontsell = utils.showConfig().getProperty("password_frontsell");
    String minweight = utils.showConfig().getProperty("minweight");
    String linkman = utils.showConfig().getProperty("linkman");
    String contactphone = utils.showConfig().getProperty("contactphone");
    String maxweight = utils.showConfig().getProperty("maxweight");
    String baseprice = utils.showConfig().getProperty("baseprice");
    String bidperprice = utils.showConfig().getProperty("bidperprice");
    String bidperpeight = utils.showConfig().getProperty("bidperpeight");
    String account_back = utils.showConfig().getProperty("account_back");
    String password_back = utils.showConfig().getProperty("password_back");
    String refuseordermessage = utils.showConfig().getProperty("refuseordermessage");




    //新建PNG仓单入库
    @Test
    public void test01_createpngws() throws InterruptedException {
        CreatePNGWs createPNGWs = new CreatePNGWs();
        createPNGWs.CreatePNGWs();
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
        String classname = this.getClass().getSimpleName();
        Ordername ordername = new Ordername();
        String wsordername = ordername.aotuordername(classname);
        CreatewsBidObject createwsBidObject = new CreatewsBidObject(driver);
        createwsBidObject.CreatewsBidObject_01(minweight,linkman,contactphone,maxweight,baseprice,bidperprice,bidperpeight,wsordername);
    }

    //后台审核拒绝该竞价订单
    @Test
    public void test04_reviewpass() throws InterruptedException {
        ReviewBid reviewBid = new ReviewBid();
        reviewBid.loginback(account_back,password_back);
        reviewBid.biddingreview_notpass(refuseordermessage);
    }

}

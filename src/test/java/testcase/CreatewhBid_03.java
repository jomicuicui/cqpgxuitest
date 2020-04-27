package testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreatewhBidObject;
import pageobject.LoginObject;
import utils.CreatePNGWh;
import utils.Ordername;
import utils.ReviewBid;
import utils.Utils;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:59 2019/12/26
 **/
public class CreatewhBid_03 {
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
    String refuseordermessage = utils.showConfig().getProperty("refuseordermessage");
    String minweight = utils.showConfig().getProperty("minweight");
    String linkman = utils.showConfig().getProperty("linkman");
    String contactphone = utils.showConfig().getProperty("contactphone");
    String maxweight = utils.showConfig().getProperty("maxweight");
    String baseprice = utils.showConfig().getProperty("baseprice");
    String bidperprice = utils.showConfig().getProperty("bidperprice");
    String bidperpeight = utils.showConfig().getProperty("bidperpeight");
    String account_back = utils.showConfig().getProperty("account_back");
    String password_back = utils.showConfig().getProperty("password_back");

    static Logger logger = Logger.getLogger(CreatewsBid_05.class);

    //新建PNG仓单入库
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
        CreatewhBidObject createwhBidObject = new CreatewhBidObject(driver);
        createwhBidObject.CreatewhBidObject_01(minweight,linkman,contactphone,maxweight,baseprice,bidperprice,bidperpeight,whordername);
    }

    //后台审核拒绝该竞价订单
    @Test
    public void test04_reviewpass() throws InterruptedException {
        ReviewBid reviewBid = new ReviewBid();
        reviewBid.loginback(account_back,password_back);
        reviewBid.biddingreview_notpass(refuseordermessage);
    }

}

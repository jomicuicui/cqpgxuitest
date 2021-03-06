package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.CreateMarginAgreementObject;
import pageobject.LoginObject;
import utils.BuyerMarginAgreement;
import utils.ReviewAgreement;
import utils.Utils;


//卖家发起PNG协议交易，对手方确认


public class CreateMarginAgreement_04 {
    WebDriver driver;
    String  url_front = "http://uc-test.chinacqpgx.com/login.htm";
    Utils utils = new Utils();
    String account_frontsell = utils.showConfig().getProperty("account_frontsell");
    String password_frontsell = utils.showConfig().getProperty("password_frontsell");
    String account_back = utils.showConfig().getProperty("account_back");
    String password_back = utils.showConfig().getProperty("password_back");
    String buyername = utils.showConfig().getProperty("buyername");
    String agreementtransactionunitprice = utils.showConfig().getProperty("agreementtransactionunitprice");
    String linkman = utils.showConfig().getProperty("linkman");
    String contactphone = utils.showConfig().getProperty("contactphone");
    String settlecycle = utils.showConfig().getProperty("settlecycleweek");
    String confirmnum = utils.showConfig().getProperty("agreementWeight");
    String account_frontbuy1 = utils.showConfig().getProperty("account_frontbuy1");
    String password_frontbuy1 = utils.showConfig().getProperty("password_frontbuy1");
    String agreementWeight = utils.showConfig().getProperty("agreementWeight");



    //登录交易系统前台
    @Test
    public void test01_loginfront_sell() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_front(account_frontsell,password_frontsell);
    }

    //卖家提交协议交易
    @Test
    public void test02_createbid() throws InterruptedException {
        CreateMarginAgreementObject createMarginAgreement = new CreateMarginAgreementObject(driver);
        createMarginAgreement.createMarginAgreementtransaction2(linkman,contactphone,settlecycle,buyername,agreementtransactionunitprice,agreementWeight);

    }

    //后台审核通过
    @Test
    public void test03_check() throws InterruptedException {
        ReviewAgreement reviewAgreement = new ReviewAgreement();
        reviewAgreement.loginback(account_back,password_back);
        reviewAgreement.agreementreview_pass();
    }

    //对手方确认交易
    @Test
    public void test04_buyerdelisting() throws InterruptedException {
        BuyerMarginAgreement buyerMarginAgreement = new BuyerMarginAgreement();
        buyerMarginAgreement.loginfront_buyer(account_frontbuy1,password_frontbuy1);
        buyerMarginAgreement.buyerMarginagreement_buyerreceived(confirmnum);
    }


}










































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































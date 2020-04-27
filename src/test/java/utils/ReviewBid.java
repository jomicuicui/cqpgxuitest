package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.BiddingReviewObject;
import pageobject.LoginObject;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:32 2019/12/3
 **/

//后台审核竞价
public class ReviewBid {
    WebDriver driver;
    String url_back = "http://center-test.chinacqpgx.com/system/login.htm";

    //登录交易系统后台
    public void loginback(String account_back,String password_back) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_back);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_back(account_back,password_back);
    }

    //后台审核通过竞价订单
    public void biddingreview_pass() throws InterruptedException {
        BiddingReviewObject biddingReviewObject = new BiddingReviewObject(driver);
        biddingReviewObject.biddingreview_pass();
    }

    //后台审核拒绝竞价订单
    public void biddingreview_notpass(String refuseordermessage) throws InterruptedException {
        BiddingReviewObject biddingReviewObject = new BiddingReviewObject(driver);
        biddingReviewObject.biddingreview_notpass(refuseordermessage);
    }


}

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.ListingReviewObject;
import pageobject.LoginObject;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:32 2019/12/3
 **/

//后台审核竞价
public class ReviewListing {
    WebDriver driver;
    String url_back = "http://center-test.chinacqpgx.com/system/login.htm";

    //登录交易系统后台
    public void loginback(String account_back,String password_back) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_back);
        LoginObject loginObject = new LoginObject(driver);
        loginObject.login_back(account_back,password_back);
    }

    //后台审核通过挂牌订单
    public void litingreview_pass() throws InterruptedException {
        ListingReviewObject listingReviewObject = new ListingReviewObject(driver);
        listingReviewObject.listingreview_pass();
    }

    //后台审核拒绝挂牌订单
    public void litingreview_notpass(String reviewnotpassmessageinfo) throws InterruptedException {
        ListingReviewObject listingReviewObject = new ListingReviewObject(driver);
        listingReviewObject.listingreview_notpass(reviewnotpassmessageinfo);
    }


}

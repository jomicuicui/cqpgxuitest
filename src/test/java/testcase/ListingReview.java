package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobject.ListingReviewObject;
import pageobject.LoginObject_back;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 16:40 2019/10/12
 **/
public class ListingReview {
    WebDriver driver;



    //登录交易系统后台
    @Test
    public void test01_login() throws InterruptedException {
        String url_back = "http://center-test.chinacqpgx.com/system/login.htm";
        driver = new ChromeDriver();
        driver.get(url_back);
        LoginObject_back loginObject_back = new LoginObject_back(driver);
        loginObject_back.login_back();
    }

    //后台审核通过挂牌订单
    @Test
    public void test02_biddingreview_pass() throws InterruptedException {
        ListingReviewObject listingReviewObject = new ListingReviewObject(driver);
        listingReviewObject.listingreview_pass();
    }

    //后台审核拒绝挂牌订单
    @Test
    public void test03_biddingreview_notpass(String reviewnotpassmessageinfo) throws InterruptedException {
        ListingReviewObject listingReviewObject = new ListingReviewObject(driver);
        listingReviewObject.listingreview_notpass(reviewnotpassmessageinfo);
    }

}

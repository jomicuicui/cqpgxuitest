package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.ListingReviewFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:40 2019/10/14
 **/
public class ListingReviewObject {
    WebDriver driver;

    public ListingReviewObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //审核通过挂牌订单
    public void listingreview_pass() throws InterruptedException {
        ListingReviewFactory listingReviewFactory = new ListingReviewFactory(driver);

        //点击交易管理菜单按钮
        listingReviewFactory.setTrademanagebotton();
        Thread.sleep(1000);
        //点击挂牌列表管理菜单
        listingReviewFactory.setBackstagelistingmanagemenu();
        Thread.sleep(1000);
        //切换到挂牌管理列表页面
        listingReviewFactory.setBackstagelistingmanageIframe();
        Thread.sleep(1000);
        //点击审核通过按钮
        listingReviewFactory.setReviewpassbotton();
        Thread.sleep(2000);
        //点击审核通过确定按钮（即弹框的确定按钮）
        listingReviewFactory.setComment();
        //关闭浏览器
        driver.close();
    }


    //审核拒绝竞价订单
    public void listingreview_notpass(String reviewnotpassmessageinfo) throws InterruptedException {
        ListingReviewFactory listingReviewFactory = new ListingReviewFactory(driver);

        //点击交易管理菜单按钮
        listingReviewFactory.setTrademanagebotton();
        Thread.sleep(1000);
        //点击挂牌列表管理菜单
        listingReviewFactory.setBackstagelistingmanagemenu();
        Thread.sleep(2000);
        //切换到挂牌管理列表页面
        listingReviewFactory.setBackstagelistingmanageIframe();
        Thread.sleep(1000);
        //点击审核拒绝按钮
        listingReviewFactory.setReviewnotpassbotton();
        Thread.sleep(1000);
        listingReviewFactory.setReviewnotpassmessage(reviewnotpassmessageinfo);
        //点击审核拒绝确定按钮（即弹框的确定按钮）
        listingReviewFactory.setComment();
        //关闭浏览器
        driver.close();
    }

}

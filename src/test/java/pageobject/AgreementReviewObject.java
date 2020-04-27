package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.AgreementReviewFactory;
import pagefactory.ListingReviewFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:40 2019/10/14
 **/
public class AgreementReviewObject {
    WebDriver driver;

    public AgreementReviewObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //审核通过协议订单
    public void agreementReview_pass() throws InterruptedException {
        ListingReviewFactory listingReviewFactory = new ListingReviewFactory(driver);
        AgreementReviewFactory agreementReviewFactory = new AgreementReviewFactory(driver);

        //点击交易管理菜单按钮
        agreementReviewFactory.setTrademanagebotton();
        Thread.sleep(1000);
        //点击协议交易管理菜单
        agreementReviewFactory.setAgreementmanagemenu();
        Thread.sleep(1000);
        //点击协议交易列表菜单
        agreementReviewFactory.setAgreementlistmenu();
        Thread.sleep(1000);
        //切换iframe
        agreementReviewFactory.setAgreementiframe();
        Thread.sleep(1000);
        //点击审核通过按钮
        agreementReviewFactory.setReviewpassbotton();
        Thread.sleep(2000);
        //点击审核通过确定按钮（即弹框的确定按钮）
        agreementReviewFactory.setConfirmreviewpassbotton();
        Thread.sleep(2000);
        //关闭浏览器
        driver.close();
    }


    //审核拒绝协议订单
    public void agreementReview_notpass() throws InterruptedException {
        AgreementReviewFactory agreementReviewFactory = new AgreementReviewFactory(driver);

        //点击交易管理菜单按钮
        agreementReviewFactory.setTrademanagebotton();
        Thread.sleep(1000);
        //点击协议交易管理菜单
        agreementReviewFactory.setAgreementmanagemenu();
        Thread.sleep(1000);
        //点击协议交易列表菜单
        agreementReviewFactory.setAgreementlistmenu();
        Thread.sleep(2000);
        //切换iframe
        agreementReviewFactory.setAgreementiframe();
        //点击审核拒绝按钮
        agreementReviewFactory.setReviewnotpassbotton();
        Thread.sleep(2000);
        //点击审核通过确定按钮（即弹框的确定按钮）
        agreementReviewFactory.setConfirmreviewnotpassbotton();
        Thread.sleep(4000);
        //关闭浏览器
        driver.close();
    }

}

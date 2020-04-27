package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.BiddingReviewFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:40 2019/10/14
 **/
public class BiddingReviewObject {
    WebDriver driver;

    public BiddingReviewObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //审核通过竞价订单
    public void biddingreview_pass() throws InterruptedException {
        BiddingReviewFactory biddingReviewFactory = new BiddingReviewFactory(driver);

        //点击交易管理菜单按钮
        biddingReviewFactory.setTrademanagebotton();
        Thread.sleep(1000);
        //点击竞价交易菜单按钮
        biddingReviewFactory.setMenV2();
        Thread.sleep(1000);
        //点击竞价场次列表按钮
        biddingReviewFactory.setMenV2list();
        Thread.sleep(1000);
        //切换到竞价场次列表详情页面
        biddingReviewFactory.setListIframe();
        Thread.sleep(3000);
        //点击查询按钮，确保第一条为最新的一条
//        biddingReviewFactory.setSearchSpace();
        //点击操作列列表的查看按钮
        biddingReviewFactory.setMessage();
        //点击审核通过按钮
        Thread.sleep(2000);
        biddingReviewFactory.setAudit_pass();
        Thread.sleep(2000);
        //点击审核通过确定按钮（即弹框的确定按钮）
        biddingReviewFactory.setSurebotton();
        //关闭浏览器
        driver.close();
    }


    //审核拒绝竞价订单
    public void biddingreview_notpass(String refuseordermessage) throws InterruptedException {
        BiddingReviewFactory biddingReviewFactory = new BiddingReviewFactory(driver);

        //点击交易管理菜单按钮
        biddingReviewFactory.setTrademanagebotton();
        Thread.sleep(1000);
        //点击竞价交易菜单按钮
        biddingReviewFactory.setMenV2();
        Thread.sleep(1000);
        //点击竞价场次列表按钮
        biddingReviewFactory.setMenV2list();
        Thread.sleep(1000);
        //切换到竞价场次列表详情页面
        biddingReviewFactory.setListIframe();
        Thread.sleep(3000);
        //点击操作列列表的查看按钮
        biddingReviewFactory.setMessage();
//        //输入审核拒绝的原因
//        biddingReviewFactory.setRefuseordermessageimput(refuseordermessage);
        //点击审核不通过按钮
        Thread.sleep(2000);
        biddingReviewFactory.setAudit_not_pass();

        Thread.sleep(2000);
        //确认弹框
        biddingReviewFactory.acceptalert();
        //点击备注弹框的确认按钮
        biddingReviewFactory.setComment();
        //关闭浏览器
        driver.close();
    }

}

package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.Create_MarginorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:52 2020/1/13
 **/
public class PlaceListingObject {
    WebDriver driver;

    public PlaceListingObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //买家摘牌流程
    public void BuyerPlaceListing(String buyerdelistingquantity) throws InterruptedException {
        Create_MarginorderFactory create_marginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(2100);
        //点击“交易管理”菜单按钮
        create_marginorderFactory.setTradeManagement_menu();
        //点击“我是买家”菜单按钮
        create_marginorderFactory.setBuyMenu();
        Thread.sleep(1100);
        //点击“买家摘牌管理”菜单
        create_marginorderFactory.setBuyerdelistingmanagemenu();
        Thread.sleep(1000);
        //点击“挂牌信息查询”菜单按钮
        create_marginorderFactory.setBuyerdelistinglist();
        Thread.sleep(1000);
        //点击“详情选购”按钮
        create_marginorderFactory.setBuyerpurchasedetailbotton();
        Thread.sleep(2000);
        //点击“立即选购”按钮
        create_marginorderFactory.setImmediatelybuybotton();
        Thread.sleep(1000);
        //输入摘牌量
        create_marginorderFactory.setBuyerdelistingquantitybotton(buyerdelistingquantity);
        Thread.sleep(1000);
        //点击确定按钮
        create_marginorderFactory.setDelistingconfirmbotton();
        Thread.sleep(1500);
        //点击购物车里的下单按钮
        create_marginorderFactory.setPlacelistingorderbotton();
        //关闭浏览器
        driver.close();
    }

    //卖家摘牌流程(不临时指定执行单位）
    public void SellerPlaceListing(String buyerdelistingquantity) throws InterruptedException {
        Create_MarginorderFactory create_marginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(2100);
        //点击“交易管理”菜单按钮
        create_marginorderFactory.setTradeManagement_menu();
        //点击“我是卖家”菜单按钮
        create_marginorderFactory.setSellerPage_menu();
        Thread.sleep(2100);
        //点击“卖家摘牌管理”菜单
        create_marginorderFactory.setSellerdelistingmanagemenu();
        Thread.sleep(1000);
        //点击“挂牌信息查询”菜单按钮
        create_marginorderFactory.setBuyerlistinginfo();
        Thread.sleep(1000);
        //点击“详情选购”按钮
        create_marginorderFactory.setSellerpurchasedetailbotton();
        Thread.sleep(2000);
        //点击“立即选购”按钮
        create_marginorderFactory.setImmediatelybuybotton();
        Thread.sleep(1000);
        //输入摘牌量
        create_marginorderFactory.setBuyerdelistingquantitybotton(buyerdelistingquantity);
        Thread.sleep(1000);
        //点击确定按钮
        create_marginorderFactory.setDelistingconfirmbotton();
        Thread.sleep(1500);
        //点击购物车里的下单按钮
        create_marginorderFactory.setPlacelistingorderbotton();
        //关闭浏览器
        driver.close();
    }


    //卖家摘牌流程（临时指定执行单位）
    public void SellerPlaceListingwithExecutiveunit(String buyerdelistingquantity,String inputqueryinfo) throws InterruptedException {
        Create_MarginorderFactory create_marginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(2100);
        //点击“交易管理”菜单按钮
        create_marginorderFactory.setTradeManagement_menu();
        //点击“我是卖家”菜单按钮
        create_marginorderFactory.setSellerPage_menu();
        Thread.sleep(2100);
        //点击“卖家摘牌管理”菜单
        create_marginorderFactory.setSellerdelistingmanagemenu();
        Thread.sleep(1000);
        //点击“挂牌信息查询”菜单按钮
        create_marginorderFactory.setBuyerlistinginfo();
        Thread.sleep(1000);
        //点击“详情选购”按钮
        create_marginorderFactory.setSellerpurchasedetailbotton();
        Thread.sleep(2000);
        //点击“立即选购”按钮
        create_marginorderFactory.setImmediatelybuybotton();
        Thread.sleep(1000);
        //输入摘牌量
        create_marginorderFactory.setBuyerdelistingquantitybotton(buyerdelistingquantity);
        Thread.sleep(1000);
        //点击临时执行按钮
        create_marginorderFactory.setProvisionaldesignationbotton();
        Thread.sleep(500);
        //输入买家企业二
        create_marginorderFactory.setInputqueryinfobox(inputqueryinfo);
        Thread.sleep(500);
        //点击搜索按钮
        create_marginorderFactory.setQueryinfobotton();
        Thread.sleep(500);
        //选中买家企业二
        create_marginorderFactory.setConfirmselected();
        Thread.sleep(500);
        //点击确定按钮
        create_marginorderFactory.setConfirmbotton();
        Thread.sleep(1000);
        //点击确定按钮
        create_marginorderFactory.setDelistingconfirmbotton();
        Thread.sleep(1500);
        //点击购物车里的下单按钮
        create_marginorderFactory.setPlacelistingorderbotton();
        //关闭浏览器
        driver.close();
    }

}

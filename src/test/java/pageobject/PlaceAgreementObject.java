package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.Create_MarginorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:52 2020/1/13
 **/
public class PlaceAgreementObject {
    WebDriver driver;

    public PlaceAgreementObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //买家确认协议
    public void BuyerPlaceAgreementpass(String confirmnum) throws InterruptedException {
        Create_MarginorderFactory create_marginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(2100);
        //点击“交易管理”菜单按钮
        create_marginorderFactory.setTradeManagement_menu();
        //点击“我是买家”菜单按钮
        create_marginorderFactory.setBuyMenu();
        Thread.sleep(1100);
        //点击协议交易管理菜单
        create_marginorderFactory.setBuyeragreementmanagemenu();
        Thread.sleep(1100);
        //点击收到的协议菜单
        create_marginorderFactory.setBuyerrecivedagreementlist();
        Thread.sleep(2000);
        //买方点击确认按钮
        create_marginorderFactory.setBuyerrecivedorderbotton();
        Thread.sleep(2000);
        //最终确认协议
        create_marginorderFactory.setConfirmagreementbotton();
        Thread.sleep(1000);
        //输入确认协议的量
        create_marginorderFactory.setConfirmnumimput(confirmnum);
        //点击确认按钮
        create_marginorderFactory.setConfirmumbotton();
        Thread.sleep(1000);
        //确认费用按钮
        create_marginorderFactory.setConfirmlim();
        Thread.sleep(1000);
        //关闭浏览器
        driver.close();
    }


    //买家拒绝协议
    public void BuyerPlaceAgreementrefuse() throws InterruptedException {
        Create_MarginorderFactory create_marginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(2100);
        //点击“交易管理”菜单按钮
        create_marginorderFactory.setTradeManagement_menu();
        //点击“我是买家”菜单按钮
        create_marginorderFactory.setBuyMenu();
        Thread.sleep(1100);
        //点击协议交易管理菜单
        create_marginorderFactory.setBuyeragreementmanagemenu();
        Thread.sleep(1100);
        //点击收到的协议菜单
        create_marginorderFactory.setBuyerrecivedagreementlist();
        Thread.sleep(2000);
        //买方点击确认按钮
        create_marginorderFactory.setBuyerrecivedorderbotton();
        Thread.sleep(2000);
        //点击拒绝协议按钮
        create_marginorderFactory.setRefuseagreementbotton();
        Thread.sleep(1000);
        //确认拒绝
        create_marginorderFactory.setConfirmlim();
        Thread.sleep(2000);
        //关闭浏览器
        driver.close();
    }


    //卖家确认协议
    public void sellerPlaceAgreementpasswithcust(String confirmnum,String sellerinputcustname) throws InterruptedException {
        Create_MarginorderFactory create_marginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(2100);
        //点击“交易管理”菜单按钮
        create_marginorderFactory.setTradeManagement_menu();
        //点击我是卖家按钮
        create_marginorderFactory.setSellerPage_menu();
        Thread.sleep(1100);
        //点击协议交易管理菜单
        create_marginorderFactory.setAgreementtransactionmanagemenu();
        Thread.sleep(1100);
        //点击收到的协议菜单
        create_marginorderFactory.setSellerrecivedagreementmenu();
        Thread.sleep(2000);
        //卖方点击确认按钮
        create_marginorderFactory.setBuyerrecivedorderbotton();
        Thread.sleep(2000);
        //最终确认协议
        create_marginorderFactory.setConfirmagreementbotton();
        Thread.sleep(1000);
        //输入确认协议的量
        create_marginorderFactory.setConfirmnumimput(confirmnum);
        Thread.sleep(1000);
        //点击临时指定按钮
        create_marginorderFactory.setSelectExecusbotton();
        Thread.sleep(500);
        create_marginorderFactory.setSellerinputcustnamebotton(sellerinputcustname);
        Thread.sleep(500);
        create_marginorderFactory.setQuerycustnamebotton();
        Thread.sleep(500);
        create_marginorderFactory.setChoosecustname();
        Thread.sleep(500);
        create_marginorderFactory.setConfirmcustnamebotton();
        Thread.sleep(1000);
        //点击确认按钮
        create_marginorderFactory.setConfirmrecivednum();
        Thread.sleep(1000);
        //确认费用按钮
        create_marginorderFactory.setConfirmlim();
        Thread.sleep(1000);
        //关闭浏览器
        driver.close();
    }

    //卖家确认协议
    public void sellerPlaceAgreementpasswithoutcust(String confirmnum,String sellerinputcustname) throws InterruptedException {
        Create_MarginorderFactory create_marginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(2100);
        //点击“交易管理”菜单按钮
        create_marginorderFactory.setTradeManagement_menu();
        //点击我是卖家按钮
        create_marginorderFactory.setSellerPage_menu();
        Thread.sleep(1100);
        //点击协议交易管理菜单
        create_marginorderFactory.setAgreementtransactionmanagemenu();
        Thread.sleep(1100);
        //点击收到的协议菜单
        create_marginorderFactory.setSellerrecivedagreementmenu();
        Thread.sleep(2000);
        //卖方点击确认按钮
        create_marginorderFactory.setBuyerrecivedorderbotton();
        Thread.sleep(2000);
        //最终确认协议
        create_marginorderFactory.setConfirmagreementbotton();
        Thread.sleep(1000);
        //输入确认协议的量
        create_marginorderFactory.setConfirmnumimput(confirmnum);
        Thread.sleep(1000);
        //点击确认按钮
        create_marginorderFactory.setConfirmrecivednum();
        Thread.sleep(1000);
        //确认费用按钮
        create_marginorderFactory.setConfirmlim();
        Thread.sleep(1000);
        //关闭浏览器
        driver.close();
    }

}

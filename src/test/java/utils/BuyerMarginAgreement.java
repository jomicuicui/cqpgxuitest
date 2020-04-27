package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoginObject_front;
import pageobject.PlaceAgreementObject;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:32 2019/12/3
 **/

//买家确认协议
public class BuyerMarginAgreement {
    WebDriver driver;
    String  url_front = "http://uc-test.chinacqpgx.com/login.htm";

    //买家登录
    public void loginfront_buyer(String account,String password) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject_front loginObjectFront = new LoginObject_front(driver);
        loginObjectFront.login_front(account,password);
    }

    //买方确认协议
    public void buyerMarginagreement_buyerreceived(String confirmnum) throws InterruptedException {
        PlaceAgreementObject placeAgreementObject = new PlaceAgreementObject(driver);
        placeAgreementObject.BuyerPlaceAgreementpass(confirmnum);
    }

    //买方拒绝协议
    public void buyerMarginagreement_buyerrefused() throws InterruptedException {
        PlaceAgreementObject placeAgreementObject = new PlaceAgreementObject(driver);
        placeAgreementObject.BuyerPlaceAgreementrefuse();
    }

    //卖方确认协议:临时执行执行单位
    public void sellerMarginagreement_buyerreceivedwithcust(String confirmnum,String sellerinputcustname) throws InterruptedException {
        PlaceAgreementObject placeAgreementObject = new PlaceAgreementObject(driver);
        placeAgreementObject.sellerPlaceAgreementpasswithcust(confirmnum,sellerinputcustname);
    }

    //卖方确认协议：不指定执行单位
    public void sellerMarginagreement_buyerreceivedwithoutcust(String confirmnum,String sellerinputcustname) throws InterruptedException {
        PlaceAgreementObject placeAgreementObject = new PlaceAgreementObject(driver);
        placeAgreementObject.sellerPlaceAgreementpasswithoutcust(confirmnum,sellerinputcustname);
    }



}

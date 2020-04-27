package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoginObject_front;
import pageobject.PlaceListingObject;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:32 2019/12/3
 **/

//买家摘牌
public class BuyerMarginListing {
    WebDriver driver;
    String  url_front = "http://uc-test.chinacqpgx.com/login.htm";

    //买家登录
    public void loginfront_buyer(String account,String password) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject_front loginObjectFront = new LoginObject_front(driver);
        loginObjectFront.login_front(account,password);
    }

    //买家摘牌
    public void buyerMarginListing_buyer(String buyerdelistingquantity) throws InterruptedException {
        PlaceListingObject placeListingObject = new PlaceListingObject(driver);
        placeListingObject.BuyerPlaceListing(buyerdelistingquantity);
    }

    //卖家摘牌
    public void buyerMarginListing_seller(String buyerdelistingquantity) throws InterruptedException {
        PlaceListingObject placeListingObject = new PlaceListingObject(driver);
        placeListingObject.SellerPlaceListing(buyerdelistingquantity);
    }

    //卖家摘牌
    public void buyerMarginListing_sellerwithExecutiveunit(String buyerdelistingquantity,String inputqueryinfo) throws InterruptedException {
        PlaceListingObject placeListingObject = new PlaceListingObject(driver);
        placeListingObject.SellerPlaceListingwithExecutiveunit(buyerdelistingquantity,inputqueryinfo);
    }


}

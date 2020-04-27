package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.LoginObject_front;
import pageobject.PlaceAuctionObject;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:32 2019/12/3
 **/

//买家竞拍
public class BuyerAuctionbid {
    WebDriver driver;
    String  url_front = "http://uc-test.chinacqpgx.com/login.htm";

    //买家登录
    public void loginfront_buyer(String account,String password) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get(url_front);
        LoginObject_front loginObjectFront = new LoginObject_front(driver);
        loginObjectFront.login_front(account,password);
    }

    //买家竞拍（有交收地点）
    public void PlaceAuctionwithadr(String bid_rowprice,String bid_rowweight) throws InterruptedException {
        PlaceAuctionObject placeAuctionObject = new PlaceAuctionObject(driver);
        placeAuctionObject.PlaceAuctionwithadr(bid_rowprice,bid_rowweight);
    }

    //买家竞拍（无交收地点）
    public void PlaceAuctionwithoutadr(String bid_rowprice,String bid_rowweight) throws InterruptedException {
        PlaceAuctionObject placeAuctionObject = new PlaceAuctionObject(driver);
        placeAuctionObject.PlaceAuctionwithoutadr(bid_rowprice,bid_rowweight);
    }

    //买家竞拍（包含执行单位和节气点的特殊处理）
    public void PlaceAuctionwithoutExecutionunit(String bid_rowprice,String bid_rowweight) throws InterruptedException {
        PlaceAuctionObject placeAuctionObject = new PlaceAuctionObject(driver);
        placeAuctionObject.PlaceAuctionwithoutExecutionunit(bid_rowprice,bid_rowweight);
    }

}

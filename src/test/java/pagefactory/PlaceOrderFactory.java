package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 10:34 2019/12/26
 **/
public class PlaceOrderFactory {
    WebDriver driver;

    public PlaceOrderFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //"交易管理"菜单按钮
    @FindBy(xpath = "//*[@id=\'flx\']/a")
    WebElement tradeManagement_menu;
    public void setTradeManagement_menu(){
        tradeManagement_menu.click();
    }
    //“我是买家”菜单按钮
    @FindBy(xpath = "//*[@id=\'flx\']/ol/li/a")
    WebElement buyMenu;
    public void setBuyMenu(){
        buyMenu.click();
    }
    //“买家摘牌”管理菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[3]/h3")
    WebElement buyerdelistingmenu;
    public void setBuyerdelistingmenu(){
        buyerdelistingmenu.click();
    }
    //“挂牌信息查询”菜单
    @FindBy(xpath = "//*[@id=\'menu_content_1099\']/ol/li[1]/a")
    WebElement listinginfoquery;
    public void setListinginfoquery(){
        listinginfoquery.click();
    }
    //“详情选购”按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[8]/a")
    WebElement delistingorderbotton;
    public void setDelistingorderbotton(){
        delistingorderbotton.click();
    }





}

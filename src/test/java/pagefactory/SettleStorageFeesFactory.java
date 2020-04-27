package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 10:34 2019/12/26
 **/
public class SettleStorageFeesFactory {
    WebDriver driver;

    public SettleStorageFeesFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //“仓单管理”导航栏按钮
    @FindBy(xpath = "//*[@id=\'wsws3\']/a")
    WebElement whmenuone;
    public void setWhmenuone(){
        whmenuone.click();
    }
    //“仓单管理”菜单按钮
    @FindBy(xpath = "//*[@id=\'menu_content_1118\']/h3")
    WebElement whmenutwo;
    public void setWhmenutwo(){
        whmenutwo.click();
    }
    //“仓单管理”子菜单按钮
    @FindBy(xpath = "//*[@id=\'menu_content_1118\']/ol/li[1]/a")
    WebElement whmenuthree;
    public void setWhmenuthree(){
        whmenuthree.click();
    }
    //“结算仓储费”按钮（根据xpatx找）
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/table/tbody/tr[1]/td[13]/a[3]")
    WebElement settstrogefeebotton;
    public void setSettstrogefeebotton(){
        settstrogefeebotton.click();
    }

    //“结算仓储费”按钮
    @FindBy(linkText = "结算仓储费")
    WebElement settstrogefeebottontext;
    public void setSettstrogefeebottontext(){
        settstrogefeebottontext.click();
    }

    //选择“结算账户”
    @FindBy(xpath = "//*[@id=\'buyerSettleNo\']")
    WebElement choosesettcountbotton;
    public static By choosesettcount = By.xpath("//*[@id=\'buyerSettleNo\']/option[2]");
    public void setChoosesettcountbotton(){
        choosesettcountbotton.findElement(choosesettcount).click();
    }
    //获取“预付仓储费”字段的值
    public String totalfee(){
        String totalfee = driver.findElement(By.xpath("//*[@id=\'tbd_receipt_list\']/tr/td[5]/input")).getAttribute("value");
        return totalfee;
    }
    //“返回”按钮
    @FindBy(xpath = "//*[@id=\'form_charge_info\']/div[6]/button[2]")
    WebElement returnbotton;
    public void setReturnbotton(){
        returnbotton.click();
    }

    //“支付”按钮
    @FindBy(xpath = "//*[@id=\'btnInfoCommit\']")
    WebElement paybotton;
    public void setPaybotton(){
        paybotton.click();
    }
    //确认支付“确定”按钮
    @FindBy(css = "body > div.aui_focus > div > table > tbody > tr:nth-child(2) > td.aui_center > table > tbody > tr:nth-child(3) > td > div > button.aui_strongButton")
    WebElement surebotton;
    public void setSurebotton(){
        surebotton.click();
    }

}

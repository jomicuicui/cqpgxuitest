package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 16:53 2019/10/12
 **/
public class AgreementReviewFactory {
    WebDriver driver;

    public AgreementReviewFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //交易管理菜单按钮
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td[3]/a")
    WebElement trademanagebotton;
    public void setTrademanagebotton(){
        trademanagebotton.click();
    }

    //协议交易管理菜单
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/h3[5]")
    WebElement agreementmanagemenu;
    public void setAgreementmanagemenu(){
        agreementmanagemenu.click();
    }
    //协议交易列表菜单
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/ul[5]/li[1]/a")
    WebElement agreementlistmenu;
    public void setAgreementlistmenu(){
        agreementlistmenu.click();
    }

    //审核通过按钮
    @FindBy(xpath = "/html/body/div[1]/div[2]/ul/table/tbody/tr[2]/td[10]/span[1]/a")
    WebElement reviewpassbotton;
    public void setReviewpassbotton(){
        reviewpassbotton.click();
    }
    //审核通过的确认按钮
    @FindBy(xpath = "/html/body/div[7]/div[11]/div/button[1]/span")
    WebElement confirmreviewpassbotton;
    public void setConfirmreviewpassbotton(){
        confirmreviewpassbotton.click();
    }

    //切换到协议交易列表iframe
    @FindBy(xpath = "/html/body/div[2]/div[2]/iframe[2]")
    WebElement agreementiframe;
    public void setAgreementiframe(){
        driver.switchTo().frame(agreementiframe);
    }
    //审核拒绝按钮
    @FindBy(xpath = "/html/body/div[1]/div[2]/ul/table/tbody/tr[2]/td[10]/span[2]/a")
    WebElement reviewnotpassbotton;
    public void setReviewnotpassbotton(){
        reviewnotpassbotton.click();
    }
    //审核拒绝确认按钮
    @FindBy(xpath = "/html/body/div[8]/table/tbody/tr/td/div[2]/form/input[1]")
    WebElement confirmreviewnotpassbotton;
    public void setConfirmreviewnotpassbotton(){
        confirmreviewnotpassbotton.click();
    }





}

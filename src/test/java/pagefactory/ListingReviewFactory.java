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
public class ListingReviewFactory {
    WebDriver driver;

    public ListingReviewFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //交易管理菜单按钮
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td[3]/a")
    WebElement trademanagebotton;
    public void setTrademanagebotton(){
        trademanagebotton.click();
    }

    //挂牌列表管理菜单
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/ul[1]/li[1]/a")
    WebElement backstagelistingmanagemenu;
    public void setBackstagelistingmanagemenu(){
        backstagelistingmanagemenu.click();
    }


    //切换到挂牌管理列表页面
    @FindBy(xpath = "/html/body/div[2]/div[2]/iframe[2]")
    WebElement backstagelistingmanageIframe;
    public void setBackstagelistingmanageIframe(){
        driver.switchTo().frame(backstagelistingmanageIframe);
    }


    //审核通过按钮
    @FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody[2]/tr[2]/td[2]/span[2]/a")
    WebElement reviewpassbotton;
    public void setReviewpassbotton(){
        reviewpassbotton.click();
    }

    //审核拒绝按钮
    @FindBy(xpath = "/html/body/div[1]/div[2]/table/tbody[2]/tr[2]/td[2]/span[3]/a")
    WebElement reviewnotpassbotton;
    public void setReviewnotpassbotton(){
        reviewnotpassbotton.click();
    }

    //审核拒绝备注
    @FindBy(xpath = "//*[@id=\'remarkNew\']")
    WebElement reviewnotpassmessage;
    public void setReviewnotpassmessage(String reviewnotpassmessageinfo){
        reviewnotpassmessage.sendKeys(reviewnotpassmessageinfo);
    }

    //切出iframe
    public void outiframe(){
        driver.switchTo().defaultContent();
    }

    //确认alert弹框
    public void acceptalert(){
        driver.switchTo().alert().accept();
    }

    //备注弹框的确认按钮
    @FindBy(xpath = "/html/body/div[6]/div[11]/div/button[1]/span")
    WebElement comment;
    public void setComment(){
        comment.click();
    }

}

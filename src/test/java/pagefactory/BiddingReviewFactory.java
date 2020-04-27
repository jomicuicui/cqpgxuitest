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
public class BiddingReviewFactory {
    WebDriver driver;

    public BiddingReviewFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //交易管理菜单按钮
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/table/tbody/tr/td[3]/a")
    WebElement trademanagebotton;
    public void setTrademanagebotton(){
        trademanagebotton.click();
    }

    //竞价交易菜单按钮
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/h3[2]")
    WebElement menV2;
    public void setMenV2(){
        menV2.click();
    }

    //竞价场次列表菜单按钮
    @FindBy(xpath = "/html/body/div[2]/div[1]/div/ul[2]/li[1]/a")
    WebElement menV2list;
    public void setMenV2list(){
        menV2list.click();
    }

    //切换到竞价场次列表页面
    @FindBy(xpath = "/html/body/div[2]/div[2]/iframe[2]")
    WebElement listIframe;
    public void setListIframe(){
        driver.switchTo().frame(listIframe);
    }

    //查询按钮
    @FindBy(id = "searchSpace")
    WebElement searchSpace;
    public void setSearchSpace(){
        searchSpace.click();
    }

    //查看按钮
    @FindBy(xpath = "/html/body/div[1]/div[2]/ul/div[1]/table/tbody/tr[2]/td[12]/a")
    WebElement message;
    public void setMessage(){
        message.click();
    }

    //审核通过按钮
    @FindBy(xpath = "//*[@id=\'audit_pass\']")
    WebElement audit_pass;
    public void setAudit_pass(){
        audit_pass.click();
    }

    //审核拒绝原因
    @FindBy(xpath = "//*[@id=\'auditCause\']")
    WebElement refuseordermessageimput;
    public void setRefuseordermessageimput(String refuseordermessage){
        refuseordermessageimput.sendKeys(refuseordermessage);
    }
    //审核拒绝按钮
    @FindBy(xpath = "//*[@id=\'audit_not_pass\']")
    WebElement audit_not_pass;
    public void setAudit_not_pass(){
        audit_not_pass.click();
    }

    //审核通过确定按钮
    @FindBy(xpath = "/html/body/div[8]/div[11]/div/button[1]/span")
    WebElement surebotton;
    public void setSurebotton(){
        surebotton.click();
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
    @FindBy(xpath = "/html/body/div[8]/div[11]/div/button[1]/span")
    WebElement comment;
    public void setComment(){
        comment.click();
    }

}

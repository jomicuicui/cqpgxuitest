package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 16:11 2019/10/12
 **/
public class LoginFactory_back {
    WebDriver driver;

    public LoginFactory_back(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //定位账号的位置
    @FindBy(xpath = "//*[@id=\'account\']")
    WebElement accountpos;
    public void setAccountpos(String account_back){
        accountpos.sendKeys(account_back);
    }

    //定位密码的位置
    @FindBy(xpath = "//*[@id=\'password\']")
    WebElement passwordpos;
    public void setPasswordpos(String password_back){
        passwordpos.sendKeys(password_back);
    }

    //定位登录按钮
    @FindBy(xpath = "//*[@id=\'form1\']/fieldset/div[4]/input")
    WebElement loginbotton;
    public void setLoginbotton(){
        loginbotton.click();
    }

}

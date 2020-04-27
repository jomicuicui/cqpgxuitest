package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//登录交易中心前台系统
public class LoginFactory_front {
    WebDriver driver;

    public LoginFactory_front(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //定位帐号位置
    @FindBy(xpath = "//*[@id=\'account\']")
    WebElement account_pos;
    //定位帐号位置并输入帐号信息
    public void setCount_pos(String account){
        account_pos.sendKeys(account);
    }

    //定位密码位置
    @FindBy(xpath = "//*[@id=\'password\']")
    WebElement password_pos;
    //定位输入密码位置并输入密码信息
    public void setPassword_pos(String password){
        password_pos.sendKeys(password);
    }

    //定位“登录”按钮位置
    @FindBy(xpath = "//*[@id=\'button\']")
    WebElement loginbotton_pos;
    //点击登录按钮
    public void setLoginbotton_pos(){
        loginbotton_pos.click();
    }
}

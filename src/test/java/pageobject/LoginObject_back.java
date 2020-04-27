package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.LoginFactory_back;
import utils.Utils;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 16:21 2019/10/12
 **/
public class LoginObject_back {
    WebDriver driver;

    public LoginObject_back(WebDriver driver){
        this.driver = driver;
    }

    public void login_back() throws InterruptedException {
        LoginFactory_back loginFactory_back = new LoginFactory_back(driver);
        driver.manage().window().maximize();  //窗口最大化
        Thread.sleep(2);
        String window = driver.getWindowHandle();
        driver.switchTo().window(window.toString());
        Utils utils = new Utils();
        String account_back = utils.showConfig().getProperty("account_back");
        String password_back = utils.showConfig().getProperty("password_back");

        //输入账号密码进行登录
        loginFactory_back.setAccountpos(account_back);
        loginFactory_back.setPasswordpos(password_back);
        loginFactory_back.setLoginbotton();

    }
}

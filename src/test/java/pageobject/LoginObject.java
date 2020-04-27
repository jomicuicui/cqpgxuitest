package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.LoginFactory_back;
import pagefactory.LoginFactory_front;


public class LoginObject {
    WebDriver driver;

    public LoginObject(WebDriver driver){
        this.driver = driver;
    }

    //前台登录
    public void login_front(String account,String password) throws InterruptedException {
        LoginFactory_front loginFactory_front = new LoginFactory_front(driver);
        Thread.sleep(1000);
//        String title = driver.getTitle();
//        System.out.println(title);   //打印窗口title
        driver.manage().window().maximize();  //窗口最大化
        Thread.sleep(1000);
        String window = driver.getWindowHandle();
        driver.switchTo().window(window.toString());
        //输入帐号密码进行登录
        loginFactory_front.setCount_pos(account);  //输入帐号
        loginFactory_front.setPassword_pos(password);   //输入密码
        loginFactory_front.setLoginbotton_pos();  //点击登录按钮
    }

    //后台登录
    public void login_back(String account_back,String password_back) throws InterruptedException {
        LoginFactory_back loginFactory_back = new LoginFactory_back(driver);
        driver.manage().window().maximize();  //窗口最大化
        Thread.sleep(2);
        String window = driver.getWindowHandle();
        driver.switchTo().window(window.toString());


        //输入账号密码进行登录
        loginFactory_back.setAccountpos(account_back);
        loginFactory_back.setPasswordpos(password_back);
        loginFactory_back.setLoginbotton();

    }

}

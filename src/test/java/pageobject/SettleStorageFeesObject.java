package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.SettleStorageFeesFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 14:48 2019/12/26
 **/
//结算仓单仓储费
public class SettleStorageFeesObject {
    WebDriver driver;

    public SettleStorageFeesObject(WebDriver driver){
        this.driver=driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void SettStorageFees() throws InterruptedException{
        SettleStorageFeesFactory settleStorageFeesFactory = new SettleStorageFeesFactory(driver);
        //点击仓单管理导航栏按钮
        settleStorageFeesFactory.setWhmenuone();
        //点击仓单管理一级菜单按钮
        settleStorageFeesFactory.setWhmenutwo();
        //点击仓单管理子菜单按钮
        settleStorageFeesFactory.setWhmenuthree();
        Thread.sleep(1000);
        //点击结算仓储费按钮
        settleStorageFeesFactory.setSettstrogefeebottontext();
        //选择结算账户
        settleStorageFeesFactory.setChoosesettcountbotton();
        Thread.sleep(1000);
        if (settleStorageFeesFactory.totalfee().equals("0")){
            settleStorageFeesFactory.setReturnbotton();
        }else {
            //点击支付按钮
            settleStorageFeesFactory.setPaybotton();
            Thread.sleep(1000);
            //确认支付
            settleStorageFeesFactory.setSurebotton();
        }
    }
}

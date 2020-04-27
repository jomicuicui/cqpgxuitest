package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 16:53 2019/10/12
 **/
public class loginFactory {
    WebDriver driver;

    public loginFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }






}

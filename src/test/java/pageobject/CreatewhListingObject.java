package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.Create_MarginorderFactory;
import pagefactory.Create_WhorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 9:23 2019/10/10
 **/
public class CreatewhListingObject {
    WebDriver driver;

    public CreatewhListingObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//第一种组合
    /*
    产品：储气库PNG1
    价格类型：商品价
    成交价模式：申报价成交
    摘单方式：保证金摘单
    黑白名单：不启用
     */

    public void CreatewhListingObject_01(String listunitprice,String minweight,String linkman,String contactphone,String maxweight,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);
        Create_WhorderFactory createWhFactory = new Create_WhorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击卖家挂牌管理菜单
        createBid_factory.setSellerlistingmanagermenu();
        Thread.sleep(1000);
        //点击新建挂牌菜单
        createBid_factory.setCreatelistingordermenu();
        Thread.sleep(1000);
        //选择竞标类型：储单挂牌
        createWhFactory.setWhlistingtype();
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(1000);
        //选择储气库PNG产品
        createWhFactory.setCreate_whpngone();
        createWhFactory.setCreate_whpngtwo();
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //点击选择储单按钮
        createBid_factory.setChoosews();
        Thread.sleep(500);
        //勾选储单
        createBid_factory.setChoosewsweight();
        Thread.sleep(1000);
        //点击确认按钮
        createWhFactory.setCreatepageconfirmbotton();
        Thread.sleep(1500);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置交易单价
        createBid_factory.setListunitpricebotton(listunitprice);
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        //摘单方式默认为保证金摘单
        Thread.sleep(1000);
        //点击保存按钮
        createBid_factory.setCreatelistingsavebotton();
        Thread.sleep(1000);
        //点击提交挂牌按钮
        createBid_factory.setSubmitlistingbotton();
        Thread.sleep(1000);
        //点击提交按钮
        createBid_factory.setSubmitlistingorder();
        Thread.sleep(1000);
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(2000);
        //关闭浏览器
        driver.close();
    }


//第二种组合
    /*
    产品：储气库PNG1
    价格类型：商品价
    成交价模式：申报价成交
    摘单方式：全款摘单
    黑白名单：不启用
     */

    public void CreatewhListingObject_02(String listunitprice,String minweight,String linkman,String contactphone,String maxweight,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);
        Create_WhorderFactory createWhFactory = new Create_WhorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击卖家挂牌管理菜单
        createBid_factory.setSellerlistingmanagermenu();
        Thread.sleep(1000);
        //点击新建挂牌菜单
        createBid_factory.setCreatelistingordermenu();
        Thread.sleep(1000);
        //选择竞标类型：储单挂牌
        createWhFactory.setWhlistingtype();
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(1000);
        //选择储气库PNG产品
        createWhFactory.setCreate_whpngone();
        createWhFactory.setCreate_whpngtwo();
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //点击选择储单按钮
        createBid_factory.setChoosews();
        Thread.sleep(500);
        //勾选储单
        createBid_factory.setChoosewsweight();
        Thread.sleep(1000);
        //点击确认按钮
        createWhFactory.setCreatepageconfirmbotton();
        Thread.sleep(1500);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置交易单价
        createBid_factory.setListunitpricebotton(listunitprice);
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        //摘单方式设置为全款摘单
        createBid_factory.setDelitype1botton();
        Thread.sleep(1000);
        //点击保存按钮
        createBid_factory.setCreatelistingsavebotton();
        Thread.sleep(1000);
        //点击提交挂牌按钮
        createBid_factory.setSubmitlistingbotton();
        Thread.sleep(1000);
        //点击提交按钮
        createBid_factory.setSubmitlistingorder();
        Thread.sleep(1000);
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(2000);
        //关闭浏览器
        driver.close();
    }

}

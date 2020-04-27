package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.Create_MarginorderFactory;
import pagefactory.Create_WsorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 10:19 2020/1/16
 **/
public class CreatewsListingObject {
    WebDriver driver;

    public CreatewsListingObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
//卖家发起挂牌
//第一种组合
    /*
    PNG3
    价格类型：商品价
    交收方式：线上交收
    黑白名单：不启用
    摘单方式：全款摘单
     */
    public void sellercreatewsListing1(String listunitprice,String minweight,String linkman,String contactphone,String maxweight,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);
        Create_WsorderFactory createWsorderFactory = new Create_WsorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击卖家挂牌管理菜单
        createBid_factory.setSellerlistingmanagermenu();
        Thread.sleep(500);
        //点击新建挂牌菜单
        createBid_factory.setCreatelistingordermenu();
        Thread.sleep(1000);
        //选择竞标类型：仓单挂牌
        createWsorderFactory.setChoosewhtype();
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createWsorderFactory.setCproduct_PNGL();
        createWsorderFactory.setCproduct_PNGL1();
        createWsorderFactory.setCproduct_PNGL2();
        createWsorderFactory.setCproduct_PNGL3();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //点击选择仓单按钮
        createBid_factory.setChoosews();
        Thread.sleep(500);
        //勾选仓单
        createBid_factory.setChoosewsweight();
        Thread.sleep(1000);
        //点击确认按钮
        createWsorderFactory.setConfirmwhbotton();
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
    PNG3
    价格类型：商品价
    交收方式：线上交收
    黑白名单：不启用
    摘单方式：保证金摘单
     */
    public void sellercreatewsListing2(String listunitprice,String minweight,String linkman,String contactphone,String maxweight,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);
        Create_WsorderFactory createWsorderFactory = new Create_WsorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击卖家挂牌管理菜单
        createBid_factory.setSellerlistingmanagermenu();
        Thread.sleep(500);
        //点击新建挂牌菜单
        createBid_factory.setCreatelistingordermenu();
        Thread.sleep(1000);
        //选择竞标类型：仓单挂牌
        createWsorderFactory.setChoosewhtype();
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createWsorderFactory.setCproduct_PNGL();
        createWsorderFactory.setCproduct_PNGL1();
        createWsorderFactory.setCproduct_PNGL2();
        createWsorderFactory.setCproduct_PNGL3();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //点击选择仓单按钮
        createBid_factory.setChoosews();
        Thread.sleep(500);
        //勾选仓单
        createBid_factory.setChoosewsweight();
        Thread.sleep(1000);
        //点击确认按钮
        createWsorderFactory.setConfirmwhbotton();
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




//第三种组合
    /*
    LNG6
    价格类型：商品价
    交收方式：线上交收
    黑白名单：不启用
    摘单方式：保证金摘单
     */
    public void sellercreatewsListing3(String listunitprice,String minweight,String linkman,String contactphone,String maxweight,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);
        Create_WsorderFactory createWsorderFactory = new Create_WsorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击卖家挂牌管理菜单
        createBid_factory.setSellerlistingmanagermenu();
        Thread.sleep(500);
        //点击新建挂牌菜单
        createBid_factory.setCreatelistingordermenu();
        Thread.sleep(1000);
        //选择竞标类型：仓单挂牌
        createWsorderFactory.setChoosewhtype();
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择液化天然气父品种
        createWsorderFactory.setProduct_LNG();
        createWsorderFactory.setProduct_LNG1();
        createWsorderFactory.setProduct_LNG2();
        createWsorderFactory.setProduct_LNG3();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //点击选择仓单按钮
        createBid_factory.setChoosews();
        Thread.sleep(500);
        //勾选仓单
        createBid_factory.setChoosewsweight();
        Thread.sleep(1000);
        //点击确认按钮
        createWsorderFactory.setConfirmwhbotton();
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
        //摘单方式设置：默认保证金摘单
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




//第四种组合
    /*
    LNG6
    价格类型：商品价
    交收方式：线上交收
    黑白名单：不启用
    摘单方式：全款摘单
     */
    public void sellercreatewsListing4(String listunitprice,String minweight,String linkman,String contactphone,String maxweight,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);
        Create_WsorderFactory createWsorderFactory = new Create_WsorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击卖家挂牌管理菜单
        createBid_factory.setSellerlistingmanagermenu();
        Thread.sleep(500);
        //点击新建挂牌菜单
        createBid_factory.setCreatelistingordermenu();
        Thread.sleep(1000);
        //选择竞标类型：仓单挂牌
        createWsorderFactory.setChoosewhtype();
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择液化天然气父品种
        createWsorderFactory.setProduct_LNG();
        createWsorderFactory.setProduct_LNG1();
        createWsorderFactory.setProduct_LNG2();
        createWsorderFactory.setProduct_LNG3();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //点击选择仓单按钮
        createBid_factory.setChoosews();
        Thread.sleep(500);
        //勾选仓单
        createBid_factory.setChoosewsweight();
        Thread.sleep(1000);
        //点击确认按钮
        createWsorderFactory.setConfirmwhbotton();
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

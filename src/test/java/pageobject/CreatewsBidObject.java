package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.Create_MarginorderFactory;
import pagefactory.Create_WsorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 9:23 2019/10/10
 **/
public class CreatewsBidObject {
    WebDriver driver;

    public CreatewsBidObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//第一种组合
    /*
    品种：PNGL3
    价格类型：商品价
    成交价模式：单一底价成交
    可否调配：是
    摘单方式：保证金
    交收方式：线上交收
    黑白名单：不启用
     */

    public void CreatewsBidObject_01(String minweight,String linkman,String contactphone,String maxweight,String baseprice,String bidperprice,String bidperpeight,String wsordername) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击新建场次菜单按钮
        createBid_factory.setNewOrder_botton();
        //选择竞标类型：仓单竞标
        createBid_factory.setWsbid();
        Thread.sleep(2000);
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createWsFactory.setCproduct_PNGL();
        Thread.sleep(2000);
        createWsFactory.setCproduct_PNGL1();
        createWsFactory.setCproduct_PNGL2();
        createWsFactory.setCproduct_PNGL3();
        Thread.sleep(1500);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton2();
        Thread.sleep(1000);
        //点击选择仓单按钮
        createBid_factory.setChoosews();
        Thread.sleep(500);
        //勾选仓单
        createBid_factory.setChoosewsweight();
        Thread.sleep(100);
        //点击确认按钮
        createBid_factory.setSurebotton();
        //设置场次名称
        createBid_factory.setOrderName(wsordername);
        //设置公告日期
        createBid_factory.setNoticeDate();
        //设置竞标日期
        createBid_factory.setBidDate();
        //设置竞标开始时间
        createBid_factory.setBeginTime();
        //设置竞标结束时间
        createBid_factory.setEndTime();
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //默认成交价模式为：单一底价成交
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //摘单方式默认为保证金摘单
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置销售对象类型为:天然气生产
        Thread.sleep(2);
        createBid_factory.setCompanyTypeView();
        //设置起拍价
        createBid_factory.setBasePriceShow(baseprice);
        //设置最小变动价位
        createBid_factory.setBidPerPrice(bidperprice);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        Thread.sleep(1000);

        //点击保存并提交按钮
        createBid_factory.setSavesubbit();
        Thread.sleep(1000);
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(2000);
        //关闭浏览器
        driver.close();
    }


//第二种组合
    /*
    品种：PNGL3
    价格类型：商品价
    成交价模式：申报价成交
    可否调配：是
    摘单方式：全款摘单
    交收方式：线上交收
    黑白名单：不启用
     */
    public void CreatewsBidObject_02(String minweight,String linkman,String contactphone,String maxweight,String baseprice,String bidperprice,String bidperpeight,String wsordername) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击新建场次菜单按钮
        createBid_factory.setNewOrder_botton();
        //选择竞标类型：仓单竞标
        createBid_factory.setWsbid();
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(1000);
        //选择对应的产品名称：管道天然气（门站）
        createWsFactory.setCproduct_PNGL();
        createWsFactory.setCproduct_PNGL1();
        createWsFactory.setCproduct_PNGL2();
        createWsFactory.setCproduct_PNGL3();
        Thread.sleep(1000);

        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(2000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton2();
        Thread.sleep(1000);
        //点击选择仓单按钮
        createBid_factory.setChoosews();
        Thread.sleep(500);
        //勾选仓单
        createBid_factory.setChoosewsweight();
        Thread.sleep(100);
        //点击确认按钮
        createBid_factory.setSurebotton();
        //设置场次名称
        createBid_factory.setOrderName(wsordername);
        //设置公告日期
        createBid_factory.setNoticeDate();
        //设置竞标日期
        createBid_factory.setBidDate();
        //设置竞标开始时间
        createBid_factory.setBeginTime();
        //设置竞标结束时间
        createBid_factory.setEndTime();
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //设置成交价模式为申报价成交
        createBid_factory.setSpaceAuctionMode1();
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //摘单方式设置为全款摘单
        createBid_factory.setDelitype1botton();
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置销售对象类型为:天然气生产
        Thread.sleep(2);
        createBid_factory.setCompanyTypeView();

        //设置起拍价
        createBid_factory.setBasePriceShow(baseprice);
        //设置最小变动价位
        createBid_factory.setBidPerPrice(bidperprice);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        //点击保存并提交按钮
        createBid_factory.setSavesubbit();
        Thread.sleep(1000);
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(2000);
        //关闭浏览器
        driver.close();
    }


//第三种组合
    /*
    品种：LNG6
    价格类型：申报价
    成交价模式：单一底价成交
    可否调配：是
    摘单方式：保证金摘单
    交收方式：线上交收
    黑白名单：不启用
     */

    public void CreatewsBidObject_03(String minweight,String linkman,String contactphone,String maxweight,String baseprice,String bidperprice,String bidperpeight,String wsordername) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击新建场次菜单按钮
        createBid_factory.setNewOrder_botton();
        //选择竞标类型：仓单竞标
        createBid_factory.setWsbid();
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(1000);
        //选择对应的产品名称：管道天然气（门站）
        createWsFactory.setProduct_LNG();
        createWsFactory.setProduct_LNG1();
        createWsFactory.setProduct_LNG2();
        createWsFactory.setProduct_LNG3();
        Thread.sleep(1000);

        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);

        //点击下一步按钮
        createBid_factory.setNextStep_Botton2();
        Thread.sleep(1000);
        //点击选择仓单按钮
        createBid_factory.setChoosews();
        Thread.sleep(500);
        //勾选仓单
        createBid_factory.setChoosewsweight();
        Thread.sleep(100);
        //点击确认按钮
        createBid_factory.setSurebotton();
        Thread.sleep(1000);
        //设置场次名称
        createBid_factory.setOrderName(wsordername);
        //设置公告日期
        createBid_factory.setNoticeDate();
        //设置竞标日期
        createBid_factory.setBidDate();
        //设置竞标开始时间
        createBid_factory.setBeginTime();
        //设置竞标结束时间
        createBid_factory.setEndTime();
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //默认成交价模式为：单一底价成交
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //摘单方式默认为保证金摘单
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置销售对象类型为:天然气生产
        Thread.sleep(2);
        createBid_factory.setCompanyTypeView();
        //设置起拍价
        createBid_factory.setBasePriceShow(baseprice);
        //设置最小变动价位
        createBid_factory.setBidPerPrice(bidperprice);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        //点击保存并提交按钮
        createBid_factory.setSavesubbit();
        Thread.sleep(1000);
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(2000);
        //关闭浏览器
        driver.close();
    }


}

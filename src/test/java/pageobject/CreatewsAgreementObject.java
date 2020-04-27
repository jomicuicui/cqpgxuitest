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
public class CreatewsAgreementObject {
    WebDriver driver;

    public CreatewsAgreementObject(WebDriver driver){
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

    public void CreatewsAgreementObject_01(String minweight,String linkman,String contactphone,String maxweight,String baseprice,String bidperprice,String bidperpeight,String wsordername) throws InterruptedException {
        Create_MarginorderFactory createMarginorderFactory = new Create_MarginorderFactory(driver);
        Create_WsorderFactory createWsorderFactory = new Create_WsorderFactory(driver);

        Thread.sleep(1000);
        //点击交易管理
        createMarginorderFactory.setTradeManagement_menu();
        //点击我是卖家按钮
        createMarginorderFactory.setSellerPage_menu();
        Thread.sleep(1000);
        //点击协议管理菜单
        createMarginorderFactory.setAgreementtransactionmanagemenu();
        Thread.sleep(1000);
        //点击新建协议菜单
        createMarginorderFactory.setCreateagreementtransactionmenu();
        Thread.sleep(1000);
        //点击发起协议按钮
        createMarginorderFactory.setCreateagreementtransactionorderbotton();
        //选择仓单方式
        createWsorderFactory.setSelectwhtypebotton();

        //点击产品名称按钮
        createMarginorderFactory.setProductName_botton();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createWsorderFactory.setCproduct_PNGL();
        createWsorderFactory.setCproduct_PNGL1();
        createWsorderFactory.setCproduct_PNGL2();
        createWsorderFactory.setCproduct_PNGL3();
        Thread.sleep(1500);
        //点击确定按钮
        createMarginorderFactory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createMarginorderFactory.setNextStep_Botton();
        Thread.sleep(1000);
        //点击选择仓单按钮
        createMarginorderFactory.setChoosews();
        Thread.sleep(500);
        //勾选仓单
        createMarginorderFactory.setChoosewsweight();
        Thread.sleep(1000);
        //点击确认按钮
        createWsorderFactory.setConfirmwsorderbotton();
        //设置场次名称
        createMarginorderFactory.setOrderName(wsordername);
        //设置公告日期
        createMarginorderFactory.setNoticeDate();
        //设置竞标日期
        createMarginorderFactory.setBidDate();
        //设置竞标开始时间
        createMarginorderFactory.setBeginTime();
        //设置竞标结束时间
        createMarginorderFactory.setEndTime();
        //设置最小交易量
        createMarginorderFactory.setMinWeight(minweight);
        //默认成交价模式为：单一底价成交
        //设置联系人
        createMarginorderFactory.setLinkMan(linkman);
        //设置联系电话
        createMarginorderFactory.setContactPhone(contactphone);
        //摘单方式默认为保证金摘单
        //设置最大交易量
        createMarginorderFactory.setMaxWeight(maxweight);
        //设置销售对象类型为:天然气生产
        Thread.sleep(2);
        createMarginorderFactory.setCompanyTypeView();
        //设置起拍价
        createMarginorderFactory.setBasePriceShow(baseprice);
        //设置最小变动价位
        createMarginorderFactory.setBidPerPrice(bidperprice);
        //设置最小交易单位
        createMarginorderFactory.setBidPerWeight(bidperpeight);
        Thread.sleep(1000);

        //点击保存并提交按钮
        createMarginorderFactory.setSavesubbit();
        Thread.sleep(1000);
        //确认提交按钮
        createMarginorderFactory.setSure();
        Thread.sleep(2000);
        //关闭浏览器
        driver.close();
    }




}

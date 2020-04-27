package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.BiddingReviewFactory;
import pagefactory.Create_MarginorderFactory;
import pagefactory.Create_WhorderFactory;
import pagefactory.Create_WsorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description: 后台注册储单
 * @Date: Create in 18:22 2020/1/4
 **/
public class Create_PNGwhObject {
    WebDriver driver;


    public Create_PNGwhObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //后台储单注册
    public void createPNGwh_one(String custname,String applywhweight) throws InterruptedException {
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);
        Create_WhorderFactory createWhFactory = new Create_WhorderFactory(driver);
        Create_MarginorderFactory createOrderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(1000);
        //点击仓单导航栏
        createWsFactory.setWssystem();
        Thread.sleep(1000);
        //点击储单管理菜单
        createWhFactory.setWhmanmgermenu();
        Thread.sleep(1000);
        //点击储单注册菜单按钮
        createWhFactory.setCreatewhmenu();
        Thread.sleep(1000);
        //切换到储单注册iframe
        createWhFactory.setChangeiframe();
        Thread.sleep(1000);
        //选择品种编码
        createWhFactory.setProductnumber();
        Thread.sleep(1000);
        //选择品种名称
        createWhFactory.setWhproductone();
        Thread.sleep(1000);
        //选择储气库产品
        createWhFactory.setWhproducttwo();
        Thread.sleep(1000);
        createWhFactory.setWhproductthree();
        //点击确定按钮
        createOrderFactory.setDeterMine_botton();
        Thread.sleep(500);
        //点击下一步按钮
        createWsFactory.setaInitForm();
        Thread.sleep(1000);
        //选择交收机构
        createWhFactory.setWarehouseid();
        Thread.sleep(1000);
        //选择库区
        createWhFactory.setWhlocation();
        Thread.sleep(1000);

        //点击选择会员按钮
        createWhFactory.setSelectcustbotton();
        Thread.sleep(1000);
        //输入交易商名称
        createWhFactory.setQueryinfo(custname);
        Thread.sleep(500);

        //点击搜索按钮
        createWhFactory.setQuerybotton();
        Thread.sleep(1000);

        //点击选择按钮
        createWhFactory.setChoosebotton();
        Thread.sleep(1000);

        //输入申请储单重量
        createWhFactory.setApplywhWeight(applywhweight);
        //输入质检日期
        createWhFactory.setQualitytesttime();
        //输入储单有效期
        createWhFactory.setWhvalidity();
        Thread.sleep(1000);
        //输入提气时间
        createWhFactory.setExtracttime();
        Thread.sleep(1000);
        //点击保存按钮
        createWhFactory.setSavebotton();
        //点击确定按钮
        createWsFactory.setConfirm();
        Thread.sleep(1000);


        //跳出iframe
        createWhFactory.switch_parent();
        //后台审核
    }
    public void createPNGwh_twopass() throws InterruptedException {
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);
        Create_WhorderFactory createWhFactory = new Create_WhorderFactory(driver);
        Create_MarginorderFactory createOrderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(1000);
        //点击储单查询菜单
        createWhFactory.setQuerywhordermenu();
        Thread.sleep(1000);
        createWhFactory.setQuerywhorderinfo();
        Thread.sleep(2000);
        //点击审核按钮
        createWhFactory.setReviewbotton();
        Thread.sleep(1000);

        //点击审核通过按钮
        createWhFactory.setReviewpass();
        Thread.sleep(1000);

        //点击确定按钮
        createWsFactory.setConfirm();
        Thread.sleep(1000);
        driver.close();

    }


    public void createPNGwh_tworefuse(String reasoninfo) throws InterruptedException {
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);
        Create_WhorderFactory createWhFactory = new Create_WhorderFactory(driver);
        Thread.sleep(1000);
        //点击储单查询菜单
        createWhFactory.setQuerywhordermenu();
        Thread.sleep(1000);
        createWhFactory.setQuerywhorderinfo();
        Thread.sleep(1000);
        //点击审核按钮
        createWhFactory.setReviewbotton();
        Thread.sleep(1000);

        //输入审核拒绝原因
        createWhFactory.setRefusereason(reasoninfo);
        Thread.sleep(1000);
        //点击审核拒绝按钮
        createWhFactory.setReviewrefuse();
        Thread.sleep(1000);

        //点击确定按钮
        createWsFactory.setConfirm();
        Thread.sleep(1000);
        driver.close();

    }

    //前台会员进行提货申请
    public void createPNGwh_three(String xtractinputtotal) throws InterruptedException {
        Create_WhorderFactory createWhFactory = new Create_WhorderFactory(driver);
        BiddingReviewFactory biddingReviewFactory = new BiddingReviewFactory(driver);
        Thread.sleep(1000);
        //点击储单系统导航栏
        createWhFactory.setGaswsmenutop();
        Thread.sleep(1000);
        //点击储单管理菜单
        createWhFactory.setGaswsmanagermenu();
        Thread.sleep(1000);
        //点击提货申请按钮
        createWhFactory.setApplyextractbotton();
        Thread.sleep(1000);
        //输入提货量
        createWhFactory.setApplyextractinputtotal(xtractinputtotal);
        Thread.sleep(1000);
        //点击确定按钮
        createWhFactory.setDobotton();
        Thread.sleep(1000);
        //关闭弹框
        biddingReviewFactory.acceptalert();
        driver.close();

    }

    //仓库管理员出库
    public void createPNGwh_four() throws InterruptedException {
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);
        Create_WhorderFactory createWhFactory = new Create_WhorderFactory(driver);
        Create_MarginorderFactory createOrderFactory = new Create_MarginorderFactory(driver);
        BiddingReviewFactory biddingReviewFactory = new BiddingReviewFactory(driver);
        Thread.sleep(1000);
        //点击储单系统导航栏
        createWhFactory.setGaswsmenutop();
        Thread.sleep(500);
        //点击储单出库菜单
        createWhFactory.setWhoutboundmenu();
        Thread.sleep(500);
        //点击出库按钮
        createWhFactory.setOutboundbotton();
        Thread.sleep(500);
        driver.close();

    }

    //会员进行收货确认
    public void createPNGwh_five() throws InterruptedException {
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);
        Create_WhorderFactory createWhFactory = new Create_WhorderFactory(driver);
        Create_MarginorderFactory createOrderFactory = new Create_MarginorderFactory(driver);
        BiddingReviewFactory biddingReviewFactory = new BiddingReviewFactory(driver);
        Thread.sleep(1000);
        //点击储单系统导航栏
        createWhFactory.setGaswsmenutop();
        Thread.sleep(1000);
        //点击储单出库菜单
        createWhFactory.setWhoutboundmenu();
        Thread.sleep(1000);
        //点击确认收货按钮
        createWhFactory.setWhconfirmbotton();
        Thread.sleep(500);
        //确认弹框
        biddingReviewFactory.acceptalert();
        driver.close();

    }


}

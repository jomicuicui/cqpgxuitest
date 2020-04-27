package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pagefactory.Create_MarginorderFactory;
import pagefactory.Create_WsorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 11:37 2019/11/20
 **/
public class Create_LNGwsObject {
    WebDriver driver;

    public Create_LNGwsObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //卖家申请入库
    public void Createws_stepone(String preweight,String gasRatenum) throws InterruptedException {
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);
        Create_MarginorderFactory createOrderFactory = new Create_MarginorderFactory(driver);
        //点击仓储系统菜单按钮
        createWsFactory.setWhws_menu();
        //点击入库申报申请菜单按钮
        createWsFactory.setApplymanager_menu();
        //点击入库申报申请菜单按钮
        createWsFactory.setProductCode();
        //点击品种编码
        createWsFactory.setProductnum();
        //选择LNG6品种
        createWsFactory.setProduct_LNG();
        createWsFactory.setProduct_LNG1();
        createWsFactory.setProduct_LNG2();
        createWsFactory.setProduct_LNG3();
        Thread.sleep(500);
        //点击确定按钮
        createOrderFactory.setDeterMine_botton();
        Thread.sleep(500);
        //点击下一步按钮
        createWsFactory.setaInitForm();
        Thread.sleep(1000);
        //选择交收机构
        createWsFactory.setLNGwarehouseId();
        //选择结算帐号
        createWsFactory.setSettleAccount();
        //设置申报数量
        createWsFactory.setPreWeight(preweight);
        //设置单位为：吨
        createWsFactory.setStockInUnit();
        //设置运输方式
        createWsFactory.setTransportType();
        //设置预计入库时间
        createWsFactory.setPreEnterTime();
        //是否注册仓单：是
        createWsFactory.setIsRegister_yes();
        //设置气化率
        createWsFactory.setGasificationrate(gasRatenum);
        //点击提交按钮
        createWsFactory.setApplyForm();
        Thread.sleep(500);
        //点击确定按钮
        createWsFactory.setConfirm();
        //关闭浏览器
        Thread.sleep(1000);
        driver.close();
    }

    //仓库管理员审批、验收
    public void Createws_steptwo(String preweight) throws InterruptedException {
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);
        //点击仓储系统菜单按钮
        createWsFactory.setWhws_menu();
        //点击入库审批管理菜单
        createWsFactory.setReviewManager_menu();
        //点击入库审批菜单
        createWsFactory.setReview_menu();
        Thread.sleep(1000);
        //点击审批按钮
        createWsFactory.setReviewbotton();
        //点击审批通过
        createWsFactory.setReview_pass();
        Thread.sleep(500);
        //确认弹框
        createWsFactory.setReview_confirm();
        Thread.sleep(500);
        //点击返回按钮
        createWsFactory.setBackbotton();
        Thread.sleep(1000);
        //点击入库验收菜单
        createWsFactory.setCheck_menu();
        Thread.sleep(1000);
        //点击验收按钮
        createWsFactory.setCheckPass_botton();
        //设置实际入库数量
        createWsFactory.setActualweight(preweight);
        Thread.sleep(500);
        //点击确定按钮
        createWsFactory.setCheckPassconfirm();
        //关闭弹框
        createWsFactory.setClosealert();
        //关闭浏览器
        Thread.sleep(1000);
        driver.close();
    }

    //卖家入库确认
    public void Createws_stepthree() throws InterruptedException {
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);
        //点击仓储系统菜单按钮
        createWsFactory.setWhws_menu();
        //点击入库管理菜单
        createWsFactory.setInputmanage();
        Thread.sleep(500);
        //点击入库确认菜单
        createWsFactory.setInputconfirm();
        Thread.sleep(1000);
        //点击确认按钮
        createWsFactory.setConfirmbotton();
        //点击弹框的确定按钮
        createWsFactory.setConfirmbotton1();
        //关闭弹框
        createWsFactory.setClosealert();
        //关闭浏览器
        Thread.sleep(1000);
        driver.close();

    }

    //仓库管理员入库、入库复核
    public void Createws_steptfour(String preweight,String position_duo) throws InterruptedException {
        Create_WsorderFactory createWsFactory = new Create_WsorderFactory(driver);
        Thread.sleep(2000);
        //点击仓储系统菜单按钮
        createWsFactory.setWhws_menu();
        //点击入库管理菜单
        createWsFactory.setInputmanage();
        Thread.sleep(1000);
        createWsFactory.setInputmanages();
        //点击入库按钮
        createWsFactory.setInputstorebotton();
        //设置实际入库
        createWsFactory.setRealweight(preweight);
        //设置库区
        createWsFactory.setRegion();
        //设置库位：垛
        createWsFactory.setPosition_duo(position_duo);
        try {
            driver.findElement(By.xpath("//*[@id=\'tbd_itemList\']/tr[2]/td[4]/input[3]"));
            //设置库位：垛
            createWsFactory.setPosition_duo(position_duo);
        }catch (Exception e){

        }
        //点开仓单属性
        createWsFactory.setOpen();
        Thread.sleep(501);
        //设置仓单属性：质检日期
        createWsFactory.setQualitytest();
        //设置仓单有效期
        createWsFactory.setWsvalidity();
        Thread.sleep(500);

        try {
            driver.findElement(By.xpath("//*[@id=\'tbd_itemList\']/tr[3]/td/div/table/tbody[2]/tr/td[4]/input"));
            //设置仓单等级
            createWsFactory.setWsleveltwo();
            Thread.sleep(500);
            //设置提货时间
            createWsFactory.setPickuptime();
            Thread.sleep(500);
        }catch (Exception e){
            System.out.println("LNG仓单");
        }

        //点击提交按钮
        createWsFactory.setSubmitbotton();
        //确认弹框
        createWsFactory.setConfirm();
        //点击入库复核菜单按钮
        createWsFactory.setInputcheck();
        //点击复核按钮
        createWsFactory.setCheckbotton();
        //点击复核通过按钮
        createWsFactory.setCheckpass();
        Thread.sleep(500);
        //确认弹框
        createWsFactory.setReview_confirm();
        //关闭浏览器
        Thread.sleep(1000);
        driver.close();
    }

}


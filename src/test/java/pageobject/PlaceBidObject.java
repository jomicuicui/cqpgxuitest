package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pagefactory.Create_MarginorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:52 2020/1/13
 **/
public class PlaceBidObject {
    WebDriver driver;

    public PlaceBidObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //买家竞拍（有交收地点/接气点）
    public void PlaceBidwithadr(String bid_rowprice,String bid_rowweight) throws InterruptedException {
        Create_MarginorderFactory createOrderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(2000);
        //点击“交易管理”菜单按钮
        createOrderFactory.setTradeManagement_menu();
        //点击“我是买家”菜单按钮
        createOrderFactory.setBuyMenu();
        Thread.sleep(2000);
        //点击“场次查询”菜单按钮
        createOrderFactory.setOrderList();
        Thread.sleep(2000);
        //点击竞标订单详情
        createOrderFactory.setOrderMessage();
        Thread.sleep(2000);
        //响应当前场次
        createOrderFactory.setCreatebid2responsebotton();
        Thread.sleep(1000);
        //选择接气点
        Thread.sleep(2000);
        createOrderFactory.setDestAddress();
        Thread.sleep(2000);
        //点击回应按钮
        createOrderFactory.setAnswer();
        Thread.sleep(2000);
        //点击回应按钮后的返回按钮
        createOrderFactory.setBack();
        Thread.sleep(2000);
        //点击参与竞标按钮
        createOrderFactory.setSpaceResponsebotton();
        Thread.sleep(2000);
        //等待申报价按钮出现
//        createBid_factory.setWaitbotton();
        //设置申报价
        createOrderFactory.setBid_row_1(bid_rowprice);
        //设置申报量
        createOrderFactory.setBid_row_1weight(bid_rowweight);
        //确认申报按钮
        createOrderFactory.setPlaceorder();
        Thread.sleep(1000);
        //输入验证码
        createOrderFactory.setCheckCode();
        Thread.sleep(2000);
        //确认提交申报按钮
        createOrderFactory.setSubmission();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }

    //买家竞拍（无交收地点/接气点）
    public void PlaceBidwithoutadr(String bid_rowprice,String bid_rowweight) throws InterruptedException {
        Create_MarginorderFactory createOrderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(2000);
        //点击“交易管理”菜单按钮
        createOrderFactory.setTradeManagement_menu();
        //点击“我是买家”菜单按钮
        createOrderFactory.setBuyMenu();
        Thread.sleep(2000);
        //点击“场次查询”菜单按钮
        createOrderFactory.setOrderList();
        Thread.sleep(3000);
        //点击竞标订单详情
        createOrderFactory.setOrderMessage();
        Thread.sleep(3000);

        //响应当前场次
        createOrderFactory.setSpaceResponse();
        Thread.sleep(1000);
        //点击回应按钮
        createOrderFactory.setAnswer();
        Thread.sleep(2000);
        //点击回应按钮后的返回按钮
        createOrderFactory.setBack();
        Thread.sleep(2000);
        //点击参与竞标按钮
        createOrderFactory.setSpaceResponsebotton();
        Thread.sleep(2000);
        //设置申报价
        createOrderFactory.setBid_row_1(bid_rowprice);
        //设置申报量
        createOrderFactory.setBid_row_1weight(bid_rowweight);
        //确认申报按钮
        createOrderFactory.setPlaceorder();
        Thread.sleep(1000);
        //输入验证码
        createOrderFactory.setCheckCode();
        Thread.sleep(1000);
        //确认提交申报按钮
        createOrderFactory.setSubmission();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();

    }



    //买家竞标（包含执行单位和节气点的特殊处理）
    public void PlaceBidwithoutExecutionunit(String bid_rowprice,String bid_rowweight) throws InterruptedException {
        Create_MarginorderFactory createOrderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(2000);
        //点击“交易管理”菜单按钮
        createOrderFactory.setTradeManagement_menu();
        //点击“我是买家”菜单按钮
        createOrderFactory.setBuyMenu();
        Thread.sleep(2000);
        //点击“场次查询”菜单按钮
        createOrderFactory.setOrderList();
        Thread.sleep(2000);
        //点击竞标订单详情
        createOrderFactory.setOrderMessage();
        Thread.sleep(2000);
        //响应当前场次
        createOrderFactory.setSpaceResponse();
        Thread.sleep(1000);
        try {
            driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[2]/form/input"));
            driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div[2]/form/input")).click();
        }catch (Exception e){
            try {
                Thread.sleep(500);
                driver.findElement(By.xpath("//*[@id=\'responseForm\']/table/tbody/tr[4]/th"));
                //选择接气点
                Thread.sleep(1000);
                createOrderFactory.setDestAddress();
                //点击回应按钮
                createOrderFactory.setAnswer();
                Thread.sleep(1000);
                //点击回应按钮后的返回按钮
                createOrderFactory.setBack();
                Thread.sleep(1000);
                //点击参与竞标按钮
                createOrderFactory.setSpaceResponsebotton();
                Thread.sleep(2000);
                //设置申报价
                createOrderFactory.setBid_row_1(bid_rowprice);
                //设置申报量
                createOrderFactory.setBid_row_1weight(bid_rowweight);
                //确认申报按钮
                createOrderFactory.setPlaceorder();
                Thread.sleep(1000);
                //输入验证码
                createOrderFactory.setCheckCode();
                Thread.sleep(1000);
                //确认提交申报按钮
                createOrderFactory.setSubmission();
                Thread.sleep(3000);

            }catch (Exception e1){
                //点击回应按钮
                createOrderFactory.setAnswer();
                Thread.sleep(1000);
                //点击回应按钮后的返回按钮
                createOrderFactory.setBack();
                Thread.sleep(1000);
                //点击参与竞标按钮
                createOrderFactory.setSpaceResponsebotton();
                Thread.sleep(2000);
                //设置申报价
                createOrderFactory.setBid_row_1(bid_rowprice);
                //设置申报量
                createOrderFactory.setBid_row_1weight(bid_rowweight);
                //确认申报按钮
                createOrderFactory.setPlaceorder();
                Thread.sleep(1000);
                //输入验证码
                createOrderFactory.setCheckCode();
                Thread.sleep(1000);
                //确认提交申报按钮
                createOrderFactory.setSubmission();
                Thread.sleep(3000);

            }
        }
        //关闭浏览器
        driver.close();


    }




}

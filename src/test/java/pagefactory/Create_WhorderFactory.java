package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;

/**
 * @Authot: Jomi Gan
 * @Description: 储单注册
 * @Date: Create in 14:51 2020/1/4
 **/
public class Create_WhorderFactory {
    WebDriver driver;

    public Create_WhorderFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //后台“储单管理”菜单按钮
    @FindBy(xpath = "//*[@id=\'menuV2\']/h3[7]")
    WebElement whmanmgermenu;
    public void setWhmanmgermenu(){
        whmanmgermenu.click();
    }

    //“储单注册”菜单按钮
    @FindBy(xpath = "//*[@id=\'menuV2\']/ul[7]/li[1]/a")
    WebElement createwhmenu;
    public void setCreatewhmenu(){
        createwhmenu.click();
    }

    //储单注册iframe
    @FindBy(xpath = "/html/body/div[2]/div[2]/iframe[2]")
    WebElement changeiframe;
    public void setChangeiframe(){
        driver.switchTo().frame(changeiframe);
    }


    //“品种编码”按钮
    @FindBy(xpath = "//*[@id=\'varietyCode\']")
    WebElement productnumber;
    public void setProductnumber(){
        productnumber.click();
    }

    //“品种名称”按钮
    @FindBy(xpath = "//*[@id=\'varietyName\']")
    WebElement whproductone;
    public void setWhproductone(){
        whproductone.click();
    }

    //申请入库时选择储气库PNG产品
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_26_switch\']")
    WebElement whproducttwo;
    public void setWhproducttwo(){
        whproducttwo.click();
    }


    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_27_span\']")
    WebElement whproductthree;
    public void setWhproductthree(){
        whproductthree.click();
    }

    //新建订单时选择储气库PNG产品
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_1_switch\']")
    WebElement create_whpngone;
    public void setCreate_whpngone(){
        create_whpngone.click();
    }
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_2_span\']")
    WebElement create_whpngtwo;
    public void setCreate_whpngtwo(){
        create_whpngtwo.click();
    }


    //选择“交收机构”：PNG自动化储单仓库
    @FindBy(xpath = "//*[@id=\'warehouseId\']")
    WebElement warehouseid;
    public static By warehouseinfo = By.xpath("//*[@id=\'warehouseId\']/option[2]");
    public void setWarehouseid(){
        warehouseid.findElement(warehouseinfo).click();
    }

    //选择“库区”：PNG储单库区
    @FindBy(xpath = "//*[@id=\'locationSec\']")
    WebElement whlocation;
    public static By whlocationinfo = By.xpath("//*[@id=\'locationSec\']/option[2]");
    public void setWhlocation(){
        whlocation.findElement(whlocationinfo).click();
    }

    //选择会员
    @FindBy(xpath = "//*[@id=\'btnWmOpenWin\']")
    WebElement selectcustbotton;
    public void setSelectcustbotton(){
        selectcustbotton.click();
    }
    //“交易商名称”查询控件输入框
    @FindBy(xpath = "//*[@id=\'whUserDialogForm\']/table/tbody/tr/td[2]/input")
    WebElement queryinfo;
    public void setQueryinfo(String custname){
        queryinfo.sendKeys(custname);
    }
    //查询按钮
    @FindBy(xpath = "//*[@id=\'searchwhUser\']")
    WebElement querybotton;
    public void setQuerybotton(){
        querybotton.click();
    }
    //选择交易商按钮
    @FindBy(xpath = "//*[@id=\'open_bid\']/div/div/table/tbody/tr[2]/td[3]/a")
    WebElement choosebotton;
    public void setChoosebotton(){
        choosebotton.click();
    }

    //“申请储单重量”输入框
    @FindBy(xpath = "//*[@id=\'applyWeight\']")
    WebElement applywhWeight;
    public void setApplywhWeight(String applywhweight){
        applywhWeight.sendKeys(applywhweight);
    }

    //“质检日期”
    @FindBy(xpath = "//*[@id=\'form_gas_receipt\']/div[3]/table/tbody[1]/tr[1]/td[2]/input")
    WebElement qualitytesttime;
    public void setQualitytesttime(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.querySelector(\'#form_gas_receipt > div:nth-child(3) > table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > input\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        String currenttime = new SimpleDateFormat("yyyy-MM-dd").format(time);
        qualitytesttime.clear();
        qualitytesttime.sendKeys(currenttime);
    }

    //“储单有效期”
    @FindBy(xpath = "//*[@id=\'form_gas_receipt\']/div[3]/table/tbody[1]/tr[1]/td[4]/input")
    WebElement whvalidity;
    public void setWhvalidity() {
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.querySelector(\'#form_gas_receipt > div:nth-child(3) > table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > input\').removeAttribute('readonly');");
        Long time = (System.currentTimeMillis()+24*60*60*1000*5);
        String currenttime = new SimpleDateFormat("yyyy-MM-dd").format(time);
        whvalidity.clear();
        whvalidity.sendKeys(currenttime);
    }

    //“提气时间”
    @FindBy(xpath = "//*[@id=\'form_gas_receipt\']/div[3]/table/tbody[2]/tr/td[2]/input")
    WebElement extracttime;
    public void setExtracttime() {
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.querySelector(\'#form_gas_receipt > div:nth-child(3) > table > tbody:nth-child(4) > tr > td:nth-child(3) > input\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        String currenttime = new SimpleDateFormat("yyyy-MM").format(time);
        extracttime.clear();
        extracttime.sendKeys(currenttime);
    }

    //“保存”按钮
    @FindBy(xpath = "//*[@id=\'btn_save\']")
    WebElement savebotton;
    public void setSavebotton(){
        savebotton.click();
    }

    //“储单系统”

    //“储单查询”菜单
    @FindBy(xpath = "//*[@id=\'menuV2\']/ul[7]/li[2]/a")
    WebElement querywhordermenu;
    public void setQuerywhordermenu(){
        querywhordermenu.click();
    }

    //“审核”按钮
    @FindBy(xpath = "//*[@id=\'tab_list\']/tbody/tr[2]/td[16]/a[2]")
    WebElement reviewbotton;
    public void setReviewbotton(){
        reviewbotton.click();
    }

    //切换到父iframe
    public void switch_parent(){
        driver.switchTo().parentFrame();
    }

    //切换到“储单查询”iframe
    @FindBy(xpath = "/html/body/div[2]/div[2]/iframe[3]")
    WebElement querywhorderinfo;
    public void setQuerywhorderinfo(){
        driver.switchTo().frame(querywhorderinfo);
    }

    //“审核通过”按钮
    @FindBy(xpath = "/html/body/div[1]/form/div[4]/button[1]")
    WebElement reviewpass;
    public void setReviewpass(){
        reviewpass.click();
    }

    //“审核不通过”按钮
    @FindBy(xpath = "/html/body/div[1]/form/div[4]/button[2]")
    WebElement reviewrefuse;
    public void setReviewrefuse(){
        reviewrefuse.click();
    }

    //审核不通过时的审核意见
    @FindBy(xpath = "//*[@id=\'auditCause\']")
    WebElement refusereason;
    public void setRefusereason(String reasoninfo){
        refusereason.sendKeys(reasoninfo);
    }

    //“储单管理”导航栏
    @FindBy(xpath = "//*[@id=\'gasws\']/a")
    WebElement gaswsmenutop;
    public void setGaswsmenutop(){
        gaswsmenutop.click();
    }

    //“储单管理”菜单
    @FindBy(xpath = "//*[@id=\'menu_content_1115\']/ol/li[1]/a")
    WebElement gaswsmanagermenu;
    public void setGaswsmanagermenu(){
        gaswsmanagermenu.click();
    }

    //“提货申请”按钮
    @FindBy(xpath = "//*[@id=\'pickUp\']")
    WebElement applyextractbotton;
    public void setApplyextractbotton(){
        applyextractbotton.click();
    }

    //储单出库量输入框
    @FindBy(xpath = "/html/body/div[11]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td/input")
    WebElement applyextractinputtotal;
    public void setApplyextractinputtotal(String xtractinputtotal){
        applyextractinputtotal.clear();
        applyextractinputtotal.sendKeys(xtractinputtotal);
    }

    //“确定”按钮
    @FindBy(xpath = "/html/body/div[11]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td/div/button")
    WebElement dobotton;
    public void setDobotton(){
        dobotton.click();
    }

    //“储单出库”菜单
    @FindBy(xpath = "//*[@id=\'menu_content_1115\']/ol/li[2]/a")
    WebElement whoutboundmenu;
    public void setWhoutboundmenu(){
        whoutboundmenu.click();
    }

    //“出库”按钮
    @FindBy(xpath = "//*[@id=\'pickUp\']")
    WebElement outboundbotton;
    public void setOutboundbotton(){
        outboundbotton.click();
    }

    //“储单确认收货”菜单
    @FindBy(xpath = "//*[@id=\'selectedMenu\']")
    WebElement whconfirmmenu;
    public void setWhconfirmmenu(){
        whconfirmmenu.click();
    }

    //“储单确认收货”按钮
    @FindBy(xpath = "//*[@id=\'pickUp\']")
    WebElement whconfirmbotton;
    public void setWhconfirmbotton(){
        whconfirmbotton.click();
    }

    //选择储单挂牌
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/form/ul/li[3]/span[3]/input")
    WebElement whlistingtype;
    public void setWhlistingtype(){
        whlistingtype.click();
    }
    //选择储单后的确认按钮
    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[1]/span")
    WebElement createpageconfirmbotton;
    public void setCreatepageconfirmbotton(){
        createpageconfirmbotton.click();
    }



}

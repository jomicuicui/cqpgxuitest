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
 * @Description:
 * @Date: Create in 11:37 2019/11/20
 **/
public class Create_WsorderFactory {
    WebDriver driver;

    public Create_WsorderFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //“仓储系统”菜单按钮
    @FindBy(xpath = "//*[@id=\'whws\']/a")
    WebElement whws_menu;
    public void setWhws_menu(){
        whws_menu.click();
    }

    //“入库申报管理”菜单按钮
    @FindBy(xpath = "//*[@id=\'menu_content_1128\']/ol/li[1]/a")
    WebElement apply_menu;
    public void setApplymanager_menu(){
        apply_menu.click();
    }

    //“入库申报申请”菜单按钮
    @FindBy(xpath = "//*[@id=\'varietyCode\']")
    WebElement productCode;
    public void setProductCode(){
        productCode.click();
    }
    //点击“品种编码”按钮
    @FindBy(xpath = "//*[@id=\'varietyCode\']")
    WebElement productnum;
    public void setProductnum(){
        productnum.click();
    }

    //卖家申请入库时选择PNGL
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_28_switch\']")
    WebElement product_PNGL;
    public void setProduct_PNGL(){
        product_PNGL.click();
    }
    //选择PNGL1
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_29_switch\']")
    WebElement product_PNGL1;
    public void setProduct_PNGL1(){
        product_PNGL1.click();
    }
    //选择PNGL2
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_30_switch\']")
    WebElement product_PNGL2;
    public void setProduct_PNGL2(){
        product_PNGL2.click();
    }
    //选择PNGL3
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_31_span\']")
    WebElement product_PNGL3;
    public void setProduct_PNGL3(){
        product_PNGL3.click();
    }

    //卖家仓单挂牌时选择PNGL1
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_28_switch\']")
    WebElement cproduct_PNGL;
    public void setCproduct_PNGL(){
        cproduct_PNGL.click();
    }
    //选择PNGL1
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_29_switch\']")
    WebElement cproduct_PNGL1;
    public void setCproduct_PNGL1(){
        cproduct_PNGL1.click();
    }
    //选择PNGL2
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_30_switch\']")
    WebElement cproduct_PNGL2;
    public void setCproduct_PNGL2(){
        cproduct_PNGL2.click();
    }
    //选择PNGL3
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_31_span\']")
    WebElement cproduct_PNGL3;
    public void setCproduct_PNGL3(){
        cproduct_PNGL3.click();
    }

    //卖家申请入库时选择LNG
    //最外层LNG
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_15_switch\']")
    WebElement product_LNG;
    public void setProduct_LNG(){
        product_LNG.click();
    }
    //LNG1
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_16_switch\']")
    WebElement product_LNG1;
    public void setProduct_LNG1(){
        product_LNG1.click();
    }
    //LNG2
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_17_switch\']")
    WebElement product_LNG2;
    public void setProduct_LNG2(){
        product_LNG2.click();
    }
    //LNG3
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_21_span\']")
    WebElement product_LNG3;
    public void setProduct_LNG3(){
        product_LNG3.click();
    }

    //“下一步”按钮
    @FindBy(xpath = "//*[@id=\'aInitForm\']/ul/li[4]/input")
    WebElement aInitForm;
    public void setaInitForm(){
        aInitForm.click();
    }

    //LNG交收机构：LNG自动化仓库
    @FindBy(xpath = "//*[@id=\'warehouseId\']")
    WebElement LNGwarehouseId;
    public static By LNGwarehouseId_info = By.xpath("//*[@id=\'warehouseId\']/option[2]");
    public void setLNGwarehouseId(){
        LNGwarehouseId.findElement(LNGwarehouseId_info).click();
    }

    //PNG交收机构：jomi匹配01
    @FindBy(xpath = "//*[@id=\'warehouseId\']")
    WebElement warehouseId;
    public static By warehouseId_info = By.xpath("//*[@id=\'warehouseId\']/option[10]");
    public void setWarehouseId(){
        warehouseId.findElement(warehouseId_info).click();
    }

    //结算帐号：
    @FindBy(xpath = "//*[@id=\'settleAccount\']")
    WebElement settleAccount;
    public static By settleAccount_true = By.xpath("//*[@id=\'settleAccount\']/option[2]");
    public void setSettleAccount(){
        settleAccount.findElement(settleAccount_true).click();
    }

    //入库“申报数量”
    @FindBy(xpath = "//*[@id=\'preWeight\']")
    WebElement preWeight;
    public void setPreWeight(String preweight){
        preWeight.sendKeys(preweight);
    }

    //“单位”
    @FindBy(xpath = "//*[@id=\'stockInUnit\']")
    WebElement stockInUnit;
    public static By stockInUnit_info = By.xpath("//*[@id=\'stockInUnit\']/option[2]");
    public void setStockInUnit(){
        stockInUnit.findElement(stockInUnit_info).click();
    }

    //运输方式：陆运
    @FindBy(xpath = "//*[@id=\'transportType\']")
    WebElement transportType;
    public static By transportType_info = By.xpath("//*[@id=\'transportType\']/option[3]");
    public void setTransportType(){
        transportType.findElement(transportType_info).click();
    }

    //“预计入库时间”
    @FindBy(xpath = "//*[@id=\'preEnterTime\']")
    WebElement preEnterTime;
    public void setPreEnterTime(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.getElementById(\'preEnterTime\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        String currenttime = new SimpleDateFormat("yyyy-MM-dd").format(time);
        preEnterTime.clear();
        preEnterTime.sendKeys(currenttime);
    }

    //是否注册仓单：是
    @FindBy(xpath = "//*[@id=\'isRegister\']")
    WebElement isRegister_yes;
    public static By isRegister_yes_info = By.xpath("//*[@id=\'isRegister\']/option[2]");
    public void setIsRegister_yes(){
        isRegister_yes.findElement(isRegister_yes_info).click();
    }

    //是否注册仓单：否
    @FindBy(xpath = "//*[@id=\'isRegister\']")
    WebElement isRegister_no;
    public static By isRegister_no_info = By.xpath("//*[@id=\'isRegister\']/option[3]");
    public void setIsRegister_no(){
        isRegister_no.findElement(isRegister_no_info).click();
    }

    //“气化率”按钮
    @FindBy(xpath = "//*[@id=\'applyForm\']/div[2]/table/tbody[2]/tr[1]/td[2]/input")
    WebElement gasificationrate;
    public void setGasificationrate(String gasRatenum){
        gasificationrate.sendKeys(gasRatenum);
    }

    //提交按钮
    @FindBy(xpath = "//*[@id=\'applyForm\']/div[4]/button[2]")
    WebElement applyForm;
    public void setApplyForm(){
        applyForm.click();
    }

    //弹框“确认”提交按钮
    @FindBy(css = "body > div.aui_focus > div > table > tbody > tr:nth-child(2) > td.aui_center > table > tbody > tr:nth-child(3) > td > div > button.aui_strongButton")
    WebElement confirm;
    public void setConfirm(){
        confirm.click();
    }

    //“返回”按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/p/a")
    WebElement returnbotton;
    public void setReturnbotton(){
        returnbotton.click();
    }

    //“入库审批管理”菜单
    @FindBy(xpath = "//*[@id=\'menu_content_1129\']/h3")
    WebElement reviewManager_menu;
    public void setReviewManager_menu(){
        reviewManager_menu.click();
    }

    //“入库审批”菜单
    @FindBy(xpath = "//*[@id=\'menu_content_1129\']/ol/li[1]/a")
    WebElement review_menu;
    public void setReview_menu(){
        review_menu.click();
    }

    //“审批”按钮
    @FindBy(xpath = "//*[@id=\'tbd_list\']/tr[1]/td[12]/a[1]")
    WebElement reviewbotton;
    public void setReviewbotton(){
        reviewbotton.click();
    }

    //“审批通过”按钮
    @FindBy(xpath = "//*[@id=\'auditForm\']/div[2]/input[1]")
    WebElement review_pass;
    public void setReview_pass(){
        review_pass.click();
    }

    //“审批拒绝”按钮
    @FindBy(xpath = "//*[@id=\'auditForm\']/div[2]/input[2]")
    WebElement review_no;
    public void setReview_no(){
        review_no.click();
    }

    //“确认审核通过”按钮
    @FindBy(xpath = "/html/body/table/tbody/tr/td/div[2]/form/input[1]")
    WebElement review_confirm;
    public void setReview_confirm(){
       review_confirm.click();
    }

    //“返回”按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/p/a")
    WebElement backbotton;
    public void setBackbotton(){
        backbotton.click();
    }

    //“入库验收”菜单
    @FindBy(linkText = "入库验收")
    WebElement check_menu;
    public void setCheck_menu(){
        check_menu.click();
    }

    //“验收”按钮
    @FindBy(xpath = "//*[@id=\'tbd_list\']/tr[1]/td[13]/a[1]")
    WebElement checkPass_botton;
    public void setCheckPass_botton(){
        checkPass_botton.click();
    }

    //“驳回”按钮
    @FindBy(xpath = "//*[@id=\'tbd_list\']/tr[1]/td[13]/a[2]")
    WebElement checkRefuse_botton;
    public void setCheckRefuse_botton(){
        checkRefuse_botton.click();
    }

    //“实际入库量”输入框
    @FindBy(xpath = "//*[@id=\'actualWeight_check\']")
    WebElement Actualweight;
    public void setActualweight(String actualweight){
        Actualweight.sendKeys(actualweight);
    }

    //入库验收“确定”按钮
    @FindBy(css = "body > div.aui_focus > div > table > tbody > tr:nth-child(2) > td.aui_center > table > tbody > tr:nth-child(3) > td > div > button.aui_strongButton")
    WebElement checkPassconfirm;
    public void setCheckPassconfirm(){
        checkPassconfirm.click();
    }

    //验收完成后的提示弹框关闭按钮
    @FindBy(xpath = "/html/body/table/tbody/tr/td/div[2]/form/input")
    WebElement closealert;
    public void setClosealert(){
        closealert.click();
    }

    //“入库管理”菜单按钮
    @FindBy(xpath = "//*[@id=\'menu_content_1130\']/h3")
    WebElement inputmanage;
    public void setInputmanage(){
        inputmanage.click();
    }

    //入库管理“入库管理”菜单按钮
    @FindBy(xpath = "//*[@id=\'menu_content_1130\']/ol/li[2]")
    WebElement inputmanages;
    public void setInputmanages(){
        inputmanages.click();
    }

    //“入库确认”菜单按钮
    @FindBy(linkText = "入库确认")
    WebElement inputconfirm;
    public void setInputconfirm(){
        inputconfirm.click();
    }

    //入库管理-入库确认“确认”按钮
    @FindBy(xpath = "//*[@id=\'tbd_list\']/tr[1]/td[12]/a[1]")
    WebElement confirmbotton;
    public void setConfirmbotton(){
        confirmbotton.click();
    }

    //入库确认弹框“确定”按钮
    @FindBy(css = "body > div.aui_focus > div > table > tbody > tr:nth-child(2) > td.aui_center > table > tbody > tr:nth-child(3) > td > div > button.aui_strongButton")
    WebElement confirmbotton1;
    public void setConfirmbotton1(){
        confirmbotton1.click();
    }

    //入库管理-入库管理，“入库”按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[12]/a[1]")
    WebElement inputstorebotton;
    public void setInputstorebotton(){
        inputstorebotton.click();
    }

//仓库管理员：入库管理-入库管理-明细入库信息
    //明细入库-库存明细信息，“实际入库量”
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[2]/td[1]/input")
    WebElement realweight;
    public void setRealweight(String realweightinfo){
        realweight.sendKeys(realweightinfo);
    }
    //“库区”
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[2]/td[3]/select")
    WebElement region;
    public static By regioninfo = By.xpath("//*[@id=\'tbd_itemList\']/tr[2]/td[3]/select/option[2]");
    public void setRegion(){
        region.findElement(regioninfo).click();
    }
    //库位：垛
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[2]/td[4]/input[2]")
    WebElement position_duo;
    public void setPosition_duo(String position_duoinfo){
        position_duo.sendKeys(position_duoinfo);
    }

    //库位：库位
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[2]/td[4]/input[3]")
    WebElement position_store;
    public void setPosition_store(String position_storeinfo){
        position_store.sendKeys(position_storeinfo);
    }
    //“仓单属性展开”按钮
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[2]/td[5]/img")
    WebElement Open;
    public void setOpen(){
        Open.click();
    }
    //“质检日期”
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[3]/td/div/table/tbody[1]/tr[1]/td[2]/input")
    WebElement qualitytest;
    public void setQualitytest(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.querySelector(\'#tbd_itemList > tr.detailReceipt0 > td > div > table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > input\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        String currenttime = new SimpleDateFormat("yyyy-MM-dd").format(time);
        qualitytest.clear();
        qualitytest.sendKeys(currenttime);
    }
    //“仓单有效期”
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[3]/td/div/table/tbody[1]/tr[1]/td[4]/input")
    WebElement wsvalidity;
    public void setWsvalidity() {
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.querySelector(\'#tbd_itemList > tr.detailReceipt0 > td > div > table > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(6) > input\').removeAttribute('readonly');");
        Long time = (System.currentTimeMillis()+24*60*60*1000*5);
        String currenttime = new SimpleDateFormat("yyyy-MM-dd").format(time);
        wsvalidity.clear();
        wsvalidity.sendKeys(currenttime);
    }

    //“仓单等级”：一级
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[3]/td/div/table/tbody[2]/tr/td[2]/select")
    WebElement wslevelone;
    public static By wslevelonw_info = By.xpath("//*[@id=\'tbd_itemList\']/tr[3]/td/div/table/tbody[2]/tr/td[2]/select/option[1]");
    public void setWslevelone(){
        wslevelone.findElement(wslevelonw_info);
    }

    //“仓单等级”：二级
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[3]/td/div/table/tbody[2]/tr/td[2]/select")
    WebElement wsleveltwo;
    public static By wsleveltwo_info = By.xpath("//*[@id=\'tbd_itemList\']/tr[3]/td/div/table/tbody[2]/tr/td[2]/select/option[2]");
    public void setWsleveltwo(){
        wsleveltwo.findElement(wsleveltwo_info);
    }

    //“仓单等级”：三级
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[3]/td/div/table/tbody[2]/tr/td[2]/select")
    WebElement wslevelthree;
    public static By wslevelthree_info = By.xpath("//*[@id=\'tbd_itemList\']/tr[3]/td/div/table/tbody[2]/tr/td[2]/select/option[2]");
    public void setWslevelthree(){
        wslevelthree.findElement(wslevelthree_info);
    }

    //“提货时间”
    @FindBy(xpath = "//*[@id=\'tbd_itemList\']/tr[3]/td/div/table/tbody[2]/tr/td[4]/input")
    WebElement pickuptime;
    public void setPickuptime(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.querySelector(\'#tbd_itemList > tr.detailReceipt0 > td > div > table > tbody:nth-child(4) > tr > td:nth-child(6) > input\').removeAttribute('readonly');");
        Long time = (System.currentTimeMillis()+60*60*1000*5);
        String currenttime = new SimpleDateFormat("yyyy-MM-dd").format(time);
        pickuptime.clear();
        pickuptime.sendKeys(currenttime);
    }
    //“提交”按钮
    @FindBy(xpath = "//*[@id=\'forminverntorySelector\']/div[3]/input[2]")
    WebElement submitbotton;
    public void setSubmitbotton(){
        submitbotton.click();
    }

//仓库管理员：仓储系统-入库管理-入库复核
    //“入库复核”菜单按钮
    @FindBy(xpath = "//*[@id=\'menu_content_1130\']/ol/li[3]/a")
    WebElement inputcheck;
    public void setInputcheck(){
        inputcheck.click();
    }
    //“复核”按钮
    @FindBy(xpath = "//*[@id=\'tbd_list\']/tr/td[11]/a[1]")
    WebElement checkbotton;
    public void setCheckbotton(){
        checkbotton.click();
    }
    //“复核通过”按钮
    @FindBy(xpath = "//*[@id=\'auditForm\']/div[2]/input[1]")
    WebElement checkpass;
    public void setCheckpass(){
        checkpass.click();
    }
    //“复核驳回”按钮
    @FindBy(xpath = "//*[@id=\'auditForm\']/div[2]/input[2]")
    WebElement checkrefuse;
    public void setCheckrefuse(){
        checkrefuse.click();
    }

//后台预制仓单审核
    //“仓单系统”菜单按钮
    @FindBy(css = "body > div.frame_top > div.h_top > div.subsystem > div.subsystem_mid > table > tbody > tr > td:nth-child(5) > a")
    WebElement wssystem;
    public void setWssystem(){
        wssystem.click();
    }

    //“仓单管理”菜单
    @FindBy(xpath = "//*[@id=\'menuV2\']/h3[2]")
    WebElement wsmanager;
    public void setWsmanager(){
        wsmanager.click();
    }
    //“预制仓单审核”菜单按钮
    @FindBy(xpath = "//*[@id=\'menuV2\']/ul[2]/li[2]/a")
    WebElement prewscheck;
    public void setPrewscheck(){
        prewscheck.click();
    }
    //“审核”按钮
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/table[2]/tbody/tr[2]/td[10]/a")
    WebElement b_checkbotton;
    public void setB_checkbotton(){
        b_checkbotton.click();
    }
    //后台实际审核iframe
    @FindBy(xpath = "/html/body/div[2]/div[2]/iframe[2]")
    WebElement checkiframe;
    public void setCheckiframe(){
        driver.switchTo().frame(checkiframe);
    }

    //“审核通过”按钮
    @FindBy(xpath = "//*[@id=\'auditView\']/div/button[1]")
    WebElement b_checkpass;
    public void setB_checkpass(){
        b_checkpass.click();
    }
    //“审核不通过”按钮
    @FindBy(xpath = "//*[@id=\'auditView\']/div/button[2]")
    WebElement b_checkrefuse;
    public void setB_checkrefuse(){
        b_checkrefuse.click();
    }

//申请入库客户
    //仓单验收菜单按钮
    @FindBy(xpath = "//*[@id=\'menu_content_1130\']/ol/li[4]/a")
    WebElement wsacceptancemenu;
    public void setWsacceptancemenu(){
        wsacceptancemenu.click();
    }
    //入库管理-仓单验收：验收按钮
    @FindBy(xpath = "//*[@id=\'tbd_list\']/tr/td[11]/a[1]")
    WebElement wsacceptance;
    public void setWsacceptance(){
        wsacceptance.click();
    }


    //“验收完成”按钮
    @FindBy(xpath = "//*[@id=\'auditForm\']/div[2]/input[1]")
    WebElement acceptancepass;
    public void setAcceptancepass(){
        acceptancepass.click();
    }
    //“验收驳回”按钮
    @FindBy(xpath = "//*[@id=\'auditForm\']/div[2]/input[2]")
    WebElement acceptancerefuse;
    public void setAcceptancerefuse(){
        acceptancerefuse.click();
    }


//仓单挂牌
    //选择仓单挂牌方式
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/form/ul/li[3]/span[2]/input")
    WebElement choosewhtype;
    public void setChoosewhtype(){
        choosewhtype.click();
    }
    //选择仓单后的确认按钮
    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[1]/span")
    WebElement confirmwhbotton;
    public  void setConfirmwhbotton(){
        confirmwhbotton.click();
    }

//仓单新建协议
    //选择仓单协议方式
    @FindBy(xpath = "//*[@id=\'form_step1\']/ul/li[3]/span[2]/input")
    WebElement selectwhtypebotton;
    public void setSelectwhtypebotton(){
        selectwhtypebotton.click();
    }
    //选择仓单后的确认按钮
    @FindBy(xpath = "/html/body/div[8]/div[3]/div/button[1]/span")
    WebElement confirmwsorderbotton;
    public void setConfirmwsorderbotton(){
        confirmwsorderbotton.click();
    }

}

package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;

public class Create_MarginorderFactory {
    WebDriver driver;

    public Create_MarginorderFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);  //配合页面对象模式，为每个页面创建隐式等待
    }
//保证金竞价
    //"交易管理"菜单按钮
    @FindBy(xpath = "//*[@id=\'flx\']/a")
    WebElement tradeManagement_menu;
    public void setTradeManagement_menu(){
        tradeManagement_menu.click();
    }
    //"我是卖家"交易页面按钮
    @FindBy(xpath = "//*[@id=\'flx\']/ol/li/a")
    WebElement sellerPage_menu;
    public void setSellerPage_menu(){
        sellerPage_menu.click();
    }
    //竞标发起“新建场次”按钮
    @FindBy(xpath = "//*[@id=\'menu_content_1103\']/ol/li[1]/a")
    WebElement newOrder_botton;
    public void setNewOrder_botton(){
        newOrder_botton.click();
    }
    //竞拍发起主菜单、竞拍响应主菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[2]/h3")
    WebElement auctionmenu;
    public void setAuctionmenu(){
        auctionmenu.click();
    }
    //竞拍发起中的新建场次菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[2]/ol/li[1]/a")
    WebElement createnewauctionordermenu;
    public void setCreatenewauctionordermenu(){
        createnewauctionordermenu.click();
    }

    //“卖家挂牌管理”菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[3]/h3")
    WebElement sellerlistingmanagermenu;
    public void setSellerlistingmanagermenu(){
        sellerlistingmanagermenu.click();
    }
    //“卖家挂牌管理-新建挂牌”菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[3]/ol/li[1]/a")
    WebElement createlistingordermenu;
    public void setCreatelistingordermenu(){
        createlistingordermenu.click();
    }
    //“卖家挂牌管理-挂牌管理”菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[3]/ol/li[2]/a")
    WebElement listingmanagermenu;
    public void setListingmanagermenu(){
        listingmanagermenu.click();
    }
    //“卖家挂牌管理-挂牌模板管理”菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[3]/ol/li[3]/a")
    WebElement listingstencilmanagermenu;
    public void setListingstencilmanagermenu(){
        listingstencilmanagermenu.click();
    }

    //选择“产品名称”按钮
    @FindBy(xpath = "//*[@id=\'varietyShortName\']")
    WebElement productName_botton;
    public void setProductName_botton(){
        productName_botton.click();
    }
    //选择天然气：保证金竞标
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_37_switch\']")
    WebElement type;
    public void setType(){
        type.click();
    }
    //CreateMarginBid_04的第一层天然气
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_42_span\']")
    WebElement CreateMarginBid_04type;
    public void setCreateMarginBid_04Type(){
        CreateMarginBid_04type.click();
    }

    //CreateMarginBid_04：管道天然气（PNG）
    @FindBy(xpath = "/html/body/div[9]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/div/ul/li[7]/ul/li[5]/a/span")
    WebElement CreateMarginBid_04pngproduct;
    public void setCreateMarginBid_04pngproduct(){
        CreateMarginBid_04pngproduct.click();
    }





    //新建挂牌里的：选择天然气
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_37_switch\']")
    WebElement listingmenufirstfloorpng;
    public void setListingmenufirstfloorpng(){
        listingmenufirstfloorpng.click();
    }
    //新建挂牌里的：管道天然气（门站）
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_42_span\']")
    WebElement listingmenusecondfloorpng;
    public void setListingmenusecondfloorpng(){
        listingmenusecondfloorpng.click();
    }

    //新建挂牌里的：液化天然气（LNG）
    @FindBy(xpath = "/html/body/div[9]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/div/ul/li[7]/ul/li[6]/a/span")
    WebElement getListingmenusecondfloorlng;
    public void setGetListingmenusecondfloorlng(){
        getListingmenusecondfloorlng.click();
    }

    //选择产品“管道天然气（门站）”:保证金竞标
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_42_span\']")
    WebElement chooseProduct_botton;
    public void setChooseProduct_botton(){
        chooseProduct_botton.click();
    }
    //选择产品“液化天然气（LNG）”
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_43_span\']")
    WebElement chooseLNG;
    public void setChooseLNG(){
        chooseLNG.click();
    }
    //选择产品“液化天然气（LNG）”
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_43_span\']")
    WebElement createMarginBid_06chooseLNG;
    public void setCreateMarginBid_06chooseLNG(){
        createMarginBid_06chooseLNG.click();
    }





    //选择产品：管道天然气（PNG）
    @FindBy(xpath = "/html/body/div[8]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/div/ul/li[7]/ul/li[4]/a/span")
    WebElement chooseprjTypeTreeUL_16;
    public void setChooseprjTypeTreeUL_16(){
        chooseprjTypeTreeUL_16.click();
    }
    //选择产品后的确定按钮
    @FindBy(css = "body > div.aui_focus > div > table > tbody > tr:nth-child(2) > td.aui_center > table > tbody > tr:nth-child(3) > td > div > button.aui_strongButton")
    WebElement deterMine_botton;
    public void setDeterMine_botton(){
        deterMine_botton.click();
    }
    //“下一步”按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/form/div/div/ul/li/center/input")
    WebElement nextStep_Botton2;
    public void setNextStep_Botton2(){
        nextStep_Botton2.click();
    }
    //“下一步”按钮
    @FindBy(xpath = "//*[@id=\'form_step1\']/ul/li[4]/input")
    WebElement nextStep_Botton;
    public void setNextStep_Botton(){
        nextStep_Botton.click();
    }

    //设置“场次名称”
    @FindBy(id = "spaceName")
    WebElement orderName;
    public void setOrderName(String ordername){
        orderName.sendKeys(ordername);
    }
    //设置"公告日期"
    @FindBy(xpath = "//*[@id=\'noticeDate\']")
    WebElement noticeDate;
    public void setNoticeDate(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.getElementById(\'noticeDate\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        String currenttime = new SimpleDateFormat("yyyy-MM-dd").format(time);
        noticeDate.clear();
        noticeDate.sendKeys(currenttime);
    }
    //设置"竞标日期"、“竞拍日期”
    @FindBy(xpath = "//*[@id=\'auctionDate\']")
    WebElement BidDate;
    public void setBidDate(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.getElementById(\'auctionDate\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        String currenttime = new SimpleDateFormat("yyyy-MM-dd").format(time);
        BidDate.clear();
        BidDate.sendKeys(currenttime);
    }
    //设置“竞标开始时间”
    @FindBy(xpath = "//*[@id=\'beginTimeStr\']")
    WebElement beginTime;
    public void setBeginTime(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.getElementById(\'beginTimeStr\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        time += 2*1000*35;
        String currenttime = new SimpleDateFormat("HH:mm").format(time);
        beginTime.sendKeys(currenttime);
    }
    //设置“竞标结束时间”
    @FindBy(xpath = "//*[@id=\'endTimeStr\']")
    WebElement endTime;
    public void setEndTime() {
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.getElementById(\'endTimeStr\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        time += 3 * 1000 * 50;
        String currenttime = new SimpleDateFormat("HH:mm").format(time);
        endTime.sendKeys(currenttime);
    }
    //设置“竞标挂牌量”
    @FindBy(xpath = "//*[@id=\'listWeight\']")
    WebElement biddingW;
    public void setBiddingW(String bidweight){
        biddingW.sendKeys(bidweight);
    }
    //设置“最小交易量”
    @FindBy(xpath = "//*[@id=\'minWeight\']")
    WebElement minWeight;
    public void setMinWeight(String minweight){
        minWeight.sendKeys(minweight);
    }
    //设置成交计价模式：申报价
    @FindBy(xpath = "//*[@id=\'spaceAuctionMode1\']")
    WebElement spaceAuctionMode1;
    public void setSpaceAuctionMode1(){
        spaceAuctionMode1.click();
    }
    //设置“联系人”
    @FindBy(xpath = "//*[@id=\'linkman\']")
    WebElement linkMan;
    public void setLinkMan(String linkman){
        linkMan.sendKeys(linkman);
    }
    //设置“联系电话”
    @FindBy(xpath = "//*[@id=\'contactPhone\']")
    WebElement contactPhone;
    public void setContactPhone(String contactphone){
        contactPhone.sendKeys(contactphone);
    }
    //设置“交收方式”为：协商交收
    @FindBy(xpath = "//*[@id=\'settType0\']")
    WebElement settType0;
    public void setSettType0(){
        settType0.click();
    }
    //设置“交收方式”为：线下交收
    @FindBy(xpath = "//*[@id=\'settType1\']")
    WebElement settType1;
    public void setSettType1(){
        settType1.click();
    }
    //付款条件：先货后款
    @FindBy(xpath = "//*[@id=\'payType0\']")
    WebElement paytype0;
    public void setPaytype0(){
        paytype0.click();
    }

    //设置“合同交收点类型”：省份
    @FindBy(xpath = "//*[@id=\'addressType0\']")
    WebElement addressType0botton;
    public void setAddressType0botton(){
        addressType0botton.click();
    }
    //设置“合同交收点类型”：接气点
    @FindBy(xpath = "//*[@id=\'addressType1\']")
    WebElement addressType1botton;
    public void setAddressType1botton(){
        addressType1botton.click();
    }


    //设置“最大交易量”
    @FindBy(xpath = "//*[@id=\'maxWeight\']")
    WebElement maxWeight;
    public void setMaxWeight(String maxweight){
        maxWeight.sendKeys(maxweight);
    }

    //设置“摘单方式”：全款
    @FindBy(xpath = "//*[@id=\'deliType1\']")
    WebElement delitype1botton;
    public void setDelitype1botton(){
        delitype1botton.click();
    }
    //设置“交收周期”
    @FindBy(xpath = "//*[@id=\'settleCycle\']")
    WebElement settleCycle;
    public void setSettleCycle(String settlecycle){
        settleCycle.sendKeys(settlecycle);
    }
    //“是否指定执行单位”：否
    @FindBy(xpath = "//*[@id=\'isExecu0\']")
    WebElement isExecu0;
    public void setIsExecu0(){
        isExecu0.click();
    }
    //“是否指定执行单位”：是
    @FindBy(xpath = "//*[@id=\'isExecu1\']")
    WebElement isExecu1;
    public void setIsExecu1(){
        isExecu1.click();
    }
    //“临时指定”按钮
    @FindBy(xpath = "//*[@id=\'selectExecus\']")
    WebElement selectExecusbotton;
    public void setSelectExecusbotton(){
        selectExecusbotton.click();
    }
    //选择执行单位
    @FindBy(xpath = "//*[@id=\'open_bid\']/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/input")
    WebElement chooseexecus;
    public void setChooseexecus(){
        chooseexecus.click();
    }
    //点击确认按钮
    @FindBy(xpath = "/html/body/div[9]/div[11]/div/button[1]/span")
    WebElement dobotton;
    public void setDobotton(){
        dobotton.click();
    }
    //“合同类型”：日合同    下拉框的特殊处理
    @FindBy(xpath = "//*[@id=\'contractType\']")
    WebElement contractType_day;
    public static By contractType_infoday = By.xpath("//*[@id=\'contractType\']/option[1]");
    public void setContractType_day(){
        contractType_day.findElement(contractType_infoday).click();
    }
    //“合同类型”：周合同    下拉框的特殊处理
    @FindBy(xpath = "//*[@id=\'contractType\']")
    WebElement contractType_week;
    public static By contractType_infoweek = By.xpath("//*[@id=\'contractType\']/option[2]");
    public void setContractType_week(){
        contractType_week.findElement(contractType_infoweek).click();
    }
    //“合同类型”：月合同    下拉框的特殊处理
    @FindBy(xpath = "//*[@id=\'contractType\']")
    WebElement contractType_month;
    public static By contractType_infomonth = By.xpath("//*[@id=\'contractType\']/option[4]");
    public void setContractType_month(){
        contractType_month.findElement(contractType_infomonth).click();
    }
    //“交收起始日”
    @FindBy(id = "settlementDate")
    WebElement settlementDate;
    public void setSettlementDate() {
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.getElementById(\'settlementDate\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        time += 600 * 1000 * 60;
        String currenttime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(time);
        settlementDate.clear();
        settlementDate.sendKeys(currenttime);
    }
    //“销售对象类型”
    public void setCompanyTypeView(){
        JavascriptExecutor removeAttribute_view = (JavascriptExecutor) driver;
        removeAttribute_view.executeScript("document.getElementById(\'companyTypeView\').removeAttribute('readonly');");
        driver.findElement(By.xpath("//*[@id=\'companyTypeView\']")).sendKeys("天然气贸易,天然气运输,天然气化肥");
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("document.getElementById(\'companyType\').setAttribute('value','SC-MY-YS-HF-HG-FD-RQ-LNGGC-QT');");
    }
    //“商品运输”
    @FindBy(id = "shipType")
    WebElement shipType;
    public static By shipType_info = By.xpath("//*[@id=\'shipType\']/option");
    public void setShipType_info(){
        shipType.findElement(shipType_info).click();
    }
    //“交收地点”--重庆
    public void setProvinceView1() throws InterruptedException {
        Thread.sleep(2);
        JavascriptExecutor removeAttribute2_view = (JavascriptExecutor) driver;
        removeAttribute2_view.executeScript("document.getElementById(\'provinceView\').removeAttribute('readonly');");
        driver.findElement(By.xpath("//*[@id=\'provinceView\']")).sendKeys("重庆");
        JavascriptExecutor removeAttribute2 = (JavascriptExecutor) driver;
        removeAttribute2.executeScript("document.getElementById(\'province\').setAttribute('value','50');");
    }
    //“交收地点”--重庆渝北
    public void setProvinceView2() throws InterruptedException {
        Thread.sleep(2);
        JavascriptExecutor removeAttribute2_view = (JavascriptExecutor) driver;
        removeAttribute2_view.executeScript("document.getElementById(\'deliveryPlaceView\').removeAttribute('readonly');");
        driver.findElement(By.xpath("//*[@id=\'deliveryPlaceView\']")).sendKeys("重庆渝北");
        JavascriptExecutor removeAttribute2 = (JavascriptExecutor) driver;
        removeAttribute2.executeScript("document.getElementById(\'deliveryPlace\').setAttribute('value','704');");
    }
    //“门站价浮动比例”   //起拍价
    @FindBy(xpath = "//*[@id=\'pieceInfo\']/li[1]/input")
    WebElement basePriceShow;
    public void setBasePriceShow(String basepriceshow){
        basePriceShow.sendKeys(basepriceshow);
    }
    //“最小变动价位”
    @FindBy(name = "bidPerPrice")
    WebElement bidPerPrice;
    public void setBidPerPrice(String bidperprice){
        bidPerPrice.sendKeys(bidperprice);
    }
    //“最小交易单位”
    @FindBy(name = "bidPerWeight")
    WebElement bidPerWeight;
    public void setBidPerWeight(String bidperpeight){
        bidPerWeight.sendKeys(bidperpeight);
    }
    //设置“气化率”
    @FindBy(xpath = "//*[@id=\'gasRate\']")
    WebElement gasRate;
    public void setGasRate(String gasRatenum){
        gasRate.sendKeys(gasRatenum);
    }
    //“保存并提交”按钮
    @FindBy(xpath = "//*[@id=\'form_step2\']/div[2]/p/input[2]")
    WebElement submmit;
    public void setSubmmit(){
        submmit.click();
    }

    //确认提交按钮
    @FindBy(xpath = "/html/body/table/tbody/tr/td/div[2]/form/input[1]")
    WebElement sure;
    public void setSure(){
        sure.click();
    }
    //“我是买家”菜单按钮
    @FindBy(xpath = "/html/body/div[2]/ul/li[2]/ol/li/a")
    WebElement buyMenu;
    public void setBuyMenu(){
        buyMenu.click();
    }

    //竞标响应中的“场次查询”菜单按钮
    @FindBy(xpath = "//*[@id=\"menu_content_1097\"]/ol/li[2]/a")
    WebElement orderList;
    public void setOrderList(){
        orderList.click();
    }
    //竞拍响应中的“场次查询”
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[2]/ol/li[2]/a")
    WebElement auctionlistquery;
    public void setAuctionlistquery(){
        auctionlistquery.click();
    }
    //场次详情按钮
//    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[12]/a")
//    WebElement orderMessage;
//    public void setOrderMessage(){
//        orderMessage.click();
//    }

    public void setOrderMessage(){
        String starusstr1 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[3]")).getText();
        String statusstr2 = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr[3]/td[3]")).getText();
        if (starusstr1.equals("审核通过")||((starusstr1.equals("竞标中")||starusstr1.equals("竞价中"))&&statusstr2.equals("已成交"))){
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr[2]/td[12]/a")).click();
        }else {
            driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div/table/tbody/tr[3]/td[12]/a")).click();
        }
    }





    //买家响应场次按钮
    @FindBy(css = "#spaceResponse")
    WebElement spaceResponse;
    public void setSpaceResponse(){
        spaceResponse.click();
    }
    //参与竞标按钮
    @FindBy(xpath = "//*[@id=\'spaceResponse\']")
    WebElement createbid2responsebotton;
    public void setCreatebid2responsebotton(){
        createbid2responsebotton.click();
    }
    //节气点 下拉框点击,选择第一个
    @FindBy(xpath = "//*[@id=\'destAddress\']")
    WebElement destAddress;
    public static By destAddress_info = By.xpath("//*[@id=\'destAddress\']/option[2]");
    public void setDestAddress(){
        destAddress.findElement(destAddress_info).click();
    }
    //点击回应按钮
    @FindBy(xpath = "/html/body/div[9]/div[11]/div/button[1]")
    WebElement answer;
    public void setAnswer(){
        answer.click();
    }
    //点击回应按钮后的返回按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/p/a")
    WebElement back;
    public void setBack(){
        back.click();
    }
    //参与竞标按钮
    @FindBy(linkText = "参与竞标")
    WebElement spaceResponsebotton;
    public void setSpaceResponsebotton(){
        spaceResponsebotton.click();
    }
    //参与竞拍按钮
    @FindBy(linkText = "参与竞拍")
    WebElement spaceauctionResponsebotton;
    public void setSpaceauctionResponsebotton(){
        spaceauctionResponsebotton.click();
    }

    //等待设置申报价按钮出现
    public void setWaitbotton(){
        new WebDriverWait(driver,80000).until(ExpectedConditions.presenceOfElementLocated(By.linkText("参与竞标")));
    }
    //设置申报价
    @FindBy(xpath = "//*[@id=\'bid_row_1\']/td[1]/input")
    WebElement bid_row_1price;
    public void setBid_row_1(String bid_rowprice){
        try{
            WebDriverWait wait = new WebDriverWait(driver,260);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'bid_row_1\']/td[1]/input")));
            Thread.sleep(2000);
            element.sendKeys(bid_rowprice);
        }catch (Exception e){
            System.out.println("等待出错");
        }
    }
    //设置申报量
    @FindBy(xpath = "//*[@id=\'bid_row_1\']/td[1]/span/input")
    WebElement bid_row_1weight;
    public void setBid_row_1weight(String bid_rowweight){
        bid_row_1weight.sendKeys(bid_rowweight);
    }
    //确认申报按钮
    @FindBy(xpath = "//*[@id=\'bid_row_1\']/td[1]/button")
    WebElement placeorder;
    public void setPlaceorder(){
        placeorder.click();
    }
    //输入验证码
    @FindBy(xpath = "//*[@id=\'checkCode\']")
    WebElement checkCode;
    public void setCheckCode(){
        checkCode.sendKeys("1111");
    }
    //确认提交申报按钮
    @FindBy(className = "aui_strongButton")
    WebElement Submission;
    public void setSubmission(){
        Submission.click();
    }


//仓单竞标
    //选择仓单竞标方式
    @FindBy(xpath = "//*[@id=\'spaceEntryForm\']/div/div/table/tbody/tr[3]/td/span[2]/input")
    WebElement wsbid;
    public void setWsbid(){
        wsbid.click();
    }

    //选择储单方式
    @FindBy(xpath = "//*[@id=\'spaceEntryForm\']/div/div/table/tbody/tr[3]/td/span[3]/input")
    WebElement whbidtype;
    public void setWhbidtype(){
        whbidtype.click();
    }

    //选择品种：一级 PNGL
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_35_switch\']")
    WebElement wsonelevelproduct;
    public void setWsonelevelproduct(){
        wsonelevelproduct.click();
    }
    //选择品种： 二级 PNGL1
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_36_switch\']")
    WebElement wstwolevelproduct;
    public void setWstwolevelproduct(){
        wsonelevelproduct.click();
    }
    //选择品种： 三级PNGL2
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_37_switch\']")
    WebElement wsthreeproduct;
    public void setWsthreeproduct(){
        wsthreeproduct.click();
    }
    //选择品种： 四级 PNGL3
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_38_span\']")
    WebElement wsfourproduct;
    public void setWsfourproduct(){
        wsfourproduct.click();
    }
    //“选择仓单”按钮、选择储单按钮
    @FindBy(xpath = "//*[@id=\'selectReceipt\']")
    WebElement choosews;
    public void setChoosews(){
        choosews.click();
    }



    //设置仓单量
    @FindBy(xpath = "//*[@id=\'open_bid\']/div/div/div[2]/div[1]/table/tbody/tr[2]/td[2]/input")
    WebElement setrwsweight;
    public void setSetrwsweight(String wsweight){
        setrwsweight.clear();
        setrwsweight.sendKeys(wsweight);
    }
    //选择仓单量、选择储单量
    @FindBy(xpath = "//*[@id=\'open_bid\']/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/input")
    WebElement choosewsweight;
    public void setChoosewsweight(){
        choosewsweight.click();
    }
    //提交挂牌时的“保存并提交”按钮
    @FindBy(xpath = "//*[@id=\"form_step2\"]/div[3]/p/input[2]")
    WebElement savesubbit;
    public void setSavesubbit(){
        savesubbit.click();
    }
    //“确定”按钮
    @FindBy(xpath = "/html/body/div[10]/div[3]/div/button[1]/span")
    WebElement surebotton;
    public void setSurebotton(){
        surebotton.click();
    }
    //“结算仓储费”按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div[3]/div[1]/table/tbody/tr[1]/td[13]/a[3]")
    WebElement settcost;
    public void setSettcost(){
        settcost.click();
    }
    //选择“结算账户”
    @FindBy(xpath = "//*[@id=\'buyerSettleNo\']")
    WebElement settcount;
    public static By settcount_info = By.xpath("//*[@id=\'buyerSettleNo\']/option[2]");
    public void setSettcount(){
        settcount.findElement(settcount_info).click();
    }
    //“支付”按钮
    @FindBy(xpath = "//*[@id=\'btnInfoCommit\']")
    WebElement paycost;
    public void setPaycost(){
        paycost.click();
    }





//挂牌页面


    //挂牌开始时间
    @FindBy(xpath = "//*[@id=\'listingDatesStr\']")
    WebElement listingstarttinme;
    public void setListingstarttinme(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.getElementById(\'listingDatesStr\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        time += 2 * 1000 * 45;
        String currenttime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(time);
        listingstarttinme.clear();
        listingstarttinme.sendKeys(currenttime);
    }
    //挂牌结束时间字段
    @FindBy(xpath = "//*[@id=\'listingDateeStr\']")
    WebElement listingendtinme;
    public void setListingendtinme(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.getElementById(\'listingDateeStr\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        time += 6 * 1000 * 60;
        String currenttime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(time);
        listingendtinme.clear();
        listingendtinme.sendKeys(currenttime);
    }
    //设置交易单价
    @FindBy(xpath = "//*[@id=\'listUnitPrice_num\']")
    WebElement listunitpricebotton;
    public void setListunitpricebotton(String listunitprice){
        listunitpricebotton.sendKeys(listunitprice);
    }
    //保存按钮
    @FindBy(xpath = "//*[@id=\'form_step2_submit\']")
    WebElement createlistingsavebotton;
    public void setCreatelistingsavebotton(){
        createlistingsavebotton.click();
    }
    //提交挂牌按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/p/a[2]")
    WebElement submitlistingbotton;
    public void setSubmitlistingbotton(){
        submitlistingbotton.click();
    }
    //提交按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/div/p/input")
    WebElement submitlistingorder;
    public void setSubmitlistingorder(){
        submitlistingorder.click();
    }

    //“买家摘牌管理”菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[3]/h3")
    WebElement buyerdelistingmanagemenu;
    public void setBuyerdelistingmanagemenu(){
        buyerdelistingmanagemenu.click();
    }
    //“买家摘牌管理-挂牌信息查询”菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[3]/ol/li[1]/a")
    WebElement buyerdelistinglist;
    public void setBuyerdelistinglist(){
        buyerdelistinglist.click();
    }
    //买家摘牌列表的“详情选购”按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[8]/a")
    WebElement buyerpurchasedetailbotton;
    public void setBuyerpurchasedetailbotton(){
        buyerpurchasedetailbotton.click();
    }
    //买家摘牌页面中的“立即购买”按钮
    public void setImmediatelybuybotton(){
        try{
            WebDriverWait wait = new WebDriverWait(driver,260);
            Thread.sleep(120000);
            driver.navigate().refresh();
            Thread.sleep(1500);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[1]/div/div[1]/span[2]/a")));
            element.click();
        }catch (Exception e){
            System.out.println("等待立即选购按钮出错");
        }
    }


    //摘牌量输入字段
    @FindBy(xpath = "//*[@id=\'totalWeight\']")
    WebElement buyerdelistingquantitybotton;
    public void setBuyerdelistingquantitybotton(String buyerdelistingquantity){
        buyerdelistingquantitybotton.sendKeys(buyerdelistingquantity);
    }
    //摘牌确定按钮
    @FindBy(className = "aui_strongButton")
    WebElement delistingconfirmbotton;
    public void setDelistingconfirmbotton(){
        delistingconfirmbotton.click();
    }
    //购物车下单按钮
    @FindBy(xpath = "//*[@id=\'orderBtn2\']")
    WebElement placelistingorderbotton;
    public void setPlacelistingorderbotton(){
        placelistingorderbotton.click();
    }

    //买家挂牌管理菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[4]/h3")
    WebElement buyerlistingmanagemenu;
    public void setBuyerlistingmanagemenu(){
        buyerlistingmanagemenu.click();
    }

    //买家新建挂牌菜单
    @FindBy(xpath = "//*[@id=\'menu_content_1100\']/ol/li[1]/a")
    WebElement buyercreatelistingmenu;
    public void setBuyercreatelistingmenu(){
        buyercreatelistingmenu.click();
    }
    //买家的管道天然气（门站）产品
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_4_switch\']")
    WebElement buyercreatelistingpng1;
    public void setBuyercreatelistingpng1(){
        buyercreatelistingpng1.click();
    }
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_5_span\']")
    WebElement buyercreatelistingpng2;
    public void setBuyercreatelistingpng2(){
        buyercreatelistingpng2.click();
    }
    //买家的液化天然气（LNG）
    @FindBy(xpath = "/html/body/div[8]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/div/ul/li[8]/ul/li[4]/a/span")
    WebElement buyercreatelistinglng1;
    public void setBuyercreatelistinglng1(){
        buyercreatelistinglng1.click();
    }


    //买家新建挂牌选择产品时的下一步按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[2]/div/div[2]/form/ul/li[9]/input")
    WebElement chooseproductnextbotton;
    public void setChooseproductnextbotton(){
        chooseproductnextbotton.click();
    }
    //我是卖家的“卖家摘牌管理”菜单
    @FindBy(css = "#menu_content_1106 > h3")
    WebElement sellerdelistingmanagemenu;
    public void setSellerdelistingmanagemenu(){
        sellerdelistingmanagemenu.click();
    }
    //卖家摘牌管理中的“买家挂牌信息”菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[4]/ol/li[2]/a")
    WebElement buyerlistinginfo;
    public void setBuyerlistinginfo(){
        buyerlistinginfo.click();
    }
    //卖家摘牌页面的“详情选购”按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[3]/div[1]/table/tbody/tr[2]/td[7]/a")
    WebElement sellerpurchasedetailbotton;
    public void setSellerpurchasedetailbotton(){
        sellerpurchasedetailbotton.click();
    }
    //买家新建LNG挂牌时的交收地点选择
    public void setProvinceView3() throws InterruptedException {
        Thread.sleep(2);
        JavascriptExecutor removeAttribute2_view = (JavascriptExecutor) driver;
        removeAttribute2_view.executeScript("document.getElementById(\'deliveryPlaceView\').removeAttribute('readonly');");
        driver.findElement(By.xpath("//*[@id=\'deliveryPlaceView\']")).sendKeys("买家交收(重庆市/重庆/万州区/1111)");
        JavascriptExecutor removeAttribute2 = (JavascriptExecutor) driver;
        removeAttribute2.executeScript("document.getElementById(\'deliveryPlace\').setAttribute('value','706');");
    }

    //卖家摘牌LNG品种时，临时执行执行单位
    //点击临时指定按钮
    @FindBy(xpath = "/html/body/div[12]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/div/div/table/tbody/tr[6]/td/a[1]")
    WebElement provisionaldesignationbotton;
    public void setProvisionaldesignationbotton(){
        provisionaldesignationbotton.click();
    }
    //搜索框内输入买家企业二
    @FindBy(xpath = "/html/body/div[9]/div[2]/div/div/div/div[1]/ul/form/li[1]/input")
    WebElement inputqueryinfobox;
    public void setInputqueryinfobox(String inputqueryinfo){
        inputqueryinfobox.sendKeys(inputqueryinfo);
    }
    //输入查询条件后的搜索按钮
    @FindBy(xpath = "/html/body/div[9]/div[2]/div/div/div/div[1]/ul/form/li[2]/input[1]")
    WebElement queryinfobotton;
    public void setQueryinfobotton(){
        queryinfobotton.click();
    }
    //选中买家二企业
    @FindBy(xpath = "/html/body/div[9]/div[2]/div/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/input")
    WebElement confirmselected;
    public void setConfirmselected(){
        confirmselected.click();
    }
    //选定执行单位后的确定按钮
    @FindBy(xpath = "/html/body/div[9]/div[3]/div/button[1]/span")
    WebElement confirmbotton;
    public void setConfirmbotton(){
        confirmbotton.click();
    }


//协议交易元素
    //协议交易管理菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[7]/h3")
    WebElement agreementtransactionmanagemenu;
    public void setAgreementtransactionmanagemenu(){
        agreementtransactionmanagemenu.click();
    }
    //卖家的新建协议菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[7]/ol/li[1]/a")
    WebElement createagreementtransactionmenu;
    public void setCreateagreementtransactionmenu(){
        createagreementtransactionmenu.click();
    }
    //卖家的发起协议按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div[1]/a")
    WebElement createagreementtransactionorderbotton;
    public void setCreateagreementtransactionorderbotton(){
        createagreementtransactionorderbotton.click();
    }
    //卖家收到的协议
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[7]/ol/li[3]/a")
    WebElement sellerrecivedagreementmenu;
    public void setSellerrecivedagreementmenu(){
        sellerrecivedagreementmenu.click();
    }

    //卖家发起协议保证金协议交易里的天然气产品
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_4_switch\']")
    WebElement agreementtranscactionpng;
    public void setAgreementtranscactionpng(){
        agreementtranscactionpng.click();
    }
    //保证金协议交易里的“管道天然气（门站）”品种
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_5_span\']")
    WebElement agreementtranscactionpng1;
    public void setAgreementtranscactionpng1(){
        agreementtranscactionpng1.click();
    }
    //保证金协议交易里的“液化天然气LNG”品种
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_9_span\']")
    WebElement agreementtranscactionlng1;
    public void setAgreementtranscactionlng1(){
        agreementtranscactionlng1.click();
    }
    //协议交易开始时间
    @FindBy(xpath = "//*[@id=\'agreementDatesStr\']")
    WebElement agreementtransactionstart;
    public void setAgreementtransactionstart(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.getElementById(\'agreementDatesStr\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        time += 2 * 1000 * 45;
        String currenttime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(time);
        agreementtransactionstart.clear();
        agreementtransactionstart.sendKeys(currenttime);
    }

    //协议交易开始时间
    @FindBy(xpath = "//*[@id=\'agreementDateeStr\']")
    WebElement agreementtransactionend;
    public void setAgreementtransactionend(){
        JavascriptExecutor removeAttribute = (JavascriptExecutor) driver;
        removeAttribute.executeScript("var setDate=document.getElementById(\'agreementDateeStr\').removeAttribute('readonly');");
        Long time = System.currentTimeMillis();
        time += 16 * 1000 * 45;
        String currenttime = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(time);
        agreementtransactionend.clear();
        agreementtransactionend.sendKeys(currenttime);
    }
    //添加对手方按钮
    @FindBy(xpath = "//*[@id=\'selectBuyer\']")
    WebElement selectbuyerbotton;
    public void setSelectbuyerbotton(){
        selectbuyerbotton.click();
    }
    //会员名称输入框
    @FindBy(xpath = "//*[@id=\'buyerSelectDialogForm\']/ul/li[1]/input[1]")
    WebElement inputbuyername;
    public void setInputbuyername(String buyername){
        inputbuyername.sendKeys(buyername);
    }
    //搜索按钮
    @FindBy(xpath = "//*[@id=\'listBuyer\']")
    WebElement querybuyerlistbotton;
    public void setQuerybuyerlistbotton(){
        querybuyerlistbotton.click();
    }
    //选中对手方
    @FindBy(xpath = "//*[@id=\'open_bid\']/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/input")
    WebElement choosebuyerinfo;
    public void setChoosebuyerinfo(){
        choosebuyerinfo.click();
    }
    //选中对手方后的确认按钮
    @FindBy(xpath = "/html/body/div[7]/div[11]/div/button[1]/span")
    WebElement cofrimbuyerbotton;
    public void setCofrimbuyerbotton(){
        cofrimbuyerbotton.click();
    }
    //协议单价输入框
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/form/div[2]/fieldset[5]/ul/div[2]/div/table/tbody/tr[2]/td[2]/input")
    WebElement agreementtransactionunitpriceimput;
    public void setAgreementtransactionunitpriceimput(String agreementtransactionunitprice){
        agreementtransactionunitpriceimput.sendKeys(agreementtransactionunitprice);
    }
    //协议量输入框
    @FindBy(xpath = "//*[@id=\'agreementWeight_0\']")
    WebElement agreementWeightimput;
    public void setAgreementWeightimput(String agreementWeight){
        agreementWeightimput.sendKeys(agreementWeight);
    }

    //交收地点选择框
    public void setProvinceaddr() throws InterruptedException {
        Thread.sleep(2);
        JavascriptExecutor removeAttribute2_view = (JavascriptExecutor) driver;
        removeAttribute2_view.executeScript("document.getElementById(\'agreeProvinceView_0\').removeAttribute('readonly');");
        driver.findElement(By.xpath("//*[@id=\'agreeProvinceView_0\']")).sendKeys("重庆");
        JavascriptExecutor removeAttribute2 = (JavascriptExecutor) driver;
        removeAttribute2.executeScript("document.getElementById(\'agreeProvinceView_0\').setAttribute('value','50');");
    }


    //保存按钮
    @FindBy(xpath = "//*[@id=\'form_step2_submit\']")
    WebElement saveagreementtransactioninfobotton;
    public void setSaveagreementtransactioninfobotton(){
        saveagreementtransactioninfobotton.click();
    }
    //保存协议后的返回按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/p/a")
    WebElement backbotton;
    public void setBackbotton(){
        backbotton.click();
    }
    //提交协议按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div[2]/div/div[1]/table/tbody[2]/tr/td[8]/span[4]/a")
    WebElement submitagreementbotton;
    public void setSubmitagreementbotton(){
        submitagreementbotton.click();
    }
    //提交按钮
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/div/p/input")
    WebElement submitbotton;
    public void setSubmitbotton(){
        submitbotton.click();
    }
    //买家协议交易管理菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[5]/h3")
    WebElement buyeragreementmanagemenu;
    public void setBuyeragreementmanagemenu(){
        buyeragreementmanagemenu.click();
    }
    //买家“收到的协议”菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[5]/ol/li[3]/a")
    WebElement buyerrecivedagreementlist;
    public void setBuyerrecivedagreementlist(){
        buyerrecivedagreementlist.click();
    }
    //买方确认协议按钮
    public void setBuyerrecivedorderbotton(){
        try{
            WebDriverWait wait = new WebDriverWait(driver,200);
            Thread.sleep(110000);
            driver.navigate().refresh();
            Thread.sleep(1000);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'list\']/div/div[1]/table/tbody/tr[2]/td[11]/span/a[2]")));
            element.click();
        }catch (Exception e){
            System.out.println("等待确认协议按钮出错");
        }
    }



    //买方确认交易按钮
    @FindBy(xpath = "//*[@id=\'form_step2\']/div[2]/div/p/a[1]")
    WebElement confirmagreementbotton;
    public void setConfirmagreementbotton(){
        confirmagreementbotton.click();
    }
    //买方拒绝协议
    @FindBy(xpath = "//*[@id=\'form_step2\']/div[2]/div/p/a[2]")
    WebElement refuseagreementbotton;
    public void setRefuseagreementbotton(){
        refuseagreementbotton.click();
    }
    //确认交易量
    @FindBy(xpath = "//*[@id=\'confirmWeight\']")
    WebElement confirmnumimput;
    public void setConfirmnumimput(String confirmnum){
        confirmnumimput.sendKeys(confirmnum);
    }
    //确认数量按钮
    @FindBy(xpath = "/html/body/div[8]/div[11]/div/button[1]/span")
    WebElement confirmumbotton;
    public void setConfirmumbotton(){
        confirmumbotton.click();
    }
    //确认费用按钮
    @FindBy(xpath = "/html/body/table/tbody/tr/td/div[2]/form/input[1]")
    WebElement confirmlim;
    public void setConfirmlim(){
        confirmlim.click();
    }

    //买家的发起的协议菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[5]/ol/li[1]/a")
    WebElement buycreateagreementmenu;
    public void setBuycreateagreementmenu(){
        buycreateagreementmenu.click();
    }
    //买家发起协议时选择的管道天然气（门站）
    @FindBy(xpath = "/html/body/div[7]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td/div/ul/li[8]/button")
    WebElement buycreateagreementpng;
    public void setBuycreateagreementpng(){
        buycreateagreementpng.click();
    }
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_40_span\']")
    WebElement buycreateagreementpng1;
    public void setBuycreateagreementpng1(){
        buycreateagreementpng1.click();
    }
    //买家的协议交易管理菜单
    @FindBy(xpath = "/html/body/div[4]/div[1]/ul/li[5]/h3")
    WebElement buyeragreementtransactionmanagemenu;
    public void setBuyeragreementtransactionmanagemenu(){
        buyeragreementtransactionmanagemenu.click();
    }
    //买家确认协议时临时指定执行单位
    @FindBy(xpath = "/html/body/div[7]/div[2]/div/div/div/div[1]/ul/form/li[1]/input")
    WebElement sellerinputcustnamebotton;
    public void setSellerinputcustnamebotton(String sellerinputcustname){
        sellerinputcustnamebotton.sendKeys(sellerinputcustname);
    }
    //输入执行单位后的查询按钮
    @FindBy(xpath = "/html/body/div[7]/div[2]/div/div/div/div[1]/ul/form/li[2]/input[1]")
    WebElement querycustnamebotton;
    public void setQuerycustnamebotton(){
        querycustnamebotton.click();
    }
    //选中搜索出来的执行单位
    @FindBy(xpath = "/html/body/div[7]/div[2]/div/div/div/div[2]/div[1]/table/tbody/tr[2]/td[1]/input")
    WebElement choosecustname;
    public void setChoosecustname(){
        choosecustname.click();
    }
    //确定执行单位后的确定按钮
    @FindBy(xpath = "/html/body/div[7]/div[11]/div/button[1]/span")
    WebElement confirmcustnamebotton;
    public void setConfirmcustnamebotton(){
        confirmcustnamebotton.click();
    }
    //确认协议的按钮
    @FindBy(xpath = "/html/body/div[6]/div[11]/div/button[1]/span")
    WebElement confirmrecivednum;
    public void setConfirmrecivednum(){
        confirmrecivednum.click();
    }
    //卖家新建LNG协议交易时输入的交收地点
    @FindBy(xpath = "//*[@id=\'agreePlace_0\']")
    WebElement agreePlaceimput;
    public void setAgreePlaceimput(String agreePlace){
        agreePlaceimput.sendKeys(agreePlace);
    }
    //买家发起协议选择的lng
    @FindBy(xpath = "//*[@id=\'prjTypeTreeUL_42_span\']")
    WebElement agreementtranscactionlng2;
    public void setAgreementtranscactionlng2(){
        agreementtranscactionlng2.click();
    }

}


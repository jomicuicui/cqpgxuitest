package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.Create_MarginorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 10:19 2020/1/16
 **/
public class CreateMarginListingObject {
    WebDriver driver;

    public CreateMarginListingObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
//卖家发起挂牌
//第一种组合
    /*
    PNG管道天然气（门站）
    价格类型：升贴水
    交收方式：协商交收
    是否指定指定单位：否
    商品运输方式：卖方包运
    合同交收点类型：省份
    黑白名单：不启用
    合同类型：日合同
     */
    public void sellercreateMarginListing1(String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String basepriceshow,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

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
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setListingmenufirstfloorpng();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createBid_factory.setListingmenusecondfloorpng();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收地点为：重庆
        createBid_factory.setProvinceView1();
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        //设置付款条件为先货后款
        createBid_factory.setPaytype0();
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //设置合同交收点类型：省份
        createBid_factory.setAddressType0botton();
        //合同类型设置为：日合同
        createBid_factory.setContractType_day();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(2000);
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
        Thread.sleep(1000);
        //关闭浏览器
        driver.close();
    }


//第二种组合
    /*
        PNG管道天然气（门站）
        价格类型：升贴水
        交收方式：线下交收
        是否指定执行单位：系统提前指定
        合同交收点类型：接气点
        黑白名单：不启用
        合同类型：周合同
     */
    public void sellercreateMarginListing2(String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String basepriceshow,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

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
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setListingmenufirstfloorpng();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createBid_factory.setListingmenusecondfloorpng();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收地点为：重庆
        createBid_factory.setProvinceView1();
        //设置交收方式为：线下交收
        createBid_factory.setSettType1();
        //选择付款方式为先货后款
        createBid_factory.setPaytype0();
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //设置合同交收点类型：接气点
        createBid_factory.setAddressType1botton();
        //合同类型设置为：周合同
        createBid_factory.setContractType_week();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(500);
        //点击保存按钮
        createBid_factory.setCreatelistingsavebotton();
        Thread.sleep(1000);
        //点击提交挂牌按钮
        createBid_factory.setSubmitlistingbotton();
        Thread.sleep(1000);
        //点击提交按钮
        createBid_factory.setSubmitlistingorder();
        Thread.sleep(100000);
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(2000);
        //关闭浏览器
        driver.close();
    }



//第三种组合
    /*
        PNG管道天然气（门站）
        价格类型：升贴水
        交收方式：协商交收
        临时指定执行交收单位
        合同交收点类型：接气点
        黑白名单：不启用
        合同类型：周合同
     */
    public void sellercreateMarginListing3(String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

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
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setListingmenufirstfloorpng();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createBid_factory.setListingmenusecondfloorpng();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收地点为：重庆
        createBid_factory.setProvinceView1();
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        //设置交收周期：月
        createBid_factory.setSettleCycle(settlecycle);
        //设置合同交收点类型：接气点
        createBid_factory.setAddressType1botton();
        //合同类型设置为：月合同
        createBid_factory.setContractType_month();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(500);
        //设置是否指定执行单位为：系统临时设定
        createBid_factory.setIsExecu1();
        createBid_factory.setSelectExecusbotton();
        createBid_factory.setChooseexecus();
        createBid_factory.setDobotton();
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
        液化天然气（LNG）
        价格类型：商品价
        交收方式：协商交收
        不指定执行单位
        黑白名单：不启用
        合同类型：日合同
     */
    public void sellercreateMarginListing4(String gasRatenum,String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

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
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setListingmenufirstfloorpng();
        Thread.sleep(2000);
        //选择对应的产品名称：液化天然气（LNG）
        createBid_factory.setGetListingmenusecondfloorlng();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //设置气化率
        createBid_factory.setGasRate(gasRatenum);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收地点为：重庆
        createBid_factory.setProvinceView2();
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        //设置交收周期：日
        createBid_factory.setSettleCycle(settlecycle);
        //合同类型设置为：日合同
        createBid_factory.setContractType_day();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(500);
        //不指定执行单位
        createBid_factory.setIsExecu0();
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



//第五种组合
    /*
        液化天然气（LNG）
        价格类型：商品价
        交收方式：协商交收
        临时指定执行单位
        黑白名单：不启用
        合同类型：周合同
     */
    public void sellercreateMarginListing5(String gasRatenum,String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

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
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setListingmenufirstfloorpng();
        Thread.sleep(2000);
        //选择对应的产品名称：液化天然气（LNG）
        createBid_factory.setGetListingmenusecondfloorlng();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //设置气化率
        createBid_factory.setGasRate(gasRatenum);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收地点为：重庆
        createBid_factory.setProvinceView2();
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        //设置交收周期：周
        createBid_factory.setSettleCycle(settlecycle);
        //合同类型设置为：周合同
        createBid_factory.setContractType_week();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(500);
        //临时指定执行单位
        createBid_factory.setIsExecu1();
        createBid_factory.setSelectExecusbotton();
        createBid_factory.setChooseexecus();
        createBid_factory.setDobotton();
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


//第六种组合
    /*
        液化天然气（LNG）
        价格类型：商品价
        交收方式：线下交收
        不指定执行单位
        黑白名单：不启用
        合同类型：周合同
     */
    public void sellercreateMarginListing6(String gasRatenum,String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

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
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setListingmenufirstfloorpng();
        Thread.sleep(2000);
        //选择对应的产品名称：液化天然气（LNG）
        createBid_factory.setGetListingmenusecondfloorlng();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton();
        Thread.sleep(1000);
        //设置气化率
        createBid_factory.setGasRate(gasRatenum);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收地点为：重庆
        createBid_factory.setProvinceView2();
        //设置交收方式为：线下交收
        createBid_factory.setSettType1();
        //设置交收周期：周
        createBid_factory.setSettleCycle(settlecycle);
        //合同类型设置为：周合同
        createBid_factory.setContractType_week();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(500);
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


//买家发起挂牌组合
//第一种组合
    /*
    PNG管道天然气（门站）
    价格类型：申报价
    交收方式：协商交收
    是否指定指定单位：否
    商品运输方式：卖方包运
    合同交收点类型：省份
    黑白名单：不启用
    合同类型：日合同
     */
public void buyercreateMarginListing1(String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String basepriceshow,String bidperprice,String bidperpeight) throws InterruptedException {
    Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

    //点击交易管理
    createBid_factory.setTradeManagement_menu();
    //点击我是买家按钮
    createBid_factory.setSellerPage_menu();
    //点击买家挂牌管理菜单
    createBid_factory.setBuyerlistingmanagemenu();
    Thread.sleep(1000);
    //点击新建挂牌菜单
    createBid_factory.setBuyercreatelistingmenu();
    Thread.sleep(1000);
    //点击品种名称按钮
    createBid_factory.setProductName_botton();
    Thread.sleep(2000);
    //选择天然气父品种
    createBid_factory.setBuyercreatelistingpng1();
    Thread.sleep(2000);
    //选择对应的产品名称：管道天然气（门站）
    createBid_factory.setBuyercreatelistingpng2();
    Thread.sleep(1000);
    //点击确定按钮
    createBid_factory.setDeterMine_botton();
    Thread.sleep(1000);
    //点击下一步按钮
    createBid_factory.setChooseproductnextbotton();
    Thread.sleep(2000);
    //设置挂牌开始时间
    createBid_factory.setListingstarttinme();
    //设置挂牌结束时间
    createBid_factory.setListingendtinme();
    //设置挂牌量
    createBid_factory.setBiddingW(bidweight);
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
    //设置交收方式为：协商交收
    createBid_factory.setSettType0();
    //付款条件：先货后款
    createBid_factory.setPaytype0();
    //设置交收周期
    createBid_factory.setSettleCycle(settlecycle);
    //设置合同交收点类型：省份
    createBid_factory.setAddressType0botton();
    //合同类型设置为：日合同
    createBid_factory.setContractType_day();
    //设置销售对象类型为:天然气生产
    Thread.sleep(2000);
    createBid_factory.setCompanyTypeView();
    //设置商品运输为：卖方包运
    createBid_factory.setShipType_info();
    Thread.sleep(500);
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
    Thread.sleep(1000);
    //关闭浏览器
    driver.close();
}

//第二种组合
    /*
    PNG管道天然气（门站）
    价格类型：申报价
    交收方式：协商交收
    系统提指定执行单位
    商品运输方式：卖方包运
    合同交收点类型：省份
    黑白名单：不启用
    合同类型：周合同
     */
    public void buyercreateMarginListing2(String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String basepriceshow,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击买家挂牌管理菜单
        createBid_factory.setBuyerlistingmanagemenu();
        Thread.sleep(1000);
        //点击新建挂牌菜单
        createBid_factory.setBuyercreatelistingmenu();
        Thread.sleep(1000);
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setBuyercreatelistingpng1();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createBid_factory.setBuyercreatelistingpng2();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setChooseproductnextbotton();
        Thread.sleep(2000);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //设置合同交收点类型：省份
        createBid_factory.setAddressType0botton();
        //合同类型设置为：周合同
        createBid_factory.setContractType_week();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(500);
        //设置是否指定执行单位为：系统提前指定
        createBid_factory.setIsExecu1();
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
        Thread.sleep(1000);
        //关闭浏览器
        driver.close();
    }


//第三种组合
    /*
    PNG管道天然气（门站）
    价格类型：申报价
    交收方式：协商交收
    临时指定执行单位
    商品运输方式：卖方包运
    合同交收点类型：接气点
    黑白名单：不启用
    合同类型：月合同
     */
    public void buyercreateMarginListing3(String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String basepriceshow,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击买家挂牌管理菜单
        createBid_factory.setBuyerlistingmanagemenu();
        Thread.sleep(1000);
        //点击新建挂牌菜单
        createBid_factory.setBuyercreatelistingmenu();
        Thread.sleep(1000);
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setBuyercreatelistingpng1();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createBid_factory.setBuyercreatelistingpng2();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setChooseproductnextbotton();
        Thread.sleep(2000);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //设置合同交收点类型：省份
        createBid_factory.setAddressType1botton();
        //合同类型设置为：周合同
        createBid_factory.setContractType_month();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(500);
        //设置是否指定执行单位为：系统临时指定
        createBid_factory.setIsExecu1();
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
        Thread.sleep(1000);
        //关闭浏览器
        driver.close();
    }



//第四种组合
    /*
    PNG管道天然气（门站）
    价格类型：申报价
    交收方式：线下交收
    不指定执行单位
    商品运输方式：卖方包运
    合同交收点类型：接气点
    黑白名单：不启用
    合同类型：月合同
     */
    public void buyercreateMarginListing4(String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String basepriceshow,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击买家挂牌管理菜单
        createBid_factory.setBuyerlistingmanagemenu();
        Thread.sleep(1000);
        //点击新建挂牌菜单
        createBid_factory.setBuyercreatelistingmenu();
        Thread.sleep(1000);
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setBuyercreatelistingpng1();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createBid_factory.setBuyercreatelistingpng2();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setChooseproductnextbotton();
        Thread.sleep(2000);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收方式为：协商交收
        createBid_factory.setSettType1();
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //设置合同交收点类型：接气点
        createBid_factory.setAddressType1botton();
        //合同类型设置为：周合同
        createBid_factory.setContractType_month();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(500);
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
        Thread.sleep(1000);
        //关闭浏览器
        driver.close();
    }


//第五种组合
    /*
    LNG液化天然气
    价格类型：申报价
    交收方式：线下交收
    不指定执行单位
    商品运输方式：卖方包运
    黑白名单：不启用
    合同类型：月合同
     */
    public void buyercreateMarginListing5(String gasRatenum,String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String basepriceshow,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击买家挂牌管理菜单
        createBid_factory.setBuyerlistingmanagemenu();
        Thread.sleep(1000);
        //点击新建挂牌菜单
        createBid_factory.setBuyercreatelistingmenu();
        Thread.sleep(1000);
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setBuyercreatelistingpng1();
        Thread.sleep(2000);
        //选择对应的产品名称：液化天然气（LNG）
        createBid_factory.setBuyercreatelistinglng1();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setChooseproductnextbotton();
        Thread.sleep(2000);
        //设置气化率
        createBid_factory.setGasRate(gasRatenum);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收地点
        createBid_factory.setProvinceView3();
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //设置交收方式为：线下交收
        createBid_factory.setSettType1();
        //合同类型设置为：周合同
        createBid_factory.setContractType_month();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(500);
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
        Thread.sleep(1000);
        //关闭浏览器
        driver.close();
    }


//第六种组合
    /*
    LNG液化天然气
    价格类型：申报价
    交收方式：协商交收
    临时指定执行单位
    商品运输方式：卖方包运
    黑白名单：不启用
    合同类型：日合同
     */
    public void buyercreateMarginListing6(String gasRatenum,String listunitprice,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String basepriceshow,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击买家挂牌管理菜单
        createBid_factory.setBuyerlistingmanagemenu();
        Thread.sleep(1000);
        //点击新建挂牌菜单
        createBid_factory.setBuyercreatelistingmenu();
        Thread.sleep(1000);
        //点击品种名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setBuyercreatelistingpng1();
        Thread.sleep(2000);
        //选择对应的产品名称：液化天然气（LNG）
        createBid_factory.setBuyercreatelistinglng1();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createBid_factory.setChooseproductnextbotton();
        Thread.sleep(2000);
        //设置气化率
        createBid_factory.setGasRate(gasRatenum);
        //设置挂牌开始时间
        createBid_factory.setListingstarttinme();
        //设置挂牌结束时间
        createBid_factory.setListingendtinme();
        //设置挂牌量
        createBid_factory.setBiddingW(bidweight);
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
        //设置交收地点
        createBid_factory.setProvinceView3();
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        //合同类型设置为：周合同
        createBid_factory.setContractType_month();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //系统提前指定执行单位
        createBid_factory.setIsExecu1();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(500);
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
        Thread.sleep(1000);
        //关闭浏览器
        driver.close();
    }

}
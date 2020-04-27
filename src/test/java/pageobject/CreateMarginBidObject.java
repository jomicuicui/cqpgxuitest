package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.Create_MarginorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 10:19 2020/1/16
 **/
public class CreateMarginBidObject {
    WebDriver driver;

    public CreateMarginBidObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//第一种组合
    /*
    PNG管道天然气（门站）
    价格类型：升贴水
    成交计价模式：申报价成交
    交收方式：协商交收
    是否指定指定单位：否
    商品运输方式：卖方包运
    黑白名单：不启用
    合同类型：日合同
     */
    public void CreateMarginBid1(String marginordername,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String basepriceshow,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        Thread.sleep(1000);

        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        //点击新建场次菜单按钮
        createBid_factory.setNewOrder_botton();
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);

        //选择天然气父品种
        createBid_factory.setType();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createBid_factory.setChooseProduct_botton();
        Thread.sleep(2000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(2000);

        //点击下一步按钮
        createBid_factory.setNextStep_Botton2();
        //设置场次名称
        createBid_factory.setOrderName(marginordername);
        //设置公告日期
        createBid_factory.setNoticeDate();
        //设置竞标日期
        createBid_factory.setBidDate();
        //设置竞标开始时间
        createBid_factory.setBeginTime();
        //设置竞标结束时间
        createBid_factory.setEndTime();
        //设置竞标挂牌量
        createBid_factory.setBiddingW(bidweight);
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //设置是否指定执行单位为：否
        createBid_factory.setIsExecu0();
        //合同类型设置为：日合同
        createBid_factory.setContractType_day();
        //设置交收起始日
        createBid_factory.setSettlementDate();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        //设置交收地点为：重庆
        createBid_factory.setProvinceView1();
        //设置门站价浮动比例
        createBid_factory.setBasePriceShow(basepriceshow);
        //设置最小变动价位
        createBid_factory.setBidPerPrice(bidperprice);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        Thread.sleep(1000);

        //点击保存并提交按钮
        createBid_factory.setSubmmit();
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
    成交计价模式：单一底价成交
    交收方式：协商交收
    是否指定指定单位：是（系统临时指定）
    商品运输方式：卖方包运
    黑白名单：不启用
    合同类型：周合同
     */
    public void CreateMarginBid2(String marginordername,String bidweight,String minweight,String linkman,String contactphone,String maxweight,String settlecycle,String basepriceshow,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        Thread.sleep(1000);
        //点击新建场次菜单按钮
        createBid_factory.setNewOrder_botton();
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(1000);
        //选择天然气父品种
        createBid_factory.setType();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createBid_factory.setChooseProduct_botton();
        Thread.sleep(2000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(2000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton2();
        Thread.sleep(1000);
        //设置场次名称
        createBid_factory.setOrderName(marginordername);
        //设置公告日期
        createBid_factory.setNoticeDate();
        //设置竞标日期
        createBid_factory.setBidDate();
        //设置竞标开始时间
        createBid_factory.setBeginTime();
        //设置竞标结束时间
        createBid_factory.setEndTime();
        //设置竞标挂牌量
        createBid_factory.setBiddingW(bidweight);
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        Thread.sleep(1000);
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //设置是否指定执行单位为：系统临时设定
        createBid_factory.setIsExecu1();
        Thread.sleep(1000);
        createBid_factory.setSelectExecusbotton();
        Thread.sleep(1000);
        createBid_factory.setChooseexecus();
        Thread.sleep(1000);
        createBid_factory.setDobotton();
        Thread.sleep(1000);
        //合同类型设置为：周合同
        createBid_factory.setContractType_week();
        //设置交收起始日
        createBid_factory.setSettlementDate();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        //设置交收地点为：重庆
        createBid_factory.setProvinceView1();
        //设置门站价浮动比例
        createBid_factory.setBasePriceShow(basepriceshow);
        //设置最小变动价位
        createBid_factory.setBidPerPrice(bidperprice);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        Thread.sleep(1000);
        //点击保存并提交按钮
        createBid_factory.setSubmmit();
        Thread.sleep(1000);
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }


//第三种组合
    /*
     品种：PNG管道天然气（管道）
    价格类型：商品价
    成交计价模式：单一底价成交
    交收方式：协商交收
    是否指定指定单位：是（系统临时指定）
    商品运输方式：卖方包运
    黑白名单：不启用
    合同类型：日合同
     */
    public void CreateMarginBid3(String marginordername,String bidweight,String minweight,String maxweight,String linkman,String contactphone,String settlecycle,String baseprice,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);
        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        Thread.sleep(1000);
        //点击新建场次菜单按钮
        createBid_factory.setNewOrder_botton();
        Thread.sleep(1000);
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setType();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（PNG）
        createBid_factory.setChooseProduct_botton();
        Thread.sleep(2000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(2000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton2();
        Thread.sleep(1000);
        //设置场次名称
        createBid_factory.setOrderName(marginordername);
        //设置公告日期
        createBid_factory.setNoticeDate();
        //设置竞标日期
        createBid_factory.setBidDate();
        //设置竞标开始时间
        createBid_factory.setBeginTime();
        //设置竞标结束时间
        createBid_factory.setEndTime();
        //设置竞标挂牌量
        createBid_factory.setBiddingW(bidweight);
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        Thread.sleep(1000);
        //设置是否指定执行单位为：系统提前指定
        createBid_factory.setIsExecu1();
        Thread.sleep(2000);
        //合同类型设置为：日合同
        createBid_factory.setContractType_day();
        //设置交收起始日
        createBid_factory.setSettlementDate();
        //设置销售对象类型为:天然气生产
        Thread.sleep(1000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        Thread.sleep(1000);
        //设置交收地点为：重庆
        createBid_factory.setProvinceView1();
        //设置起拍价
        createBid_factory.setBasePriceShow(baseprice);
        //设置最小变动价位
        createBid_factory.setBidPerPrice(bidperprice);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        Thread.sleep(1000);
        //点击保存并提交按钮
        createBid_factory.setSubmmit();
        Thread.sleep(1000);
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }


//第四种组合
    /*
    品种：PNG管道天然气（门站）
    价格类型：商品价
    成交计价模式：单一底价成交
    交收方式：线下交收
    是否指定指定单位：否
    商品运输方式：卖方包运
    黑白名单：不启用
    合同类型：月合同
     */
    public void CreateMarginBid4(String marginordername,String bidweight,String minweight,String maxweight,String linkman,String contactphone,String settlecycle,String baseprice,String bidperprice,String bidperpeight) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        Thread.sleep(1000);
        //点击新建场次菜单按钮
        createBid_factory.setNewOrder_botton();
        Thread.sleep(1000);
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(1000);
        //选择天然气父品种
        //选择天然气父品种
        createBid_factory.setType();
        Thread.sleep(2000);
        //选择对应的产品名称：管道天然气（门站）
        createBid_factory.setChooseProduct_botton();
        Thread.sleep(2000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(2000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton2();
        Thread.sleep(1000);
        //设置场次名称
        createBid_factory.setOrderName(marginordername);
        //设置公告日期
        createBid_factory.setNoticeDate();
        //设置竞标日期
        createBid_factory.setBidDate();
        //设置竞标开始时间
        createBid_factory.setBeginTime();
        //设置竞标结束时间
        createBid_factory.setEndTime();
        //设置竞标挂牌量
        createBid_factory.setBiddingW(bidweight);
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //设置交收方式为：线下交收
        createBid_factory.setSettType1();
        Thread.sleep(1000);
        //设置交收周期：月
        createBid_factory.setSettleCycle(settlecycle);
        //设置是否指定执行单位为：否
        //合同类型设置为：月合同
        createBid_factory.setContractType_month();
        Thread.sleep(1000);

        //设置交收起始日
        createBid_factory.setSettlementDate();
        //设置销售对象类型为:天然气生产
        Thread.sleep(1000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        //设置交收地点为：重庆
        createBid_factory.setProvinceView1();
        //设置起拍价
        createBid_factory.setBasePriceShow(baseprice);
        //设置最小变动价位
        createBid_factory.setBidPerPrice(bidperprice);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        Thread.sleep(1000);
        //点击保存并提交按钮
        createBid_factory.setSubmmit();
        Thread.sleep(1000);
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(4000);
        //关闭浏览器
        driver.close();
    }


//第五种组合
    /*
    品种：液化天然气（LNG）
    价格类型：商品价
    成交计价模式：单一底价成交
    交收方式：协商交收
    是否指定指定单位：否
    商品运输方式：买方自提
    黑白名单：不启用
    合同类型：日合同
     */

    public void CreateMarginBid5(String marginordername,String bidweight,String minweight,String maxweight,String linkman,String contactphone,String settlecycle,String baseprice,String bidperprice,String bidperpeight,String gasRatenum) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        Thread.sleep(1000);
        //点击新建场次菜单按钮
        createBid_factory.setNewOrder_botton();
        Thread.sleep(1000);
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setType();
        Thread.sleep(2000);
        //选择对应的产品名称：液化天然气
        createBid_factory.setCreateMarginBid_06chooseLNG();
        Thread.sleep(1000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(2000);
        //点击下一步按钮
        createBid_factory.setNextStep_Botton2();
        //设置场次名称
        createBid_factory.setOrderName(marginordername);
        //设置公告日期
        createBid_factory.setNoticeDate();
        //设置竞标日期
        createBid_factory.setBidDate();
        //设置竞标开始时间
        createBid_factory.setBeginTime();
        Thread.sleep(1000);
        //设置竞标结束时间
        createBid_factory.setEndTime();
        //设置竞标挂牌量
        createBid_factory.setBiddingW(bidweight);
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //成交计价模式：单一底价成交
        //价格类型：商品价
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //设置交收方式为：协商交收
        createBid_factory.setSettType0();
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //合同类型设置为：日合同
        createBid_factory.setContractType_day();
        //设置交收起始日
        createBid_factory.setSettlementDate();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        //设置交收地点为：重庆渝北
        createBid_factory.setProvinceView2();
        //设置起拍价
        createBid_factory.setBasePriceShow(baseprice);
        //设置最小变动价位
        createBid_factory.setBidPerPrice(bidperprice);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        //设置气化率
        createBid_factory.setGasRate(gasRatenum);
        Thread.sleep(1000);
        //点击保存并提交按钮
        createBid_factory.setSubmmit();
        Thread.sleep(1000);
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }


//第六种组合
    /*
    品种：液化天然气（LNG）
    价格类型：商品价
    成交计价模式：申报价成交
    交收方式：线下交收
    是否指定指定单位：否
    商品运输方式：买方自提
    黑白名单：不启用
    合同类型：日合同
     */
    public void CreateMarginBid6(String marginordername,String bidweight,String minweight,String maxweight,String linkman,String contactphone,String settlecycle,String baseprice,String bidperprice,String bidperpeight,String gasRatenum) throws InterruptedException {
        Create_MarginorderFactory createBid_factory = new Create_MarginorderFactory(driver);

        //点击交易管理
        createBid_factory.setTradeManagement_menu();
        //点击我是卖家按钮
        createBid_factory.setSellerPage_menu();
        Thread.sleep(1000);
        //点击新建场次菜单按钮
        createBid_factory.setNewOrder_botton();
        Thread.sleep(1000);
        //点击产品名称按钮
        createBid_factory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createBid_factory.setType();
        Thread.sleep(2000);
        //选择对应的产品名称：液化天然气
        createBid_factory.setCreateMarginBid_06chooseLNG();
        Thread.sleep(2000);
        //点击确定按钮
        createBid_factory.setDeterMine_botton();
        Thread.sleep(2000);
        //点击下一步按钮
        Thread.sleep(1000);
        createBid_factory.setNextStep_Botton2();
        //设置场次名称
        createBid_factory.setOrderName(marginordername);
        //设置公告日期
        createBid_factory.setNoticeDate();
        //设置竞标日期
        createBid_factory.setBidDate();
        //设置竞标开始时间
        createBid_factory.setBeginTime();
        Thread.sleep(1000);
        //设置竞标结束时间
        createBid_factory.setEndTime();
        //设置竞标挂牌量
        createBid_factory.setBiddingW(bidweight);
        //设置最小交易量
        createBid_factory.setMinWeight(minweight);
        //设置最大交易量
        createBid_factory.setMaxWeight(maxweight);
        //设置成交计价模式：申报价成交
        createBid_factory.setSpaceAuctionMode1();
        //设置联系人
        createBid_factory.setLinkMan(linkman);
        //设置联系电话
        createBid_factory.setContactPhone(contactphone);
        //设置交收方式为：线下交收
        createBid_factory.setSettType1();
        //设置交收周期
        createBid_factory.setSettleCycle(settlecycle);
        //合同类型设置为：日合同
        createBid_factory.setContractType_day();
        //设置交收起始日
        createBid_factory.setSettlementDate();
        //设置销售对象类型为:天然气生产
        Thread.sleep(2000);
        createBid_factory.setCompanyTypeView();
        //设置商品运输为：卖方包运
        createBid_factory.setShipType_info();
        //设置交收地点为：重庆
        createBid_factory.setProvinceView2();
        //设置起拍价
        createBid_factory.setBasePriceShow(baseprice);
        //设置最小变动价位
        createBid_factory.setBidPerPrice(bidperprice);
        //设置最小交易单位
        createBid_factory.setBidPerWeight(bidperpeight);
        //设置气化率
        createBid_factory.setGasRate(gasRatenum);
        Thread.sleep(1000);
        //点击保存并提交按钮
        createBid_factory.setSubmmit();
        //确认提交按钮
        createBid_factory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }






}
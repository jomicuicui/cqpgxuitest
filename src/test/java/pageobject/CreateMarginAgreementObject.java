package pageobject;

import org.openqa.selenium.WebDriver;
import pagefactory.Create_MarginorderFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Authot: Jomi Gan
 * @Description:
 * @Date: Create in 15:52 2020/1/13
 **/
public class CreateMarginAgreementObject {
    WebDriver driver;

    public CreateMarginAgreementObject(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



//第一种场次组合：卖家发起协议
    /*
    管道天然气（门站）
    交收方式：线下交收
    是否指定指定单位：否
    合同交收点类型：省份
    黑白名单：不启用
    合同类型：日合同
     */
    public void createMarginAgreementtransaction1(String linkman,String contactphone,String settlecycle,String buyername,String agreementtransactionunitprice,String agreementWeight) throws InterruptedException {
        Create_MarginorderFactory createMarginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(1000);
        //点击交易管理顶部菜单栏
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
        //默认保证金方式
        //点击产品名称按钮
        createMarginorderFactory.setProductName_botton();
        Thread.sleep(1000);
        //选择天然气父品种
        createMarginorderFactory.setType();
        Thread.sleep(1000);
        //选择对应的产品名称：管道天然气（门站）
        createMarginorderFactory.setAgreementtranscactionpng1();
        Thread.sleep(1000);
        //点击确定按钮
        createMarginorderFactory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createMarginorderFactory.setNextStep_Botton();
        Thread.sleep(1000);

        //设置协议交易开始时间
        createMarginorderFactory.setAgreementtransactionstart();
        //设置协议交易结束时间
        createMarginorderFactory.setAgreementtransactionend();
        //设置联系人
        createMarginorderFactory.setLinkMan(linkman);
        //设置联系电话
        createMarginorderFactory.setContactPhone(contactphone);
        //合同类型设置为：日合同
        createMarginorderFactory.setContractType_day();
        //设置交收起始日
        createMarginorderFactory.setSettlementDate();
        //设置交收周期
        createMarginorderFactory.setSettleCycle(settlecycle);

        //设置交收方式为：线下交收
        createMarginorderFactory.setSettType1();
        //设置付款条件为：先货后款
        createMarginorderFactory.setPaytype0();
        //合同交收点类型默认为省份
        //点击添加对手方按钮
        createMarginorderFactory.setSelectbuyerbotton();
        Thread.sleep(1000);
        //输入会员名称
        createMarginorderFactory.setInputbuyername(buyername);
        //点击搜索按钮
        createMarginorderFactory.setQuerybuyerlistbotton();
        Thread.sleep(1000);
        //选中对手方
        createMarginorderFactory.setChoosebuyerinfo();
        //点击确认按钮
        createMarginorderFactory.setCofrimbuyerbotton();
        //输入协议单价
        createMarginorderFactory.setAgreementtransactionunitpriceimput(agreementtransactionunitprice);
        Thread.sleep(1000);
        //输入协议量
        createMarginorderFactory.setAgreementWeightimput(agreementWeight);
        Thread.sleep(2000);
        //点击保存按钮
        createMarginorderFactory.setSaveagreementtransactioninfobotton();
        Thread.sleep(2000);
        //点击返回按钮
        createMarginorderFactory.setBackbotton();
        //提交第一条协议信息
        createMarginorderFactory.setSubmitagreementbotton();
        Thread.sleep(2000);
        //点击提交按钮
        createMarginorderFactory.setSubmitbotton();
        Thread.sleep(2000);
        //确认提交按钮
        createMarginorderFactory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }

//第二种场次组合：卖家发起协议
    /*
    管道天然气（门站）
    交收方式：协商交收
    临时指定执行单位
    合同交收点类型：接气点
    黑白名单：不启用
    合同类型：周合同
     */
    public void createMarginAgreementtransaction2(String linkman,String contactphone,String settlecycle,String buyername,String agreementtransactionunitprice,String agreementWeight) throws InterruptedException {
        Create_MarginorderFactory createMarginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(1000);
        //点击交易管理顶部菜单栏
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
        //默认保证金方式
        //点击产品名称按钮
        createMarginorderFactory.setProductName_botton();
        Thread.sleep(1000);
        //选择天然气父品种
        createMarginorderFactory.setType();
        Thread.sleep(1000);
        //选择对应的产品名称：管道天然气（门站）
        createMarginorderFactory.setAgreementtranscactionpng1();
        Thread.sleep(1000);
        //点击确定按钮
        createMarginorderFactory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createMarginorderFactory.setNextStep_Botton();
        Thread.sleep(1000);

        //设置协议交易开始时间
        createMarginorderFactory.setAgreementtransactionstart();
        //设置协议交易结束时间
        createMarginorderFactory.setAgreementtransactionend();
        //设置联系人
        createMarginorderFactory.setLinkMan(linkman);
        //设置联系电话
        createMarginorderFactory.setContactPhone(contactphone);
        //合同类型设置为：日合同
        createMarginorderFactory.setContractType_week();
        //设置交收起始日
        createMarginorderFactory.setSettlementDate();
        //设置交收周期
        createMarginorderFactory.setSettleCycle(settlecycle);

        //设置交收方式为：协商交收
        createMarginorderFactory.setSettType0();
        Thread.sleep(1000);
        //设置是否指定执行单位为：系统临时设定
        createMarginorderFactory.setIsExecu1();
        createMarginorderFactory.setSelectExecusbotton();
        createMarginorderFactory.setChooseexecus();
        createMarginorderFactory.setDobotton();
        Thread.sleep(1000);
        //合同交收点类型设置为接气点
        createMarginorderFactory.setAddressType1botton();

        //点击添加对手方按钮
        createMarginorderFactory.setSelectbuyerbotton();
        Thread.sleep(1000);
        //输入会员名称
        createMarginorderFactory.setInputbuyername(buyername);
        //点击搜索按钮
        createMarginorderFactory.setQuerybuyerlistbotton();
        Thread.sleep(1000);
        //选中对手方
        createMarginorderFactory.setChoosebuyerinfo();
        //点击确认按钮
        createMarginorderFactory.setCofrimbuyerbotton();
        //输入协议单价
        createMarginorderFactory.setAgreementtransactionunitpriceimput(agreementtransactionunitprice);
        //输入协议量
        createMarginorderFactory.setAgreementWeightimput(agreementWeight);
        Thread.sleep(1000);
        //点击保存按钮
        createMarginorderFactory.setSaveagreementtransactioninfobotton();
        Thread.sleep(2000);
        //点击返回按钮
        createMarginorderFactory.setBackbotton();
        //提交第一条协议信息
        createMarginorderFactory.setSubmitagreementbotton();
        Thread.sleep(2000);
        //点击提交按钮
        createMarginorderFactory.setSubmitbotton();
        Thread.sleep(2000);
        //确认提交按钮
        createMarginorderFactory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }




//第三种场次组合:买家发起协议
    /*
    管道天然气（门站）
    交收方式：协商交收
    临时指定执行单位
    合同交收点类型：省份
    黑白名单：不启用
    合同类型：周合同
     */
    public void createMarginAgreementtransaction3(String linkman,String contactphone,String settlecycle,String sellername,String agreementtransactionunitprice,String agreementWeight) throws InterruptedException {
        Create_MarginorderFactory createMarginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(1000);
        //点击交易管理顶部菜单栏
        createMarginorderFactory.setTradeManagement_menu();
        //点击“我是买家”菜单按钮
        createMarginorderFactory.setBuyMenu();
        Thread.sleep(1000);
        //点击协议管理菜单
        createMarginorderFactory.setBuyeragreementtransactionmanagemenu();
        //点击新建协议菜单
        Thread.sleep(2000);
        createMarginorderFactory.setBuycreateagreementmenu();
        Thread.sleep(2000);
        //点击发起协议按钮
        createMarginorderFactory.setCreateagreementtransactionorderbotton();
        //点击产品名称按钮
        createMarginorderFactory.setProductName_botton();
        Thread.sleep(1000);
        //选择天然气父品种
        createMarginorderFactory.setAgreementtranscactionpng();
        Thread.sleep(1000);
        //选择对应的产品名称：管道天然气（门站）
        createMarginorderFactory.setAgreementtranscactionpng1();
        Thread.sleep(1000);
        //点击确定按钮
        createMarginorderFactory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createMarginorderFactory.setNextStep_Botton();
        Thread.sleep(1000);

        //设置协议交易开始时间
        createMarginorderFactory.setAgreementtransactionstart();
        //设置协议交易结束时间
        createMarginorderFactory.setAgreementtransactionend();
        //设置联系人
        createMarginorderFactory.setLinkMan(linkman);
        //设置联系电话
        createMarginorderFactory.setContactPhone(contactphone);
        //合同类型设置为：日合同
        createMarginorderFactory.setContractType_week();
        //设置交收起始日
        createMarginorderFactory.setSettlementDate();
        //设置交收周期
        createMarginorderFactory.setSettleCycle(settlecycle);

        //设置交收方式为：协商交收
        createMarginorderFactory.setSettType0();
        Thread.sleep(1000);
        //设置是否指定执行单位为：系统临时设定
        createMarginorderFactory.setIsExecu1();
        //合同交收点类型设置为省份
        createMarginorderFactory.setAddressType0botton();

        //点击添加对手方按钮
        createMarginorderFactory.setSelectbuyerbotton();
        Thread.sleep(1000);
        //输入会员名称
        createMarginorderFactory.setInputbuyername(sellername);
        //点击搜索按钮
        createMarginorderFactory.setQuerybuyerlistbotton();
        Thread.sleep(1000);
        //选中对手方
        createMarginorderFactory.setChoosebuyerinfo();
        //点击确认按钮
        createMarginorderFactory.setCofrimbuyerbotton();
        //输入协议单价
        createMarginorderFactory.setAgreementtransactionunitpriceimput(agreementtransactionunitprice);
        //输入协议量
        createMarginorderFactory.setAgreementWeightimput(agreementWeight);
        Thread.sleep(1000);
        //点击保存按钮
        createMarginorderFactory.setSaveagreementtransactioninfobotton();
        Thread.sleep(2000);
        //点击返回按钮
        createMarginorderFactory.setBackbotton();
        //提交第一条协议信息
        createMarginorderFactory.setSubmitagreementbotton();
        Thread.sleep(2000);
        //点击提交按钮
        createMarginorderFactory.setSubmitbotton();
        Thread.sleep(2000);
        //确认提交按钮
        createMarginorderFactory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }



//第四种场次组合:买家发起协议
    /*
    管道天然气（门站）
    交收方式：线下交收
    合同交收点类型：接气点
    黑白名单：不启用
    合同类型：周合同
     */
    public void createMarginAgreementtransaction4(String linkman,String contactphone,String settlecycle,String sellername,String agreementtransactionunitprice,String agreementWeight) throws InterruptedException {
        Create_MarginorderFactory createMarginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(1000);
        //点击交易管理顶部菜单栏
        createMarginorderFactory.setTradeManagement_menu();
        //点击“我是买家”菜单按钮
        createMarginorderFactory.setBuyMenu();
        Thread.sleep(1000);
        //点击协议管理菜单
        createMarginorderFactory.setBuyeragreementtransactionmanagemenu();
        //点击新建协议菜单
        Thread.sleep(2000);
        createMarginorderFactory.setBuycreateagreementmenu();
        Thread.sleep(2000);
        //点击发起协议按钮
        createMarginorderFactory.setCreateagreementtransactionorderbotton();
        //点击产品名称按钮
        createMarginorderFactory.setProductName_botton();
        Thread.sleep(2000);
        //选择天然气父品种
        createMarginorderFactory.setAgreementtranscactionpng();
        Thread.sleep(1000);
        //选择对应的产品名称：管道天然气（门站）
        createMarginorderFactory.setAgreementtranscactionpng1();
        Thread.sleep(1000);
        //点击确定按钮
        createMarginorderFactory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createMarginorderFactory.setNextStep_Botton();
        Thread.sleep(1000);

        //设置协议交易开始时间
        createMarginorderFactory.setAgreementtransactionstart();
        //设置协议交易结束时间
        createMarginorderFactory.setAgreementtransactionend();
        //设置联系人
        createMarginorderFactory.setLinkMan(linkman);
        //设置联系电话
        createMarginorderFactory.setContactPhone(contactphone);
        //合同类型设置为：日合同
        createMarginorderFactory.setContractType_day();
        //设置交收起始日
        createMarginorderFactory.setSettlementDate();
        //设置交收周期
        createMarginorderFactory.setSettleCycle(settlecycle);
        //设置交收方式为：线下交收
        createMarginorderFactory.setSettType1();
        //付款条件：先货后款
        createMarginorderFactory.setPaytype0();
        Thread.sleep(1000);
        //合同交收点类型设置为接气点
        createMarginorderFactory.setAddressType1botton();
        //点击添加对手方按钮
        createMarginorderFactory.setSelectbuyerbotton();
        Thread.sleep(1000);
        //输入会员名称
        createMarginorderFactory.setInputbuyername(sellername);
        //点击搜索按钮
        createMarginorderFactory.setQuerybuyerlistbotton();
        Thread.sleep(1000);
        //选中对手方
        createMarginorderFactory.setChoosebuyerinfo();
        //点击确认按钮
        createMarginorderFactory.setCofrimbuyerbotton();
        //输入协议单价
        createMarginorderFactory.setAgreementtransactionunitpriceimput(agreementtransactionunitprice);
        //输入协议量
        createMarginorderFactory.setAgreementWeightimput(agreementWeight);
        Thread.sleep(1000);
        //点击保存按钮
        createMarginorderFactory.setSaveagreementtransactioninfobotton();
        Thread.sleep(2000);
        //点击返回按钮
        createMarginorderFactory.setBackbotton();
        //提交第一条协议信息
        createMarginorderFactory.setSubmitagreementbotton();
        Thread.sleep(2000);
        //点击提交按钮
        createMarginorderFactory.setSubmitbotton();
        Thread.sleep(2000);
        //确认提交按钮
        createMarginorderFactory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }

//第五种场次组合：卖家发起协议
    /*
    液化天然气LNG
    交收方式：协商交收
    是否指定指定单位：否
    黑白名单：不启用
    合同类型：日合同
    摘单方式：保证金
     */
    public void createMarginAgreementtransaction5(String gasRatenum,String linkman,String contactphone,String settlecycle,String buyername,String agreementtransactionunitprice,String agreementWeight,String agreePlace) throws InterruptedException {
        Create_MarginorderFactory createMarginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(1000);
        //点击交易管理顶部菜单栏
        createMarginorderFactory.setTradeManagement_menu();
        //点击我是卖家按钮
        createMarginorderFactory.setSellerPage_menu();
        Thread.sleep(1000);

        //点击协议管理菜单
        createMarginorderFactory.setAgreementtransactionmanagemenu();
        //点击新建协议菜单
        createMarginorderFactory.setCreateagreementtransactionmenu();
        Thread.sleep(1000);
        //点击发起协议按钮
        createMarginorderFactory.setCreateagreementtransactionorderbotton();
        //默认保证金方式
        //点击产品名称按钮
        createMarginorderFactory.setProductName_botton();
        Thread.sleep(1000);
        //选择天然气父品种
        createMarginorderFactory.setAgreementtranscactionpng();
        Thread.sleep(1000);
        //选择对应的产品名称：液化天然气
        createMarginorderFactory.setAgreementtranscactionlng1();
        Thread.sleep(1000);
        //点击确定按钮
        createMarginorderFactory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createMarginorderFactory.setNextStep_Botton();
        Thread.sleep(1000);
        //设置气化率
        createMarginorderFactory.setGasRate(gasRatenum);
        //设置协议交易开始时间
        createMarginorderFactory.setAgreementtransactionstart();
        //设置协议交易结束时间
        createMarginorderFactory.setAgreementtransactionend();
        //设置联系人
        createMarginorderFactory.setLinkMan(linkman);
        //设置联系电话
        createMarginorderFactory.setContactPhone(contactphone);
        //合同类型设置为：日合同
        createMarginorderFactory.setContractType_day();
        //设置交收起始日
        createMarginorderFactory.setSettlementDate();
        //设置交收周期
        createMarginorderFactory.setSettleCycle(settlecycle);

        //设置交收方式为：协商交收
        createMarginorderFactory.setSettType0();
        //点击添加对手方按钮
        createMarginorderFactory.setSelectbuyerbotton();
        Thread.sleep(1000);
        //输入会员名称
        createMarginorderFactory.setInputbuyername(buyername);
        //点击搜索按钮
        createMarginorderFactory.setQuerybuyerlistbotton();
        Thread.sleep(1000);
        //选中对手方
        createMarginorderFactory.setChoosebuyerinfo();
        //点击确认按钮
        createMarginorderFactory.setCofrimbuyerbotton();
        //输入协议单价
        createMarginorderFactory.setAgreementtransactionunitpriceimput(agreementtransactionunitprice);
        //输入协议量
        createMarginorderFactory.setAgreementWeightimput(agreementWeight);
        Thread.sleep(1000);
        //输入交收地点
        createMarginorderFactory.setAgreePlaceimput(agreePlace);
        //点击保存按钮
        createMarginorderFactory.setSaveagreementtransactioninfobotton();
        Thread.sleep(2000);
        //点击返回按钮
        createMarginorderFactory.setBackbotton();
        //提交第一条协议信息
        createMarginorderFactory.setSubmitagreementbotton();
        Thread.sleep(2000);
        //点击提交按钮
        createMarginorderFactory.setSubmitbotton();
        Thread.sleep(2000);
        //确认提交按钮
        createMarginorderFactory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }



//第六种场次组合：卖家发起协议
    /*
    液化天然气LNG
    交收方式：线下交收
    黑白名单：不启用
    合同类型：日合同
    摘单方式：保证金
     */
    public void createMarginAgreementtransaction6(String gasRatenum,String linkman,String contactphone,String settlecycle,String buyername,String agreementtransactionunitprice,String agreementWeight,String agreePlace) throws InterruptedException {
        Create_MarginorderFactory createMarginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(1000);
        //点击交易管理顶部菜单栏
        createMarginorderFactory.setTradeManagement_menu();
        //点击我是卖家按钮
        createMarginorderFactory.setSellerPage_menu();
        Thread.sleep(1000);
        //点击协议管理菜单
        createMarginorderFactory.setAgreementtransactionmanagemenu();
        //点击新建协议菜单
        createMarginorderFactory.setCreateagreementtransactionmenu();
        Thread.sleep(1000);
        //点击发起协议按钮
        createMarginorderFactory.setCreateagreementtransactionorderbotton();
        //默认保证金方式
        //点击产品名称按钮
        createMarginorderFactory.setProductName_botton();
        Thread.sleep(1000);
        //选择天然气父品种
        createMarginorderFactory.setAgreementtranscactionpng();
        //选择对应的产品名称：液化天然气
        createMarginorderFactory.setAgreementtranscactionlng1();
        Thread.sleep(1000);
        //点击确定按钮
        createMarginorderFactory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createMarginorderFactory.setNextStep_Botton();
        Thread.sleep(1000);
        //设置气化率
        createMarginorderFactory.setGasRate(gasRatenum);
        //设置协议交易开始时间
        createMarginorderFactory.setAgreementtransactionstart();
        //设置协议交易结束时间
        createMarginorderFactory.setAgreementtransactionend();
        //设置联系人
        createMarginorderFactory.setLinkMan(linkman);
        //设置联系电话
        createMarginorderFactory.setContactPhone(contactphone);
        //合同类型设置为：日合同
        createMarginorderFactory.setContractType_day();
        //设置交收起始日
        createMarginorderFactory.setSettlementDate();
        //设置交收周期
        createMarginorderFactory.setSettleCycle(settlecycle);

        //设置交收方式为：线下交收
        createMarginorderFactory.setSettType1();
        //点击添加对手方按钮
        createMarginorderFactory.setSelectbuyerbotton();
        Thread.sleep(1000);
        //输入会员名称
        createMarginorderFactory.setInputbuyername(buyername);
        //点击搜索按钮
        createMarginorderFactory.setQuerybuyerlistbotton();
        Thread.sleep(1000);
        //选中对手方
        createMarginorderFactory.setChoosebuyerinfo();
        //点击确认按钮
        createMarginorderFactory.setCofrimbuyerbotton();
        //输入协议单价
        createMarginorderFactory.setAgreementtransactionunitpriceimput(agreementtransactionunitprice);
        //输入协议量
        createMarginorderFactory.setAgreementWeightimput(agreementWeight);
        Thread.sleep(1000);
        //输入交收地点
        createMarginorderFactory.setAgreePlaceimput(agreePlace);
        //点击保存按钮
        createMarginorderFactory.setSaveagreementtransactioninfobotton();
        Thread.sleep(2000);
        //点击返回按钮
        createMarginorderFactory.setBackbotton();
        //提交第一条协议信息
        createMarginorderFactory.setSubmitagreementbotton();
        Thread.sleep(2000);
        //点击提交按钮
        createMarginorderFactory.setSubmitbotton();
        Thread.sleep(2000);
        //确认提交按钮
        createMarginorderFactory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }


//第七种场次组合:买家发起协议
    /*
    液化天然气LNG
    交收方式：协商交收
    临时指定执行单位
    黑白名单：不启用
    合同类型：周合同
     */
    public void createMarginAgreementtransaction7(String gasRatenum,String linkman,String contactphone,String settlecycle,String sellername,String agreementtransactionunitprice,String agreementWeight,String agreePlace) throws InterruptedException {
        Create_MarginorderFactory createMarginorderFactory = new Create_MarginorderFactory(driver);
        Thread.sleep(1000);
        //点击交易管理顶部菜单栏
        createMarginorderFactory.setTradeManagement_menu();
        //点击“我是买家”菜单按钮
        createMarginorderFactory.setBuyMenu();
        Thread.sleep(1000);
        //点击协议管理菜单
        createMarginorderFactory.setBuyeragreementtransactionmanagemenu();
        //点击新建协议菜单
        Thread.sleep(2000);
        createMarginorderFactory.setBuycreateagreementmenu();
        Thread.sleep(2000);
        //点击发起协议按钮
        createMarginorderFactory.setCreateagreementtransactionorderbotton();
        //点击产品名称按钮
        createMarginorderFactory.setProductName_botton();
        Thread.sleep(1000);
        //选择天然气父品种
        createMarginorderFactory.setAgreementtranscactionpng();
        //选择对应的产品名称：液化天然气
        createMarginorderFactory.setAgreementtranscactionlng2();
        Thread.sleep(1000);
        //点击确定按钮
        createMarginorderFactory.setDeterMine_botton();
        Thread.sleep(1000);
        //点击下一步按钮
        createMarginorderFactory.setNextStep_Botton();
        Thread.sleep(1000);
        //设置气化率
        createMarginorderFactory.setGasRate(gasRatenum);
        //设置协议交易开始时间
        createMarginorderFactory.setAgreementtransactionstart();
        //设置协议交易结束时间
        createMarginorderFactory.setAgreementtransactionend();
        //设置联系人
        createMarginorderFactory.setLinkMan(linkman);
        //设置联系电话
        createMarginorderFactory.setContactPhone(contactphone);
        //合同类型设置为：日合同
        createMarginorderFactory.setContractType_day();
        //设置交收起始日
        createMarginorderFactory.setSettlementDate();
        //设置交收周期
        createMarginorderFactory.setSettleCycle(settlecycle);

        //设置交收方式为：协商交收
        createMarginorderFactory.setSettType0();
        Thread.sleep(1000);
        //设置是否指定执行单位为：系统临时设定
        createMarginorderFactory.setIsExecu1();

        //点击添加对手方按钮
        createMarginorderFactory.setSelectbuyerbotton();
        Thread.sleep(1000);
        //输入会员名称
        createMarginorderFactory.setInputbuyername(sellername);
        //点击搜索按钮
        createMarginorderFactory.setQuerybuyerlistbotton();
        Thread.sleep(1000);
        //选中对手方
        createMarginorderFactory.setChoosebuyerinfo();
        //点击确认按钮
        createMarginorderFactory.setCofrimbuyerbotton();
        //输入协议单价
        createMarginorderFactory.setAgreementtransactionunitpriceimput(agreementtransactionunitprice);
        //输入协议量
        createMarginorderFactory.setAgreementWeightimput(agreementWeight);
        //输入交收地点
        createMarginorderFactory.setAgreePlaceimput(agreePlace);
        Thread.sleep(1000);
        //点击保存按钮
        createMarginorderFactory.setSaveagreementtransactioninfobotton();
        Thread.sleep(2000);
        //点击返回按钮
        createMarginorderFactory.setBackbotton();
        //提交第一条协议信息
        createMarginorderFactory.setSubmitagreementbotton();
        Thread.sleep(2000);
        //点击提交按钮
        createMarginorderFactory.setSubmitbotton();
        Thread.sleep(2000);
        //确认提交按钮
        createMarginorderFactory.setSure();
        Thread.sleep(3000);
        //关闭浏览器
        driver.close();
    }

}

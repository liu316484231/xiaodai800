package com.xiaodai.bean;

import java.util.ArrayList;
import java.util.List;

public class WebDataTable {
	private List<WebDataBean> list = new ArrayList();
	public WebDataTable(){
		WebDataBean d1 = new WebDataBean();
		
		d1.setWebSiteName("红岭创投");
		d1.setStartTime("2009-03-01");
		d1.setRegisterMoney("5000.0万");
		d1.setFaren("周世平");
		d1.setCity("广东深圳");
		d1.setPayMethod("易宝");
		d1.setTixian("每笔5元");
		d1.setGuanli("利息的10%");
		d1.setDianfu("VIP会员享受本金垫付");
		d1.setVip("180元/年");
		d1.setLink("http://www.my089.com/");
		list.add(d1);
		
		WebDataBean d2 = new WebDataBean();
		d2.setWebSiteName("365易贷");
		d2.setStartTime("2010-02-01");
		d2.setRegisterMoney("1002.0万");
		d2.setFaren("单金显");
		d2.setCity("江苏南京");
		d2.setPayMethod("国付宝、盛付通");
		d2.setTixian("每月免费2笔，未投标收1%。超过2次，3万以下3元，3万到5万5元");
		d2.setGuanli("利息的10%");
		d2.setDianfu("现场评级垫付本息；网上评级垫付本金；担保标只垫付本金和一个月利息");
		d2.setVip("120元/年");
		d2.setLink("http://www.edai365.cn/");
		list.add(d2);
		
		WebDataBean d3 = new WebDataBean();
		d3.setWebSiteName("人人贷");
		d3.setStartTime("2010-04-01");
		d3.setRegisterMoney("100.0万万");
		d3.setFaren("易源俏");
		d3.setCity("北京");
		d3.setPayMethod("快钱 （充值收 0.5%手续费）");
		d3.setTixian("2万以下,1元;2-5W,3元;5-100W,5元");
		d3.setGuanli("免费");
		d3.setDianfu("享受风险备用金垫付");
		d3.setVip("无");
		d3.setLink("http://www.renrendai.com/");
		list.add(d3);
		
		WebDataBean d4 = new WebDataBean();
		d4.setWebSiteName("E速贷");
		d4.setStartTime("2010-09-01");
		d4.setRegisterMoney("2000.0万");
		d4.setFaren("张森英");
		d4.setCity("广东惠州");
		d4.setPayMethod("国付宝、环迅、盛付通、新生、汇付天下");
		d4.setTixian("每月3笔免费，超过后5笔/次（7天后提现）");
		d4.setGuanli("担保标10%，其余8%");
		d4.setDianfu("VIP享受信用标垫付本金，其余垫付本息");
		d4.setVip("120元/年");
		d4.setLink("http://www.esudai.com/");
		list.add(d4);
		
		WebDataBean d5 = new WebDataBean();
		d5.setWebSiteName("盛融在线");
		d5.setStartTime("2010-09-10");
		d5.setRegisterMoney("1000.0万");
		d5.setFaren("刘志军");
		d5.setCity("广东广州");
		d5.setPayMethod("国付宝、环迅");
		d5.setTixian("5万元之内每笔5元");
		d5.setGuanli("利息的5%");
		d5.setDianfu("逾期垫付本息+千分之8滞纳金");
		d5.setVip("100元/年");
		d5.setLink("http://www.s-rong.cn/");
		list.add(d5);
		
		WebDataBean d6 = new WebDataBean();
		d6.setWebSiteName("808信贷");
		d6.setStartTime("2011-05-01");
		d6.setRegisterMoney("500.0万");
		d6.setFaren("林国庆");
		d6.setCity("江苏淮安");
		d6.setPayMethod("国付宝、新生");
		d6.setTixian("每月5笔免费，超过后每笔收取1元");
		d6.setGuanli("免费");
		d6.setDianfu("享受本息垫付");
		d6.setVip("无");
		d6.setLink("http://www.js808.cn/");
		list.add(d6);
		
		WebDataBean d7 = new WebDataBean();
		d7.setWebSiteName("煜隆创投");
		d7.setStartTime("2011-06-01");
		d7.setRegisterMoney("2000.0万");
		d7.setFaren("杨建");
		d7.setCity("广东深圳");
		d7.setPayMethod("国付宝、环迅、新生");
		d7.setTixian("免费（15天后提现）");
		d7.setGuanli("免费");
		d7.setDianfu("24小时内本息垫付");
		d7.setVip("120元/年");
		d7.setLink("http://www.wd5.com.cn/");
		list.add(d7);
		
		WebDataBean d8 = new WebDataBean();
		d8.setWebSiteName("微贷网");
		d8.setStartTime("2011-07-08");
		d8.setRegisterMoney("500.0万");
		d8.setFaren("姚宏");
		d8.setCity("浙江杭州");
		d8.setPayMethod("国付宝、盛付通");
		d8.setTixian("每笔2元（只能在投资后才能提现）");
		d8.setGuanli("利息的6%");
		d8.setDianfu("VIP享受本金垫付，非VIP垫付50%本金");
		d8.setVip("120元/年");
		d8.setLink("http://www.wd5.com.cn/");
		list.add(d8);
		
		WebDataBean d9 = new WebDataBean();
		d9.setWebSiteName("草根新贷");
		d9.setStartTime("2011-08-30");
		d9.setRegisterMoney("600.0万");
		d9.setFaren("叶秀统");
		d9.setCity("浙江宁波");
		d9.setPayMethod("宝付、网银在线、汇付天下");
		d9.setTixian("免费（7日内提现千四）");
		d9.setGuanli("免费");
		d9.setDianfu("享受本息垫付");
		d9.setVip("暂免");
		d9.setLink("http://www.daiab.com/");
		list.add(d9);
		
		WebDataBean d10 = new WebDataBean();
		d10.setWebSiteName("紫枫信贷");
		d10.setStartTime("2012-01-11");
		d10.setRegisterMoney("500.0万");
		d10.setFaren("张健");
		d10.setCity("江苏南京");
		d10.setPayMethod("国付宝、环迅");
		d10.setTixian("免费");
		d10.setGuanli("免费");
		d10.setDianfu("8天本息垫付");
		d10.setVip("无");
		d10.setLink("http://www.zfxindai.cn/");
		list.add(d6);
		
		
		
		
		
	}
	public List<WebDataBean> getList() {
		return list;
	}
	public void setList(List<WebDataBean> list) {
		this.list = list;
	}
}

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
		
		
		
		
		
	}
	public List<WebDataBean> getList() {
		return list;
	}
	public void setList(List<WebDataBean> list) {
		this.list = list;
	}
}

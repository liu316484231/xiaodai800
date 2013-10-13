package com.xiaodai.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class CalculatorBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 123203471346893045L;
	private double yearinterestrate;
	private double bonusrate;
	private double managementrate;
	private int timelimit;
	private double money;
	private int repaymentmode=1;
	public int getRepaymentmode() {
		return repaymentmode;
	}
	public void setRepaymentmode(int repaymentmode) {
		this.repaymentmode = repaymentmode;
	}
	public double getYearinterestrate() {
		return yearinterestrate;
	}
	public void setYearinterestrate(double yearinterestrate) {
		this.yearinterestrate = yearinterestrate;
	}
	public double getBonusrate() {
		return bonusrate;
	}
	public void setBonusrate(double bonusrate) {
		this.bonusrate = bonusrate;
	}
	public double getManagementrate() {
		return managementrate;
	}
	public void setManagementrate(double managementrate) {
		this.managementrate = managementrate;
	}
	public int getTimelimit() {
		return timelimit;
	}
	public void setTimelimit(int timelimit) {
		this.timelimit = timelimit;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public double calculator(){
		double monthinterestrate = this.yearinterestrate/12/100;
		double quarterinterstrate = monthinterestrate*3;
		double quarter = this.timelimit/3;
		double interest = 0;
		if((Math.pow(1+monthinterestrate,this.timelimit)-1)==0||Math.pow(1+quarterinterstrate,quarter)-1==0){
			return 0.0;
		}
		if(this.repaymentmode==1){
			interest = this.money*monthinterestrate*Math.pow(1+monthinterestrate, this.timelimit)/(Math.pow(1+monthinterestrate,this.timelimit)-1)*this.timelimit-this.money;
			double temp =interest*(1-this.managementrate/100)+this.bonusrate/100*this.money;
			BigDecimal result = new BigDecimal(temp);
		
			return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		}else if(this.repaymentmode==2){
			interest = this.money*quarterinterstrate*Math.pow(1+quarterinterstrate, quarter)/(Math.pow(1+quarterinterstrate,quarter)-1)*quarter-this.money;
			double temp =interest*(1-this.managementrate/100)+this.bonusrate/100*this.money;
			BigDecimal result = new BigDecimal(temp);
			
			return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		}else{
			interest = this.money*monthinterestrate*this.timelimit;
			double temp =interest*(1-this.managementrate/100)+this.bonusrate/100*this.money;
			BigDecimal result = new BigDecimal(temp);
			
			return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			
		}
		
		
	}
}

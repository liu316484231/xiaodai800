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
	private int option1;
	private int option2;
	public int getOption1() {
		return option1;
	}
	public void setOption1(int option1) {
		this.option1 = option1;
	}
	public int getOption2() {
		return option2;
	}
	public void setOption2(int option2) {
		this.option2 = option2;
	}
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
	public double calculateIncome(){
		
		double income;
		double yinterest = 0;
		double timelimit = this.timelimit;;
		int paymode = this.repaymentmode;
		if(this.option1==0||this.option2==0){
			return 0.0;
		}
		if(this.option1 == 1){
			yinterest = this.yearinterestrate;

		}else if(this.option1 == 2){
			yinterest = this.yearinterestrate*360;

		}
		
		yinterest = yinterest*(1-this.managementrate/100);
		if(this.option2==1){
			
			if(paymode==1){
				if((Math.pow((1 + yinterest / 1200),timelimit)- 1)==0){
					return 0.0;
				}else{
					if (yinterest > 0) {
						income = (money * yinterest / 1200 * Math.pow((1 + yinterest / 1200), timelimit) /(Math.pow((1 + yinterest / 1200),timelimit)- 1) * timelimit - money + money * this.bonusrate / 100);
					} else {
						income = Math.round(money*this.bonusrate) / 100;
					}
				}
				BigDecimal result = new BigDecimal(income);
				return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			}else if(paymode==2){
					double season = Math.ceil(timelimit / 3);
					income = money * yinterest * (1 + season) / 800 + money * this.bonusrate / 100;
					BigDecimal result = new BigDecimal(income);
					return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				
			}else if(paymode==3||paymode==4){
					income = money * yinterest * timelimit/ 1200 + money * this.bonusrate / 100;
					BigDecimal result = new BigDecimal(income);
					return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				
			}
			}else if(this.option2==2){
				income = money * yinterest * timelimit / 36000 + money * this.bonusrate / 100;
				BigDecimal result = new BigDecimal(income);
				return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		}

		
		return 0.0;
		
	}
	public double calculateYearInterest(){
		double yinterest = 0;
		double timelimit = this.timelimit;;
		int paymode = this.repaymentmode;
		
		if(this.option1==0||this.option2==0){
			return 0.0;
		}
		
		if(this.option1 == 1){
			yinterest = this.yearinterestrate;
		}else if(this.option1 == 2){
			yinterest = this.yearinterestrate * 360;
		}
		
		yinterest = yinterest*(1-this.managementrate/100);
		if(this.option2==1){
			//totalYearRate = 24.00 * prize / (limitTime + 1) + yearRate;
			//flYearRate = (Math.pow((1 + totalYearRate / 1200), 12) - 1) * 100;
			if(paymode==1){
				double temp = 24*this.bonusrate/(timelimit+1)+yinterest;
				BigDecimal result = new BigDecimal(temp);
				return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			}else if(paymode==2){
				//totalYearRate = (yearRate * 3 + 24 * prize /(limitTime/3+1)) / 3
				//totalYearRate = (yearRate * 3 + 24 * prize /(limitTime/3+1)) / 3;
				double temp = (yinterest*3+24*this.bonusrate/(timelimit/3+1))/3;
				BigDecimal result = new BigDecimal(temp);
				return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			
				
			}else if(paymode==3){
				//totalYearRate = (yearRate * limitTime + 12 * prize) / limitTime;
				double temp = (yinterest*timelimit+12*this.bonusrate)/timelimit;
				BigDecimal result = new BigDecimal(temp);
				return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
				
			}else if(paymode==4){
				//totalYearRate = yearRate + prize * 12 / limitTime;
				double temp = yinterest+this.bonusrate*12/timelimit;
				BigDecimal result = new BigDecimal(temp);
				return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			}
		
		}else if(this.option2==2){
			double temp = yinterest+this.bonusrate*360/timelimit;
			BigDecimal result = new BigDecimal(temp);
			return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		}

		
		return 0.0;
		
	}
	
public double calculateCompoundInterest(){
	double yinterest = 0;
	double timelimit = this.timelimit;;
	int paymode = this.repaymentmode;
	
	if(this.option1==0||this.option2==0){
		return 0.0;
	}
	
	if(this.option1 == 1){
		yinterest = this.yearinterestrate;
	}else if(this.option1 == 2){
		yinterest = this.yearinterestrate * 360;
	}
	yinterest = yinterest*(1-this.managementrate/100);
	if(this.option2==1){
		//totalYearRate = 24.00 * prize / (limitTime + 1) + yearRate;
		//flYearRate = (Math.pow((1 + totalYearRate / 1200), 12) - 1) * 100;
		if(paymode==1){
			//flYearRate = (Math.pow((1 + totalYearRate / 1200), 12) - 1) * 100;
			double temp = (Math.pow(1+this.calculateYearInterest()/1200, 12)-1)*100;
			BigDecimal result = new BigDecimal(temp);
			return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		}else if(paymode==2){
			//totalYearRate = (yearRate * 3 + 24 * prize /(limitTime/3+1)) / 3;
				//flYearRate = (Math.pow((1 + totalYearRate / 400), 4) - 1) * 100;
			double temp = (Math.pow(1+this.calculateYearInterest()/400,4)-1)*100;
			BigDecimal result = new BigDecimal(temp);
			return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		
			
		}else if(paymode==3||paymode==4){
			//totalYearRate = (yearRate * limitTime + 12 * prize) / limitTime;
			//flYearRate = (Math.pow((1 + totalYearRate / 1200 * limitTime), 12 / limitTime) - 1) * 100;
			double temp = (Math.pow(1+this.calculateYearInterest()/1200*timelimit, 12/timelimit)-1)*100;
			BigDecimal result = new BigDecimal(temp);
			return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			
		}
	
	}else if(this.option2==2){
		//flYearRate = (Math.pow((1 + totalYearRate / 36500 * limitTime), 365 / limitTime) - 1) * 100;
		double temp = (Math.pow(1+this.calculateYearInterest()/36500*timelimit, 365/timelimit)-1)*100;
		BigDecimal result = new BigDecimal(temp);
		return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	
	return 0.0;
	}
	public double calculateMonthInterest(){
		double temp =  this.calculateYearInterest()/12;
		BigDecimal result = new BigDecimal(temp);
		return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	public double calculateMonthCompoundInterest(){
		double temp =  this.calculateCompoundInterest()/12;
		BigDecimal result = new BigDecimal(temp);
		return result.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}

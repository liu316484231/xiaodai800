package com.xiaodai.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class LoanInfoBean implements Serializable{
	private int id;
	private String websiteName;
	private String tabName;
	private String loanType;
	private String title;
	private String obligorId;
	private int money;
	private int durationMonths;
	private double yearInterestRate;
	private double bonusRate;
	private double progress;
	private Date bidEndTime;
	private String repaymentMode;
	private String loanStatus;
	private String loanDetail;
	private Timestamp snapshotTime;
	private String detailURL;
	private String comment;
	
	private double yearIncomeRate;
	private double monthInterestRate;
	private double managementRate;
	private int durationDays;
	public int getDurationDays() {
		return durationDays;
	}
	public void setDurationDays(int durationDays) {
		this.durationDays = durationDays;
	}
	public double getYearIncomeRate() {
		return yearIncomeRate;
	}
	public void setYearIncomeRate(double yearIncomeRate) {
		this.yearIncomeRate = yearIncomeRate;
	}
	public double getMonthInterestRate() {
		return monthInterestRate;
	}
	public void setMonthInterestRate(double monthInterestRate) {
		this.monthInterestRate = monthInterestRate;
	}
	public double getManagementRate() {
		return managementRate;
	}
	public void setManagementRate(double managementRate) {
		this.managementRate = managementRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWebsiteName() {
		return websiteName;
	}
	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}
	public String getTabName() {
		return tabName;
	}
	public void setTabName(String tabName) {
		this.tabName = tabName;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getObligorId() {
		return obligorId;
	}
	public void setObligorId(String obligorId) {
		this.obligorId = obligorId;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getDurationMonths() {
		return durationMonths;
	}
	public void setDurationMonths(int durationMonths) {
		this.durationMonths = durationMonths;
	}
	public double getYearInterestRate() {
		return yearInterestRate;
	}
	public void setYearInterestRate(double yearInterestRate) {
		this.yearInterestRate = yearInterestRate;
	}
	public double getBonusRate() {
		return bonusRate;
	}
	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}
	public double getProgress() {
		return progress;
	}
	public void setProgress(double progress) {
		this.progress = progress;
	}
	public Date getBidEndTime() {
		return bidEndTime;
	}
	public void setBidEndTime(Date bidEndTime) {
		this.bidEndTime = bidEndTime;
	}
	public String getRepaymentMode() {
		return repaymentMode;
	}
	public void setRepaymentMode(String repaymentMode) {
		this.repaymentMode = repaymentMode;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public String getLoanDetail() {
		return loanDetail;
	}
	public void setLoanDetail(String loanDetail) {
		this.loanDetail = loanDetail;
	}
	public Date getSnapshotTime() {
		return snapshotTime;
	}
	public void setSnapshotTime(Timestamp snapshotTime) {
		this.snapshotTime = snapshotTime;
	}
	public String getDetailURL() {
		return detailURL;
	}
	public void setDetailURL(String detailURL) {
		this.detailURL = detailURL;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String webSiteNameChangeColor(){
		if(this.websiteName.equals("���˴�")){
			return "#1CA5B8";
		}else if(this.websiteName.equals("��¡��Ͷ")){
			return "#1E56BD";
		}else if(this.websiteName.equals("���봴Ͷ")){
			return "#21D1A5";
		}else if(this.websiteName.equals("808�Ŵ�")){
			return "#1DDE20";
		}else if(this.websiteName.equals("һ���")){
			return "#CC2F54";
		}else if(this.websiteName.equals("����״�")){
			return "#8A0F2C";
		}else if(this.websiteName.equals("���Ŵ�  ")){
			return "#D124BA";
		}else if(this.websiteName.equals("��³�˴�")){
			return "#69045B";
		}else if(this.websiteName.equals("���Ѵ�")){
			return "#750EC9";
		}else if(this.websiteName.equals("���ݴ�")){
			return "#E0341D";
		}else if(this.websiteName.equals("�Ϸ��Ŵ�")){
			return "#E31C02";
		}else if(this.websiteName.equals("��ͨ��")){
			return "#9E9C09";
		}else if(this.websiteName.equals("�ݸ��´�")){
			return "#0AA197";
		}else if(this.websiteName.equals("���ٴ�")){
			return "#09223B";
		}else if(this.websiteName.equals("My���")){
			return "#0C82F7";
		}else if(this.websiteName.equals("�ǳ����")){
			return "#3C0342";
		}else if(this.websiteName.equals("ȫ���")){
			return "#DC11F2";
		}else if(this.websiteName.equals("�״�365")){
			return "#403E40";
		}else if(this.websiteName.equals("���̴�")){
			return "#1386EB";
		}else if(this.websiteName.equals("E�ٴ�")){
			return "#E86A10";
		}else if(this.websiteName.equals("ʢ������")){
			return "#0B7A2E";
		}else if(this.websiteName.equals("΢����")){
			return "#182E1F";
		}else if(this.websiteName.equals("������")){
			return "#0FA8D6";
		}else if(this.websiteName.equals("���ŲƸ�")){
			return "#960E14";
		}else if(this.websiteName.equals("���̴�")){
			return "#3D0608";
		}else if(this.websiteName.equals("ɽ����")){
			return "#AB09AB";
		}else if(this.websiteName.equals("�Ŵ���")){
			return "#524952";
		}else if(this.websiteName.equals("�����")){
			return "#7D12E0";
		}else if(this.websiteName.equals("������")){
			return "#310A57";
		}else if(this.websiteName.equals("�Ĵ�Ͷ��")){
			return "#0BBF89";
		}else if(this.websiteName.equals("������")){
			return "#0AF5AE";
		}else if(this.websiteName.equals("ȫ�ϴ�")){
			return "#070D0B";
		}else if(this.websiteName.equals("ͨ���״�")){
			return "#273833";
		}else if(this.websiteName.equals("���Ĵ�")){
			return "#FA1302";
		}else{
			return null;
		}
		
	}
	public String repaymentModeChangeColor(){
		if(this.repaymentMode.equals("���»���")){
			return "#8A1B13";
		}else if(this.repaymentMode.equals("��������")){
			return "#D9E620";
		}else if(this.repaymentMode.equals("���ڻ���")){
			return "#127505";
		}else{
			return "black";
		}
	}
	public String loanTypeChangeColor(){
		if(this.loanType.equals("���ñ�")){
			return "blue";
		}else if(this.loanType.equals("��ֵ��")){
			return "#C4A00E";
		}else if(this.loanType.equals("�Ƽ���")){
			return "#A90EC4";
		}else if(this.loanType.equals("������")){
			return "#0CC94E";
		}else if(this.loanType.equals("��ת��")){
			return "red";
		}else{
			return null;
		}
	}
	public String getTitleShort(){
		String s = this.title;
		if(s!=null&&s.length()<=6){
			return s;
		}else if(s!=null&&s.length()>6){
			return s.substring(0, 6)+"...";
		}else{
			return null;
		}
	}
	public String durationMonthsFormat(){
		return this.durationMonths+"个月";
	}
	public String durationDaysFormat(){
		return this.durationDays+"天";
	}
}

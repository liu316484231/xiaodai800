package com.xiaodai.bean;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xiaodai.DAO.LoanInfo;

public class LoanInfoTable implements Serializable{
	private List<LoanInfoBean> loanInfoList;
	public LoanInfoTable() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		loanInfoList = new ArrayList();
		LoanInfo.getDataFromLeida(loanInfoList);
		LoanInfo.getData(loanInfoList);
		
		
	}
	public List<LoanInfoBean> getLoanInfoList() {
		return loanInfoList;
	}
	public void setLoanInfoList(List<LoanInfoBean> loanInfoList) {
		this.loanInfoList = loanInfoList;
		
	}
	
}

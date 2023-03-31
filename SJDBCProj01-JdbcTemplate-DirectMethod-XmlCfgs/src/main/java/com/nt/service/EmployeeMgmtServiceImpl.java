package com.nt.service;

import com.nt.dao.IEmployeeDAO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	private IEmployeeDAO dao;
	
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		this.dao=dao;
	}
	@Override
	public int fetcgEmpsCount() {
		int count=dao.getEmpsCount();
		return count;
	}
	@Override
	public String fetchEmpName(int eno) {
		String name=dao.getEmpNameByEmpNo(eno);
		return name;
	}

}

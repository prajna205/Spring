package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String GET_EMPS_COUNT="SELECT COUNT(*) FROM EMP";
	private static final String GET_EMPS_NAME_BY_EMPNO="SELECT ENAME FROM EMP WHERE EMPNO=?";
	private JdbcTemplate jt;
	
	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt=jt;
	}
	@Override
	public int getEmpsCount() {
		int count=jt.queryForObject(GET_EMPS_COUNT, Integer.class);
		return count;
	}
	@Override
	public String getEmpNameByEmpNo(int eno) {
		String name=jt.queryForObject(GET_EMPS_NAME_BY_EMPNO, String.class,eno);
		return name;
	}

}

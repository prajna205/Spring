package com.nt.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.nt.bo.CustomerBo;

public final class OracleCustomerDaoImpl implements ICustomerDao {
	private static final String CUSTOMER_INSERT_QUERY="INSERT INTO REALTIMEDI_CUSTOMER VALUES(REALTIMEDI_SEQ.NEXTVAL,?,?,?,?)";
	private DataSource ds;

	public OracleCustomerDaoImpl(DataSource ds) {
		System.out.println("CustomerDaoImpl::1-param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBo custBo) throws Exception {
		//get connection pooled obj
		int count = 0;
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(CUSTOMER_INSERT_QUERY);){
			if (ps!=null) {
				ps.setString(1, custBo.getCname());
				ps.setString(2, custBo.getCadd());
				ps.setDouble(3, custBo.getPamt());
				ps.setDouble(4, custBo.getIntramt());
			}//if
			//execute query
			count=ps.executeUpdate();
		}//try
		catch (SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return count;
	}

}

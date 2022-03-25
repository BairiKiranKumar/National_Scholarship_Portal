package com.lti.Boot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.lti.Portal.DAO.AdminLoginDAO;
import com.lti.Portal.pojo.AdminLoginPojo;

@SpringBootTest
class ApplicationTests 
{
	@Autowired
	AdminLoginDAO DAO;

	@Test
	public void validate()
	{
		AdminLoginPojo A1=new AdminLoginPojo("newadmin","newadmin");
		boolean res=DAO.addAdmin(A1);
		assertEquals(true,res);
	}

}

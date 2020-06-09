package com.poi.controller;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
						"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class MemberManagerControllerTest{

	@Autowired
	private WebApplicationContext ctx;
	private MockMvc mockMVC;
	

	@Before
	public void setUp()
	{
		this.mockMVC = MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testMemberDelete() throws Exception
	{
		log.info(
				mockMVC.perform(MockMvcRequestBuilders.post("/membermanager/delete")
						.param("mno", "953")
						)
				.andReturn()
				.getModelAndView()
				.getViewName()
				
				);
		
	}
	
	@Test
	public void testMemberModify() throws Exception
	{
		log.info(
				mockMVC.perform(MockMvcRequestBuilders.post("/membermanager/modify")
						.param("mno", "1027")
						.param("name", "할머니")
						.param("email","Haknabang11@naver.com")
						.param("password", "5555")
						.param("company", "BitCamp")
						.param("dept", "100")
						.param("role", "1","2")
						)
				.andReturn()
				.getModelAndView()
				.getViewName()
				
				);
	}
	
	@Test
	public void testMemberRegister() throws Exception
	{
		log.info(
				mockMVC.perform(MockMvcRequestBuilders.post("/membermanager/register")
						.param("name", "핵나방")
						.param("email","bullnabang11@naver.com")
						.param("password", "1234")
						.param("company", "BitCamp")
						.param("dept", "100")
						.param("role", "1","2")
						)
				.andReturn()
				.getModelAndView()
				.getViewName()
				
				);
		
	}
	@Test
	public void testMemberInfo() throws Exception
	{
		log.info(
				mockMVC.perform(MockMvcRequestBuilders
						.get("/membermanager/memberinfo")
						.param("mno", "5")
						)
				
				.andReturn()
				.getModelAndView()
				.getModelMap()
				);
	}
	
	@Test
	public void testList() throws Exception
	{
		log.info(
					mockMVC.perform(MockMvcRequestBuilders.get("/membermanager/memberlist"))
					.andReturn()
					.getModelAndView()
					.getModelMap()
				);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

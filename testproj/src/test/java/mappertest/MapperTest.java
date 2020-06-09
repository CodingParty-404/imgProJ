package mappertest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poi.mapper.HelloMapper;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MapperTest {
	
	@Autowired
	private HelloMapper mapper;
	@Test
	public void read()
	{
		mapper.hello("hj0").forEach(vo->log.info(vo));
	}
	
	@Test
	public void test()
	{
		log.info(mapper.getClass().getName());
	}
}

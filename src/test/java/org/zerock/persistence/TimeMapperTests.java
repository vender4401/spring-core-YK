package org.zerock.persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {
   
	@Setter(onMethod_ = @Autowired)
	private TimeMapper timeMapper;
	
  
	@Test
   	public void testGetTime() {
		System.out.println("=======================time1");
	    log.info(timeMapper.getClass().getCanonicalName());
	    System.out.println("=======================time1");
	    log.info(timeMapper.getTime());
	}
	
	@Test
	public void testGetTime2() {
		assertNotNull(timeMapper.getTime2());
		System.out.println("=======================time2");
		log.info(timeMapper.getTime2());
		System.out.println("=======================time2");
	}	
	
}
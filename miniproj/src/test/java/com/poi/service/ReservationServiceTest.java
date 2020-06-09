package com.poi.service;

import java.time.LocalDateTime;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.poi.service.reservation.ReservationServiceImpl;
import com.poi.service.reservation.ReservationService;
import com.poi.testparent.TestParent;
import com.poi.vo.meeting.MeetingVO;

import lombok.extern.log4j.Log4j;

@Log4j
public class ReservationServiceTest extends TestParent{

	@Autowired
	private ReservationService reservationService;
	

	@Test
	public void deleteTest()
	{
		reservationService.deleteReservation(1L);
	}
	
	@Test
	public void setRealTimeTestStart()
	{
		reservationService.realStartTimeSet(4L, LocalDateTime.of(2020, 5, 29, 13, 1, 1));
		
	}
	@Test
	public void setRealTimeTestEnd()
	{
		reservationService.realEndTimeSet(4L, LocalDateTime.of(2020, 5, 29, 16, 1, 1));
		
	}
	
	
	@Test
	public void modiReservationTest()
	{
		
		reservationService.modiReservation(new MeetingVO().updateSet(4L, null, null, new Long[] {2L,3L,4L,5L,6L}));
	}
	
	@Test
	public void addReservationTest()
	{
		LocalDateTime reservationStartDate = LocalDateTime.of(2020, 05, 29, 13, 00,00);
		LocalDateTime reservationEndDate = LocalDateTime.of(2020, 05, 29, 16, 00, 00);
		reservationService.addReservation(new MeetingVO()
				.insertSet("우리팀의 미래", 1L, 13L, new Long[] {2L,3L,4L,5L,6L,946L}, 
						reservationStartDate, reservationEndDate));
	}
	@Test
	public void getReservationTest()
	{
		reservationService.getResrvationList(4L).forEach((vo)->log.info(vo) );

	}

	@Test
	public void getListTest()
	{
		reservationService.getResrvationListAll().forEach((vo)->log.info(vo) );
	}
	
	@Test
	public void test()
	{
		log.info(reservationService);
	}
	
}

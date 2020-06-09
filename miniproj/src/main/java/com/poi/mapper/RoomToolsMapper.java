package com.poi.mapper;

import java.util.List;

import com.poi.vo.room.RoomToolsVO;

public interface RoomToolsMapper {

	/**
	 * �� Mapper�� ����� �� Room�� Tool�� �������ִ� tbl_roomtools ���̺�� ����ȴ�.
	 * Room���� �������� ����� �ξ����ֱ� ������
	 * CRUD ���� rno�� ������� ���̺��� Ž���Ѵ�.
	 * Ư�� read�� �ش��ϴ� getList�� ��� ������ Room - tool Data�� �̾Ƴ� �ʿ䰡 ���� ������
	 * List�νḸ �˻��Ѵ�.
	 */
	
	public int insert(RoomToolsVO vo);
	
	public List<RoomToolsVO> getList(Long rno);
	
	public int update(RoomToolsVO vo);
	
	public int delete(Long rno);
	
	public List<String> getListJoined(Long rno);
	
}

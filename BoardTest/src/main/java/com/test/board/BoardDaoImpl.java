package com.test.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	SqlSession session;
	String namespace = "com.test.board.";

	 @Override
	public int totalListCnt() throws Exception {
		 return session.selectOne(namespace + "totalListCnt");
	 }
	 
	 @Override
	public List<BoardDto> selectListAll() throws Exception {
		 return session.selectList(namespace + "selectListAll");
	 }

	 @Override
	public List<BoardDto> selectList(PagingDto pagingDto) throws Exception {
		 return session.selectList(namespace + "selectList", pagingDto);
	 }
	 
	 @Override
	public BoardDto select(Integer bno) throws Exception {
		 return session.selectOne(namespace + "select", bno);
	 }
	 
	 @Override
	public int insert(BoardDto boardDto) throws Exception {
		 return session.insert(namespace + "insert", boardDto);
	 }
	 
	 @Override
	public int update(BoardDto boardDto) throws Exception {
		 return session.update(namespace + "update", boardDto);
	 }
	 
	 @Override
	public int viewCnt(Integer bno) throws Exception {
		 return session.update(namespace + "viewCnt", bno);
	 }
	 
	 @Override
	public int deleteAll() {
		 return session.delete(namespace + "deleteAll");
	 }
	 
	 @Override
	public int delete(Integer bno) throws Exception {
		 return session.delete(namespace + "delete", bno);
	 }
}
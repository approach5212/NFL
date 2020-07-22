package kr.co.nfl.quarterback.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.nfl.quarterback.domain.Quarterback;

@Repository
public class QuarterbackDAO {
	@Autowired
	//MyBatis를 xml로 이용할 때 사용하는 클래스
	private SqlSession sqlSession;
	
	/*
	//Hibernate는 세션 팩토리
	@Autowired
	private SessionFactory sessionFactory;
	*/
	
	//player_quarterback 테이블의 전체 데이터를 가져오는 메소드
	public List<Quarterback> allquarterback(){
		return sqlSession.selectList("quarterback.allquarterback");
		//return sessionFactory.getCurrentSession().createCriteria(quarterback.class).list();
	}
	//player_quarterback 테이블에서 1개의 데이터를 가져오는 메소드
	//기본키 player_name을 받아서 데이터 가져오는 메소드
	public Quarterback detailquarterback(String player_name) {
		return sqlSession.selectOne("quarterback.detailquarterback", player_name);
		//return sessionFactory.getCurrentSession().get(Quarterback.class, player_name);
	}
}

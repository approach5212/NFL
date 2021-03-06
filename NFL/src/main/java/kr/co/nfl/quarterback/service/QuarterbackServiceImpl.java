package kr.co.nfl.quarterback.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.nfl.quarterback.dao.QuarterbackDAO;
import kr.co.nfl.quarterback.dao.QuarterbackMapper;
import kr.co.nfl.quarterback.domain.Quarterback;

@Service
public class QuarterbackServiceImpl implements QuarterbackService {
	@Autowired
	private QuarterbackDAO quarterbackDao;
	
	//private QuarterbackMapper quarterbackDao;

	@Override
	//@Transactional - 이 주석은 하이버네이트 쓸꺼면 주석 해제
	public void allquarterback(HttpServletRequest request, HttpServletResponse response) {
		//1.파라미터 읽기
		
		//2.필요한 처리 수행
		
		//3.DAO 메소드의 매개변수 생성
		
		//4.DAO 메소드를 호출
		List<Quarterback> list = quarterbackDao.allquarterback();
		//5.결과를 가공
		
		//6.결과를 저장 - REST API Server의 경우는 request에 저장
		request.setAttribute("list", list);
		
	}

	@Override
	//@Transactional - 이 줄도 하이버네이트 쓸거면 주석 해제
	public void detailquarterback(HttpServletRequest request, HttpServletResponse response) {
		//요청 주소의 마지막 부분을 가져오기
		//localhost/detail/player_name
		String requestURI = request.getRequestURI();
		String [] ar = requestURI.split("/");
		String player_name = ar[ar.length-1];
		
		//DAO의 메소드를 호출
		Quarterback quarterback = quarterbackDao.detailquarterback(player_name);
		//결과를 저장
		request.setAttribute("quarterback", quarterback);
	}

	@Override
	public void fileview(HttpServletRequest request, HttpServletResponse response) {
		//프로젝트 내의 디렉토리에 대한 절대 경로 가져오기
		String imgPath = request.getServletContext().getRealPath("/img");
		//디렉토리 안의 모든 파일에 대한 이름을 가져오기 - File 클래스 이용
		File f = new File(imgPath);
		String [] fileList = f.list();
		
		//파일이름을 List에 저장하고 List를 request에 저장
		List<String> list = new ArrayList<String>();
		for(String imsi : fileList) {
			list.add(imsi);
		}
		//출력할 데이터 저장
		request.setAttribute("list", list);
		
	}
	
}

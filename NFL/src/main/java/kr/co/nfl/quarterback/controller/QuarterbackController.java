package kr.co.nfl.quarterback.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.nfl.quarterback.service.QuarterbackService;

@Controller
public class QuarterbackController {
	@Autowired
	private QuarterbackService quarterbackService;
	
	@RequestMapping(value = {"/", "index.html"}, method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response) {
		//서비스의 메소드를 호출
		quarterbackService.allquarterback(request, response);
		return "home";
	}
	
	@RequestMapping(value = {"detail/{player_id}"}, method = RequestMethod.GET)
	public String detail(HttpServletRequest request, HttpServletResponse response) {
		//서비스의 메소드를 호출
		quarterbackService.detailquarterback(request, response);
		return "detail";
	}
}
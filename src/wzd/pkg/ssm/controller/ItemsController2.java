package wzd.pkg.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ItemsController2 implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		//调用service查找数据库，查询商品列表。
		
		
		
		//返回ModelAndView
		ModelAndView modelAndView=new ModelAndView();
		
		//相当于request的setAttribute，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", "controller2 content");
		
		modelAndView.setViewName("/WEB-INF/jsp/items.jsp");
		
		return modelAndView;
	}

}

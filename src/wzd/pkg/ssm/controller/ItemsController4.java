package wzd.pkg.ssm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
 * 注解的handler
 * 
 * 注意：
 * 1.不实现其他接口。
 * 2.创建方法，该方法返回ModelAndView。
 * 3.分别用@Controller和@RequestMapping修饰类和对应的方法。
 * 4.在xml文件中进行注册bean，进行加载。加载的方式有2种，1.使用bean进行单个配置，2
 * 
 * 步骤：
 * 1. 使用@Controller来标注这是一个控制器
 * 2. 使用@RequestMapping修饰方式，实现url和方法的映射。
 */


@Controller
@RequestMapping("/Annotation")
public class ItemsController4{

	//对这个方法和url进行映射
	@RequestMapping("/queryAndView4.action")
	public ModelAndView queryAndView4(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("itemsList", "controller4 content");
		
		modelAndView.setViewName("/WEB-INF/jsp/items.jsp");
		
		return modelAndView;
	}
	
	public ItemsController4(){
		
	}


}

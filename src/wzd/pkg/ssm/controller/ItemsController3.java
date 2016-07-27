package wzd.pkg.ssm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class ItemsController3 implements HttpRequestHandler {

	
	@Override
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setAttribute("itemsList", "controller3 content");
		
		
		request.getRequestDispatcher("/WEB-INF/jsp/items.jsp").forward(request, response);
		
		
	}



}

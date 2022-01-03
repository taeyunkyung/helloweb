package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet { // 상속
	// 필드-생략가능
	private static final long serialVersionUID = 1L;

	// 생성자-생략가능
	public HelloServlet() { // default
	}

	// 메소드 g/s

	// 메소드 일반-두가지 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath()); // 지워도 됨
			
		// 코드작성
		response.setContentType("text/html;charset=utf-8");	
		
		PrintWriter out = response.getWriter(); // html에 있는 것 다 작성..
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("   <head>");
		out.println("      <meta charset='UTF-8'>");
		out.println("      <title>Insert title here</title>");
		out.println("   </head>");
		out.println("   <body>");
		out.println("      <h1>servlet: helloworld!!!! 안녕 servlet!!!!!</h1>");
		out.println("   </body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response); // 지워도 됨
		// 코드작성
		// get방식 또는 post방식 중 선택이 가능할때, 보통 get만 가능
		
	}

}

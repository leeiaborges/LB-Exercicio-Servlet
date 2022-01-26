package com.exercicio.triangulo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int a = Integer.parseInt(request.getParameter("valA"));
		int b = Integer.parseInt(request.getParameter("valB"));
		int c = Integer.parseInt(request.getParameter("valC"));
		int areaQuadrado;
		int areaRetangulo;
        
		if (a == b && a == c){
			response.getWriter().printf("<H1> Tr�s lados iguais. � um Triangulo Equil�tero!%n </H1>");
		}else if(a == b || a == c || b == c){
			response.getWriter().printf("<H1> Dois lados iguais. � um Triangulo Is�sceles!%n </H1>");
		}else {
			response.getWriter().printf("<H1> Tr�s lados Diferentes. � um Triangulo Escaleno!%n </H1>");
		}
		
		areaQuadrado = (int) Math.pow(b,2);
		areaRetangulo = a * b;
		
		response.getWriter().printf("<H1> A �rea do quadrado �: %d%n </H1>", areaQuadrado);
		response.getWriter().printf("<H1> A �rea do retangulo �: %d%n </H1>", areaRetangulo);
	}

}

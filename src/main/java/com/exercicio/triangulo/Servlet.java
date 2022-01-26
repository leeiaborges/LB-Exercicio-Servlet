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
			response.getWriter().printf("<H1> Três lados iguais. É um Triangulo Equilátero!%n </H1>");
		}else if(a == b || a == c || b == c){
			response.getWriter().printf("<H1> Dois lados iguais. É um Triangulo Isósceles!%n </H1>");
		}else {
			response.getWriter().printf("<H1> Três lados Diferentes. É um Triangulo Escaleno!%n </H1>");
		}
		
		areaQuadrado = (int) Math.pow(b,2);
		areaRetangulo = a * b;
		
		response.getWriter().printf("<H1> A área do quadrado é: %d%n </H1>", areaQuadrado);
		response.getWriter().printf("<H1> A área do retangulo é: %d%n </H1>", areaRetangulo);
	}

}

package com.springPractice.foodCart;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get the data from the database (model)
		String[] foodItems = {"Pizza", "Hamburger", "Hot Dog", "Pasta" };
		request.setAttribute("foodItems", foodItems);
		
		
		
		
		// redirect to a different page (view)
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-food.jsp");
		requestDispatcher.forward(request, response);
		
	}

}

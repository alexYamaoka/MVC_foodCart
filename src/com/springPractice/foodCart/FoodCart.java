package com.springPractice.foodCart;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		
		try {
			List<Food> foodItems = FoodCartDbUtil.getFoodList();
			request.setAttribute("foodItems", foodItems);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		// redirect to a different page (view)
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("show-food.jsp");
		requestDispatcher.forward(request, response);
		
	}

}

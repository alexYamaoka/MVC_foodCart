package com.springPractice.foodCart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class FoodCartDbUtil {
	// connects to mysql database with food items 
	
	public static List<Food> getFoodList(){
		
		String url = "jdbc:mysql://127.0.0.1:3306/";
		String userName = "root";
		String password = "password";
		ArrayList<Food> foodList = new ArrayList<Food>();
		
		
		
		//  Load mysql driver
		Class.forName("com.mysql.jdbc.Driver");
		
		// get the connection
		Connection connection = DriverManager.getConnection(url, userName, password);
		
		// create a statement
		Statement statement = connection.createStatement();
		
		// execute the statement and loop over the result set 
		ResultSet resultSet = statement.executeQuery("SELECT * FROM foodCart");
		
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String item = resultSet.getString(2);
			double price = resultSet.getDouble(3);
			Food food = new Food(id, item, price);
			foodList.add(food);
		}
		
		
		return foodList;
	}
	
	
	
}

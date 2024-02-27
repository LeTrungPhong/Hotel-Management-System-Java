package com.appManageHotel.controller.user.home;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.appManageHotel.dao.*;
import com.appManageHotel.http.HttpURLConnectionExample;
import com.appManageHotel.models.room.Room;
import com.google.gson.Gson;

@WebServlet(urlPatterns = {"/Homecss"})
public class Homecss extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DO GET");
			
		RequestDispatcher rd = request.getRequestDispatcher("/views/user/style.css");
		rd.forward(request, response);
	}
	
	
}
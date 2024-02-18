package com.appManageHotel.controller.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.appManageHotel.dao.*;
import com.appManageHotel.models.room.Room;

@WebServlet(urlPatterns = {"/Home"})
public class Home extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Room> listroom = RoomDAO.getInstance().selectAll();
		System.out.println(listroom.size());
		Room room = listroom.get(0);
		request.setAttribute("model", room);
		Module module = (Module) request.getAttribute("model");
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/user/home.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
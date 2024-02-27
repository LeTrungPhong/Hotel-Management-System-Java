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

@WebServlet(urlPatterns = {"/Home"})
public class Home extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DO GET");

//		response.setContentType("application/json");
//		
//		ArrayList<Room> listroom = RoomDAO.getInstance().selectAll();
//		request.setAttribute("model", room);	
//		
//		Module module = (Module) request.getAttribute("model");
		
//		HttpURLConnectionExample.getInstance().sendGet();
//		Gson gson = new Gson();
//		PrintWriter printWriter = response.getWriter();

//		for(Room room : listroom) {
//			printWriter.println(gson.toJson(listroom));
//		}
//		request.setAttribute("listroom", listroom);
		
		
//		for(Room item : listroom){
//			HttpURLConnectionExample.getInstance().sendPOST(item);
//		}
			
		RequestDispatcher rd1 = request.getRequestDispatcher("/views/user/home.jsp");
		rd1.forward(request, response);
	}
	
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rqMethod = Integer.parseInt(request.getParameter("requestMethod"));
		
		if(rqMethod == 0) {
			String id = request.getParameter("id");
			String TypeRoom = request.getParameter("TypeRoom");
			int Money = Integer.parseInt(request.getParameter("Money"));
			System.out.println("DO POST");
			System.out.println(id);
			System.out.println(TypeRoom);
			System.out.println(Money);
			
			Room room = new Room(id,true,Money,TypeRoom);
			
			RoomDAO.getInstance().insert(room);
		}
		
		if(rqMethod == 1) {
			String id = request.getParameter("id");
			System.out.println("DO DELETE");
			System.out.println(id);
			
			Room room = new Room(id,true,0,"null");
			
			RoomDAO.getInstance().delete(room);
		}
		
		if(rqMethod == 2) {
			String id = request.getParameter("id");
			String TypeRoom = request.getParameter("TypeRoom");
			int Money = Integer.parseInt(request.getParameter("Money"));
			System.out.println("DO PUT");
			System.out.println(id);
			System.out.println(TypeRoom);
			System.out.println(Money);
			
			Room room = new Room(id,true,Money,TypeRoom);
			
			RoomDAO.getInstance().update(room);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/user/home.jsp");
		rd.forward(request, response);
	}
	
//	@Override 
//	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("DO DELETE");
//		String id = request.getParameter("id");
//		String TypeRoom = request.getParameter("TypeRoom");
//		int Money = Integer.parseInt(request.getParameter("Money"));
//		
//		System.out.println(id);
//		System.out.println(TypeRoom);
//		System.out.println(Money);
//		
//		Room room = new Room(id,true,Money,TypeRoom);
//		
//		RoomDAO.getInstance().delete(room);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("/views/user/home.jsp");
//		rd.forward(request, response);
//	}
//	
//	@Override 
//	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("DO PUT");
//		String id = request.getParameter("id");
//		String TypeRoom = request.getParameter("TypeRoom");
//		int Money = Integer.parseInt(request.getParameter("Money"));
//		
//		System.out.println(id);
//		System.out.println(TypeRoom);
//		System.out.println(Money);
//		
//		Room room = new Room(id,true,Money,TypeRoom);
//		
//		RoomDAO.getInstance().update(room);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("/views/user/home.jsp");
//		rd.forward(request, response);
//	}
}
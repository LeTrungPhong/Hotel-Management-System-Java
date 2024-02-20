package com.appManageHotel.controller.user.homedata;
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

@WebServlet(urlPatterns = {"/Home-data-room"})
public class HomeData extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json");
		
		ArrayList<Room> listroom = RoomDAO.getInstance().selectAll();
//		request.setAttribute("model", room);	
//		
//		Module module = (Module) request.getAttribute("model");
		
//		HttpURLConnectionExample.getInstance().sendGet();
		Gson gson = new Gson();
		PrintWriter printWriter = response.getWriter();
		
//		for(Room room : listroom) {
		printWriter.println(gson.toJson(listroom));
//		}
//		request.setAttribute("listroom", listroom);
		
		
//		for(Room item : listroom){
//			HttpURLConnectionExample.getInstance().sendPOST(item);
//		}
		
//		RequestDispatcher rd = request.getRequestDispatcher("/views/user/home.jsp");
//		rd.forward(request, response);
	}
	
	@Override 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
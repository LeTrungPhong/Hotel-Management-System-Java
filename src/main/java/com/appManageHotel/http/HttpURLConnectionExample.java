package com.appManageHotel.http;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;

import com.appManageHotel.dao.CustomerDAO;
import com.appManageHotel.models.room.Room;
import com.google.gson.Gson;

public class HttpURLConnectionExample {
	
	private static final String USER_AGENT = null;

	public static HttpURLConnectionExample getInstance() {
		return new HttpURLConnectionExample();
	}
	
    public static void sendGet() {
        try {
        	URI uri = URI.create("http://localhost:3000/Room");
            URL url = uri.toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();
                System.out.println("Response: " + response.toString());
            } else {
                System.out.println("HTTP GET request failed with response code: " + responseCode);
            }
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void sendPOST(Room room) {
    	try	{
    		Gson gson = new Gson();
    		String POST_PARAMS = gson.toJson(room);
//    		URI uri = URI.create("http://localhost:3000/Room");
    		URI uri = URI.create("http://localhost:8080/appManageHotel-java-pj/Home");
            URL url = uri.toURL();
    		HttpURLConnection con = (HttpURLConnection) url.openConnection();
    		con.setRequestMethod("POST");
    		con.setRequestProperty("User-Agent", USER_AGENT);
    		 con.setRequestProperty("Content-Length", Integer.toString(POST_PARAMS.getBytes().length)); // Set Content-Length
    		// For POST only - START
    		con.setDoOutput(true);
    		OutputStream os = con.getOutputStream();
    		os.write(POST_PARAMS.getBytes());
    		os.flush();
    		os.close();
    		// For POST only - END

    		int responseCode = con.getResponseCode();
    		System.out.println("POST Response Code :: " + responseCode);
    		System.out.println(POST_PARAMS);

    		if (responseCode == HttpURLConnection.HTTP_CREATED || responseCode == HttpURLConnection.HTTP_OK) { //success
    			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
    			String inputLine;
    			StringBuffer response = new StringBuffer();

    			while ((inputLine = in.readLine()) != null) {
    				response.append(inputLine);
    			}
    			in.close();
    			System.out.println("Thuc thi thành công");
    			System.out.println(response.toString());
    		} else {
    			System.out.println("POST request did not work.");
    		}
    		con.disconnect();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
	}
}

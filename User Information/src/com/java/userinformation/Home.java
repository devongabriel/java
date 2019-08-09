package com.java.userinformation;
import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // get the value for the query parameter
    	String firstName = request.getParameter("firstName");
    	if(firstName == null) {
    		firstName = "unknown";
    	}
    	
    	
        String lastName = request.getParameter("lastName");
        if(lastName == null) {
    		lastName = "unknown";
    	}
        String language = request.getParameter("language");
        
        if(language == null) {
    		language = "unknown";
    	}
        String home = request.getParameter("home");
        if(home == null) {
    		home = "unknown";
    	}
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        
        out.write("<h1>Welcome " + firstName +" "+lastName + "</h1>");
        out.write("<h1>Your favorite language is " + language + "</h1>");
        out.write("<h1>Your hometown is " + home + "</h1>");
    }
//...
}
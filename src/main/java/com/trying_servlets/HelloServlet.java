package com.trying_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello") // The URL pattern to access the servlet
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Constructor for the servlet
    public HelloServlet() {
        super();
    }

    // Override the doGet method to handle GET requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Write HTML response
        out.println("<html><body>");
        out.println("<h1>Bonjour, KAZZI Marvin</h1>");
        out.println("</body></html>");
    }
}

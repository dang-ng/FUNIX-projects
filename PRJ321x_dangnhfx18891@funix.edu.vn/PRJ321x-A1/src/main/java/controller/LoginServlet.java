package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        try {
            // collect data from user form
            String userID = request.getParameter("username");
            String password = request.getParameter("password");
            // read information of account in web.xml
            String uid = getServletContext().getInitParameter("username");
            String pwd = getServletContext().getInitParameter("password");
            // check account - use validate code to valid user
            if (userID != null && password.equals(pwd) && userID.equalsIgnoreCase(uid)) {
                response.sendRedirect("home.jsp");
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                response.getWriter().println("<font color='red'>Username or password is invalid</font>");
                rd.include(request, response);
            }
        } catch (Exception ex) {
            response.getWriter().println(ex);
        }
    }
}

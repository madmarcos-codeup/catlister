package controllers;

import dao.DaoFactory;
import model.Cat;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "CatsController", urlPatterns = "/cats")
public class CatsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // fetch the cat models from the dao
        List<Cat> cats = DaoFactory.getCatsDao().all();
        // pass the cat models to the view
        request.setAttribute("cats", cats);
        request.getRequestDispatcher("/WEB-INF/catlist.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

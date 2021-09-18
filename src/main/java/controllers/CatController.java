package controllers;

import dao.DaoFactory;
import model.Cat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CatController", urlPatterns = "/cat/*")
public class CatController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // have to split out the cat id
        String [] pathParts = request.getPathInfo().split("/");
        long catId = Long.parseLong(pathParts[pathParts.length - 1]);

        // fetch the cat models from the dao
        Cat cat = DaoFactory.getCatsDao().fetchCat(catId);
        // pass the cat models to the view
        request.setAttribute("cat", cat);
        request.getRequestDispatcher("/WEB-INF/catdetail.jsp").forward(request, response);
    }

}

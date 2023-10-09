package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contato;
import model.ContatoDAO;

@WebServlet("/home")
public class ListaContatosServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Contato> agenda = new ArrayList<Contato>();
		ContatoDAO cdao = new ContatoDAO();		
		agenda = cdao.getContatos();		
		req.setAttribute("listaContatos", agenda);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("cadastro2.jsp");
		dispatcher.forward(req, resp);
	}

}


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/OlaMundo")

public class OlaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OlaMundo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			out.println("<html>");
			out.println(" <head>");
			out.println(" <title>AloMundoServlet</title>");
			out.println(" </head>");
			out.println(" <body>");
			out.println(" <h1>AloMundoServlet</h1>");
			out.println(" </body>");
			out.println("</html>");
		} finally {
			out.close();
		}

	}

}

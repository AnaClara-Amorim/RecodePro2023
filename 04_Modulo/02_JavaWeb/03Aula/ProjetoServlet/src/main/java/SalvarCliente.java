
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(asyncSupported = true, urlPatterns = { "/SalvarCliente" })

public class SalvarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SalvarCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		
		
		
		response.sendRedirect("SucessoCliente.jsp?nome=" + nome + "&telefone=" + telefone + "&email=" + email);

	}

}

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

@WebServlet("/Cadastro")
public class SalvarProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public SalvarProduto() {
		super();
	}

 

	protected void doPost(HttpServletRequest request, HttpServletResponse response)

			throws ServletException, IOException {		

		String descricao = request.getParameter("descricao");
		float valor = Float.parseFloat(request.getParameter("valor"));
		int estoque = Integer.parseInt(request.getParameter("estoque"));
		String tipo = request.getParameter("tipo");
 

		PrintWriter saida = response.getWriter(); 

		saida.println("<!DOCTYPE html>");
		saida.println("<html lang='pt-br'>");
		saida.println("<head>");
		saida.println("<meta charset='UTF-8'>");
		saida.println("<title>Dados do Produto</title>");
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<h1>Dados do Produto</h1>");
		saida.println("<p>");
		saida.println("Descrição do Produto: " + descricao + "<br>");
		saida.println("Valor: " + valor + "<br>");
		saida.println("Estoque: " + estoque + "<br>");
		saida.println("Tipo: " + tipo);
		saida.println("</p>");
		saida.println("</body>");
		saida.println("</html>");
	}

}
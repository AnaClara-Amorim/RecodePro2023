package principalDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import principal.Conexao;
import principal.Medico;
 

public class MedicoDAO {

	private Connection conexao;
    public MedicoDAO() {
        try {
            conexao = Conexao.conectar();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 

    public void criarMedico(Medico Medico) {
        String sql = "INSERT INTO Medicos (nome, especialidade) VALUES (?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, Medico.getNome());
            stmt.setString(2, Medico.getEspecialidade());
             stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void fecharConexao() { 
        try {
             if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            }
    }  

}
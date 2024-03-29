package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Cortina;
import modelo.EPIS;

public class EpisDAO {
	private Connection con;
	
	public EpisDAO() {
	}
	
	
	public boolean cadastraEPI(EPIS ep) {
		PreparedStatement prep;
		String sql;
		int lin;

		con = SQLConnection.abrirConexaoMySQL();

		sql = "INSERT INTO epis VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			prep = con.prepareStatement(sql);
			prep.setString(1, ep.getUsuario());
			prep.setString(2, ep.geraID());
			prep.setString(3, ep.getLuva1());
			prep.setString(4, ep.getLuva2());
			prep.setString(5, ep.getLuva3());
			prep.setString(6, ep.getLuva4());
			prep.setString(7, ep.getLuva5());
			prep.setString(8, ep.getManga());
			prep.setString(9, ep.getAvental());
			prep.setString(10, ep.getCartucho1());
			prep.setString(11, ep.getCartucho2());
			prep.setString(12, ep.getResp1());
			prep.setString(13, ep.getResp2());
			prep.setString(14, ep.getMascara());
			prep.setString(15, ep.getResp3());
			prep.setString(16, ep.getProtetor1());
			prep.setString(17, ep.getProtetor2());
			prep.setString(18, ep.getSapatilha());
			prep.setString(19, ep.getTouca());
			prep.setString(20, ep.getOculos1());
			prep.setString(21, ep.getOculos2());
			prep.setString(22, ep.getEscudo());
			prep.setString(23, ep.getMatricula());
			prep.setString(24, ep.getTelf());
			prep.setString(25, ep.getMatricula());
			prep.setString(26, ep.getObs());
			

			lin = prep.executeUpdate();
			
			System.out.println("Registrado!");

			SQLConnection.fecharConexao();
			return true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SQLConnection.fecharConexao();
		return false;

	}
}

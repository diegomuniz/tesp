package br.unibh.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import br.unibh.entidades.Professor;

public class ProfessorDAO implements DAO<Professor,Long> {

	@Override
	public Professor find(Long id) {
		try {
			PreparedStatement p = JDBCUtil.getConnection().prepareStatement("select * from tb_aluno where id = ?");
			p.setLong(1, id);
			ResultSet res = p.executeQuery();

			if (res.next()) {
				return new Professor(res.getLong("id"), res.getString("nome"), res.getString("cpf"),
						res.getBigDecimal("salario"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.closeConnection();
		}
		return null;
	}

	@Override
	public void insert(Professor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Professor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Professor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Professor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

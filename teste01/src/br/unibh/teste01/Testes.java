package br.unibh.teste01;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.entidades.Aluno;
import br.unibh.persistencia.AlunoDAO;

public class Testes {
	@Test
	public void testeFindAll() {
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> lista = dao.findAll();
		Assert.assertEquals(lista.size(), 100);
	}

	@Test
	public void testeAlunoFind() {
		AlunoDAO dao = new AlunoDAO();
		Aluno a = dao.find(19L);
		Assert.assertEquals(a.getNome(), "Michael B. Duncan");
		
	}
	
	@Test
	public void testeAlunoInsert() {
		AlunoDAO dao = new AlunoDAO();
		Aluno a = new Aluno (null, "Beltrano de tal", "12345678901", "12345678", new Date(1998-12-12));
		dao.insert(a);
		
		Aluno b = dao.find("Beltrano");
		Assert.assertNotNull(b);
		b.setNome("Fulano da Silva");
		dao.update(b);
		
		Aluno c = dao.find("Fulano da Silva");
		Assert.assertNotNull(c);
		
		dao.delete(c);
		Aluno d = dao.find("Fulano");
		Assert.assertNull(d);
	}
}


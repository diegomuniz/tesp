package br.unibh.teste01;

import java.util.List;

import br.unibh.entidades.Aluno;
import br.unibh.persistencia.AlunoDAO;

public class Main {

	public static void main(String[] args) {
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> lista = dao.findAll();
		for (Aluno a: lista) {
			System.out.println(a);
		}
		
	}
	
	
}

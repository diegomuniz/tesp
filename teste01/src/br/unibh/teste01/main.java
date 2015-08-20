package br.unibh.teste01;

import java.math.BigDecimal;
import java.util.Date;

import br.unibh.entidades.Aluno;
import br.unibh.entidades.Professor;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno a1 = new Aluno (14L, "Adriana Silva", "102151002654", "56879", new Date());
		
		Professor prof1 = new Professor(15L, "Jose Humberto", "156489798", new BigDecimal(1000));
				
		System.out.println(a1);
		System.out.println(prof1);
	}

}

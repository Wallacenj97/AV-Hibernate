package teste;

import actions.selectDeAlunos;
import model.Aluno;

import java.util.List;

public class teste2 {
	public static void main(String[] args) {
		selectDeAlunos SA = new selectDeAlunos ();
		List<Aluno> alunos = SA.passar();
		for (Aluno aluno: alunos) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getId());
		}
	}
}

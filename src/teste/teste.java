package teste;

import actions.insertDeAlunos;
import model.Aluno;

public class teste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setCpf("888.888.888-88");
		a1.setEndereco("Rua");
		a1.setData(null);
		a1.setNome("wallace");
		insertDeAlunos ia = new insertDeAlunos();
		ia.passar(a1);
	}

}

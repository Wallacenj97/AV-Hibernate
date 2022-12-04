package actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Persistence;

import model.Aluno;

public class selectDeAlunos {
	public List<Aluno> passar() {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
			EntityManager manager = factory.createEntityManager();
			
			String sql = "Selec b from Aluno as b";
			Query query = manager.createQuery(sql);
			query.setParameter("paramentro", "a");
			List<Aluno> alunos = query.getResultList();
			
		return alunos;
	}

}
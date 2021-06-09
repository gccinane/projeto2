package Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


public class ReportDAO {
	
	
	
	public ReportDAO() {
		EntityManagerFactory entityFactory =  Persistence.createEntityManagerFactory("covid-db") ;
		EntityManager entityManager = entityFactory.createEntityManager();
		TypedQuery<ReportModel> query = entityManager.createQuery("SELECT * FROM REPORT;", ReportModel.class);
		List<ReportModel> entries = query.getResultList();
		System.out.println(entries);
	}
	
	
	public void getReports() {
		 
	}
}

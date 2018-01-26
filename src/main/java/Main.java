import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Main {
	private static String PERSISTENCE_UNIT_NAME = "PatientExample";
	
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory( PERSISTENCE_UNIT_NAME ).createEntityManager();
		
		List<Patient> list = em.createQuery("select p from Patient p", Patient.class).getResultList();
		for(Patient patient : list) {
			System.out.println(patient.getFirstname() + " " + patient.getName());
		}
	}
}

package DAO;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Person;
import util.HibernateUtil;
public class PersonDao {
	public PersonDao() {		
	}
	public static int register(Person p){
		int i=0;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction=session.beginTransaction();
			i=(Integer) session.save(p);
			transaction.commit();
			System.out.println("Data Add");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			session.close();
		}
		return i;
	}
}

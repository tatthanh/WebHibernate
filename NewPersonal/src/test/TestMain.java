package test;
import pojo.Person;
import DAO.PersonDao;
import util.HibernateUtil;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestMain {
	public static void main(String[] args) {
		TestMain obj = new TestMain();
		obj.saveRecord();
	}
	public void saveRecord(){
		Person p=new Person("Tuanga","Ha Tay");
		PersonDao.register(p);
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction transaction = null;
//		try {
//			transaction=session.beginTransaction();
//			session.save(p);
//			transaction.commit();
//			System.out.println("Data Add");
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally{
//			session.close();
//		}
	}

}

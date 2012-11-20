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

	}

}

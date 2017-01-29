
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StudentTest {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	@Before
	public void init () {
		// �������ö���
		Configuration config = new Configuration().configure();
		System.out.println(config.getProperties());
		// ��������ע�����
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		// �����Ự��������
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		// �Ự����
		session = sessionFactory.openSession();
		// ��������
		transaction = session.beginTransaction();
	}
	
	@Test
	public void testSaveStudents () {
		// ����ѧ������
		Students stu = new Students(5, "����5", "��", new Date(), "һ��");
		System.out.println("id: " + stu.getSid());
		System.out.println("name: " + stu.getSname());
		System.out.println("gender: " + stu.getGender());
		System.out.println("birthday: " + stu.getBirthday());
		System.out.println("address: " + stu.getAddress());

		session.save(stu); // �������
	}
	
	@Test
	public void testSaveStuWithAddress () {
		Junior stu = new Junior();
		stu.setSid(100);
		stu.setSname("����");
		stu.setGender("��");
		stu.setBirthday(new Date());
		Address address = new Address("10010", "1381111", "����");
		stu.setAddress(address);
		session.save(stu);
	}
	
	@After
	public void destory () {
		// �ύ����
		transaction.commit();
		// �رջỰ
		session.close();
		// �رջỰ����
		sessionFactory.close();
	}
}

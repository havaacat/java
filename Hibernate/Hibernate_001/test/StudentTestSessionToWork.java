
import java.sql.SQLException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mysql.jdbc.Connection;


public class StudentTestSessionToWork {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	@Before
	public void init () {
		// �������ö���
		Configuration config = new Configuration().configure();
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
		Students stu = new Students(5, "����5", "��", new Date(), "һ��5");
		session.doWork(new Work() {
			
						@Override
			public void execute(java.sql.Connection connection) throws SQLException {
				// TODO Auto-generated method stub
				connection.setAutoCommit(true);
			}
		});
		session.save(stu); // �������
		session.flush();
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

package com.giriharan.HCQLExampleApp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class StudentDAO implements DAO<Student> {
	SessionFactory sessionFactory;
	
	public StudentDAO() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		this.sessionFactory = cfg.buildSessionFactory();
	}
	
	public int save(Student student) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		return 1;
	}
	
	public int delete(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		session.delete(session.get(Student.class, id));
		session.flush();
		session.getTransaction().commit();
		session.close();
		return 1;
	}
	
	public List<Student> getStudentsWithMarkGreaterThan(int mark){  //HCQL
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.gt("mark",mark));
		return criteria.list();
	}
	
	public int update(int id,Integer mark) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		//session.evict(student);
		Student student = (Student) session.get(Student.class, id);
		student.setMark(mark); 
		
		session.save(student);
		session.getTransaction().commit();
		session.close();
		
		return 1;
	}
	
	public List<Student> getAll(char order){                        //HCQL
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Student.class);
		if(order=='a') {
			criteria.addOrder(Order.asc("mark"));
		}
		else {
			criteria.addOrder(Order.desc("mark"));
		}
		
		return criteria.list();
	}
}

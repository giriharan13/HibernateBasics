package com.giriharan.HCQLExampleApp;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;

public class App 
{
    public static void main( String[] args )
    {
        StudentDAO studentDAO = new StudentDAO();
        
        Student student1 = new Student("Elon Musk",100);
        Student student2 = new Student("Zucc",79);
        
        studentDAO.save(student1);
        studentDAO.save(student2);
        
        List<Student> students = studentDAO.getAll('a');
        System.out.println("getAll()");
        for(Student student:students)
        {
        	System.out.println(student.getName());
        }
        
        students = studentDAO.getStudentsWithMarkGreaterThan(80);
        System.out.println("Students with mark greater than 80");
        for(Student student:students)
        {
        	System.out.println(student.getName());
        }
        
        System.out.println("Updating Zucc marks to 83");
        studentDAO.update(student2.getId(), 83);
        
        students = studentDAO.getStudentsWithMarkGreaterThan(80);
        System.out.println("Students with mark greater than 80");
        for(Student student:students)
        {
        	System.out.println(student.getName());
        }
        
        System.out.println("Deleting Zucc");
        studentDAO.delete(student2.getId());
        
        students = studentDAO.getAll('a');
        System.out.println("getAll()");
        for(Student student:students)
        {
        	System.out.println(student.getName());
        }
        
        System.out.println("Eloma wins");
        
    }
}

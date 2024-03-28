package com.sopra.DAO;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Entity.Employee;
import com.Repository.EmpRepository;



public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext();
        
        app.scan("com.Repository");
        
        app.refresh();
        
        //EmpRepository empR= new EmpRepository();
        
        EmpRepository empR=app.getBean(EmpRepository.class);
        
        empR.store(new Employee(1, "ajay" , "GET"));
        empR.store(new Employee(2, "avi" , "GET"));
        empR.store(new Employee(3, "prashant" , "GET"));
        
        List<Employee> lst=empR.getAll();
        
        for(Employee e: lst) {
        	System.out.println(e);
        }
        
        System.out.println("Get " +empR.get(1));
        System.out.println("delete " +empR.delete(2));
        
        List<Employee> st=empR.getAll();
        
        for(Employee e: st) {
        	System.out.println(e);
        }  

    }
}

package net.javaguides.springbootbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootbackend.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{
    
}

// In a typical Java application, you write a class that implements CustomerRepository and craft the queries yourself. 
// What makes Spring Data MongoDB so useful is the fact that you need not create this implementation. 
// Spring Data MongoDB creates it on the fly when you run the application.
// Now you can wire up this application and see what it looks like!


// Spring JPA generates the implementing class code for you.
// Behind the scenes, the types of the primary key, and JPA Entity that you supply in the interface template gives it enough information for basic CRUD methods.
// Spring has this great DSL for queries, too.
// It will parse the names of your interface methods, for keywords like ‘find’, ‘by’, ‘distinct’ and so on. It can then generate JPA Query language to make those queries written in English happen.
// So the answer is Spring Magic.
// Spring Boot provides even more magic, generally, to the point where there’s really not much code left to write.
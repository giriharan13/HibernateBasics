# **Introduction to Hibernate**

```Hibernate is a Java framework``` that simplifies the development of Java application to interact with the database.
By ```mapping Java objects to database tables```, it streamlines data persistence and retrieval without the need for complex SQL queries.

### Advantages:
   - Hibernate is **Open Source** and **Lightweight**
   - The performance of hibernate framework is **fast** because cache is internally used in hibernate framework
   - **HQL** generates the database **independent queries**. So you don't need to write database specific queries
   - Hibernate framework provides the facility to **create** the tables of the database **automatically**.
   - **Fetching data** from multiple tables is **easy** in hibernate framework.
   - Hibernate supports **Query cache** and provide statistics about query and database status.

`ORM tools in java like Hibernate implements the Java/Jakarta Persistence API (JPA)`

## Java Persistence API (JPA)
JPA is a Java specification that gives some **functionality** and **standard** to **ORM tools**. It is used to examine, control, and persist data between Java objects and relational databases. ORM tools like **Hibernate,iBatis,TopLink** follow the standards provided by JPA

![hib1](https://github.com/giriharan13/HibernateBasics/assets/119475958/dc2d387c-6493-45de-953b-e2070f7863dc)
*image source:[Javatpoint](https://www.javatpoint.com/hibernate-tutorial)*

## Architecture of Hibernate
![hibarch](https://github.com/giriharan13/HibernateBasics/assets/119475958/451191be-cc01-471e-80b1-833a45a5715e)
*image source:[Tutorialspoint](https://www.tutorialspoint.com/hibernate/hibernate_architecture.htm)*

### Persistent Object: 
Persistent Object is a **Java Object** that represents a **row**.
For example during the setup, we have created a Persistent class called **Student**

### Configuration Object:
The Configuration object is the **first** Hibernate object you create in any Hibernate application and is **created only once**.
It represents a configuration or properties file required by the Hibernate.
The Configuration object provides two keys components 	
	1. **Database Connection**
	2. **Class Mapping Setup**

### SessionFactory Object:
Configuration object is used to create a SessionFactory object.
The SessionFactory is a **thread-safe** object and used by all the threads of an application.
The SessionFactory is a **heavyweight object**.
You would need one SessionFactory object per database using a separate configuration file

### Session Object:
A Session is used to get a **physical connection** with a database.
The Session object is **lightweight**.
Persistent objects are **saved** and **retrieved** through a Session object.
These objects are **not thread-safe** and should not be kept open for a long time

### Transaction Object:
A Transaction represents a **unit of work** that ensures a set of database operations are performed **consistently**.
Transactions in Hibernate are handled by an underlying transaction manager and transaction (from JDBC or JTA).
This is an **optional** object and Hibernate applications may choose not to use this interface, instead managing transactions in their own application code.

### Query Object:
Query Object is used to perform **database queries**.
Hibernate provides query languages like **HQL** and **JPQL**.

### Criteria Object:
The Session object is used to build the Criteria object. It's used to create and run **object-oriented criterion queries** and retrieve entities by assembling Criterion objects.



`Hibernate internally uses various existing Java APIs, like JDBC, Java Transaction API(JTA), and Java Naming and Directory Interface (JNDI).` 

### Java Transaction API (JTA):
JTA is a standard API for **managing transactions** in a java application.

### Java Database Connectivity(JDBC):
JDBC is a standard API for **connecting and working** with databases

### Java Naming and Directory Interface(JNDI):
JNDI is a standard API for **looking up resources** in a java application


## References:
[GeeksforGeeks](https://www.geeksforgeeks.org/)
[Javatpoint](https://www.javatpoint.com/)
[Tutorialspoint](https://www.tutorialspoint.com/index.htm)
[CodingNinjas](https://www.codingninjas.com/)



# Setting Up a Hibernate Project

Hey guys! I will explain you on how to setup a hibernate project with few examples in Eclipse IDE



## Prerequisites

Make sure you have these installed in your system

- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL](https://dev.mysql.com/downloads/mysql/)

## Step 1: Create a Maven Project in Eclipse

1. Open Eclipse IDE.
2. Go to `File -> New -> Maven Project.
![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/mav1.png?raw=true)
3. Follow the images below
![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/mav2.png?raw=true)
![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/mav3.png?raw=true)
![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/mav4.png?raw=true)
4. Click `Finish` to create the project.
![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/mavaft.png?raw=true)

## Step 2: Add Dependencies

1. Open the `pom.xml` file in your Maven project.
2. Add the following dependencies for [Hibernate Core](https://mvnrepository.com/artifact/org.hibernate/hibernate-core/5.6.15.Final) and [MySQL Connector](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j):![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/pomxml.png?raw=true)
3. Save the `pom.xml` file.

## Step 3: Create a Database

1. Using MySQL, create a new database.
2. Inside the database, create a table that corresponds to the entity you want to map using Hibernate.

Here I'm creating a database called "db" and a table name "student" with the attributes given below
![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/db1.png?raw=true)
![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/db2.png?raw=true)

## Step 4: Configure Hibernate

1. In Eclipse, create a Hibernate configuration file (e.g., `hibernate.cfg.xml`).
2. Add the necessary configurations to the file, including the database URL, username, and password.
![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/configxml.png?raw=true)

We set the property named "hibernate.show_sql" to true so that whenever we perform some operations on the database using Hibernate it shows the respective sql equivalent command in the output

## Step 5: Create Entity Class

1. Create a Java class that represents the entity you want to map to the database table.
2. Use `javax.persistence` annotations such as `@Entity`, `@Id`, and `@Column` to define the mapping.

![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/entityclass.png?raw=true)

Here I have created a class called "student" with three attributes roll(int),name(String),age(int).I have used @Entity before class and @Column before every attributes and also specified their names that they have in sql database . And also I used @Id for the roll attribute because it is a primary key



## Step 6: Create Application Code

1. Create a Java class (e.g., `App`) to interact with Hibernate.

![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/app.png?raw=true)


We'll discuss about these things in detail in the future.For now just add these in your App class

Now you should see these results in your db
![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/inserted.png?raw=true)


# Congratulations 🎉
  Congrats for creating your first hibernate app!!You did it!!
  ![](https://github.com/giriharan13/HibernateBasics/tree/master/setup/images/congrats.jpg?raw=true)




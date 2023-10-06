

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
<img width="387" alt="mav1" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/57f45100-a2ad-4056-8235-61fd2e821fed">
3. Follow the images below
<img width="637" alt="mav2" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/2b8e786a-741c-4e1e-9b94-b0268e3c7a5a">
<img width="636" alt="mav3" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/92ba5e1d-704b-4199-9cbf-bc96d15b96ef">
<img width="637" alt="mav4" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/171093d1-b852-4495-a707-9bf924243991">
4. Click `Finish` to create the project.
<img width="283" alt="mavaft" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/2d50e4ee-89ef-48cb-930f-4c42870b3638">


## Step 2: Add Dependencies

1. Open the `pom.xml` file in your Maven project.
2. Add the following dependencies for [Hibernate Core](https://mvnrepository.com/artifact/org.hibernate/hibernate-core/5.6.15.Final) and [MySQL Connector](https://mvnrepository.com/artifact/com.mysql/mysql-connector-j):
<img width="749" alt="pomxml" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/8929028a-0c72-4a14-b6ea-98511bd74030">

3. Save the `pom.xml` file.

## Step 3: Create a Database

1. Using MySQL, create a new database.
2. Inside the database, create a table that corresponds to the entity you want to map using Hibernate.

Here I'm creating a database called "db" and a table name "student" with the attributes given below
<img width="150" alt="db1" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/18aa541b-f6e5-4d38-aa09-bab989b2ee37">
<img width="96" alt="db2" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/450ef8c0-91b8-48b7-a7ec-b41b046fb5d5">


## Step 4: Configure Hibernate

1. In Eclipse, create a Hibernate configuration file (e.g., `hibernate.cfg.xml`).
2. Add the necessary configurations to the file, including the database URL, username, and password.
<img width="554" alt="configxml" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/7d57068a-13d3-4a2b-8ac9-a55bf23c1828">


We set the property named "hibernate.show_sql" to true so that whenever we perform some operations on the database using Hibernate it shows the respective sql equivalent command in the output

## Step 5: Create Entity Class

1. Create a Java class that represents the entity you want to map to the database table.
2. Use `javax.persistence` annotations such as `@Entity`, `@Id`, and `@Column` to define the mapping.

<img width="395" alt="entityclass" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/70b70cb7-e191-44a2-98d4-1a2de340fa79">


Here I have created a class called "student" with three attributes roll(int),name(String),age(int).I have used @Entity before class and @Column before every attributes and also specified their names that they have in sql database . And also I used @Id for the roll attribute because it is a primary key



## Step 6: Create Application Code

1. Create a Java class (e.g., `App`) to interact with Hibernate.

<img width="348" alt="app" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/e7d6d4aa-ff12-4bd0-ac3e-ee318daa6079">



We'll discuss about these things in detail in the future.For now just add these in your App class

Now you should see these results in your db
<img width="132" alt="inserted" src="https://github.com/giriharan13/HibernateBasics/assets/119475958/faa80b4d-164a-4e79-9ef0-0d88bce1dac6">


# Congratulations 🎉
  Congrats for creating your first hibernate app!!You did it!!
  ![congrats](https://github.com/giriharan13/HibernateBasics/assets/119475958/c217efdc-f45e-43f6-adcd-95ebdc5f33ce)





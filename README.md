# Relational Databases Project
A project about MySQL database management.
  
In this project a management system for a travel agency is implemented and consists of two main parts:
- MySQL Database
- GUI App
  
The **"database"** folderof the project contains files with code for creating and managing the database:
- travel_agency.sql: It contains SQL code for the creation of the database.
- procedures.sql: It contains SQL code for the procedures of the database.
- triggers.sql: It contains SQL code for the triggers of the database.
- inserts.sql: It contains some initial inserts for the database so that we can test the final app.
- ER Diagram.png: An image of the ER diagram of the database.
  
The **"travel_agency_app"** folder of the project contains Java code that implements the app from which we manage the travel agency. The app was made with the Netbeans IDE which supports GUI designer.
  
**Execution Info:**
Firtly, in order to run the app having the MySQL database data available, you will have to create the database locally because it is not public in a server. Also you will have to change the database connection properties in the Database Java class of the project according to your local database credentials. Finally, in order to run the app you will have to run the LoginPage Java class.

Context
The aim of this mini project is to contribute to the development of a goods delivery application. The
application is intended for customers, schedulers, and drivers.
Description of the project

When the application is launched, a window appears asking the user to either register or
authenticate.
The registration window allows the user to enter his/her e-mail address, password, cell phone
number, and role (customer, scheduler, or driver). If the user is a driver, he must also enter his
truck's registration number and capacity of the truck in Kg.
Once authenticated, the user can modify the following information: e-mail address, password, cell
phone number and, if applicable, truck registration number and capacity truck.


As a customer,
The user can select from a list of products (hard stored in the database), the goods he/she needs
and the quantity in Kg. The user then chooses the delivery date and address.


As a scheduler,
The user has access to the list of all deliveries to be made sorted by date. The user can assign a route
to a driver (a route is a set of destination points). The user can generate a Word file with all
assignments for a specific day (date chosen by the user). The generated document must contain
justified title "[THE CHOSEN DAY]" in a bold text. The body of the document contains the list of
missions. Each mission is made up of the driver's first and last name, and the route. A mission starts
with the warehouse address, followed by the delivery addresses, and ends with the warehouse
address.

Optional question: Use the Google OR-Tools library to plan daily journeys automatically.
As a driver,
The user can view the list of missions assigned to him/her.
The user can view the list of missions he/she has already carried out.
Constraints and instructions
The database management system used should be MySQL.
The programming language used must be Java.
At the end of each session, you must push your code to GitHub

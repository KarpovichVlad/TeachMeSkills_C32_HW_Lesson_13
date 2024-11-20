# The following task was implemented here:


Create a class with a static method.
This method takes three parameters as input:
Login
Password
confirmPassword
All fields have a String data type.
Login must be less than 20 characters long and must not contain
spaces.
If login does not meet these requirements, it is necessary to "throw" the WrongLoginException.
The password must be less than 20 characters long, must not contain a space, and must contain at least one digit.
Also, password and confirmPassword must be equal.
If the password does not meet these requirements, you must throw the WrongPasswordException.
The exception classes WrongPasswordException and WrongLoginException are custom
exception classes with two constructors - one by default, the second
accepts the exception message and passes it to the constructor of the Exception class.
The method returns true if the values are valid or false otherwise.
Place classes in packages: the class for checking values should be in its own separate package, the classes for the
# UserManagementSystem

<p>This is a Spring Boot project that implements a User management system with validation. 
The system allows users to be added, retrieved, updated, and deleted from a database. The user object has several attributes including username, 
date of birth, email, phone number, date, and time. Validation is implemented using Spring's validation framework,
which includes several built-in validation annotations.</p>

## Technologies Used

* Spring Boot
* java
* Maven

## Enpoints
* addUser 
* getUser/{userid}
* getAllUser
* updateUserInfo
* deleteUser

## Getting Started
* Clone this repository to your local machine.
* Ensure that you have the latest version of Java installed.
* Open the project in your preferred IDE.
* Run the project and navigate to http://localhost:8080/ in your web browser to access the API.

## Usage
<p>You can test the endpoints using Postman or any other API testing tool. Here are some example requests:</p>

## Add a new user
<p>Send a POST request to http://localhost:8080/users with the following JSON payload:</p>

```Java
{
    "userId": "1",
    "userName": "sonam",
    "dateOfBirth": "22-09-1995",
    "email": "sonam@gmail.com",
    "phoneNumber": "8954569765",
    "date": "25-04-2023",
    "time": "18:33"
}
```

## Get user information by UserId
<p>Send a GET request to http://localhost:8080/users/{userId} where {userId} is the id of the user you want to retrieve.</p>

## Get all users
<p>Send a GET request to http://localhost:8080/users.</p>

## Update user information by UserId
<p>Send a PUT request to http://localhost:8080/users/{userId} with the following JSON payload:</p>

```Java
{
    "userId": "2",
    "userName": "piyush",
    "dateOfBirth": "22-09-1995",
    "email": "piyushh@gmail.com",
    "phoneNumber": "9836451285",
    "date": "25-04-2023",
    "time": "18:33"
}
```

## Delete user information by UserId
<p>Send a DELETE request to http://localhost:8080/users/{userId} where {userId} is the id of the user you want to delete.</p>

## Validation
<p>Validation is implemented using Spring's validation framework. The following validation annotations are used:</p>

* @NotBlank: Validates that a string is not blank.
* @Size: Validates the size of a string.
* @Pattern: Validates a string against a regular expression pattern.
* @Email: Validates that a string is a valid email address.
* @NotEmpty : validates that field should not be empty.
* @NotNull : validates that field should not be null.


## Conclusion
<p>This project demonstrates how to create a simple User Management System using Spring Boot. </p>



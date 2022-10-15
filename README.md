# Xyz-University-Rest-Apis
This Rest Api project for Xyz University is used to validate student details.

# Prerequisites
* This project requires java 17 to be installed
* Postman for testing the Apis

# Tech Stack
* Java 17
* Spring Boot: 2.7.4
* H2 In memory DB to simulate database with table for students for Xyz university

# Testing API
* Since we are using an in memory DB to simulate the Xyz University database, we first have to POST some sample student records before invoking the GET method
* Open postman and select POST
* Invoke the URL http://localhost:8080/ValidateStudent/v1/students
* Select BODY, then select content type JSON
* Paste the sample data below, one can chang the record details to post several records
```
{
"studentId": "123456",
"studentName": "Justus Kimani",
"studentDetails": "Joined in the year 2002"
}
```
* Once the records have posted successfully, on postman change from POST to GET and invoke the same URL http://localhost:8080/ValidateStudent/v1/students, this will fetch the posted records, sample below
```
[
    {
        "studentId": 123456,
        "studentName": "Justus Kimani",
        "studentDetails": "Joined in the year 2002"
    },
    {
        "studentId": 123467,
        "studentName": "John Doe Kimani",
        "studentDetails": "Joined in the year 2003"
    },
    {
        "studentId": 1234678,
        "studentName": "Michael Doe Kimani",
        "studentDetails": "Joined in the year 2003"
    }
]
```
# Developer
* Peter Kabira

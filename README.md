# Xyz-University-Rest-Apis-Repo
Xyz University Rest Api repo to be used to validate student details then post payment notifications.

# Prerequisites
* This project requires java 17 to be installed
* Postman for testing the Apis

# Tech Stack
* Java 17
* Spring Boot: 2.7.4
* H2 In memory DB to simulate database with table for students for Xyz university

# Setup
* Fork the repo
* Download the file CompliedJarFile.rar
* Unzip the file to a folder
* Open CMD and cd to the folder with the unzipped contents
* Type the command `java -jar XyzUniversityRestApiApplication.jar` then wait for the service to come up. When successfully up, service will open an HTTP port 8080

# Structure and Api Testing
## Student Validation
* Since we are using an in memory DB to simulate the Xyz University database, we first have to POST some sample student records before validating.
* Open postman and select POST
* Paste the URL http://localhost:8080/ValidateStudent/v1/students
* Select BODY, then select content type JSON
* Use below sample payload to create student sample records. One can change the record details to post several records
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

* One can also validate a specific student by passing a student ID number on the URL as http://localhost:8080/ValidateStudent/v1/students/123456 and getting below response
```
{
    "studentId": 123456,
    "studentName": "Justus Kimani",
    "studentDetails": "Joined in the year 2002"
}
```
## Payment Notification
* For payment notifications, change the URL to http://localhost:8080/PaymentNotification/v1/payments and method to POST then use below sample payment notification payload
```
{
"paymentReference": "FTC221015ATC",
"paymentChannel": "Branch",
"paymentMethod": "Cheque",
"paymentDetails": "Tuition for Sem 1 2022",
"paymentStatus": "Paid"
}
```
# Developer
* Peter Kabira

# EmailMicroServices
📧 Email Microservices (Spring Boot + MySQL + Gmail SMTP)

A Spring Boot Email Microservice that allows sending emails using Gmail SMTP and stores all sent emails in a MySQL database for tracking purposes.
This service exposes REST APIs to send emails with subject, recipient, and body, making it useful for integrating into larger systems like e-commerce platforms, notification services, and internal messaging tools.

# 🚀 Features 

> Send emails using Gmail SMTP.

> Store sent emails (recipient, subject, body) in a MySQL database.

> REST API endpoint for sending emails.

> Input validation for email fields.

> Configurable SMTP and Database settings.

# Tech Stack

>Java 17+

>Spring Boot 3+

>Spring Data JPA (Hibernate)

>Spring Mail (JavaMailSender)

>MySQL

>Lombok

>Jakarta Validation


# 📂 Project Structure

src/main/java/com/Emailms/www/
│
├── controller/
│   └── EmailSendingController.java   

│
├── dto/
│   └── EmailRequest.java           

│
├── model/
│   └── Email.java                  

│
├── repository/
│   └── EmailRepository.java         

│
├── service/
│   └── EmailService.java            

│
└── EmailMsApplication.java          

# ⚙️ Configuration

spring.application.name=Email_MicroServices

server.port=2020

# Database Configuration

spring.datasource.url=jdbc:mysql://localhost:3306/email_db

spring.datasource.username=root

spring.datasource.password=root

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA setting

spring.jpa.hibernate.ddl-auto=update

# Mail configuration (Gmail SMTP)

spring.mail.host=smtp.gmail.com

spring.mail.port=587

spring.mail.username=your-email@gmail.com

spring.mail.password=your-app-password

spring.mail.properties.mail.smtp.auth=true

spring.mail.properties.mail.smtp.starttls.enable=true

spring.mail.properties.mail.starttls.required=true

# 👉 Note:

Replace "your-email@gmail.com" with your Gmail ID.

Replace "your-app-password" with a Gmail App Password (not your regular Gmail password).

To generate one: Go to Google Account → Security → App Passwords

# 📡 API Endpoints

✅ Send Email

POST http://localhost:2020/email/send

Request Body (JSON):
---------------------

{
  "to": "receiver@example.com",
  
  "subject": "Test Email",
  
  "body": "Hello, this is a test email!"
}

Response:
-----------

"Email successfully sent"





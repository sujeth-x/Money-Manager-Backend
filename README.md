💰 Money Manager – Backend
📌 Project Overview

The Money Manager Backend is a RESTful API built using Spring Boot and MongoDB Atlas.
It helps users manage their income and expenses, view summaries, and filter transactions by date.

This backend serves as the core business logic layer for the Money Manager application and is consumed by a React frontend.

🚀 Features

Add income and expense transactions

View all transactions

Filter transactions by date range

Get financial summary (total income, total expense, balance)

MongoDB Atlas integration

RESTful API design

Tested using Postman

🛠️ Tech Stack

Backend Framework: Spring Boot

Language: Java

Database: MongoDB Atlas

Build Tool: Maven

API Testing: Postman

📂 Project Structure
src/
 └── main/
     ├── java/
     │   └── com/moneymanager/
     │       ├── controller/
     │       ├── service/
     │       ├── repository/
     │       └── model/
     └── resources/
         └── application.properties

⚙️ Configuration
🔐 MongoDB Configuration

The application uses MongoDB Atlas.

In application.properties:

spring.data.mongodb.uri=${MONGO_URI}
spring.data.mongodb.database=moneymanager
server.port=${PORT:8080}


Set the environment variable:

MONGO_URI = mongodb+srv://<username>:<password>@<cluster>.mongodb.net/moneymanager

▶️ How to Run the Backend Locally
1️⃣ Clone the repository
git clone https://github.com/sujeth-x/Money-Manager-Backend.git
cd Money-Manager-Backend

2️⃣ Configure MongoDB

Set the MONGO_URI environment variable in your system.

3️⃣ Run the application
mvn spring-boot:run


or using Maven wrapper:

./mvnw spring-boot:run

📡 API Endpoints
➕ Add Transaction
POST /api/transactions

📄 Get All Transactions
GET /api/transactions

📊 Get Summary
GET /api/transactions/summary

📅 Filter by Date
GET /api/transactions/filter?from=YYYY-MM-DDTHH:mm&to=YYYY-MM-DDTHH:mm

❤️ Health Check
GET /

🧪 Testing

All APIs were tested using Postman with real-time data stored in MongoDB Atlas.

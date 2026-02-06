💰 Money Manager – Backend Service
📌 Overview

The Money Manager Backend is a RESTful service developed using Spring Boot and MongoDB Atlas.
It provides APIs to manage financial transactions such as income and expenses, enabling users to track spending, analyze summaries, and understand their financial balance 📊.

This backend is designed to support a frontend client (React) and focuses on clean architecture, scalability, and maintainability 🧩.

🎯 Problem Statement

Managing personal finances manually is error-prone and inefficient. Users need a reliable system to record transactions, analyze income versus expenses, and understand their financial balance.

The Money Manager Backend solves this problem by offering structured APIs to store, retrieve, and summarize financial data securely 🔐.

✨ Key Features

➕ Create and manage income and expense transactions

📄 Retrieve all recorded transactions

📅 Filter transactions based on date range

📊 Generate financial summaries (total income, total expense, balance)

☁️ MongoDB Atlas cloud database integration

🔗 RESTful API design with layered architecture

🧪 Tested and validated using API testing tools

🛠️ Technology Stack

☕ Programming Language: Java

🌱 Framework: Spring Boot

🍃 Database: MongoDB Atlas

🏗️ Architecture: Controller – Service – Repository pattern

📦 Build Tool: Maven

🏗️ Application Architecture

The backend follows a standard layered architecture:

🎮 Controller Layer: Handles HTTP requests and responses

🧠 Service Layer: Contains business logic and validations

🗄️ Repository Layer: Manages database interactions

📁 Model Layer: Defines data structures and entities

This separation ensures better readability, testability, and scalability 🚀.

⚙️ Configuration & Environment

The application uses environment variables for sensitive configuration such as database credentials 🔑.
This approach improves security and allows the application to run across different environments without code changes.

The server is configured to support dynamic port allocation, making it compatible with both local execution and cloud environments 🌍.

🌐 API Capabilities

The backend exposes endpoints to:

➕ Add new financial transactions

📄 Retrieve all transactions

📅 Filter transactions by date

📊 Fetch summarized financial insights

❤️ Perform basic health checks

All APIs follow REST conventions and return structured JSON responses 📬.

🧪 Testing & Validation

The backend APIs were thoroughly tested to ensure:

✅ Correct data persistence

🧮 Accurate calculations

📥 Proper request and response handling

Testing was performed using API testing tools and verified against live MongoDB Atlas data 🔍.

🏆 Hackathon Context

This backend was developed as part of a hackathon project submission 🏁.
The focus was on implementing core functionality, clean design, and real-world usability within the given time constraints ⏱️.

👨‍💻 Author

Sujeth S
🎓 Final Year Computer Science Student
💼 Backend Developer (Java & Spring Boot)

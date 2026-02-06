💻 Money Manager – Backend Application
---

## 📌 Overview
The Money Manager Backend is a RESTful web service developed using **Spring Boot** and **MongoDB**.  
It handles all business logic, data storage, and API operations required for managing income and expense transactions securely and efficiently ⚙️📊.

This backend serves as the core engine of the Money Manager application and communicates with the frontend via REST APIs.

---

## 🎯 Problem Statement
Managing financial data manually is error-prone and inefficient.  
Users need a reliable backend system to store, process, and retrieve income and expense data with accuracy and performance.

The Money Manager Backend solves this problem by providing structured APIs for transaction management and financial summaries 💡.

---

## ✨ Key Features
➕ Add income and expense transactions  
🧾 Retrieve all transactions  
📅 Filter transactions by date range  
✏️ Edit transactions within a limited time window  
📊 Generate financial summaries (income, expense, balance)  
🔐 Secure and structured data handling  

---

## 🛠️ Technology Stack
☕ Java (Spring Boot)  
🍃 MongoDB (NoSQL Database)  
🌐 RESTful APIs  
🧰 Spring Data MongoDB  

---

## 🧱 Application Architecture
The backend follows a layered architecture:

🧩 Controller Layer – Handles API requests and responses  
⚙️ Service Layer – Contains business logic  
🗄️ Repository Layer – Interacts with MongoDB  
📦 Model Layer – Defines data structures  

This separation improves scalability, maintainability, and testability 🚀.

---

## 🔄 API Functionality
The backend exposes REST APIs to:

- Create income and expense records  
- Fetch transaction history  
- Filter data by date  
- Calculate financial summaries  
- Update transactions within allowed time  

These APIs are consumed by the frontend to provide real-time financial insights ⚡.

---

## 🗄️ Database Design
MongoDB is used to store transaction records with fields such as:

- Amount  
- Type (Income / Expense)  
- Category  
- Division (Personal / Office)  
- Description  
- Date & Time  

The NoSQL design ensures flexibility and fast performance.

---

## 🧪 Testing & Validation
The backend was tested using:

- Postman for API testing  
- Validation of CRUD operations  
- Verification of summary calculations  

All endpoints were verified to ensure correct responses and data integrity.

---

## 🏆 Hackathon Context
This backend application was developed as part of a hackathon project submission 🏁.  
The objective was to design a robust and scalable backend system within a limited timeframe ⏳.

---

## 👨‍💻 Author
**Sujeth S**  
🎓 Final Year Computer Science Student  
💻 Backend Developer (Spring Boot & MongoDB)


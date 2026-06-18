# Expense Tracker API

A RESTful Expense Tracker application built using Spring Boot, Spring Data JPA, Hibernate, and MySQL.

## Features

* Add new expenses
* View all expenses
* Store data in MySQL database
* REST API architecture
* Layered architecture (Controller, Service, Repository)

## Tech Stack

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL
* Maven
* Lombok
* Postman

## Project Structure

```
src/main/java/com/mindx1/expense_tracker

├── controller
│   └── ExpenseController
│
├── service
│   └── ExpenseService
│
├── repository
│   └── ExpenseRepository
│
├── entity
│   └── Expense
│
└── ExpenseTrackerApplication
```

## Database

Database Name:

```
expense_tracker
```

Table:

```
expense
```

Columns:

* id
* title
* amount
* category
* date

## API Endpoints

# Create Expense

POST /expenses

# Get All Expenses

GET /expenses

# Get Expense By ID

GET /expenses/{id}

# Update Expense

PUT /expenses/{id}

# Delete Expense

DELETE /expenses/{id}


### Create Expense

```
POST /expenses
```

Request Body:

```json
{
  "title": "Pizza",
  "amount": 250,
  "category": "Food",
  "date": "2026-06-16"
}
```

### Get All Expenses

```
GET /expenses
```

Response:

```json
[
  {
    "id": 1,
    "title": "Pizza",
    "amount": 250.0,
    "category": "Food",
    "date": "2026-06-16"
  }
]
```

## Architecture

```
Client
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
MySQL Database
```

## Concepts Learned

* REST APIs
* CRUD Operations
* Spring Boot
* Dependency Injection
* JPA/Hibernate
* MySQL Integration
* Maven
* Layered Architecture
* JSON Serialization
* API Testing with Postman

## Future Improvements

* Get Expense By ID
* Update Expense
* Delete Expense
* Input Validation
* Exception Handling
* JWT Authentication
* User Management
* Expense Analytics

```
```

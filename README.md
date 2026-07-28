# 📚 Library Management System

A RESTful API built with **Spring Boot** for managing a library's book inventory. Supports full CRUD operations on books, with plans to expand to members and borrowing functionality.

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 3 |
| Persistence | Spring Data JPA |
| Database | H2 (in-memory) |
| Build Tool | Maven |
| API Testing | Postman |

---

## 🚀 Getting Started

### Prerequisites
- JDK 21+
- Maven 3.8+

### Run the App

```bash
git clone https://github.com/EC-Prime/Library-management-spring-boot.git
cd Library-management-spring-boot
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`.

### H2 Console

Access the in-memory database at `http://localhost:8080/h2-console`

```
JDBC URL:  jdbc:h2:mem:testdb
Username:  sa
Password:  (Contact admin)
```

---

## 📖 API Endpoints

### Books

| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/books` | Get all books |
| `GET` | `/books/{id}` | Get a book by ID |
| `POST` | `/books` | Add a new book |
| `PUT` | `/books/{id}` | Update a book |
| `DELETE` | `/books/{id}` | Delete a book |

### Example Request — Create a Book

```http
POST /books
Content-Type: application/json

{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884"
}
```

### Example Response

```json
{
  "id": 1,
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884"
}
```

---

## 📁 Project Structure

```
src/
└── main/
    └── java/
        └── com/example/library/
            ├── controller/
            │   └── BookController.java
            ├── service/
            │   └── BookService.java
            ├── repository/
            │   └── BookRepository.java
            ├── model/
            │   └── Book.java
            └── LibraryApplication.java
```

---

## 🗺️ Roadmap

- [x] Book entity & JPA setup
- [x] Full CRUD for Books
- [ ] Exception handling with `@ControllerAdvice`
- [ ] Author entity & endpoints
- [ ] Member entity & endpoints
- [ ] Borrow/return system
- [ ] Swap H2 for PostgreSQL

---

## 📝 License

This project is for personal learning and practice. Feel free to fork and build on it.

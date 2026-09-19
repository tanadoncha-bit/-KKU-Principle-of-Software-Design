# Lab7_673380585-0# Game Catalog CRUD

โปรเจกต์นี้เป็นส่วนหนึ่งของรายวิชา **CP353002 Principles of Software Design** (Lab 7: Database Connectivity)

พัฒนาโดยใช้ **Spring Boot**, **Spring Data JPA**, **Thymeleaf** และ **PostgreSQL** เพื่อสร้างระบบจัดการข้อมูลเกม (Game Catalog) รองรับการทำงานแบบ CRUD (Create, Read, Update, Delete) พร้อมประยุกต์ใช้ **Strategy Pattern** สำหรับการคำนวณราคาส่วนลดของเกม

---

## ผู้จัดทำ

* **ชื่อ:** Tanadon Chaisila
* **Student ID:** 673380585-0
* **Section:** 3

---

## Technologies

* Java 17
* Spring Boot 3
* Spring MVC
* Spring Data JPA
* Hibernate
* PostgreSQL
* Thymeleaf
* Bootstrap 5
* Maven

---

## Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.example.lab7_673380585_0_sec3
│   │       ├── controller
│   │       │     └── GameController.java
│   │       ├── model
│   │       │     └── Game.java
│   │       ├── repository
│   │       │     └── GameRepository.java
│   │       ├── service
│   │       │     └── GameService.java
│   │       ├── strategy
│   │       │     ├── DiscountStrategy.java
│   │       │     ├── NoDiscountStrategy.java
│   │       │     ├── StudentDiscountStrategy.java
│   │       │     ├── SeasonalSaleStrategy.java
│   │       │     └── DiscountContext.java
│   │       └── Lab7Application.java
│   └── resources
│       ├── templates
│       │     └── games
│       │         ├── add.html
│       │         ├── delete.html
│       │         ├── edit.html
│       │         └── list.html
│       ├── static
│       │     └── css
│       │         ├── style.css
│       └── application.properties
```

---

## Features

* แสดงรายการเกมทั้งหมด (Read)
* เพิ่มข้อมูลเกม (Create)
* แก้ไขข้อมูลเกม (Update)
* ลบข้อมูลเกม (Delete)
* คำนวณราคาสุทธิด้วย Strategy Pattern
* เชื่อมต่อฐานข้อมูล PostgreSQL ผ่าน Spring Data JPA

---

## Strategy Pattern

ระบบใช้ Strategy Pattern ในการคำนวณส่วนลด โดยแบ่งเป็น

| Strategy                | รายละเอียด |
| ----------------------- | ---------- |
| NoDiscountStrategy      | ไม่ลดราคา  |
| StudentDiscountStrategy | ลด 10%     |
| SeasonalSaleStrategy    | ลด 20%     |

DiscountContext จะเลือก Strategy ตามค่า `discountType` ของเกม และคำนวณราคาสุทธิอัตโนมัติ

---

## Database

Database : PostgreSQL

ชื่อฐานข้อมูล

```sql
lab7demo
```

ตัวอย่างการตั้งค่า

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/lab7demo
spring.datasource.username=postgres
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Running the Project

1. Clone Repository

```bash
git clone <repository-url>
```

2. เปิด PostgreSQL และสร้างฐานข้อมูล

```sql
CREATE DATABASE lab7demo;
```

3. แก้ไขไฟล์ `application.properties`

4. รันโปรเจกต์ด้วย Spring Boot

5. เปิดเว็บ

```
http://localhost:8080/games
```

---

## Screenshots

* Game List
* Add Game
* Edit Game
* Delete Game
* PostgreSQL Database

---

## Software Design Principles

โปรเจกต์นี้ประยุกต์ใช้หลักการออกแบบซอฟต์แวร์ ได้แก่

* MVC Architecture
* Layered Architecture
* GRASP Patterns
* SOLID Principles
* Strategy Pattern
* Dependency Injection (Constructor Injection)

---

## License

This project was developed for educational purposes in the course **CP353002 Principles of Software Design**.

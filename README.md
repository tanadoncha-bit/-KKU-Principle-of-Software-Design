# Lab5_673380585-0_Sec3

# Coffee Menu Service REST API

Mini Project รายวิชา **CP353002 – Principles of Software Design and Development**

## Technology
- Java 17
- Spring Boot 4.1.0
- Maven
- REST API

---

## วิธีรันโปรเจกต์

1. Clone โปรเจกต์

```bash
git clone <repository-url>
cd <project-folder>
```

2. รันโปรเจกต์

```bash
mvn spring-boot:run
```

เมื่อรันสำเร็จ เซิร์ฟเวอร์จะทำงานที่

```
http://localhost:8080
```

---

## API Endpoints (ใน Postman)

### 1. ดูเมนูกาแฟทั้งหมด

```http
GET /coffees
```

ตัวอย่าง

```bash
GET http://localhost:8080/coffees
```

---

### 2. ดูเมนูกาแฟตาม ID

```http
GET /coffees/{id}
```

ตัวอย่าง

```bash
GET http://localhost:8080/coffees/1
```

---

### 3. เพิ่มเมนูกาแฟ

```http
POST /coffees
```

ตัวอย่าง

```bash
POST http://localhost:8080/coffees
```
```bash
BODY
{
    "name":"Cappuccino",
    "price":60.0
}
```
---

### 4. แก้ไขเมนูกาแฟ

```http
PUT /coffees/{id}
```

ตัวอย่าง

```bash
PUT http://localhost:8080/coffees/2
```
```bash
BODY
{
    "name":"Latte",
    "price":50
}
```

---

### 5. ลบเมนูกาแฟ

```http
DELETE /coffees/{id}
```

ตัวอย่าง

```bash
http://localhost:8080/coffees/3
```

---

## ตัวอย่างข้อมูลเริ่มต้น

เมื่อเริ่มรันระบบ จะมีข้อมูลเริ่มต้นดังนี้

| ID | Name | Price |
|----|------|------:|
| 1 | Espresso | 45.0 |
| 2 | Latte | 55.0 |

---

### ค้นหาเมนูตามชื่อ (Bonus)

```http
GET /coffees/search?name=Latte
```

ตัวอย่าง

```bash
curl "http://localhost:8080/coffees/search?name=Latte"
```


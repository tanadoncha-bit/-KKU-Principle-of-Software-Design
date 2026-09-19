# Custom ViewResolver Demo

โปรเจกต์ตัวอย่างการใช้งาน **Custom ViewResolver** ใน Spring Boot ร่วมกับ Thymeleaf สำหรับแสดงผลหน้าเว็บโดยใช้ Logical View Name แทนการระบุ path ของไฟล์โดยตรง

## ผู้จัดทำ

- ชื่อ: ธนดล ไชยศิลา
- รหัสนักศึกษา: 673380585-0

## เทคโนโลยีที่ใช้

- Java
- Spring Boot
- Spring MVC
- Thymeleaf
- Maven

## โครงสร้างโปรเจกต์

```
src
├── main
│   ├── java
│   │   └── com.example.demo
│   │       ├── DemoApplication.java
│   │       ├── config
│   │       │   └── ThymeleafConfig.java
│   │       └── controller
│   │           └── HomeController.java
│   └── resources
│       ├── application.properties
│       └── my-templates
│           ├── home.html
│           └── about.html
```

## การทำงาน

1. Browser ส่ง Request ไปยัง Spring Boot
2. DispatcherServlet รับ Request
3. Controller ประมวลผลและส่งกลับชื่อ View เช่น `home`
4. ViewResolver แปลงชื่อ View เป็นไฟล์ HTML
5. Thymeleaf แสดงผลและส่ง HTML กลับไปยัง Browser

## URL

| URL | รายละเอียด |
|-----|-------------|
| `/` | หน้าแรก แสดงชื่อและรหัสนักศึกษา |
| `/about` | หน้าแนะนำตัว |

## การรันโปรเจกต์

1. Clone โปรเจกต์

```bash
git clone <repository-url>
```

2. เข้าโฟลเดอร์โปรเจกต์

```bash
cd demo
```

3. รันโปรแกรม

```bash
mvn spring-boot:run
```

4. เปิดเว็บ

```
http://localhost:9090/
```

หรือ

```
http://localhost:9090/about
```

## คุณสมบัติ

- ใช้ Custom Thymeleaf ViewResolver
- แยก Controller และ View ตามหลัก MVC
- รองรับหลายหน้า (Home และ About)
- สามารถเปลี่ยนตำแหน่ง Template ได้จาก `ThymeleafConfig`

## ตัวอย่างผลลัพธ์

หน้าแรก

```
สวัสดี ธนดล ไชยศิลา (673380585-0)
```

หน้า About

```
About Me

ชื่อ : ธนดล ไชยศิลา
รหัสนักศึกษา : 673380585-0
กำลังศึกษาสาขาวิทยาการคอมพิวเตอร์
มหาวิทยาลัยขอนแก่น
```

## ผู้พัฒนา

ธนดล ไชยศิลา  
สาขาวิทยาการคอมพิวเตอร์  
วิทยาลัยการคอมพิวเตอร์ มหาวิทยาลัยขอนแก่น
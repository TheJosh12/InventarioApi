# 📦 API de Gestión de Inventario

API REST construida con **Spring Boot**, diseñada para gestionar productos dentro de un sistema de inventario. Permite registrar productos, así como entradas (aumentar stock) y salidas (disminuir stock).

---

## ⚙️ Tecnologías

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- Base de datos: MySQL (puede adaptarse a otras como H2 o PostgreSQL)

---

## 📁 Estructura del proyecto

src/
├── controller/ # Controladores REST
├── model/ # Entidades JPA
├── repository/ # Interfaces de acceso a datos
├── service/ # Lógica de negocio
└── InventarioApplication.java # Clase principal

yaml
Copiar
Editar

---

## 🚀 Cómo ejecutar el proyecto

1. Clona el repositorio:

```bash
git clone https://github.com/tu-usuario/api-inventario.git
cd api-inventario
Abre el proyecto con tu IDE (IntelliJ, Eclipse, VSCode, etc.)

Configura tu base de datos en el archivo src/main/resources/application.properties.
Ejemplo para MySQL:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/almacendb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=TU_CONTRASEÑA
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
⚠️ Importante: Por seguridad, no subas tu archivo application.properties con contraseñas reales a GitHub.
Puedes agregarlo a .gitignore o usar variables de entorno para manejar las credenciales.

Ejecuta la aplicación:

bash
Copiar
Editar
./mvnw spring-boot:run
📌 Endpoints disponibles
Método	Ruta	Descripción
GET	/api/productos	Listar todos los productos
POST	/api/productos	Crear un nuevo producto
GET	/api/productos/{id}	Obtener un producto por ID
DELETE	/api/productos/{id}	Eliminar un producto
POST	/api/entradas	Registrar entrada de stock
POST	/api/salidas	Registrar salida de stock

📦 Ejemplo de producto (JSON)
json
Copiar
Editar
{
  "nombre": "Teclado",
  "precio": 350,
  "imgUrl": "https://ejemplo.com/teclado.jpg",
  "categoria": "Accesorios",
  "codigo": 123456,
  "stock": 15
}
✍️ Autor
Gustavo Josuhar Herminio Vázquez

herminiovazquezgustavojosuhar@gmail.com
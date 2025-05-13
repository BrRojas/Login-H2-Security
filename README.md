# Login-H2-Security

Aplicación backend simple con autenticación por formulario utilizando **Spring Boot**, **Spring Security**, **JPA**, **H2** y **Lombok**.  
Ideal como base para proyectos más avanzados de autenticación en Java.

---

## 🚀 Tecnologías

| Tecnología       | Descripción                                 |
|------------------|---------------------------------------------|
| ☕ Java 17        | Lenguaje principal                          |
| 🌱 Spring Boot    | Framework para desarrollo ágil              |
| 🛡️ Spring Security | Autenticación y autorización               |
| 🧬 Spring Data JPA | ORM con Hibernate                          |
| 🧪 H2 Database    | Base de datos en memoria para testing       |
| 🔧 Lombok         | Reducción de código repetitivo              |

---

## 📂 Estructura del Proyecto

```bash
src
└── main
    ├── java
    │   └── com.brian.login
    │       ├── config        # Configuración de seguridad
    │       ├── controller    # Controlador de autenticación
    │       ├── model         # Entidades y DTOs
    │       ├── repository    # Interfaces JPA
    │       └── service       # Lógica de negocio
    └── resources
        ├── application.properties
        └── static / templates (si aplica)
⚙️ Configuración del Proyecto
Clonar el repositorio:

bash
Copiar
Editar
git clone https://github.com/BrRojas/Login-H2-Security.git
cd Login-H2-Security
Ejecutar la aplicación:

bash
Copiar
Editar
mvn spring-boot:run
Acceder a la app en el navegador:

arduino
Copiar
Editar
http://localhost:8080
🧪 Consola H2
Accedé a la consola en:

bash
Copiar
Editar
http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

Usuario: sa

Contraseña: (vacía)

🛠️ Funcionalidades
Registro de usuarios (dependiendo configuración)

Login mediante formulario

Roles básicos gestionados con Enum

Seguridad con configuración manual en SecurityConfig

Base de datos en memoria con H2

🧩 Gestión de Issues
Este proyecto incluye un sistema de Issues para registrar:

🔧 Bugs encontrados

💡 Ideas de mejora

📌 Funcionalidades a implementar
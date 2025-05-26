# 🎓 Sistema de Gestión Académica

Este proyecto es una aplicación de consola escrita en **Java** que permite gestionar **alumnos** y **cursos** en una institución educativa. Implementa operaciones CRUD completas, persistencia en base de datos MySQL y manejo robusto de excepciones y conexión.

---

## 📌 Tabla de Contenidos

- [Características](#-características)
- [Tecnologías](#-tecnologías)
- [Requisitos](#-requisitos)
- [Instalación](#-instalación)
- [Uso](#-uso)
- [Estructura del Proyecto](#-estructura-del-proyecto)
- [Autores](#-autores)
- [Licencia](#-licencia)
- [Mejoras Futuras](#-mejoras-futuras)
- [Notas Adicionales](#-notas-adicionales)

---

## 🚀 Características

- Alta, baja, modificación y consulta de alumnos.
- Alta y consulta de cursos.
- Búsqueda de alumno por ID.
- Listado de alumnos por curso.
- Validaciones de entrada y manejo de errores.
- Conexión con base de datos MySQL.
- Patrón DAO para separación de lógica de acceso a datos.

---

## 🛠️ Tecnologías

- **Lenguaje**: Java 17+
- **Base de datos**: MySQL
- **JDBC**: para conexión con la base de datos
- **Log4j2**: para logging de eventos y errores
- **IDE sugerido**: IntelliJ IDEA, Eclipse, NetBeans
- **Gradle**: Para gestión de dependencias

---

## 🔧 Requisitos

Antes de ejecutar este proyecto, necesitás tener instalado:

- Java JDK 17 o superior
- MySQL Server (recomendado: versión 8)
- Un IDE para Java
- Biblioteca Log4j2
- Driver de MySQL (`mysql-connector-j`)

---

## ⚙️ Instalación

1. **Cloná el repositorio o descargá el proyecto:**

   ```bash
   git clone https://github.com/tu_usuario/sistema-gestion-academica.git
   ```

2. **Configurá la base de datos MySQL.**  
   Ejecutá lo siguiente en tu consola MySQL:

   ```sql
   CREATE DATABASE escuela;
   USE escuela;

   CREATE TABLE curso (
     id INT AUTO_INCREMENT PRIMARY KEY,
     materia VARCHAR(100) NOT NULL
   );

   CREATE TABLE alumno (
     id INT AUTO_INCREMENT PRIMARY KEY,
     nombre VARCHAR(100) NOT NULL,
     apellido VARCHAR(100) NOT NULL,
     curso INT,
     promedio DOUBLE,
     FOREIGN KEY (curso) REFERENCES curso(id)
   );
   ```

3. **Configurá `DatabaseUtil.java`**  
   Asegurate de que los datos de conexión coincidan con tu entorno:

   ```java
   private static final String URL = "jdbc:mysql://localhost:3306/escuela?useSSL=false&serverTimezone=UTC";
   private static final String USER = "root";
   private static final String PASS = "";
   ```

4. **Agregá el conector MySQL y Log4j2 al classpath**  
   (O configurá Gradle con las dependencias si lo usás).

---

## ▶️ Uso

Ejecutá `Main.java` desde tu IDE o terminal y seguí las instrucciones del menú:

```text
=== MENU PRINCIPAL ===
1. Crear curso
2. Crear alumno
3. Listar cursos
4. Listar alumnos
...
```

Los datos se guardan y consultan directamente desde la base de datos.

---

## 📁 Estructura del Proyecto

```plaintext
├── Dao
│   └── GenericDAO.java
├── DaoImpl
│   ├── AlumnoDAOImpl.java
│   ├── CursoDAOImpl.java
│   ├── DAOException.java
│   └── GenericDAOImpl.java
├── Modelo
│   ├── Alumno.java
│   └── Curso.java
├── Utils
│   └── DatabaseUtil.java
├── org.example
│   └── Main.java
```

---

## 👤 Autores

- **Juani Sarmiento** – [@JuaniSarmiento](https://github.com/JuaniSarmiento)

---


## 🔮 Mejoras Futuras

- Interfaz gráfica (GUI) con JavaFX o Swing
- Paginación de resultados
- Búsqueda avanzada
- Exportar a PDF o Excel
- Validación con JSR 380 (Bean Validation)
- Migración a Spring Boot con JPA

---

## 🧩 Notas Adicionales

Este proyecto fue desarrollado con fines educativos.  
Cualquier contribución o mejora es más que bienvenida.

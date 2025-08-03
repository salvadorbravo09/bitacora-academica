# Imagen base: Eclipse Temurin JDK 21
FROM eclipse-temurin:21

# Metadatos: Etiqueta que identifica al autor del contenedor
LABEL author=AlejandroBravo

# Variables de entorno para configuracion de base de datos
# Docker resuelve automaticamente este nombre al IP del contenedor MySQL
ENV DATABASE_URL jdbc:mysql://mysqldb:3306/db_bitacora_academica

# Credenciales de MySQL (deben coincidir con las del contenedor MySQL)
ENV DATABASE_USERNAME root
ENV DATABASE_PASSWORD password

# Configuracion especifica de Hibernate para MYSQL 8
ENV DATABASE_PLATFORM org.hibernate.dialect.MySQL8Dialect

# Driver JDBC de MYSQL (requerido para la conexion)
ENV DATABASE_DRIVER com.mysql.cj.jdbc.Driver

# Copia el JAR compilado desde el directorio local target/ al contenedor
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar

# Comando que se ejecuta al iniciar el contenedor
# Ejecuta la aplicacion Spring Boot usando Java
ENTRYPOINT ["java", "-jar", "app.jar"]
# Etapa 1: Construcción de la aplicación con Maven
FROM maven:3.9.5-eclipse-temurin-21 AS build

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo de dependencias de Maven
COPY pom.xml .

# Descarga las dependencias de Maven
RUN mvn dependency:go-offline -B

# Copia todo el código fuente del proyecto
COPY src ./src

# Compila la aplicación y empaqueta el JAR ejecutable
RUN mvn clean package -DskipTests

# Etapa 2: Crear la imagen final
FROM eclipse-temurin:21-jdk

# Directorio donde se ejecutará la aplicación
WORKDIR /app

# Copiar el JAR generado desde la etapa de construcción
COPY --from=build /app/target/*.jar app.jar

# Puerto donde escuchará la aplicación (cambia este valor si tu aplicación escucha en otro puerto)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
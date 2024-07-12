📚 LiterAlura - Catálogo de Libros Interactivo 📚
Descripción del Proyecto
LiterAlura es un emocionante desafío de programación que desarrollé para construir un catálogo interactivo de libros. Este proyecto implica la realización de solicitudes a una API de libros, la manipulación de datos JSON, su almacenamiento en una base de datos y la presentación de información relevante a los usuarios mediante una interfaz de consola.

Las principales funcionalidades incluyen la búsqueda de libros por título, la visualización de listas de libros y autores, y la generación de estadísticas sobre los libros almacenados.

Funcionalidades
🔍 Buscar libro por título:
Permite a los usuarios buscar un libro ingresando su título. La aplicación realiza una solicitud a la API de Gutendex y almacena el primer resultado en la base de datos.

📚 Lista de libros registrados:
Muestra todos los libros que han sido buscados y registrados en la base de datos.

👩‍💼 Lista de autores registrados:
Presenta una lista de todos los autores de los libros que han sido registrados en la base de datos.

📅 Lista de autores vivos en determinado año:
Permite buscar autores que estaban vivos en un año específico, basado en sus fechas de nacimiento y fallecimiento.

🌐 Lista de libros por idioma:
Muestra libros registrados en la base de datos, filtrados por idioma.

🏆 Top 5 libros más descargados:
Presenta los cinco libros con mayor número de descargas registrados en la base de datos.

🖋️ Listado de libros por autor:
Muestra todos los libros registrados que fueron escritos por un autor específico.

Capturas de Pantalla
Menú Principal
![menu_library](https://github.com/user-attachments/assets/e16423b9-5ea4-4033-80f2-ac63f9763fe2)

Buscar Libro por Título
![menu_library_buscar](https://github.com/user-attachments/assets/27c4f611-0ca5-4da3-abd0-95ccb436c814)

Lista de Libros Registrados
![menu_library_libros_registrados](https://github.com/user-attachments/assets/8834b8b4-1270-41b1-a2e3-2afb112f40ed)

Lista de Autores Registrados
![menu_library_autores_registrados](https://github.com/user-attachments/assets/3f82a001-e110-45f9-a86c-f2e8f9dd88f9)

Lista de Autores Vivos en Determinado Año
![menu_library_vivos](https://github.com/user-attachments/assets/f32e5639-9600-49ec-a1d2-45736bc28c2b)

Lista de Libros por Idioma
![menu_library_idiomas](https://github.com/user-attachments/assets/b67a0eba-f43d-4f17-86eb-bed37f732129)

Top 5 Libros Más Descargados
![menu_library_top](https://github.com/user-attachments/assets/1788725c-9c67-45e4-8517-0f99e91cd739)

Listado de Libros por Autor
![menu_library_ultimate](https://github.com/user-attachments/assets/a0df341b-0d30-46c7-9c62-8b1733ac532d)

Configuración del Proyecto
Configuración del Ambiente Java:
Asegúrate de tener Java 11 o superior instalado en tu sistema.

Creación del Proyecto:
Clona el repositorio y abre el proyecto en tu IDE favorito (IntelliJ, Eclipse, etc.).

Consumo de la API:
Utiliza la URL base https://gutendex.com/books/ para realizar solicitudes a la API de libros.

Análisis de la Respuesta JSON:
Procesa los datos JSON obtenidos de la API para extraer información relevante sobre los libros y autores.

Inserción y Consulta en la Base de Datos:
Almacena los datos obtenidos en una base de datos PostgreSQL y realiza consultas para presentar la información a los usuarios.

Exhibición de Resultados:
Utiliza una interfaz de consola para interactuar con los usuarios y mostrar los resultados de las consultas.

Ejecución del Proyecto
Configurar Base de Datos:
Crea una base de datos PostgreSQL y actualiza las siguientes variables en application.properties con tus credenciales y nombre de base de datos:

properties
spring.datasource.url=jdbc:postgresql://${DB_HOST}/${DB_NAME}
spring.datasource.username=${DB_USER}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=org.postgresql.Driver
hibernate.dialect=org.hibernate.dialect.HSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.format-sql=true
Compilar y Ejecutar:
Ejecuta el proyecto desde tu IDE o utilizando la línea de comandos:

sh
./gradlew bootRun
Interacción con la Consola:
Utiliza la interfaz de consola para interactuar con la aplicación, seleccionando las opciones del menú principal para buscar libros, listar autores, obtener estadísticas, entre otros.

# Second Oracle ONE Program's project

## Description

This project is a program that utilizes the ExchangeRate-API along with the Gson library to carry out currency value conversions. The flow begins with prompting the user to choose the desired conversion type and then input the amount to convert. Subsequently, the program returns the response to the user and offers the option to perform further conversions if desired.
For the program structure, the Model View Controller (MVC) design pattern has been applied. This approach ensures clean, maintainable, and scalable code by dividing the application into three main components: the model, responsible for managing communication with the API and utilizing the Gson library; the view, responsible for presenting information to the user; and the controller, acting as an intermediary between the model and the view, handling user interactions and updating the model as necessary.
This layered organization facilitates separation of concerns and promotes a modular structure, simplifying maintenance and expansion of the program in the future. By leveraging the functionality provided by the ExchangeRate-API and the data serialization and deserialization capabilities of Gson, the program offers accurate and efficient conversions reliably.

## Structure

### Entry Point
- ./src/Main.java: Program's entry point.

### Model
- ./src/RecibirRespuestas.java: Class responsible for receiving and storing user input data.

- ./src/ManejadorRespuestaAPIr.java: Class responsible for establishing connection with ExchangeRate-API and handling its response.

- ./src/ManejadorGson.java: Class responsible for using the Gson library.

- ./src/Conversor.java: Template class for converting the Json object with the help of the Gson library.

### View
- ./src/Vista.java: Class containing all the outputs that the user will see in the console.

### Controller
- ./src/Controlador.java: Class managing the connection between the program's view and model.

* * *

# Proyecto 02 del programa Oracle ONE

## Descripción

Este proyecto se trata de un programa que utiliza la API ExchangeRate-API junto con la biblioteca Gson para llevar a cabo conversiones de valores de monedas. El flujo comienza con la solicitud al usuario para que elija el tipo de conversión deseada y luego introduzca la cantidad a convertir. Posteriormente, el programa devuelve la respuesta al usuario y le ofrece la opción de realizar más conversiones si así lo desea.
Para la estructura del programa, se ha aplicado el patrón de diseño Modelo Vista Controlador (MVC). Este enfoque garantiza un código limpio, mantenible y escalable al dividir la aplicación en tres componentes principales: el modelo, responsable de gestionar la comunicación con la API y el uso de la biblioteca Gson; la vista, encargada de presentar la información al usuario; y el controlador, que actúa como intermediario entre el modelo y la vista, gestionando las interacciones del usuario y actualizando el modelo según sea necesario.
Esta organización en capas facilita la separación de responsabilidades y promueve una estructura modular, lo que simplifica el mantenimiento y la ampliación del programa en el futuro. Al aprovechar la funcionalidad proporcionada por la API ExchangeRate-API y la capacidad de serialización y deserialización de datos de Gson, el programa ofrece conversiones precisas y eficientes de manera confiable.

## Estructura
- ./src/Main.java: Punto de entrada del programa.

### Modelo
- ./src/RecibirRespuestas.java: Clase que se encarga de recibir y almacenar los datos ingresados por el usuario.

- ./src/ManejadorRespuestaAPI.java: Clase que se encarga de llevar a cabo la conexión con ExchangeRate-API y de manejar la respuesta de la misma.

- ./src/ManejadorGson.java: Clase que se encarga de usar la biblioteca Gson.

- ./src/Conversor.java: Clase plantilla a la que se convertirá el objeto Json con ayuda de la bibliote Gson.

### Vista
- ./src/Vista.java: Clase que contiene todos los outputs que el usuario verá en la consola.

### Controlador
- ./src/Controlador.java: Clase que maneja la conexión entre la vista y el modelo del programa.

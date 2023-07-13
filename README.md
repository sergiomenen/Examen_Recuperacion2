# Examen_Recuperacion2

Descripción de Uso del Sistema de Gestión de Biblioteca

El Sistema de Gestión de Biblioteca es una plataforma en línea que permite administrar una librería. A continuación, se describen las principales funcionalidades y casos de uso del sistema:

1. Alta/Baja de un producto:
   - Para dar de alta un producto (libro o juego de mesa), se debe proporcionar la información relevante, como título, autor, identificador, precio, categoría (en el caso de los libros), edad recomendada (en el caso de los juegos de mesa), entre otros. Esta función permite expandir el catálogo de productos de la librería.
   - Para dar de baja un producto, se debe identificar el producto específico y eliminarlo del inventario.

2. Alta/Baja de un usuario:
   - Para dar de alta un usuario, se deben proporcionar los datos personales, como nombre, apellidos, fecha de nacimiento, DNI y la información de la tarjeta de crédito para el pago.
   - Para dar de baja un usuario, se debe identificar al usuario específico y eliminarlo del sistema.

3. Comprar/Devolver un producto:
   - Para comprar un producto, el usuario debe seleccionar el producto deseado y realizar la transacción de pago utilizando la información de su tarjeta de crédito. Una vez completada la compra, el producto se registra como vendido en el sistema.
   - Para devolver un producto, se debe identificar el producto y el usuario que lo compró recientemente (dentro de las últimas 2 semanas). La devolución implica la anulación de la venta y la devolución del importe al usuario.

4. Listar productos por título y vendidos:
   - Esta función permite obtener una lista de productos ordenados por título y diferenciados si son libros o juegos de mesa. Esto facilita la búsqueda y navegación del catálogo de productos.
   - También es posible obtener una lista de los productos vendidos, lo que proporciona información sobre los productos más populares y solicitados.

5. Informes de ventas:
   - El sistema permite obtener informes de ventas basados en criterios como el mes y el año.
   - Los informes incluyen el dinero ingresado procedente de las ventas de libros y juegos en un mes/año determinado, la cantidad de libros y juegos de mesa vendidos en ese período, y los rankings de títulos más vendidos para libros y juegos de mesa.
   - Además, es posible obtener un listado de los 5 clientes con más compras en un mes determinado.

Estas son solo algunas de las funcionalidades principales del Sistema de Gestión de Biblioteca. Recuerda que el sistema utiliza archivos para almacenar el inventario de la tienda y la información de los clientes, lo que facilita la persistencia de los datos.

¡Disfruta de tu experiencia de administrar una biblioteca en línea con esta plataforma!

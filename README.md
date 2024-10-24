# futsal-back


levantar proyecto para debugar front:

 - levantar el proyecto con el comando `docker-compose up -d --build` estando en la carpeta ./docker
 - todo se sirve en el puerto 80 cambiar el puerto en el archivo docker/docker-compose.yml si se desea cambiar el puerto
 - si se quiere levantar con el front ya compilado, se debe borrar todo lo que existe en src/main/resources/static y pegar lo que se encuentra en la carpeta dist del front
 - los endpoints que existen hasta ahora son:

 -  POST: /notificar/cambio para notificar acciones(no solo cambios), se espera que se mande:
{
   dorsal,
   dorsalEntrada,
   accion,
   tiempo,
   userId,
   }
 - GET: /jugadores: da jugadores
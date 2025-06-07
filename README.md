# examenfinalPIII19988
# Proyecto Quarkus - 

Alumno: Eddin Fernando Nij  
Carné: 65902319988

En este proyecto con Quarkus se creó la entidad **Person** con su API básica y se refactorizó el código para aplicar el principio de responsabilidad única, usando interfaces y separando la lógica de mapeo entre `Person` y `PersonDto` en una clase aparte.

Después se creó la entidad **Address** con un CRUD básico (crear y listar), y se implementó la relación de que una persona puede tener varias direcciones. También se agregó la funcionalidad para que desde el API de Person se puedan consultar las direcciones que tiene una persona.

Todo el proyecto se organizó en capas: recursos para los endpoints, servicios para la lógica, repositorios para la base de datos, y mappers para convertir los DTOs. Se probaron los endpoints con Postman para asegurar que todo funcione bien.

Este proyecto se hizo sin tocar la base de datos original del proyecto que ya tenía, y sin preocuparse aún por tests o seguridad, que quedan para etapas futuras.

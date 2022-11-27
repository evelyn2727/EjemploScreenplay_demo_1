# language: es

Característica:  Formulario demoqa
Como usuario,
Yo deseo registrar datos en formulario

  Antecedentes:
    Dado Yo Arturo voy a la pagina de Demoqa

  @Escenariosinejemplo
  Escenario:  Acceder a la página de Demoqa
  Cuando Yo ingreso los datos del formulario
  |firstname|lastname |userEmail|userNumber|gender|
  |SONIA|PEREZ UGARTE  |elizarraga@gmail.com|1234567890|Female|
  |PEPE|SUAREZ UGARTE  |PEPESUAREZ@gmail.com|0123456789|Male  |
  Entonces Yo deberia visualizar la página de conformidad

    @Escenarioconejemplo
    Esquema del escenario:  Acceder a la página de Demoqa con esquema
    Cuando Yo ingreso los datos del formulario
      |<firstname>|<lastname> |<userEmail>|<userNumber>|<gender>|
    Entonces Yo deberia visualizar la página de conformidad

    Ejemplos:
      |firstname|lastname |userEmail|userNumber|gender|
      |SONIA|PEREZ UGARTE  |elizarraga@gmail.com|1234567890|Female|
      |PEPE|SUAREZ UGARTE  |PEPESUAREZ@gmail.com|0123456789|Male  |
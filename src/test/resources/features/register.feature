# language: es

  Característica: Registro


    Escenario: Registro válido
      Dado que el usuario ingresa a la página de registro
      Cuando el usuario se registra con datos válidas
      Entonces el usuario se encuentra registrado

    @FAV-123
    Escenario: Registro inválido
      Dado que el usuario ingresa a la página de registro
      Cuando el usuario se registra con datos inválidas
      Entonces se muestra un mensaje de error de registro
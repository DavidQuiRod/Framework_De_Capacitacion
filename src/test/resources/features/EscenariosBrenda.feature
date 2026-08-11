Feature: Escenarios creados por Brenda

  # Comentarios

    #Generar los pasos necesarios para llegar a ese apartado
    # 1. Que funcione el escenario - X
    # 2. Reutilización de código y funciones que existen dentro del framework - X
    # 3. Una evidencia limpia - X
    # 4. Congruencia en el escenario - X
    @Ejercicio
  Scenario: Ingresar al apartado Leave
      Given El usuario abre la pagina "urlBrenda" en el navegador
      And El usuario ingresa el Username "Admin"
      And El usuario ingresa el Password "admin123"
      When El usuario espera 2 segundos
      Then Hacer clic en el boton Login
      When El usuario espera 5 segundos
      And El usuario da clic en la opcion Leave
      When El usuario espera 2 segundos
      Then finaliza el test "Ejercicio" y se cierra navegador
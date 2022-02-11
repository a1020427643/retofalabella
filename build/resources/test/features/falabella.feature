#Autor: Eric Espinosa


  @stories
  Feature: falabella
    As a user, I want to buy a article on falabella page for a gift

  @scenario
  Scenario: Buy article
    Given that 'Eric' wants visit the falabella page
    When he search the article "guitarra yamaha" on falabella page
    And he fill the form
    |departamento|ANTIOQUIA|
    |ciudad|BELLO|
    |barrio|BELLO|
    |direccion|avenida 39a 62 42|
    |detalle|segundo piso|
    Then he find the tittle called "Elige tu medio de pago"
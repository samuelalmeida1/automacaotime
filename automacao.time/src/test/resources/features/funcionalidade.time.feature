#Author: samucabatera.3@gmail.com


@regressivo
Feature: Realizar Login
 Como usuario do site Sauce Demo
 Quero saber o time dos funcionarios
 Para acessar os quadros de horarios
 
Background: Acessar tela login
Given que esteja na tela de login


@teste
Scenario: Login Valido
When coloco os dados de login
And clico no botão login
Then o login sera realizado com sucesso 






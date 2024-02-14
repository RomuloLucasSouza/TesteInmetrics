Feature: Automacao de testes Inmetrics
Eu como usuario quero acessar o site para realizar uma busca, incluir produto no carrinho e validar no carrinho.
   
Scenario: Busca de produto e valida no check-out
	Given que esteja no site para automatizar
	And realizo o login
	When clicar em produtos
	And realizar a busca por Tshirt
	Then adiciono o primeiro item no carrinho
	And valido esse item na pagina de check-out

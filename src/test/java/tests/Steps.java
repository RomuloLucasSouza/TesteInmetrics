package tests;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.Elementos;
import pages.Metodos;
import runner.Executa;

public class Steps {
	WebDriver driver;
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}
	
	@After
	public void encerrarTeste() {
		Executa.fecharNavegador();
	}
	
	@Given("^que esteja no site para automatizar$")
	public void que_esteja_no_site_para_automatizar() throws Throwable {
		//Iframe.fecharIframe(driver);
	}
	
	@Given("^realizo o login$")
	public void realizo_o_login() throws Throwable {
		metodos.escrever(el.inputEmail, "teste2021@teste.com.br");
		metodos.escrever(el.inputSenha, "teste");
		metodos.clicar(el.submit);
	}
	
	@When("^clicar em produtos$")
	public void clicar_em_produtos() throws Throwable {
		metodos.clicar(el.btnProdutos);
	}

	@When("^realizar a busca por Tshirt$")
	public void realizar_a_busca_por_Tshirt() throws Throwable {
		//metodos.scroll(0, 400);
		metodos.escrever(el.source, "T-shirt");
		metodos.clicar(el.submitSource);
	}
	
	@Then("^adiciono o primeiro item no carrinho$")
	public void adiciono_o_primeiro_item_no_carrinho() throws Throwable {
		metodos.scroll(0, 400);
		/*metodos.clicar(el.addCart);
		metodos.clicar(el.viewCart);*/
		metodos.clicar(el.viewProduct);
		metodos.clicar(el.btnAddCart);
		metodos.clicar(el.viewCart);
	}

	@Then("^valido esse item na pagina de check-out$")
	public void valido_esse_item_na_pagina_de_check_out() throws Throwable {
		metodos.clicar(el.proceedCheckout);
		metodos.scroll(0, 400);
		metodos.evidencia("ProdutoAdicionado");

	}

}

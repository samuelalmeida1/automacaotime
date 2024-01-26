package steps;

import elemento.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodo.Metodos;
import runner.Executa;


public class funcionalidadeTimeTeste {
	
	
	Elementos elementos = new Elementos();
	Metodos metodos = new Metodos();
	
	

	 //Login
	@Given("que esteja na tela de login")
	public void que_esteja_na_tela_de_login() {
	  Executa.abrirNavegador();
	}

	@When("coloco os dados de login")
	public void coloco_os_dados_de_login() {
	   metodos.escrever(elementos.getUsername(), "standard_user");
	   metodos.escrever(elementos.getPassword(), "secret_sauce");
	}
 
	@When("clico no botão login")
	public void clico_no_botão_login() {
	    metodos.clicar(elementos.getLogin());
	}

	@Then("o login sera realizado com sucesso")
	public void o_login_sera_realizado_com_sucesso() {
	    
	}
	
	
}
//////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


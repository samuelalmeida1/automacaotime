package metodo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import driver.Driver;
 
public class Metodos extends Driver {
	
	String TituloEsperado = "Time/Timesheets";
	
	 
   public void escrever(By elemento, String texto) {
	   
	   driver.findElement(elemento).sendKeys(texto);
	   
   }
	
   public void clicar(By elemento) {
	   
	   driver.findElement(elemento).click();
   }

	public void validarTitulotime(By elemento, String tituloEsperado) {
		assertEquals(tituloEsperado, driver.findElement(elemento).getText());
		
		
	}
   
}
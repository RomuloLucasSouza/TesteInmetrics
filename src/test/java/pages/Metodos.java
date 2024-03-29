package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import conexoes.DriversFactory;

public class Metodos extends DriversFactory {

public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	
public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
public void scroll(int n1, int n2) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");
}
public void evidencia(String nomeEvidencia) {

	TakesScreenshot scrShot = (TakesScreenshot) driver;

	File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

	File destFile = new File("./evidencias/" + nomeEvidencia + ".png");

	try {
		FileUtils.copyFile(srcFile, destFile);
	} catch (IOException e) {
		System.out.println("Erro ao tirar evidÍncia");
		e.printStackTrace();
	}

}
}

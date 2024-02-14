package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By inputEmail = By.xpath("//input[@name='email']");
	public By inputSenha = By.xpath("//input[@name='password']");
	public By submit = By.xpath("//button[contains(.,'Login')]");
	public By btnProdutos = By.xpath("//a[contains(@href, '/products')]");
	public By source = By.xpath("//input[@id='search_product']");
	public By submitSource = By.xpath("//button[@id='submit_search']");
	public By addCart = By.xpath("(//a[contains(text(),'Add to cart')])[2]");
	public By viewCart = By.xpath("//u[contains(.,'View Cart')]");
	public By proceedCheckout = By.xpath("//a[contains(.,'Proceed To Checkout')]");
	public By viewProduct = By.xpath("//a[contains(text(),'View Product')]");
	public By btnAddCart = By.xpath("//button[@type='button']");
	public By iframe = By.xpath("//iframe[@id='aswift_1']");
	public By DismissBtn = By.xpath("//iframe[@id='dismiss-button']");
	
	
	

}

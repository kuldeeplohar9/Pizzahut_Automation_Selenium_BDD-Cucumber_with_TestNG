package com.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef_Pizzahut

{
	public static WebDriver driver;

	String url = "https://www.swiggy.com/";

	@Given("User launch Pizzahut application with url")
	public void User_launch() {

		System.out.println("User launch Pizzahut application with url");
		driver = WebDriverManager.chromedriver().create();

		driver.manage().window().maximize();
		driver.get(url);
	}

	@When("User wait for auto location black pop up screen")
	public void User_wait() throws InterruptedException {

		Thread.sleep(4000);
		System.out.println("User wait for auto location black pop up screen");
	}

	@Then("User close the pop up screen")
	public void User_close() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("User close the pop up screen");
	}

	@And("User Click on Search Button")
	public void User_see() {

		driver.findElement(By.xpath(
				"//div[@class='global-nav']/child::div[1]/child::ul[1]/child::li[5]/child::div[1]/child::a[1]/child::span[2]"))
				.click();
		System.out.println("User Click on Search Button");
	}

	@Then("User type Pizza")
	public void User_type() throws InterruptedException {
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pizza");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Dish']")).click();
		System.out.println("User type Pizza");
	}

	@And("User select the pizza")
	public void User_select() throws InterruptedException {
		Thread.sleep(7000);
		WebElement pizza = driver.findElement(By.xpath("//h3[text()='BM Paneer & Onion Pizza']"));
		pizza.click();
		String actualpizaname = "BM Paneer & Onion Pizza";

		if (actualpizaname.equals(pizza)) {
			System.out.println("User selected Correct Pizaa");

		}

		System.out.println("User select the pizza");

	}

	@When("User check Cheese Pizza on page")
	public void User_check_Cheese() {

		System.out.println("User check Cheese Pizza on page");

	}

	@Then("User click on add button")
	public void User_click_on_add() {

		driver.findElement(By.xpath(
				"//h3[text()='BM Paneer & Onion Pizza']/parent::div[1]/parent::div[1]/following-sibling::div[1]/child::div[1]/following-sibling::div[1]/child::div[1]/child::div[1]"))
				.click();

		System.out.println("User click on add button");
	}

	@And("User clicks on Pizza Base option")
	public void User_clicks() {
		driver.findElement(By.xpath("//span[text()='BM Paneer & Onion 7\" Pan Crust']")).click();
		System.out.println("User clicks on Pizza Base option");
	}

	@Then("User Select add item button")
	public void User_Select_add() {

		driver.findElement(By.xpath("//div[@id='modal-placeholder']/descendant::div[5]/child::div[3]/child::div[2]"))
				.click();
		System.out.println("User Select add item button");
	}

	@And("User Click on Cart button")
	public void User_Click_on_Cart_button() throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(4000);
		System.out.println("User Click on Cart button");
	}

	@Then("User validate checkout button contains Item count")
	public void User_validate_checkout() {
		WebElement Itemcount = driver.findElement(By.xpath(
				"//div[text()='BM Paneer & Onion Pizza']/parent::div[1]/following-sibling::div[1]/descendant::div[7]"));

		int ActualItemCount = 1;

		if (Itemcount.equals(ActualItemCount)) {
			System.out.println("one item recevied");

		}

		System.out.println("User validate checkout button contains Item count");
	}

	@And("User validate checkout button contains total price count")
	public void User_validate_checkout_button() {
		WebElement TotalValue = driver.findElement(By.xpath("//div[@class='ZBf6d']/child::div[2]"));

		System.out.println(TotalValue.getText());
		System.out.println("User validate checkout button contains total price count");
	}

	@Then("Check Delivery Fee")

	public void Check_Delivery_Fee() {

		System.out.println("Check Delivery Fee");
	}

	@And("Check Delivery Fee is less than 100 or not")
	public void check_Check_Delivery() {

		WebElement Delivery_Fee = driver.findElement(By.xpath(
				"//div[starts-with(text(),'Delivery Fee')]/ancestor::div[1]/following-sibling::div[1]/child::span[1]/child::span[2]"));

		int value = Integer.parseInt(Delivery_Fee.getText());

		// Compare the value with 100
		if (value < 100) {
			System.out.println("Delivery Fee less than 100");
		}

		System.out.println("Check Delivery Fee is less than 100 or not");
	}

	@Then("if Delivery Fee is less than 100 print ok otherwise nok")
	public void if_Delivery() {
		System.out.println("if Delivery Fee is less than 100 print ok otherwise nok");
	}

	@And("validate total prices must be less than 500")
	public void validate_total_prices() {

		WebElement Final_Price = driver
				.findElement(By.xpath("//div[starts-with(text(),'TO PAY')]/ancestor::div[1]/child::div[2]"));

		int value1 = Integer.parseInt(Final_Price.getText());

		// Compare the value with 100
		if (value1 < 500) {
			System.out.println("Final_Price less than 500");
		}

		System.out.println("validate total prices must be less than 500");
	}

	@Then("Print the Order Sucessful")
	public void Print_the_Order() {
		System.out.println("Print the Order Sucessful");
	}
}
//
//	@And("see Price tag got removed from the checkout button")
//	public void see_Price() {
//		System.out.println("see Price tag got removed from the checkout button");
//	}
//
//	@And("User see 1 item showing in checkout button")
//	public void User_see_1_item() {
//		System.out.println("User see 1 item showing in checkout button");
//	}
//
//	@Then("User Clicks on Checkout button")
//	public void User_Clicks_on_Checkout() {
//		System.out.println("User Clicks on Checkout button");
//	}
//
//	@And("User see minimum order required pop up is getting displayed")
//	public void User_see_minimum() {
//		System.out.println("User see minimum order required pop up is getting displayed");
//	}
//}

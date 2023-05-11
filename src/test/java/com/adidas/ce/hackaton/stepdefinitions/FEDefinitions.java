package com.adidas.ce.hackaton.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FEDefinitions {

  private WebDriver driver;
  private String name;

  @Before
  public void setup(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    //chromeDriver.manage().timeouts().implicitlyWait()
    driver.navigate().to("https://thepulper.herokuapp.com/apps/pulp/gui/");
  }

  @After
  public void tearDown(){
    driver.close();
  }

  @When("the librarian add an author with name {string}")
  public void theLibrarianAddAnAuthorWithName(String name) {
    //homepage
    this.name = name;
    driver.findElement(By.cssSelector("#menu-create-list-author > a")).click();
    driver.findElement(By.id("authorname")).sendKeys(name);
    driver.findElement(By.id("createauthorbutton")).click();
  }

  @Then("the author should be created on the account of librarian")
  public void theAuthorShouldBeCreatedOnTheAccountOfLibrarian() {

    //authors page
    driver.findElement(By.cssSelector("#menu-authors-menu > a")).click();

    //click list authors
    driver.findElement(By.cssSelector("#menu-authors-list-list > a")).click();

    boolean anyMatch = driver.findElements(By.cssSelector("[id*='author-details'] a")).stream()
        .anyMatch(o -> o.getText().equals(name));

    Assert.assertTrue(anyMatch,String.format("The name %s should be present in the author list", name));
  }
}

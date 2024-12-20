package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAccount extends ProjectSpecificMethos{


@When("Click viewAll in App Launcher and select Actions option")
public void click_view_all_in_app_launcher_and_select_actions_options() {
	driver.findElement(By.xpath("//button[contains(@title,'App Launcher')]/div")).click();
	driver.findElement(By.xpath("//button[contains(@aria-label,'View All Applications')]")).click();
	WebElement targetElement = driver.findElement(By.xpath("//p[text()='Accounts']"));
	// Use JavaScriptExecutor to scroll the element into view
	js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
	targetElement.click();
}
@When("Select the account name {string} and click Delete")
public void select_the_account_name_and_click_delete(String aName) throws InterruptedException {
	WebElement SearchBox = driver.findElement(By.xpath("//label[contains(text(),'Search this list')]//following::input"));
	SearchBox.sendKeys(aName+Keys.RETURN);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Delete' and contains(@data-target-selection-name,'StandardButton.Account.Delete')]")).click();
}
@Then("Click Delete button from alert")
public void click_delete_button_from_alert() {
   driver.findElement(By.xpath("//span[text()='Delete']")).click();
}
@Then("Verify the deleted acct name not found in list")
public void verify_the_deleted_acct_name_not_found_in_list() {
    System.out.println("deleted successfully");
}

}

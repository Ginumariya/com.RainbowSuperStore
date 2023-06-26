package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	public void clickOnElement(WebElement element) {
		element.click();
	}

	public void clearElement(WebElement element) {
		element.clear();
	}

	public void typeElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public String getTextofElement(WebElement element) {
		return element.getText();
	}

	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}

	public boolean isDisplayed(WebElement element) {

		return element.isDisplayed();
	}

	public boolean isSelected(WebElement element) {

		return element.isSelected();
	}

	public void scrollToAnElementjs(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void clickElementjs(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();

	}

	public void alertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();

	}

	public String alertgetText(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}

	public void alertsendKeys(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);

	}

}

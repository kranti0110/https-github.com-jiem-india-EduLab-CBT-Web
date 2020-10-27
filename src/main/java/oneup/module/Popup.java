package oneup.module;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Popup {
 
  private final WebDriverWait wait;
//  private final By closeElementLocator = By.id("closePopup");
//  private final By popupIdLocator = By.id("popupId");
  private static By popupIdLocator =By.xpath("//div[@class='modal-body']");
  private static By closeElementLocator =By.xpath("//button[@class='close pointer']");
 
  public Popup(WebDriver driver) {
    this.wait = new WebDriverWait(driver, 5);
  }
 
  public void close() throws InterruptedException {
    if (isDisplayed()) {
        WebElement closeElement = wait.until(
               visibilityOfElementLocated(closeElementLocator));
        closeElement.click();
    }
  }
 
  private Boolean isDisplayed() throws InterruptedException {
     try {
        WebElement popup = wait.until(
                visibilityOfElementLocated(popupIdLocator));
        return popup.isDisplayed();
     }
     catch (Exception ex) {
       return false;
     }
 }
}
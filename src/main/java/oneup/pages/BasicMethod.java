package oneup.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import actions.ElementActions;

public class BasicMethod {
	
	private static By search_txt_box = By.xpath("//input[@placeholder='Type to search...']");
	
	// Below defining methods
		public static void verifies_partial_txt(By get_txt_ele_name) {
			String actualString = ElementActions.getText(get_txt_ele_name);
			System.out.println(actualString);
			assertTrue(actualString.contains("Displaying 1-1 of"), "Did not display 1 of 1 record");
		}
		
		public static void send_keys(By locator, String sendkeys_value) {
			ElementActions.sendKeys(locator, sendkeys_value );
		}
		
		public static void select_calendar_date(By cal_box, By date, By tick_btn) {
			ElementActions.click(cal_box);
			ElementActions.click(date);
			ElementActions.click(tick_btn);
//			ElementActions.sendKeys(tick_btn, Keys.ENTER);
		}
		
		public static void click_element(By locator) {
			ElementActions.click(locator);
		}
		
		  public static void is_ele_enable(By locator_name) {
			  boolean is_enable = ElementActions.isElementEnabled(locator_name);
			  if (is_enable == true) {
				  System.out.println(locator_name + " Element is enabled");
				  ElementActions.click(locator_name);
			   }
			   
			  else {
				  System.out.println(locator_name +" Element is not enabled");
			   }
		   }
		
		
		  public static void click_prod_key_publish_icon(By publish_icon, By publish_popup_btn) {
			  boolean is_enable = ElementActions.isElementEnabled(publish_icon);
			  if (is_enable == true) {
				  System.out.println(publish_icon + " Element is enabled");
				  ElementActions.click(publish_icon);
				  ElementActions.click(publish_popup_btn);  
			   }
			   
			  else {
				  System.out.println(publish_icon +" Element is not enabled");
			   }
		   }
		  
		  
		
		public static void select_dropdown(By drop_down_box, By drop_down_value) {
			ElementActions.click(drop_down_box);
			ElementActions.click(drop_down_value);
		}
		
		
		public static void get_text(By locator) {
			ElementActions.getText(locator);
		}
		
		public static void verifies_url(String actual_url_string) throws InterruptedException {
			Thread.sleep(3000);
			assertEquals(ElementActions.getDriver().getCurrentUrl(), actual_url_string);
		}
		
		public static void lock_exam(String title_value,By edit_icon_locator, By popup_lock_btn_locator  ) {
			   System.out.println("Title value is " + title_value);
			   if (title_value.equals("Unlock Exam")) {
				   System.out.println("The selected exam is already locked");

			   }
			   
			   else {
				   System.out.println("This Exam is unlocked");
				   System.out.println("Now locking the exam");
				   ElementActions.click(edit_icon_locator);
				   ElementActions.click(popup_lock_btn_locator);
			   }
		}
		
		public static void unlock_exam(String title_value,By edit_icon_locator, By exam_unlock_locator) throws InterruptedException {
			System.out.println("Title value is " + title_value);
			if (title_value.equals("Unlock Exam")) {
				
				System.out.println("The selected exam is locked"); 
				ElementActions.click(edit_icon_locator);
				ElementActions.click(exam_unlock_locator);
				Thread.sleep(3000);
				   
			}
			   
			else {
				
				System.out.println("This Exam is already unlocked");	   
			}		

		}
		
		public static void is_ele_displayed(By locator) {
			if (ElementActions.getDriver().findElements(locator).size() !=0) {
				boolean is_displayed = ElementActions.getDriver().findElement(locator).isDisplayed();
				
				if (is_displayed == true) {
					System.out.println(" --Element displayed-- "+ is_displayed );
				}
				
				else {
					System.out.println(" --Element is not displayed-- " + is_displayed);
				}}
			
			else {
				
				System.out.println("Exam is locked and Take Test button is not available in web page " +locator);
			}	
			
		}
		
		public static void enter_in_search_box(String textboxvalue) {
			ElementActions.sendKeys(search_txt_box, textboxvalue);
			ElementActions.sendKeys(search_txt_box,Keys.ENTER);
		}


}

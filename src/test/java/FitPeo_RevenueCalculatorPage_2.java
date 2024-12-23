//package SeleniumPractice;

		import org.openqa.selenium.*;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

	//	import com.ob.tests.AT_01OnlineBankingSystem;

		import io.github.bonigarcia.wdm.WebDriverManager;

		import java.time.Duration;
		import org.apache.logging.log4j.LogManager;
		import org.apache.logging.log4j.core.Logger;


		import org.apache.logging.log4j.core.Logger;

public class FitPeo_RevenueCalculatorPage_2 {

	public static void main(String[] args) throws InterruptedException    {
		
						
				// Setup ChromeDriver using WebDriverManager
		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();
				        
				      //  try {
				        	Logger log = (Logger) LogManager.getLogger(FitPeo_RevenueCalculatorPage_2.class);
				            // Maximize browser window
				            driver.manage().window().maximize();
				            
				            System.out.println("window Maximized");
				            // Navigate to FitPeo Homepage
				            driver.get("https://fitpeo.com"); // Update the URL if different
				            
				            System.out.println(" Web PAge Opened ");
				            // Navigate to the Revenue Calculator Page
				            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				            WebElement revenueCalculatorLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Revenue Calculator")));
				            revenueCalculatorLink.click();

				            System.out.println("  revenueCalculatorLink clicked   ");
				            
				            Thread.sleep(3000);
				            
				            // Scroll down to the Slider section
				            JavascriptExecutor js = (JavascriptExecutor) driver;
				            WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-orientation='horizontal']"))); // Update with actual selector
				            js.executeScript("window.scrollTo(0, 300);");
				            // js.executeScript("arguments[0].scrollIntoView(true);", slider);

				            System.out.println(" Scroll down to the Slider section 1   ");
				            Thread.sleep(3000);
				            // Adjust the Slider to set value to 820
				           
				            js.executeScript("window.scrollTo(0, 300);");

				            System.out.println(" Scroll down to the Slider section 3   ");
				            
				            System.out.println(" Adjust the Slider to set value to 820    ");
				            
				            
				            
				            
				            Thread.sleep(3000);
				            
				            WebElement textField = driver.findElement(By.xpath("//input[@aria-orientation='horizontal']")); // Update with actual selector

				            js.executeScript("window.scrollTo(0, 300);");

				            System.out.println(" Scroll down to the Slider section 2   "); 
				            if (textField.getAttribute("value").equals("820")) {
				                System.out.println("Slider value updated to 820 successfully.");
				            } else {
				                System.out.println("Slider value update to 820 failed.");
				            }

				            Thread.sleep(3000);
				           
				            System.out.println(" Adjust the Slider to set value to 820    ");
				            
				            // Update the Text Field to 560
				            textField.clear();
				            textField.sendKeys("560");
				            //Actions.click(slider).perform(); // Ensure slider updates
				            if (textField.getAttribute("value").equals("560")) {
				                System.out.println("Text field value updated to 560 successfully.");
				            } else {
				                System.out.println("Text field value update to 560 failed.");
				            }

				            System.out.println(" Update the Text Field to 560    ");
				            
				            Thread.sleep(3000);
				            
				            // Scroll down to CPT Codes
				            WebElement cptSection = driver.findElement(By.cssSelector(".cpt-section")); // Update with actual selector
				            js.executeScript("arguments[0].scrollIntoView(true);", cptSection);

				            System.out.println(" Scroll down to CPT Codes    ");
				            
				            Thread.sleep(3000);
				            
				            // Select CPT Codes
				            driver.findElement(By.id("CPT-99091")).click();
				            System.out.println(" CPT-99091    ");
				            
				            Thread.sleep(3000);
				            
				            driver.findElement(By.id("CPT-99453")).click();
				           
				            System.out.println(" CPT-99453    ");
				            
				            Thread.sleep(3000);
				            
				            driver.findElement(By.id("CPT-99454")).click();
				           
				            System.out.println("  CPT-99454   ");
				            
				            Thread.sleep(3000);
				            
				            driver.findElement(By.id("CPT-99474")).click();
				          
				            System.out.println(" CPT-99474    ");
				            
				            Thread.sleep(3000);
				            

				            // Validate Total Recurring Reimbursement
				            WebElement reimbursementHeader = driver.findElement(By.cssSelector(".reimbursement-header")); // Update with actual selector
				            String expectedValue = "$110700";
				            String actualValue = reimbursementHeader.getText();
				           
				            System.out.println("  Validated Total Recurring Reimbursement   ");
				            
				            Thread.sleep(3000);
				            
				            if (actualValue.contains(expectedValue)) {
				                System.out.println("Total Recurring Reimbursement validated successfully.");
				            } else {
				                System.out.println("Validation failed. Expected: " + expectedValue + ", Actual: " + actualValue);
				            }
				            
				            System.out.println(" Total Recurring Reimbursement validated successfully    ");
				            
				            
				            Thread.sleep(3000);
				            

//				        } catch (Exception e) {
//				            System.out.println("An error occurred: " + e.getMessage());
//				        } finally {
				            // Close the browser
				            driver.quit();
//				        }
	}
}

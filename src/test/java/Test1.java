import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
		import java.util.List;
public class Test1 {

	public static void main(String[] args) {

	
		        // Set up WebDriver path
		//       WebDriverManager.chromedriver().setup();
		       // Specify the ChromeDriver version explicitly
		        WebDriverManager.chromedriver().driverVersion("131.0.6778.86").setup();

		        // Initialize the WebDriver (Chrome)
		        WebDriver driver = new ChromeDriver();
		        
		        // Set implicit wait
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        try {
		            // Step 1: Navigate to the FitPeo Homepage
		            driver.get("https://www.fitpeo.com");

		            // Maximize the browser window
		            driver.manage().window().maximize();
		            
		            // Step 2: Navigate to the Revenue Calculator Page
		            // Assume the page can be accessed via a link/button with id or specific text
		            driver.findElement(By.linkText("Revenue Calculator")).click();

		            // Step 3: Scroll Down to the Slider Section
		            JavascriptExecutor js = (JavascriptExecutor) driver;
		          
		            System.out.println("scroll 1");
		            
		            
		            // Scroll down by 1000 pixels
		            js.executeScript("window.scrollBy(0,800)");
		            
		            System.out.println("scroll 2");
		            // Step 4: Adjust the Slider to 820
		            WebElement slider = driver.findElement(By.xpath("//span[@data-index='0']"));
		            adjustSlider(driver, slider, 820);
System.out.println("scroll 3");


js.executeScript("window.scrollBy(0,500)");

		            // Validate the slider updated to 820
		            String sliderValue = driver.findElement(By.id(":r0:")).getAttribute("value");
		            if (!sliderValue.equals("820")) {
		                System.out.println("Slider is not set to 820!");
		            }

		            // Step 5: Update the Text Field to 560
		            WebElement textField = driver.findElement(By.id(":r0:"));
		            textField.click();
		            textField.clear();
		            textField.sendKeys("560");

		            // Validate the slider adjusted accordingly
		            sliderValue = driver.findElement(By.id(":r0:")).getAttribute("value");
		            if (!sliderValue.equals("560")) {
		                System.out.println("Slider did not update to 560 after text field change!");
		            }

		            // Step 6: Select CPT Codes
		            List<String> cptCodes = List.of("CPT-99091", "CPT-99453", "CPT-99454", "CPT-99474");
		            for (String code : cptCodes) {
		                WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='" + code + "']"));
		                if (!checkbox.isSelected()) {
		                    checkbox.click();
		                }
		            }

		            // Step 7: Validate Total Recurring Reimbursement
		            String reimbursementText = driver.findElement(By.id("total-recurring-reimbursement")).getText();
		            if (!reimbursementText.contains("$110700")) {
		                System.out.println("Total Recurring Reimbursement validation failed!");
		            } else {
		                System.out.println("Test Passed: Total Recurring Reimbursement is $110700.");
		            }

		        } catch (Exception e) {
		            System.out.println("An error occurred during the test execution: " + e.getMessage());
		        } finally {
		            // Close the browser
		            driver.quit();
		        }
		    }

		    // Helper function to adjust slider using JavaScript
		    public static void adjustSlider(WebDriver driver, WebElement slider, int value) {
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        String script = "arguments[0].value='" + value + "'; arguments[0].dispatchEvent(new Event('change'));";
		        js.executeScript(script, slider);
		  	
		

	}

}

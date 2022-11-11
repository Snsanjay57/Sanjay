package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustomerPage {
	
	public CreateNewCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustomerNameTextField;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionTextArea;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement saveButton;

	public WebElement getEnterCustomerNameTextField() {
		return enterCustomerNameTextField;
	}

	public WebElement getDescriptionTextArea() {
		return descriptionTextArea;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public void createNewCustomer(String customerName, String description) {
		enterCustomerNameTextField.sendKeys(customerName);
		descriptionTextArea.sendKeys(description);
		saveButton.click();
	}
}

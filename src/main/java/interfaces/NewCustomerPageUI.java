package interfaces;

public class NewCustomerPageUI {
	public static final String DYNAMIC_ERROR_MSG = "//label[text()='%s']";
	public static final String DYNAMIC_INPUT = "//input[@name='%s']";
	public static final String CUSTOMER_DOB = "//input[@name='dob']";
	public static final String CUSTOMER_ADDRESS = "//textarea[@name='addr']";
	public static final String SUBMIT_BUTTON = "//input[@type='submit']";
	public static final String SUCCESSFUL_MESSAGE = "//p[@class='heading3' and text() = 'Customer Registered Successfully!!!']";
	public static final String CUSTOMER_ID = "//td[text()='Customer ID']/following-sibling::td";
}

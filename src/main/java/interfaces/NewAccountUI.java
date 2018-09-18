package interfaces;

public class NewAccountUI {
	public static final String ACCOUNT_TYPE_SELECT = "//select[@name='selaccount']";
	public static final String SUBMIT_BUTTON = "//input[@type='submit']";
	public static final String SUCCESSFUL_MESSAGE = "//p[@class='heading3' and text() = 'Account Generated Successfully!!!']";;
	public static final String CURRENT_AMOUNT = "//td[text()='Current Amount']/following-sibling::td";
	public static final String ACCOUNT_ID = "//td[text()='Account ID']/following-sibling::td";
}

package interfaces;

public class BankGuruAbstractPageUI {
	public static final String DYNAMIC_MENU_LINK = "//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX = "//input[@name='%s']";
	public static final String DYNAMIC_TEXTAREA = "//textarea[@name='%s']";
	public static final String DYNAMIC_BUTTON = "//input[@name='%s']";
	public static final String DYNAMIC_RADIO_BUTTON = "//input[@value='%s']";
	public static final String DYNAMIC_SUCCESS_MSG = "//p[@class='heading3' and text()='%s']";
	public static final String DYNAMIC_LABEL = "//label[text()='%s']";
	public static final String DYNAMIC_LABEL_RESULT = "//td[text()='%s']/following-sibling::td";
}

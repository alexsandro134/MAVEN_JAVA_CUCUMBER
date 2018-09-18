package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class BankGuruPageManagerDriver {
	private static HomePagePO homePage;
	private static LoginPagePO loginPage;
	private static RegisterPagePO registerPage;
	private static NewCustomerPagePO newCustomerPage;
	private static EditCustomerPO editCustomerPage;
	private static NewAccountPO newAccountPage;
	private static EditCustomerDetailPO editCustomerDetailPage;
	private static EditCustomerSuccessfulPO editCustomerSuccessfulPage;
	private static DepositPagePO depositPage;
	private static DepositSuccessfulPagePO depositSuccessfulPage;
	private static WithdrawPagePO withdrawPage;
	private static WithdrawSuccessfulPagePO withdrawSuccessfulPage;
	private static FundTransferPagePO fundTransferPage;
	private static FundTransferSuccessfulPO fundTransferSuccessfulPage;
	private static BalanceEnquiryPagePO balanceEnquiryPage;
	private static BalanceEnquiryDetailPagePO balanceEnquiryDetailPage;
	private static DeleteAccountPagePO deleteAccountPage;
	private static DeleteAccountSuccessfulPagePO deleteAccountSuccessfulPage;
	private static DeleteCustomerPagePO deleteCustomerPage;
	private static DeleteCustomerSuccessfulPagePO deleteCustomerSuccessfulPage;
	private static AbstractPagePO abstractPage;

	public static AbstractPage getInstance(WebDriver driver, String page) {
		switch (page) {
		case "HomePage":
			if (homePage == null) {
				return new HomePagePO(driver);
			}
			return homePage;

		case "LoginPage":
			if (loginPage == null) {
				return new LoginPagePO(driver);
			}
			return loginPage;

		case "RegisterPage":
			if (registerPage == null) {
				return new RegisterPagePO(driver);
			}
			return registerPage;

		case "NewCustomerPage":
			if (newCustomerPage == null) {
				return new NewCustomerPagePO(driver);
			}
			return newCustomerPage;

		case "EditCustomerPage":
			if (editCustomerPage == null) {
				return new EditCustomerPO(driver);
			}
			return editCustomerPage;

		case "NewAccountPage":
			if (newAccountPage == null) {
				return new NewAccountPO(driver);
			}
			return newAccountPage;

		case "EditCustomerDetailPage":
			if (editCustomerDetailPage == null) {
				return new EditCustomerDetailPO(driver);
			}
			return editCustomerDetailPage;

		case "EditCustomerSuccessfulPage":
			if (editCustomerSuccessfulPage == null) {
				return new EditCustomerSuccessfulPO(driver);
			}
			return editCustomerSuccessfulPage;

		case "DepositPage":
			if (depositPage == null) {
				return new DepositPagePO(driver);
			}
			return depositPage;

		case "DepositSuccessfulPage":
			if (depositSuccessfulPage == null) {
				return new DepositSuccessfulPagePO(driver);
			}
			return depositSuccessfulPage;

		case "WithdrawPage":
			if (withdrawPage == null) {
				return new WithdrawPagePO(driver);
			}
			return withdrawPage;

		case "WithdrawSuccessfulPage":
			if (withdrawSuccessfulPage == null) {
				return new WithdrawSuccessfulPagePO(driver);
			}
			return withdrawSuccessfulPage;

		case "FundTransferPage":
			if (fundTransferPage == null) {
				return new FundTransferPagePO(driver);
			}
			return fundTransferPage;

		case "FundTransferSuccessfulPage":
			if (fundTransferSuccessfulPage == null) {
				return new FundTransferSuccessfulPO(driver);
			}
			return fundTransferSuccessfulPage;

		case "BalanceEnquiryPage":
			if (balanceEnquiryPage == null) {
				return new BalanceEnquiryPagePO(driver);
			}
			return balanceEnquiryPage;

		case "BalanceEnquiryDetailPage":
			if (balanceEnquiryDetailPage == null) {
				return new BalanceEnquiryDetailPagePO(driver);
			}
			return balanceEnquiryDetailPage;

		case "DeleteAccountPage":
			if (deleteAccountPage == null) {
				return new DeleteAccountPagePO(driver);
			}
			return deleteAccountPage;

		case "DeleteAccountSuccessfulPage":
			if (deleteAccountSuccessfulPage == null) {
				return new DeleteAccountSuccessfulPagePO(driver);
			}
			return deleteAccountSuccessfulPage;

		case "DeleteCustomerPage":
			if (deleteCustomerPage == null) {
				return new DeleteCustomerPagePO(driver);
			}
			return deleteCustomerPage;

		case "DeleteCustomerSuccessfulPage":
			if (deleteCustomerSuccessfulPage == null) {
				return new DeleteCustomerSuccessfulPagePO(driver);
			}
			return deleteCustomerSuccessfulPage;

		case "AbstractPage":
			if (abstractPage == null) {
				return new AbstractPagePO(driver);
			}
			return abstractPage;
		default:
			return null;
		}
	}

}

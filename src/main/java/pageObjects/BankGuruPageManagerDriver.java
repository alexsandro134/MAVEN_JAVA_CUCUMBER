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
	private static CustomerRegisterSuccessfulPO customerRegisterSuccessfulPage;
	private static EditCustomerDetailPO editCustomerDetailPage;
	private static EditCustomerSuccessfulPO editCustomerSuccessfulPage;
	private static NewAccountCreateSuccessfulPO newAccountSuccessfulPage;
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

		case "CustomerRegisterSuccessfulPage":
			if (customerRegisterSuccessfulPage == null) {
				return new CustomerRegisterSuccessfulPO(driver);
			}
			return customerRegisterSuccessfulPage;

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

		case "NewAccountCreateSuccessfulPage":
			if (newAccountSuccessfulPage == null) {
				return new NewAccountCreateSuccessfulPO(driver);
			}
			return newAccountSuccessfulPage;

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

		default:
			return null;
		}
	}
	// public static HomePagePO getHomePage(WebDriver driver) {
	// if (homePage == null) {
	// return new HomePagePO(driver);
	// }
	// return homePage;
	// }
	//
	// public static LoginPagePO getLoginPage(WebDriver driver) {
	// if (loginPage == null) {
	// return new LoginPagePO(driver);
	// }
	// return loginPage;
	// }
	//
	// public static RegisterPagePO getRegisterPage(WebDriver driver) {
	// if (registerPage == null) {
	// return new RegisterPagePO(driver);
	// }
	// return registerPage;
	// }
	//
	// public static NewCustomerPagePO getNewCustomerPage(WebDriver driver) {
	// if (newCustomerPage == null) {
	// return new NewCustomerPagePO(driver);
	// }
	// return newCustomerPage;
	// }
	//
	// public static EditCustomerPO getEditCustomerPage(WebDriver driver) {
	// if (editCustomerPage == null) {
	// return new EditCustomerPO(driver);
	// }
	// return editCustomerPage;
	// }
	//
	// public static NewAccountPO getNewAccountPage(WebDriver driver) {
	// if (newAccountPage == null) {
	// return new NewAccountPO(driver);
	// }
	// return newAccountPage;
	// }
	//
	// public static CustomerRegisterSuccessfulPO
	// getCustomerRegisterSuccessfulPage(WebDriver driver) {
	// if (customerRegisterSuccessfulPage == null) {
	// return new CustomerRegisterSuccessfulPO(driver);
	// }
	// return customerRegisterSuccessfulPage;
	// }
	//
	// public static EditCustomerDetailPO getEditCustomerDetaiPage(WebDriver
	// driver) {
	// if (editCustomerDetailPage == null) {
	// return new EditCustomerDetailPO(driver);
	// }
	// return editCustomerDetailPage;
	// }
	//
	// public static EditCustomerSuccessfulPO
	// getEditCustomerSuccessfulPage(WebDriver driver) {
	// if (editCustomerSuccessfulPage == null) {
	// return new EditCustomerSuccessfulPO(driver);
	// }
	// return editCustomerSuccessfulPage;
	// }
	//
	// public static NewAccountCreateSuccessfulPO
	// getNewAccountCreateSuccessful(WebDriver driver) {
	// if (newAccountSuccessfulPage == null) {
	// return new NewAccountCreateSuccessfulPO(driver);
	// }
	// return newAccountSuccessfulPage;
	// }
	//
	// public static DepositPagePO getDepositPage(WebDriver driver) {
	// if (depositPage == null) {
	// return new DepositPagePO(driver);
	// }
	// return depositPage;
	// }
	//
	// public static DepositSuccessfulPagePO getDepositSuccessfulPage(WebDriver
	// driver) {
	// if (depositSuccessfulPage == null) {
	// return new DepositSuccessfulPagePO(driver);
	// }
	// return depositSuccessfulPage;
	// }
	//
	// public static WithdrawPagePO getWithdrawPage(WebDriver driver) {
	// if (withdrawPage == null) {
	// return new WithdrawPagePO(driver);
	// }
	// return withdrawPage;
	// }
	//
	// public static WithdrawSuccessfulPagePO
	// getWithdrawSuccessfulPage(WebDriver driver) {
	// if (withdrawSuccessfulPage == null) {
	// return new WithdrawSuccessfulPagePO(driver);
	// }
	// return withdrawSuccessfulPage;
	// }
	//
	// public static FundTransferPagePO getFundTransferPage(WebDriver driver) {
	// if (fundTransferPage == null) {
	// return new FundTransferPagePO(driver);
	// }
	// return fundTransferPage;
	// }
	//
	// public static FundTransferSuccessfulPO
	// getFundTransferSuccessfulPage(WebDriver driver) {
	// if (fundTransferSuccessfulPage == null) {
	// return new FundTransferSuccessfulPO(driver);
	// }
	// return fundTransferSuccessfulPage;
	// }
	//
	// public static BalanceEnquiryPagePO getBalanceEnquiryPage(WebDriver
	// driver) {
	// if (balanceEnquiryPage == null) {
	// return new BalanceEnquiryPagePO(driver);
	// }
	// return balanceEnquiryPage;
	// }
	//
	// public static BalanceEnquiryDetailPagePO
	// getBalanceEnquiryDetailPage(WebDriver driver) {
	// if (balanceEnquiryDetailPage == null) {
	// return new BalanceEnquiryDetailPagePO(driver);
	// }
	// return balanceEnquiryDetailPage;
	// }
	//
	// public static DeleteAccountPagePO getDeleteAccountPage(WebDriver driver)
	// {
	// if (deleteAccountPage == null) {
	// return new DeleteAccountPagePO(driver);
	// }
	// return deleteAccountPage;
	// }
	//
	// public static DeleteAccountSuccessfulPagePO
	// getDeteleAccountSuccessfulPage(WebDriver driver) {
	// if (deleteAccountSuccessfulPage == null) {
	// return new DeleteAccountSuccessfulPagePO(driver);
	// }
	// return deleteAccountSuccessfulPage;
	// }
	//
	// public static DeleteCustomerPagePO getDeleteCustomerPage(WebDriver
	// driver) {
	// if (deleteCustomerPage == null) {
	// return new DeleteCustomerPagePO(driver);
	// }
	// return deleteCustomerPage;
	// }
	//
	// public static DeleteCustomerSuccessfulPagePO
	// getDeteleCustomerSuccessfulPage(WebDriver driver) {
	// if (deleteCustomerSuccessfulPage == null) {
	// return new DeleteCustomerSuccessfulPagePO(driver);
	// }
	// return deleteCustomerSuccessfulPage;
	// }

}

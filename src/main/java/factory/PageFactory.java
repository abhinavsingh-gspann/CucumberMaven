package factory;

import pages.AccountPage;
import pages.LoginPage;

public class PageFactory {
	static ThreadLocal<LoginPage> LoginPageTL = new ThreadLocal<LoginPage>();
	static ThreadLocal<AccountPage> AccountPageTL = new ThreadLocal<AccountPage>();

	public static LoginPage getLoginPage() {
		if (LoginPageTL.get() == null) {
			LoginPageTL.set(new LoginPage());
		}
		return LoginPageTL.get();
	}

	public static AccountPage getAccountPage() {
		if (AccountPageTL.get() == null) {
			AccountPageTL.set(new AccountPage());
		}
		return AccountPageTL.get();
	}
}

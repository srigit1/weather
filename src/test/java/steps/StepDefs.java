package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import pages.Page;

public class StepDefs   {


    Page page=new Page();

        @Given("I go to url (.*)$")
        public void launchApp(String url)
        {
           page.getUrl(url);
        }
    @When("^Signin with \"(.*)\" , \"(.*)\"$")
    public void signin(String username,String pwd) throws InterruptedException {
        page.clickSignin();
        page.enterUsername(username);
        page.enterPassword(pwd);
        page.signin();

    }
    @When("^navigate to weather page and search for newcastle weather$")
        public void navigatetoweather() throws InterruptedException {
            page.clickMore();
            page.clickweather();
            page.searchnewcastle();
            Thread.sleep(2000);

        }


}

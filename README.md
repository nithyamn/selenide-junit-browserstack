selenide-junit-browserstack
Selenide JUnit Integration with BrowserStack.

Master branch contains JUnit 4 samples, for JUnit 5 samples please checkout junit5 branch

Master branch contains Selenium 3 samples, for Selenium 4 - W3C protocol please checkout selenium-4 branch

BrowserStack Logo

JUnit

Setup
Clone the repo
Install dependencies mvn install
Update *.conf.json files inside the src/test/resources/conf directory with your BrowserStack Username and Access Key.
Running your tests
To run a single test, run mvn test -P single
To run local tests, run mvn test -P local
To run parallel tests, run mvn test -P parallel
Understand how many parallel sessions you need by using our Parallel Test Calculator

Notes
You can view your test results on the BrowserStack Automate dashboard

To test on a different set of browsers, check out our platform configurator

You can export the environment variables for the Username and Access Key of your BrowserStack account.

export BROWSERSTACK_USERNAME=<browserstack-username> &&
export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key>
Addtional Resources
Documentation for writing Automate test scripts in Java
Customizing your tests on BrowserStack
Browsers & mobile devices for selenium testing on BrowserStack
Using REST API to access information about your tests via the command-line interface# selenide-junit-browserstack

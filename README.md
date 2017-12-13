# AllureReporting

This is a basic setup for [Allure](https://github.com/allure-framework/) providing powerful reporting.

Reporting has become an essential tool for every team, and there are multiple reporting tools in rise,
such as Extent Reporting. There is a big demand on good Reporting tool and Allure provide that.
It can be used with TestNG or JUnit, providing easy to follow and beautiful reports.
With annotations such as @Description and @Story you can provide detailed information.

I will use Allure for future projects, this is just a simple project for me to get more familiar with Allure.

In addition to adding the Dependencies in the pom.xml file, I had to install allure from homebrew
with the following command:

```
brew install Allure
```

Then I have to navigate to my project through the Command Line and provide the following command after having
run the project itself first.

```
allure serve
```
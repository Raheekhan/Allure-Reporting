package test;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class Main {

    @Epic("Epic")
    @Feature("Feature")
    @Description("This is a description")
    @Story("This is a story")
    @Issue("Issue-412")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void testing() {
        System.out.println("Testing Allure with TestNG");
    }
}

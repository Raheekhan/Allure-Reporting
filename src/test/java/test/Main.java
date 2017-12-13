package test;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class Main {

    @Description("This is a description")
    @Story("This is a story")
    @Test
    public void testing() {
        System.out.println("Testing Allure with TestNG");
    }
}

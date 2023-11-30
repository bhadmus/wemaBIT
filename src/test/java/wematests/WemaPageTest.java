package wematests;

import io.qameta.allure.Description;
import org.testng.annotations.*;
import wemaobjects.Selectors;
import wemaobjects.WemaPageObject;


public class WemaPageTest {
    WemaPageObject wemaPageObject = new WemaPageObject();

    @BeforeTest
    public void openPage(){
        wemaPageObject.setUp();
    }

    @Test
    @Description("A standard user login")
    public void loginStandard(){
        wemaPageObject.allUserLogin(Selectors.standard);
    }

    @Test(priority = 2)
    @Description("An error user login")
    public void loginError(){
        wemaPageObject.allUserLogin(Selectors.error);
    }

    @Test(priority = 1)
    @Description("A visual user login")
    public void loginVisual(){
        wemaPageObject.allUserLogin(Selectors.visual);
    }

    @Test(priority = 3)
    @Description("A problem user login")
    public void loginProblem(){
        wemaPageObject.allUserLogin(Selectors.problem);
    }

    @Test(priority = 4)
    @Description("A performance glitch user login")
    public void loginPerformance(){
        wemaPageObject.allUserLogin(Selectors.glitch);
    }

    @AfterMethod
    public void logOut(){
        wemaPageObject.logout();
    }


    @AfterTest
    public void closePage(){
        wemaPageObject.tearDown();
    }
}

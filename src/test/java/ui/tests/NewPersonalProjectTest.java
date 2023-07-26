package ui.tests;

import api.methods.UserMethods;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.methods.LogInPageMethods;
import ui.methods.NewProjectMethods;
import utils.RandomGenerator;

public class NewPersonalProjectTest extends BasicMethod{

    @Test
    public void createNewPersonalProjectTest(){
        LogInPageMethods logInPageMethods = new LogInPageMethods();
        logInPageMethods.logInByUser(userName, password);
        NewProjectMethods projectMethods = new NewProjectMethods();
        projectMethods.projectCreator(true);
    }

    @AfterMethod(alwaysRun = true)
    public void cleanUp(){
        UserMethods.deleteUser(userId);
    }
}

package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.PeopleSearchSteps;

@RunWith(SerenityRunner.class)
public class PeopleSearchTest {
    @Steps
    PeopleSearchSteps peopleSearch;

    @Test
    public void verifyR2D2SkinColor(){
        peopleSearch.searchForPeopleByName("R2-D2");
        peopleSearch.searchIsExecutedSuccesfully();
        peopleSearch.verifySkinColor("white, blue");
    }
}

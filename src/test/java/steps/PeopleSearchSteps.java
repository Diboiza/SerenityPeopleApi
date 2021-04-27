package steps;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class PeopleSearchSteps {

    private String PeopleSearch = "https://swapi.dev/api/people";
    private Response response;

    @Step
    public void searchForPeopleByName(String name){
        response = SerenityRest.get(PeopleSearch+"?search="+name);
    }

    @Step
    public void searchIsExecutedSuccesfully(){
        response.then().statusCode(200);
    }

    @Step
    public void verifySkinColor(String color){
        response.then().body("results[0].skin_color", equalToIgnoringCase(color));
    }
}

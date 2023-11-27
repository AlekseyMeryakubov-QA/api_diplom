package api;

import io.qameta.allure.Description;

import static io.restassured.RestAssured.given;
import static specs.DeletePersonSpec.deletePersonRequestSpec;
import static specs.DeletePersonSpec.deletePersonResponseSpec;

public class DeletePersonApi {

    @Description("Удаление сотрудника")
    public void deletePerson() {
        given()
                .spec(deletePersonRequestSpec)
                .delete("/users/2")
                .then()
                .spec(deletePersonResponseSpec);
    }
}

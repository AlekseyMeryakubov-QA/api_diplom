package api;

import io.qameta.allure.Description;
import models.person.CreatePersonBodyModel;
import models.person.CreatePersonResponseModel;
import specs.CreatePersonSpec;

import static io.restassured.RestAssured.given;

public class CreatePersonApi {

    @Description("Отправка запроса на создание сотрудника")
    public CreatePersonResponseModel successCreatePerson(CreatePersonBodyModel requestData) {
        return given()
                .spec(CreatePersonSpec.createPersonRequestSpec)
                .body(requestData)
                .when()
                .post("/users")
                .then()
                .spec(CreatePersonSpec.createPersonResponseSpec)
                .extract()
                .as(CreatePersonResponseModel.class);
    }
}

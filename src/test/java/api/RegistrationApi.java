package api;

import io.qameta.allure.Description;
import models.registration.RegistrationBodyModel;
import models.registration.RegistrationErrorModel;
import models.registration.RegistrationResponseModel;
import specs.RegistrationSpec;

import static io.restassured.RestAssured.given;

public class RegistrationApi {

    @Description("Отправка запроса на Регистрацию")
    public RegistrationResponseModel successRegistration(RegistrationBodyModel requestData) {
        return given()
                .spec(RegistrationSpec.registrationRequestSpec)
                .body(requestData)
                .when()
                .post("/register")
                .then()
                .spec(RegistrationSpec.registrationResponseSpec)
                .extract()
                .as(RegistrationResponseModel.class);
    }

    @Description("Отправка запроса с ошибкой на Регистрацию")
    public RegistrationErrorModel errorRegistration(RegistrationBodyModel requestData) {
        return given()
                .spec(RegistrationSpec.registrationRequestSpec)
                .body(requestData)
                .when()
                .post("/register")
                .then()
                .spec(RegistrationSpec.errorRegistrationResponseSpec)
                .extract()
                .as(RegistrationErrorModel.class);
    }
}
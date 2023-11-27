package api;

import io.qameta.allure.Description;
import models.authorization.AuthorizationBodyModel;
import models.authorization.AuthorizationErrorModel;
import models.authorization.AuthorizationResponseModel;
import specs.AuthorizationSpec;

import static io.restassured.RestAssured.given;

public class AuthorizationApi {

    @Description("Отправка запроса на Авторизацию")
    public AuthorizationResponseModel successAuth(AuthorizationBodyModel requestData) {
        return given()
                .spec(AuthorizationSpec.authorizationRequestSpec)
                .body(requestData)
                .when()
                .post("/login")
                .then()
                .spec(AuthorizationSpec.authorizationResponseSpec)
                .extract()
                .as(AuthorizationResponseModel.class);
    }

    @Description("Отправка запроса с ошибкой на Авторизацию")
    public AuthorizationErrorModel errorAuth(AuthorizationBodyModel requestData) {
        return given()
                .spec(AuthorizationSpec.authorizationRequestSpec)
                .body(requestData)
                .when()
                .post("/login")
                .then()
                .spec(AuthorizationSpec.errorAuthorizationResponseSpec)
                .extract()
                .as(AuthorizationErrorModel.class);
    }
}

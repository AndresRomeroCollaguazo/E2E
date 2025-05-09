package com.swag.pe.steps.login;

import com.swag.pe.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("ingresar usuario")
    public void typeUsername(String username) {
        txt_username.sendKeys(username);
    }

    @Step("ingresar contraseña")
    public void typePassword(String password) {
        txt_password.sendKeys(password);
    }

    @Step("click en el boton login")
    public void clickLogin() {
        btn_login.click();
    }
}

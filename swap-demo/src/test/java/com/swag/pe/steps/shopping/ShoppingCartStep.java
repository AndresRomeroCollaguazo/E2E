package com.swag.pe.steps.shopping;

import com.swag.pe.pages.shopping.ShoppingCartPage;
import net.thucydides.core.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {

    @Step("click en el Checkout")
    public void clickCheckoutButton() {
    checkoutButton.click();
    }

    @Step("ingresar Nombre")
    public void typeFirstName(String firstName) {
        txt_firstname.sendKeys(firstName);
    }

    @Step("ingresar Apellido")
    public void typeLastName(String lastName) {
        txt_lastname.sendKeys(lastName);
    }

    @Step("ingresar codigo postal")
    public void typePostalCode(String postal) {
        txt_postal.sendKeys(postal);

    }

    @Step("click en continuar")
    public void clickContinueButton() {
        continueButton.click();
    }

    @Step("click en finalizar")
    public void clickFinish() {
    finishButton.click();
    }
}


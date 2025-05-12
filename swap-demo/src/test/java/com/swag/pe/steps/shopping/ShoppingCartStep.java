package com.swag.pe.steps.shopping;

import com.swag.pe.pages.shopping.ShoppingCartPage;
import net.thucydides.core.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {

    @Step("Click en el Checkout")
    public void clickCheckoutButton() {
        checkoutButton.click();
    }

    @Step("Ingresar Nombre")
    public void typeFirstName(String firstName) {
        txt_firstname.sendKeys(firstName);
    }

    @Step("Ingresar Apellido")
    public void typeLastName(String lastName) {
        txt_lastname.sendKeys(lastName);
    }

    @Step("Ingresar código postal")
    public void typePostalCode(String postalCode) {
        txt_postal.sendKeys(postalCode);
    }

    @Step("Click en continuar")
    public void clickContinueButton() {
        continueButton.click();
    }

    @Step("Click en finalizar")
    public void clickFinish() {
        finishButton.click();
    }
}

package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("validar visualizacion del modulo de productos")
    public Boolean titleIsVisible() {
        return lbl_product.isDisplayed();
    }

    @Step("validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed() {
        return lbl_errorMessage.isDisplayed();
    }

    @Step("validar los productos listados en el carrito")
    public Boolean productsIsDisplayed() {
        for(WebElementFacade product:productsList){
            if(product.isDisplayed()){
                return true;
            }
        }
        return false;
    }

    @Step("validar que el carrito este vacio de productos")
    public Boolean shoppingCartIsEmpty() {
        for(WebElementFacade product:productsList){
            if(product.isDisplayed()){
                return false;
            }
        }
        return true;
    }

    @Step("validar finalizacion de orden")
    public Boolean orderTextIsDisplayed() {
        return lbl_order.isDisplayed();
    }


}

package com.swag.pe.pages.products;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectProductPage extends PageObject {

    @FindBy(xpath = "//button[contains(@class,'btn_inventory') and contains(text(),'Add to cart')]")
    protected List<WebElementFacade> products;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    protected WebElementFacade shoppingCartIcon;

}

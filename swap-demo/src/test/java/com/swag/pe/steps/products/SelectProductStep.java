package com.swag.pe.steps.products;

import com.swag.pe.pages.products.SelectProductPage;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class SelectProductStep extends SelectProductPage {
    public SelectProductStep() {
        super(); // Llama al constructor de SelectProductPage
    }

    @Step("agregar productos al carrito")
    public void addProducts(int quantity) {
        for (int i = 0; i < quantity; i++){
            Actions act = new Actions(getDriver());
                act.click(products.get(i)).perform();
        }
    }

    @Step("click en el icono de carrito de compras")
    public void clickShoppingCartIcon(){
            shoppingCartIcon.click();
    }
}





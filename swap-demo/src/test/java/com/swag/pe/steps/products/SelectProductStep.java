package com.swag.pe.steps.products;

import com.swag.pe.pages.products.SelectProductPage;
import net.thucydides.core.annotations.Step;

public class SelectProductStep extends SelectProductPage {

    @Step("Agregar productos al carrito desde JSON")
    public void addProducts(int productsCount) {
        for (int i = 0; i < productsCount; i++) {
            addSingleProductToCart();
        }
    }

    @Step("Click en el icono del carrito de compras")
    public void clickShoppingCartIcon() {
        shoppingCartIcon.click();
    }

    private void addSingleProductToCart() {
        // Aquí iría la lógica para agregar un solo producto
        System.out.println("Producto agregado al carrito.");
    }
}



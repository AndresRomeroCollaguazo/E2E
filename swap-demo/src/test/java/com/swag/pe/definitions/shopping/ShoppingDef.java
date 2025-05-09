package com.swag.pe.definitions.shopping;

import com.swag.pe.steps.products.SelectProductStep;
import com.swag.pe.steps.shopping.ShoppingCartStep;
import com.swag.pe.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {

    @Steps(shared = true)
    SelectProductStep selectProduct;

    @Steps(shared = true)
    ValidationStep validate;

    @Steps(shared = true)
    ShoppingCartStep shoppingCart;

    @And("agregar productos al carrito de compras")
    public void userAddProducts(){
        selectProduct.addProducts(3);
    }

    @And("da click en el icono del carrito")
    public void userClickShoppingCartIcon(){
        selectProduct.clickShoppingCartIcon();
    }

    @Then("el sistema deberia listar los productos agregados en el carrito de compras")
    public void systemListProducts(){
        Assert.assertTrue(validate.productsIsDisplayed());
    }

    @Then("el sistema deberia mostrar la cesta sin productos")
    public void systemShowEmptyShoppingCart(){
        Assert.assertTrue(validate.shoppingCartIsEmpty());
    }

    @When("completa todo el registro de la orden")
    public void userCompleteOrder(){
        shoppingCart.clickCheckoutButton();
        shoppingCart.typeFirstName("Andres");
        shoppingCart.typeLastName("Romero");
        shoppingCart.typePostalCode("EC 593");
        shoppingCart.clickContinueButton();
        shoppingCart.clickFinish();
    }

    @Then("el sistema deberia procesar la compra")
    public void systemProccesShoppingCart(){
        Assert.assertTrue(validate.orderTextIsDisplayed());
    }


}

package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
    @Given("looking for mobile shop")
    public void looking_for_mobile_shop() {
        System.out.println("looking for mobile shop");

    }
    @Given("i need enough money")
    public void i_need_enough_money() {
        System.out.println("i need enough money");

    }

    @Given("iphone is costly")
    public void iphone_is_costly() {
        System.out.println("iphone is so costly");

    }

    @When("red colour looks elegant so i have to buy red color iphone")
    public void red_colour_looks_elegant_so_i_have_to_buy_red_color_iphone() {
        System.out.println("red colour looks elegant so i have to buy red color iphone");
    }
    @Then("show me latest model")
    public void show_me_latest_model() {
        System.out.println("show me latest model of iphone");

    }
    @Then("i dont need warantty")
    public void i_dont_need_warantty() {
        System.out.println("i dont need warantty");

    }
    @Given("windows phone is  moderate price")
    public void windows_phone_is_moderate_price() {
        System.out.println("windows phone is  moderate price");}
    @When("red colour looks elegant so i have to buy red color")
    public void red_colour_looks_elegant_so_i_have_to_buy_red_color() {
        System.out.println("red colour looks elegant so i have to buy red color");
        System.out.println("ahaan");

    }
    @Then("show me new model")
    public void show_me_new_model() {
        System.out.println("show me new model of wp");
        System.out.println("hehhe");

    }


}

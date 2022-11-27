package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.RegistrarUsuario;
import userinterface.HomePage;

public class DemoStepDefinitions {
    @Managed(driver="chrome")
    private WebDriver navegador;
    private Actor actor= Actor.named("Global");
    private HomePage homePage=new HomePage();



    @Dado("Yo voy a la pagina de Demoqa")
    public void yo_voy_a_la_pagina_de_Demoqa() {
        // Write code here that turns the phrase above into concrete actions
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }


    @Cuando("Yo ingreso los datos del formulario")
    public void yo_ingreso_los_datos_del_formulario(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).
actor.wasAbleTo(RegistrarUsuario.conDatos2(arg1));
    }

    @Entonces("Yo deberia visualizar la página de conformidad")
    public void yo_deberia_visualizar_la_página_de_conformidad() {
        // Write code here that turns the phrase above into concrete actions

    }

}

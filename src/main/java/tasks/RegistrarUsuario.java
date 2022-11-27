package tasks;

import cucumber.api.DataTable;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class RegistrarUsuario implements Task {
    public  RegistrarUsuario (DataTable dataTable) {
        dataTable.toString();

    }
    public static RegistrarUsuario conDatos(DataTable dataTable) {
        dataTable.toString();
        return null;
    }

    public <T extends Actor> void PerformAs(T actor){
        actor.attemptsTo(Enter.theValue());
    }
}

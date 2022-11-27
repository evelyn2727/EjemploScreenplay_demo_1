package tasks;

import cucumber.api.DataTable;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.HomePage.*;

public class RegistrarUsuario implements Task {
    public static String name="";
    public static String apellido="";
    public static String userEmail="";
    public static String userNumber="";
    public static String gender="";

    public  RegistrarUsuario (List<String> usuarios) {
      this.name=usuarios.get(0);
        this.apellido=usuarios.get(1);
        this.userEmail=usuarios.get(2);
        this.userNumber=usuarios.get(3);
        this.gender=usuarios.get(4);


    }
    public static RegistrarUsuario conDatos(List<String> usuarios) {
    return instrumented(RegistrarUsuario.class,usuarios);
      }

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 Enter.theValue(name).into(input_name),
                 Enter.theValue(apellido).into(input_lastName),
                 Enter.theValue(userEmail).into(input_email),
                 Enter.theValue(userNumber).into(input_number),
                 Enter.theValue(gender).into(input_genderM));
    }
}

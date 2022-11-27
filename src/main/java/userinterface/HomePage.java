package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://demoqa.com/automation-practice-form")
//@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {
    public static  Target input_name=Target.the("input ingresa el nombre").located(By.id("firstName"));
    public static final Target input_lastName=Target.the("input ingresa el apellido").located(By.id("lastName"));
    public static final Target input_email=Target.the("input ingresa el email").located(By.id("userEmail"));
    public static final Target input_number=Target.the("input ingresa el number").located(By.id("userNumber"));
    public static final Target input_genderM=Target.the("input ingresa el géneroM").located(By.xpath("//input[@value='Male']"));
    public static final Target input_genderF=Target.the("input ingresa el géneroF").located(By.xpath("//input[@value='Female']"));


}

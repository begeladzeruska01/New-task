
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide. Selectors.*;

public class test1 {
    @Test

    public  void test1()
    {
        WebDriverManager.chromedriver().setup();

        Selenide.open( "https://www.facebook.com/");
        $(by("data-testid", "open-registration-form-button" )).click();
        $(byName("firstname")).setValue("ruska");
        $(byName("lastname")).setValue("begeladze");
        $(byName("reg_email__")).setValue("begeladzeruska@gmail.com");
        $(byName("reg_passwd__")).setValue("tetst123");

        $(byName("birthday_year")).click();
        $(by("value", "2021" )).click();

        $(byName("birthday_day")).click();
        $(by("value", "27" )).click();

        $(byName("birthday_month")).click();
        $(by("value", "4" )).click();



        $(byName("sex")).$(by("value", "-1")).click();

        $(byName("preferred_pronoun")).shouldBe(Condition.visible);


        $(byName("sex")).$$(by("value", "1")).first().click();

        $(byName("preferred_pronoun")).shouldBe(Condition.hidden);


    }



}

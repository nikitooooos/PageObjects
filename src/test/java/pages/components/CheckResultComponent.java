package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CheckResultComponent {

    public CheckResultComponent checkResultTextBoxPage(String key, String value) {
        $("#output").$(byText(key)).shouldHave(text(value));
        return this;
    }

    public CheckResultComponent checkResult(String key, String value) {
        $(".table-responsive").$(byText(key)).parent().shouldHave(text(value));
        return this;
    }
}

package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionsPage {

    private final SelenideElement
            junit5CodeExample = $(byText("@ExtendWith"));

    public SoftAssertionsPage checkJunit5CodeExample() {
        junit5CodeExample.shouldBe(visible);
        return this;
    }
}

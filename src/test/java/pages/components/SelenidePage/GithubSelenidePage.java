package pages.components.SelenidePage;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubSelenidePage {

    private final SelenideElement
            headerTitle = $("h1"),
            wikiTab = $("#wiki-tab");

    public GithubSelenidePage openPage() {
        open("selenide/selenide");
        headerTitle.shouldHave(text("selenide / selenide"));
        return this;
    }

    public GithubSelenidePage clickOnWikiTab() {
        wikiTab.click();
        return this;
    }
}

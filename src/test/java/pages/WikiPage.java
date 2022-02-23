package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class WikiPage {

    private final SelenideElement
            sidebarPagesFilter = $("#wiki-pages-filter"),
            sidebarSoftAssertionsElementOnSearch = $(".Layout-sidebar a[href*='SoftAssertions']");

    public WikiPage fillSidebarFilter(final String searchValue) {
        sidebarPagesFilter.setValue(searchValue);
        return this;
    }

    public WikiPage checkSoftAssertionsOnSidebar() {
        sidebarSoftAssertionsElementOnSearch.shouldBe(visible);
        return this;
    }

    public WikiPage clickSoftAssertionsOnSidebar() {
        sidebarSoftAssertionsElementOnSearch.click();
        return this;
    }
}

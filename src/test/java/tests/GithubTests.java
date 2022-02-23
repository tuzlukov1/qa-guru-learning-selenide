package tests;

import org.junit.jupiter.api.Test;
import pages.GithubSelenidePage;
import pages.SoftAssertionsPage;
import pages.WikiPage;

public class GithubTests extends TestBase{
    GithubSelenidePage githubSelenidePage = new GithubSelenidePage();
    WikiPage wikiPage = new WikiPage();
    SoftAssertionsPage softAssertionsPage = new SoftAssertionsPage();

    @Test
    void checkSoftAssertionsInWikiTests() {
        githubSelenidePage
                .openPage()
                .clickOnWikiTab();

        wikiPage
                .fillSidebarFilter("SoftAssertions")
                .checkSoftAssertionsOnSidebar()
                .clickSoftAssertionsOnSidebar();

        softAssertionsPage
                .checkJunit5CodeExample();
    }
}

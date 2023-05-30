package com.it_academy.selenide_rebuild_it_academy.driver;

import com.it_academy.selenide_rebuild_it_academy.WebDriverCreator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteWebDriverCreator  implements WebDriverCreator<RemoteWebDriver> {

    private static final String DEFAULT_BROWSER = "chrome";

    private static final Platform DEFAULT_PLATFORM = Platform.ANY;


    @Override
    public RemoteWebDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();

        capabilities.setBrowserName(DEFAULT_BROWSER);
        capabilities.setPlatform(DEFAULT_PLATFORM);

        chromeOptions.merge(capabilities);

        return new RemoteWebDriver(getGridUrl(), chromeOptions);
    }

    private URL getGridUrl() {
        try {
            return new URL(System.getProperty("url"));
        } catch (MalformedURLException e) {
            throw new IllegalStateException(e.getMessage() + e);
        }
    }
}

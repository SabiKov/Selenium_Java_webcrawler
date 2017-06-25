package model;

import org.openqa.selenium.WebDriver;

import java.util.List;

/**
 * Created by Sabi on 25/06/2017.
 */
public class WebDriverModel {



    private String geckoDriverName = "";
    private String getGeckoDriverPath = "";

    private String ytUserName = "pakito26";
    private String ytPassword = "Slaveke1978";
    private String issueCode = "OL-743";

    private String tcUserName = "pakito26";
    private String tcPassword = "Slaveke1978";

    public ConfigFileReader configFileReader;

    public WebDriverModel() {

        configFileReader = new ConfigFileReader();
    }

    WebDriver fireFoxdriver;


}

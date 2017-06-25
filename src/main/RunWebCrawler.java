package main;

import controller.WebCrawlerController;
import model.ConfigFileReader;
import model.WebDriverModel;
import view.InnerPanel;
import view.MainFrame;

import java.io.IOException;

/**
 * Created by Sabi on 24/06/2017.
 */
public class RunWebCrawler {

    public static void main(String[] args) throws IOException {

        InnerPanel mainFrame = new InnerPanel();
        //ConfigFileReader configFileReader = new ConfigFileReader();
        WebDriverModel webDriverModel = new WebDriverModel();

        WebCrawlerController webCrawlerController = new WebCrawlerController(mainFrame, webDriverModel);

    }
}

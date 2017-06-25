package controller;

import exception.CustomException;
import model.ConfigFileReader;
import model.WebDriverModel;
import view.InnerPanel;
import view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Sabi on 25/06/2017.
 */
public class WebCrawlerController {

    private InnerPanel innerPanel;

    //private ConfigFileReader configFileReader;
    private WebDriverModel webDriverModel;

    public WebCrawlerController(InnerPanel ip, WebDriverModel wdm) {
        super();

        this.innerPanel = ip;
        this.webDriverModel = wdm;

        this.innerPanel.executeScrapOffMechanism(new WebScrapperController());
    }

    class WebScrapperController implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                webDriverModel.configFileReader.readLines("C:\\Users\\Sabi\\Desktop\\WebDriver\\web-crawler-config.wcc");

            } catch (RuntimeException re) {
                throw new CustomException("The config file cannot be found at runtime!");
            } catch (IOException ioe) {

                ioe.printStackTrace();
            }

        }
    }

}

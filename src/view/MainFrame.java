package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Sabi on 24/06/2017.
 */
public abstract class MainFrame extends JFrame implements JElement, JFileBrowser {

    protected JFrame mainFrame;
    protected JPanel mainPanel;

    public MainFrame(){
        super();

        getMainFrame();
        mainFrame.add(getMainPanel());
    }

    private JFrame getMainFrame() {

        this.mainFrame = new JFrame("Web Crawler");
        this.mainFrame.setLayout(null);
        this.mainFrame.setSize(500,400);
        this.mainFrame.setVisible(true);
        this.mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        return mainFrame;
    }

    public JPanel getMainPanel() {
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout(new FlowLayout());
        this.mainPanel.setSize(400, 300);

        return mainPanel;
    }
}

package view;

import exception.CustomException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by Sabi on 24/06/2017.
 */
public class InnerPanel extends MainFrame {

    private JPanel innerPanel;
    private JPanel issuePanel;
    private JLabel issueLbl;
    private JTextField issueTxtFld;
    private JButton issueBtn;

    private final String WEB_CRAWLER_CONFIG_FILE = "C:\\Users\\Sabi\\Desktop\\WebDriver\\web-crawler-config.wcc";

    private JFileChooser configFileChooser;
    public String configFilePath;

    public InnerPanel() {
        //Forces user to pick the right config file
        do{
                getJFileChooserPanel();
        }while(!configFileChooser.getSelectedFile().toString().equals(WEB_CRAWLER_CONFIG_FILE));

        super.mainPanel.add(getInnerPanel());

        this.innerPanel.add(getIssuePanel(), BorderLayout.NORTH);
        this.issuePanel.add(getIssueLbl(), BorderLayout.WEST);
        this.issuePanel.add(getIssueTxtFld(), BorderLayout.CENTER);
        this.issuePanel.add(getIssueBtn(), BorderLayout.EAST);

        super.mainPanel.revalidate();
        this.mainPanel.revalidate();
        this.issuePanel.revalidate();
    }

    @Override
    public JPanel getInnerPanel() {
        innerPanel = new JPanel();
        innerPanel.setLayout(new BorderLayout());
        innerPanel.setPreferredSize(new Dimension(400, 150));
        return innerPanel;
    }

    @Override
    public  JPanel getIssuePanel() {
        issuePanel = new JPanel();
        innerPanel.setLayout(new BorderLayout());
        innerPanel.setPreferredSize(new Dimension(399, 100));

        return issuePanel;
    }

    @Override
    public JLabel getIssueLbl() {
        issueLbl = new JLabel("Issue: ");
        issueLbl.setPreferredSize(new Dimension(50, 20));
        return issueLbl;
    }

    @Override
    public JTextField getIssueTxtFld() {
        issueTxtFld = new JTextField();
        issueTxtFld.setPreferredSize(new Dimension(150, 25));
        return issueTxtFld;
    }

    @Override
    public JButton getIssueBtn() {
        issueBtn = new JButton("Scrap off");
        return issueBtn;
    }

    @Override
    public JFileChooser getJFileChooserPanel() {
            configFileChooser = new JFileChooser();
            configFileChooser.setCurrentDirectory(new File("C:\\Users\\Sabi\\Desktop\\WebDriverweb-crawler-config.wcc"));
            configFileChooser.setDialogTitle("Find Configuration File");
            configFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            configFileChooser.setAcceptAllFileFilterUsed(false);
            configFileChooser.setMultiSelectionEnabled(false);
            configFileChooser.setFileFilter(new FileNameExtensionFilter("web-crawler-config", "wcc"));

            if (configFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                System.out.println("getCurrentDirectory(): " + configFileChooser.getCurrentDirectory());
                System.out.println("getSelectedFile() : " + configFileChooser.getSelectedFile());
                configFilePath = configFileChooser.getCurrentDirectory().toString();
            } else {
                System.out.println("No Selection ");
            }
        return configFileChooser;
    }

    public void executeScrapOffMechanism(ActionListener listenForKickingOff) {
        issueBtn.addActionListener(listenForKickingOff);

    }
}

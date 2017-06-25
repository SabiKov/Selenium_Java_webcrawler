package view;

import javax.swing.*;

/**
 * Created by Sabi on 24/06/2017.
 */
public interface JElement {

    JPanel getInnerPanel();
    JPanel getIssuePanel();
    JLabel getIssueLbl();
    JTextField getIssueTxtFld();
    JButton getIssueBtn();

}

package exception;

import javax.swing.*;

/**
 * Created by Sabi on 25/06/2017.
 */
public class CustomException extends RuntimeException {


    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);

        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, message);
    }
}

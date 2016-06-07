package booking;

import javax.swing.JOptionPane;

public class MessageBox {
	public MessageBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "Info: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

}

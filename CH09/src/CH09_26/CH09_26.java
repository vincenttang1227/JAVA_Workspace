package CH09_26;

import java.awt.*;
import javax.swing.*;

class MyConfirmDialog extends JFrame
{
	MyConfirmDialog()
	{
		int ans=JOptionPane.showConfirmDialog(null, "現在下雨嗎？","調查",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		
		JLabel lblAns;
		if (ans==JOptionPane.YES_OPTION)
			lblAns=new JLabel("出門請帶雨具");
		else
			lblAns=new JLabel("出門請擦防曬");
		
		add(lblAns);
		
		setTitle("確認對話框");
		setLayout(new FlowLayout());
		setBounds(400, 350, 220, 70);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class CH09_26
{

	public static void main(String[] args)
	{
		new MyConfirmDialog();

	}

}

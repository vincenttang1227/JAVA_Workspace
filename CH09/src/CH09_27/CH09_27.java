package CH09_27;

import javax.swing.*;

class MyInputDialog extends JFrame
{
	MyInputDialog()
	{
		String ans = JOptionPane.showInputDialog(null, "請輸入數字後按確定","輸入",JOptionPane.QUESTION_MESSAGE);
		
		if(ans==null)
			System.exit(0);
		
		JOptionPane.showMessageDialog(null,ans, "輸入結果",JOptionPane.INFORMATION_MESSAGE);
	}
}

public class CH09_27
{

	public static void main(String[] args)
	{
		new MyInputDialog();

	}

}

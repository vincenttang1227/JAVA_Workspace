package CH09_28;

import java.awt.*;
import javax.swing.*;

class MyOptionDialog extends JFrame
{
	MyOptionDialog()
	{
		ImageIcon icon=new ImageIcon();
		
		String[] options = {"晴天","陰天","雨天"};
		int ans = JOptionPane.showOptionDialog(null, "請選擇今天的天氣","天氣",0,0,icon,options,options[0]);
		
		JLabel lblAns;
		if(ans==0)
			lblAns=new JLabel("出門請擦防曬");
		else if(ans==1)
			lblAns=new JLabel("出門建議攜帶雨具");
		else
			lblAns=new JLabel("出門請攜帶雨具");
		
		add(lblAns);
		
		setTitle("選項對話框");
		setLayout(new FlowLayout());
		setBounds(400,400,220,70);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class CH09_28
{

	public static void main(String[] args)
	{
		new MyOptionDialog();

	}

}

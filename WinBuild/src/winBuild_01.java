import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class winBuild_01 extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					winBuild_01 frame = new winBuild_01();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public winBuild_01()
	{
		setFont(new Font("微軟正黑體", Font.PLAIN, 12));
		setTitle("\u53F0\u5E63\u8207\u7F8E\u91D1\u514C\u63DB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8F38\u5165\u91D1\u984D\uFF1A");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 12));
		lblNewLabel.setBounds(27, 17, 100, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8F38\u5165\u7F8E\u5143\u532F\u7387\uFF1A");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 12));
		lblNewLabel_1.setBounds(174, 17, 100, 25);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(27, 50, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 50, 96, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255)), "\u8ACB\u9078\u64C7", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("");
		panel.setBounds(27, 81, 231, 71);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\u53F0\u5E63\u63DB\u7F8E\u91D1");
		rdbtnNewRadioButton.setBounds(6, 31, 107, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("\u7F8E\u91D1\u63DB\u53F0\u5E63");
		radioButton.setBounds(118, 31, 107, 23);
		panel.add(radioButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("請先輸入金額和美元匯率，再選擇兌換的種類。");
		textPane.setBounds(27, 174, 231, 41);
		contentPane.add(textPane);
	}
}

package package1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ToolTipManager;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;

@SuppressWarnings("serial")
public class frame extends JFrame {
	private JTextField totalTextField;
	protected JTextArea textAreaSummary;
	double total = 0;
	protected JLabel userIDLabel;
	public static void main(String[] args) {
					new frame();
	}

	
public frame() {
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(1350, 664);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true)); 
		loginPanel.setBackground(new Color(73, 30, 37));
		loginPanel.setBounds(0, 0, 1350, 626);
		getContentPane().add(loginPanel);
		loginPanel.setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		mainPanel.setBackground(new Color(204,173,235));
		mainPanel.setBounds(0, 0, 1350, 626);
		mainPanel.setLayout(null);
		
		JLabel LogoHereLabel = new JLabel("Cyanel Restaurant");
		LogoHereLabel.setForeground(new Color(255, 255, 255));
		LogoHereLabel.setFont(new Font("MADE Soulmaze", Font.PLAIN, 65));
		LogoHereLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LogoHereLabel.setBounds(230, 35, 890, 151);
		loginPanel.add(LogoHereLabel);
		
		JTextField usernameTextField = new JTextField(20);
		usernameTextField.setMargin(new Insets(2, 7, 2, 2));
		usernameTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		usernameTextField.setText("Username");
		usernameTextField.setToolTipText("Enter Username");
		ToolTipManager.sharedInstance().setDismissDelay(Integer.MAX_VALUE);
		usernameTextField.setBounds(605, 239, 265, 35);
		loginPanel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		JPasswordField passwordTextField  = new JPasswordField(10);
		passwordTextField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordTextField.setToolTipText("Enter Password");
		ToolTipManager.sharedInstance().setDismissDelay(Integer.MAX_VALUE);
		passwordTextField.setMargin(new Insets(2, 7, 2, 2));
		passwordTextField.setBounds(605, 300, 265, 35);
		loginPanel.add(passwordTextField);
		
		JLabel usernameLabel = new JLabel("Username: ");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setBounds(500, 241, 99, 28);
		loginPanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password: ");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordLabel.setForeground(new Color(255, 255, 255));
		passwordLabel.setBounds(500, 303, 99, 28);
		loginPanel.add(passwordLabel);
		
		JButton LoginButton = new JButton("LOGIN");
		LoginButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		LoginButton.setFocusable(false);
		LoginButton.setForeground(new Color(255, 255, 255));
		LoginButton.setBackground(new Color(181, 0, 26));
		LoginButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==LoginButton) {
					String password = new String(passwordTextField.getPassword());
					if(password.equals("123")){
						loginPanel.setVisible(false);
						getContentPane().add(mainPanel);
					} else JOptionPane.showMessageDialog(null, "Passwords is incorrect.");
				} if(e.getSource()==LoginButton) {
					String password = new String(passwordTextField.getPassword());
					if(password.equals("123")){
						loginPanel.setVisible(false);
						mainPanel.setVisible(true);
					}
				} if(e.getSource()==LoginButton) {
					 String text = usernameTextField.getText();
					 userIDLabel.setText(userIDLabel.getText()+ text);
				}
			}
		});
		LoginButton.setBounds(610, 410, 115, 40);
		loginPanel.add(LoginButton);
		
		JButton forgotButton = new JButton("forgot password?");
		forgotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==forgotButton) {
					JOptionPane.showMessageDialog(null, "           Password: 123");
				}
			}
		});
		forgotButton.setFocusable(false);
		forgotButton.setBackground(new Color(73, 30, 37));
		forgotButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		forgotButton.setForeground(new Color(255, 255, 255));
		forgotButton.setBounds(780, 345, 184, 17);
		loginPanel.add(forgotButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\63951\\Downloads\\Cover1.png"));
		lblNewLabel.setBounds(0, 0, 1350, 664);
		loginPanel.add(lblNewLabel);
		
		//SettingPanel
		JPanel mainSettingPanel = new JPanel();
		mainSettingPanel.setBounds(0, 0, 1350, 664);
		mainSettingPanel.setLayout(null);
		mainSettingPanel.setBackground(new Color(181, 0, 26));
		
		JButton settingBackButton = new JButton("BACK");
		settingBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==settingBackButton) {
					mainPanel.setVisible(true);
					mainSettingPanel.setVisible(false);
				}
			}
		});
		settingBackButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		settingBackButton.setFocusable(false);
		settingBackButton.setForeground(new Color(255, 255, 255));
		settingBackButton.setBackground(new Color(181, 0, 26));
		settingBackButton.setBounds(20, 7, 89, 44);
		mainSettingPanel.add(settingBackButton);
		
		//OrderPanel
		JPanel orderPanel = new JPanel();
		orderPanel.setBounds(0, 0, 1341, 664);
		//contentPane.add(panel);
		orderPanel.setLayout(null);
		
		JPanel OrderDashBoardPanel = new JPanel();
		OrderDashBoardPanel.setFocusable(false);
		OrderDashBoardPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		OrderDashBoardPanel.setBackground(new Color(181, 0, 26));
		OrderDashBoardPanel.setBounds(0, 0, 229, 674);
		OrderDashBoardPanel.setLayout(null);
		orderPanel.add(OrderDashBoardPanel);
		

		//panels if dashboard is clicked
		JPanel bestSellerPanel = new JPanel();
		bestSellerPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		bestSellerPanel.setBackground(new Color(121, 0, 17));
		bestSellerPanel.setLayout(null);
		bestSellerPanel.setBounds(0, 0, 1058, 664);
		orderPanel.add(bestSellerPanel);
		Image taco = new ImageIcon(this.getClass().getResource("/taco.png")).getImage();
		Image pizza = new ImageIcon(this.getClass().getResource("/pizza.png")).getImage();
		Image milktea = new ImageIcon(this.getClass().getResource("/milktea.png")).getImage();
		Image chicken = new ImageIcon(this.getClass().getResource("/chicken.png")).getImage();
		Image donut = new ImageIcon(this.getClass().getResource("/donut.png")).getImage();
		Image brownie = new ImageIcon(this.getClass().getResource("/brownie.png")).getImage();
		
		JPanel bestTacoPanel = new JPanel();
		bestTacoPanel.setBorder(null);
		bestTacoPanel.setBackground(new Color(223, 171, 136));
		bestTacoPanel.setBounds(249, 118, 250, 204);
		bestSellerPanel.add(bestTacoPanel);
		bestTacoPanel.setLayout(null);
		
		JLabel bestTacoPrice = new JLabel("₱ 35.00");
		bestTacoPrice.setHorizontalAlignment(SwingConstants.LEFT);
		bestTacoPrice.setForeground(Color.WHITE);
		bestTacoPrice.setFont(new Font("Arial", Font.BOLD, 19));
		bestTacoPrice.setBounds(165, 120, 123, 32);
		bestTacoPanel.add(bestTacoPrice);
		
		JLabel bestTacoName = new JLabel("Taco");
		bestTacoName.setForeground(Color.WHITE);
		bestTacoName.setFont(new Font("Arial", Font.BOLD, 20));
		bestTacoName.setBounds(15, 120, 147, 32);
		bestTacoPanel.add(bestTacoName);
		
		JButton buybestTacoButton = new JButton("BUY");
		buybestTacoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buybestTacoButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "    Taco           35.00 \n");
							total+=35;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});		
		buybestTacoButton.setBorder((Border) new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buybestTacoButton.setBackground(new Color(255, 236, 236));
		buybestTacoButton.setFont(new Font("Arial", Font.BOLD, 15));
		buybestTacoButton.setFocusable(false);
		buybestTacoButton.setBounds(85, 160, 87, 32);
		bestTacoPanel.add(buybestTacoButton);
		
		JLabel bestTacoLabel = new JLabel();
		bestTacoLabel.setBounds(68, 25, 123, 71);
		bestTacoPanel.add(bestTacoLabel);
		bestTacoLabel.setIcon(new ImageIcon(taco));
		
		JPanel bestPizzaPanel = new JPanel();
		bestPizzaPanel.setLayout(null);
		bestPizzaPanel.setBorder(null);
		bestPizzaPanel.setBackground(new Color(223, 171, 136));
		bestPizzaPanel.setBounds(519, 118, 250, 204);
		bestSellerPanel.add(bestPizzaPanel);
		
		JLabel bestPizzaPrice = new JLabel("₱ 100.00");
		bestPizzaPrice.setForeground(Color.WHITE);
		bestPizzaPrice.setFont(new Font("Arial", Font.BOLD, 19));
		bestPizzaPrice.setBounds(165, 120, 123, 32);
		bestPizzaPanel.add(bestPizzaPrice);
		
		JLabel bestPizzaName = new JLabel("Pizza");
		bestPizzaName.setForeground(Color.WHITE);
		bestPizzaName.setFont(new Font("Arial", Font.BOLD, 20));
		bestPizzaName.setBounds(15, 120, 147, 32);
		bestPizzaPanel.add(bestPizzaName);
		
		JButton buybestPizzaButton = new JButton("BUY");
		buybestPizzaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buybestPizzaButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Pizza          100.00\n");
							total+=100;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});	
		buybestPizzaButton.setFont(new Font("Arial", Font.BOLD, 15));
		buybestPizzaButton.setFocusable(false);
		buybestPizzaButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buybestPizzaButton.setBackground(new Color(255, 236, 236));
		buybestPizzaButton.setBounds(85, 160, 87, 32);
		bestPizzaPanel.add(buybestPizzaButton);
		
		JLabel bestPizzaLabel = new JLabel();
		bestPizzaLabel.setBounds(57, 0, 134, 130);
		bestPizzaPanel.add(bestPizzaLabel);
		bestPizzaLabel.setIcon(new ImageIcon(pizza));
		
		JPanel bestMilkTeaPanel = new JPanel();
		bestMilkTeaPanel.setLayout(null);
		bestMilkTeaPanel.setBorder(null);
		bestMilkTeaPanel.setBackground(new Color(223, 171, 136));
		bestMilkTeaPanel.setBounds(790, 118, 250, 204);
		bestSellerPanel.add(bestMilkTeaPanel);
		
		JLabel bestMilkTeaPrice = new JLabel("₱ 45.00");
		bestMilkTeaPrice.setForeground(Color.WHITE);
		bestMilkTeaPrice.setFont(new Font("Arial", Font.BOLD, 19));
		bestMilkTeaPrice.setBounds(165, 120, 123, 32);
		bestMilkTeaPanel.add(bestMilkTeaPrice);
		
		JLabel bestMilkTeaName = new JLabel("Milk Tea");
		bestMilkTeaName.setForeground(Color.WHITE);
		bestMilkTeaName.setFont(new Font("Arial", Font.BOLD, 20));
		bestMilkTeaName.setBounds(15, 120, 147, 32);
		bestMilkTeaPanel.add(bestMilkTeaName);
		
		JButton buybestMilkTeaButton = new JButton("BUY");
		buybestMilkTeaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buybestMilkTeaButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Milktea        45.00\n");
							total+=45;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});	
		buybestMilkTeaButton.setFont(new Font("Arial", Font.BOLD, 15));
		buybestMilkTeaButton.setFocusable(false);
		buybestMilkTeaButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buybestMilkTeaButton.setBackground(new Color(255, 236, 236));
		buybestMilkTeaButton.setBounds(85, 160, 87, 32);
		bestMilkTeaPanel.add(buybestMilkTeaButton);
		
		JLabel bestMilkTeaLabel = new JLabel("");
		bestMilkTeaLabel.setBounds(85, 0, 81, 131);
		bestMilkTeaPanel.add(bestMilkTeaLabel);
		bestMilkTeaLabel.setIcon(new ImageIcon(milktea));
		
		JPanel bestChickenPanel = new JPanel();
		bestChickenPanel.setLayout(null);
		bestChickenPanel.setBorder(null);
		bestChickenPanel.setBackground(new Color(223, 171, 136));
		bestChickenPanel.setBounds(249, 339, 250, 204);
		bestSellerPanel.add(bestChickenPanel);
		
		JLabel bestChickenPrice = new JLabel("₱ 40.00");
		bestChickenPrice.setForeground(Color.WHITE);
		bestChickenPrice.setFont(new Font("Arial", Font.BOLD, 19));
		bestChickenPrice.setBounds(165, 120, 123, 32);
		bestChickenPanel.add(bestChickenPrice);
		
		JLabel bestChickenName = new JLabel("Fried Chicken");
		bestChickenName.setForeground(Color.WHITE);
		bestChickenName.setFont(new Font("Arial", Font.BOLD, 20));
		bestChickenName.setBounds(15, 120, 147, 32);
		bestChickenPanel.add(bestChickenName);
		
		JButton buybestChickenButton = new JButton("BUY");
		buybestChickenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buybestChickenButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\rFried Chicken   40.00\n");
							total+=40;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});	
		buybestChickenButton.setFont(new Font("Arial", Font.BOLD, 15));
		buybestChickenButton.setFocusable(false);
		buybestChickenButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buybestChickenButton.setBackground(new Color(255, 236, 236));
		buybestChickenButton.setBounds(85, 160, 87, 32);
		bestChickenPanel.add(buybestChickenButton);
		
		JLabel bestChickenLabel = new JLabel("");
		bestChickenLabel.setBounds(58, 17, 123, 85);
		bestChickenPanel.add(bestChickenLabel);
		bestChickenLabel.setIcon(new ImageIcon(chicken));
		
		JPanel bestDonutPanel = new JPanel();
		bestDonutPanel.setLayout(null);
		bestDonutPanel.setBorder(null);
		bestDonutPanel.setBackground(new Color(223, 171, 136));
		bestDonutPanel.setBounds(519, 339, 250, 204);
		bestSellerPanel.add(bestDonutPanel);
		
		JLabel bestDonutPrice = new JLabel("₱ 15.00");
		bestDonutPrice.setForeground(Color.WHITE);
		bestDonutPrice.setFont(new Font("Arial", Font.BOLD, 19));
		bestDonutPrice.setBounds(165, 120, 123, 32);
		bestDonutPanel.add(bestDonutPrice);
		
		JLabel bestDonutName = new JLabel("Donut");
		bestDonutName.setForeground(Color.WHITE);
		bestDonutName.setFont(new Font("Arial", Font.BOLD, 20));
		bestDonutName.setBounds(15, 120, 147, 32);
		bestDonutPanel.add(bestDonutName);
		
		JButton buyBestDonutButton = new JButton("BUY");
		buyBestDonutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyBestDonutButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Donut          15.00\n");
							total+=15;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});	
		buyBestDonutButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyBestDonutButton.setFocusable(false);
		buyBestDonutButton.setFocusTraversalKeysEnabled(false);
		buyBestDonutButton.setFocusPainted(false);
		buyBestDonutButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyBestDonutButton.setBackground(new Color(255, 236, 236));
		buyBestDonutButton.setBounds(85, 160, 87, 32);
		bestDonutPanel.add(buyBestDonutButton);
		
		JLabel bestDonutLabel = new JLabel();
		bestDonutLabel.setBounds(58, 18, 130, 86);
		bestDonutPanel.add(bestDonutLabel);
		bestDonutLabel.setIcon(new ImageIcon(donut));
		
		JPanel bestBrowniesPanel = new JPanel();
		bestBrowniesPanel.setLayout(null);
		bestBrowniesPanel.setBorder(null);
		bestBrowniesPanel.setBackground(new Color(223, 171, 136));
		bestBrowniesPanel.setBounds(790, 339, 250, 204);
		bestSellerPanel.add(bestBrowniesPanel);
		
		JLabel bestBrowniesPrice = new JLabel("₱ 30.00");
		bestBrowniesPrice.setForeground(Color.WHITE);
		bestBrowniesPrice.setFont(new Font("Arial", Font.BOLD, 19));
		bestBrowniesPrice.setBounds(165, 120, 123, 32);
		bestBrowniesPanel.add(bestBrowniesPrice);
		
		JLabel bestBrowniesName = new JLabel("Brownies");
		bestBrowniesName.setForeground(Color.WHITE);
		bestBrowniesName.setFont(new Font("Arial", Font.BOLD, 20));
		bestBrowniesName.setBounds(15, 120, 147, 32);
		bestBrowniesPanel.add(bestBrowniesName);
		
		JButton buybestBrowniesButton = new JButton("BUY");
		buybestBrowniesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buybestBrowniesButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Brownies       30.00\n");
							total+=30;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});	
		buybestBrowniesButton.setFont(new Font("Arial", Font.BOLD, 15));
		buybestBrowniesButton.setFocusable(false);
		buybestBrowniesButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buybestBrowniesButton.setBackground(new Color(255, 236, 236));
		buybestBrowniesButton.setBounds(85, 160, 87, 32);
		bestBrowniesPanel.add(buybestBrowniesButton);
		
		JLabel bestBownieLabel = new JLabel();
		bestBownieLabel.setBounds(64, 20, 120, 84);
		bestBrowniesPanel.add(bestBownieLabel);
		bestBownieLabel.setIcon(new ImageIcon(brownie));
		
		JLabel bestSellerTitleLabel = new JLabel("BEST SELLER");
		bestSellerTitleLabel.setForeground(new Color(255, 255, 255));
		bestSellerTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		bestSellerTitleLabel.setFont(new Font("Deli", Font.PLAIN, 55));
		bestSellerTitleLabel.setBounds(345, 25, 582, 77);
		bestSellerPanel.add(bestSellerTitleLabel);
		
		JPanel foodsPanel = new JPanel();
		foodsPanel.setBackground(new Color(121, 0, 17));
		foodsPanel.setLayout(null);
		foodsPanel.setBounds(0, 0, 1062, 664);
		Image chicken1 = new ImageIcon(this.getClass().getResource("/chicken.png")).getImage();
		Image burger = new ImageIcon(this.getClass().getResource("/burger.png")).getImage();
		Image bulgogi = new ImageIcon(this.getClass().getResource("/bulgogi bibimbap.png")).getImage();
		Image pizza1 = new ImageIcon(this.getClass().getResource("/pizza.png")).getImage();
		Image sushi = new ImageIcon(this.getClass().getResource("/sushi.png")).getImage();
		Image taco1 = new ImageIcon(this.getClass().getResource("/taco.png")).getImage();
		
		JPanel sushiPanel = new JPanel();
		sushiPanel.setLayout(null);
		sushiPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		sushiPanel.setBackground(new Color(223, 171, 136));
		sushiPanel.setBounds(519, 339, 250, 204);
		foodsPanel.add(sushiPanel);
		
		JLabel sushiPrice = new JLabel("₱ 55.00");
		sushiPrice.setForeground(Color.WHITE);
		sushiPrice.setFont(new Font("Arial", Font.BOLD, 19));
		sushiPrice.setBounds(165, 120, 123, 32);
		sushiPanel.add(sushiPrice);
		
		JLabel sushiName = new JLabel("Sushi");
		sushiName.setForeground(Color.WHITE);
		sushiName.setFont(new Font("Arial", Font.BOLD, 20));
		sushiName.setBounds(15, 120, 147, 32);
		sushiPanel.add(sushiName);
		
		JButton buySushiButton = new JButton("BUY");
		buySushiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buySushiButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Sushi          55.00\n");
							total+=55;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});	
		buySushiButton.setFont(new Font("Arial", Font.BOLD, 15));
		buySushiButton.setFocusable(false);
		buySushiButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buySushiButton.setBackground(new Color(255, 236, 236));
		buySushiButton.setBounds(85, 160, 87, 32);
		sushiPanel.add(buySushiButton);
		
		JLabel sushiLabel = new JLabel();
		sushiLabel.setBounds(55, 8, 130, 119);
		sushiPanel.add(sushiLabel);
		sushiLabel.setIcon(new ImageIcon(sushi));
		
		JPanel chickenPanel = new JPanel();
		chickenPanel.setLayout(null);
		chickenPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		chickenPanel.setBackground(new Color(223, 171, 136));
		chickenPanel.setBounds(249, 118, 250, 204);
		foodsPanel.add(chickenPanel);
		
		JLabel chickenPrice = new JLabel("₱ 40.00");
		chickenPrice.setForeground(Color.WHITE);
		chickenPrice.setFont(new Font("Arial", Font.BOLD, 19));
		chickenPrice.setBounds(165, 120, 123, 32);
		chickenPanel.add(chickenPrice);
		
		JLabel chickenName = new JLabel("Fried Chicken");
		chickenName.setForeground(Color.WHITE);
		chickenName.setFont(new Font("Arial", Font.BOLD, 20));
		chickenName.setBounds(15, 120, 147, 32);
		chickenPanel.add(chickenName);
		
		JButton buyChickenButton = new JButton("BUY");
		buyChickenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyChickenButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "  \r\r Fried Chicken   40.00\n");
							total+=40;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});	
		buyChickenButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyChickenButton.setFocusable(false);
		buyChickenButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyChickenButton.setBackground(new Color(255, 236, 236));
		buyChickenButton.setBounds(85, 160, 87, 32);
		chickenPanel.add(buyChickenButton);
		
		JLabel chickenLabel = new JLabel();
		chickenLabel.setBounds(63, 8, 123, 108);
		chickenPanel.add(chickenLabel);
		chickenLabel.setIcon(new ImageIcon(chicken1));
		
		JPanel burgerPanel = new JPanel();
		burgerPanel.setLayout(null);
		burgerPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		burgerPanel.setBackground(new Color(223, 171, 136));
		burgerPanel.setBounds(519, 118, 250, 204);
		foodsPanel.add(burgerPanel);
		
		JLabel burgerPrice = new JLabel("₱ 45.00");
		burgerPrice.setForeground(Color.WHITE);
		burgerPrice.setFont(new Font("Arial", Font.BOLD, 19));
		burgerPrice.setBounds(165, 120, 123, 32);
		burgerPanel.add(burgerPrice);
		
		JLabel burgerName = new JLabel("Burger");
		burgerName.setForeground(Color.WHITE);
		burgerName.setFont(new Font("Arial", Font.BOLD, 20));
		burgerName.setBounds(15, 120, 147, 32);
		burgerPanel.add(burgerName);
		
		JButton buyBurgerButton = new JButton("BUY");
		buyBurgerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyBurgerButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Burger         45.00\n");
							total+=45;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});	
		buyBurgerButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyBurgerButton.setFocusable(false);
		buyBurgerButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyBurgerButton.setBackground(new Color(255, 236, 236));
		buyBurgerButton.setBounds(85, 160, 87, 32);
		burgerPanel.add(buyBurgerButton);
		
		JLabel burgerLabel = new JLabel();
		burgerLabel.setBounds(72, 22, 100, 83);
		burgerPanel.add(burgerLabel);
		burgerLabel.setIcon(new ImageIcon(burger));
		
		JPanel bulgogiPanel = new JPanel();
		bulgogiPanel.setLayout(null);
		bulgogiPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		bulgogiPanel.setBackground(new Color(223, 171, 136));
		bulgogiPanel.setBounds(790, 118, 250, 204);
		foodsPanel.add(bulgogiPanel);
		
		JLabel bulgogiPrice = new JLabel("₱ 155.00");
		bulgogiPrice.setForeground(Color.WHITE);
		bulgogiPrice.setFont(new Font("Arial", Font.BOLD, 18));
		bulgogiPrice.setBounds(165, 120, 123, 32);
		bulgogiPanel.add(bulgogiPrice);
		
		JLabel bulgogiName = new JLabel("Bulgogi Bibimbap");
		bulgogiName.setForeground(Color.WHITE);
		bulgogiName.setFont(new Font("Arial", Font.BOLD, 17));
		bulgogiName.setBounds(15, 120, 181, 32);
		bulgogiPanel.add(bulgogiName);
		
		JButton buyBulgogiButton = new JButton("BUY");
		buyBulgogiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyBulgogiButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Bibimbap       155.00\n");
							total+=155;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyBulgogiButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyBulgogiButton.setFocusable(false);
		buyBulgogiButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyBulgogiButton.setBackground(new Color(255, 236, 236));
		buyBulgogiButton.setBounds(85, 160, 87, 32);
		bulgogiPanel.add(buyBulgogiButton);
		
		JLabel bulgogiLabel = new JLabel();
		bulgogiLabel.setBounds(45, 0, 150, 133);
		bulgogiPanel.add(bulgogiLabel);
		bulgogiLabel.setIcon(new ImageIcon(bulgogi));
		
		JPanel pizzaPanel = new JPanel();
		pizzaPanel.setLayout(null);
		pizzaPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		pizzaPanel.setBackground(new Color(223, 171, 136));
		pizzaPanel.setBounds(249, 339, 250, 204);
		foodsPanel.add(pizzaPanel);
		
		JLabel pizzaPrice = new JLabel("₱ 100.00");
		pizzaPrice.setForeground(Color.WHITE);
		pizzaPrice.setFont(new Font("Arial", Font.BOLD, 19));
		pizzaPrice.setBounds(165, 120, 123, 32);
		pizzaPanel.add(pizzaPrice);
		
		JLabel pizzaName = new JLabel("Pizza");
		pizzaName.setForeground(Color.WHITE);
		pizzaName.setFont(new Font("Arial", Font.BOLD, 20));
		pizzaName.setBounds(15, 120, 147, 32);
		pizzaPanel.add(pizzaName);
		
		JButton buyPizzaButton = new JButton("BUY");
		buyPizzaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyPizzaButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Pizza          100.00\n");
							total+=100;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyPizzaButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyPizzaButton.setFocusable(false);
		buyPizzaButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyPizzaButton.setBackground(new Color(255, 236, 236));
		buyPizzaButton.setBounds(85, 160, 87, 32);
		pizzaPanel.add(buyPizzaButton);
		
		JLabel pizzaLabel = new JLabel();
		pizzaLabel.setBounds(59, 5, 130, 121);
		pizzaPanel.add(pizzaLabel);
		pizzaLabel.setIcon(new ImageIcon(pizza1));
		
		JPanel tacoPanel = new JPanel();
		tacoPanel.setLayout(null);
		tacoPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		tacoPanel.setBackground(new Color(223, 171, 136));
		tacoPanel.setBounds(790, 339, 250, 204);
		foodsPanel.add(tacoPanel);
		
		JLabel tacoPrice = new JLabel("₱ 35.00");
		tacoPrice.setForeground(Color.WHITE);
		tacoPrice.setFont(new Font("Arial", Font.BOLD, 19));
		tacoPrice.setBounds(165, 120, 123, 32);
		tacoPanel.add(tacoPrice);
		
		JLabel tacoName = new JLabel("Taco");
		tacoName.setForeground(Color.WHITE);
		tacoName.setFont(new Font("Arial", Font.BOLD, 20));
		tacoName.setBounds(15, 120, 147, 32);
		tacoPanel.add(tacoName);
		
		JButton buyTacoButton = new JButton("BUY");
		buyTacoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyTacoButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Taco           35.00\n");
							total+=35;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyTacoButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyTacoButton.setFocusable(false);
		buyTacoButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyTacoButton.setBackground(new Color(255, 236, 236));
		buyTacoButton.setBounds(85, 160, 87, 32);
		tacoPanel.add(buyTacoButton);
		
		JLabel tacoLabel = new JLabel();
		tacoLabel.setBounds(58, 17, 123, 85);
		tacoPanel.add(tacoLabel);
		tacoLabel.setIcon(new ImageIcon(taco1));
		
		JLabel foodsTitleLabel = new JLabel("FOODS");
		foodsTitleLabel.setForeground(new Color(255, 255, 255));
		foodsTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		foodsTitleLabel.setFont(new Font("Deli", Font.PLAIN, 55));
		foodsTitleLabel.setBounds(345, 25, 582, 77);
		foodsPanel.add(foodsTitleLabel);
		

		JPanel dessertPanel = new JPanel();
		dessertPanel.setBackground(new Color(121, 0, 17));
		dessertPanel.setLayout(null);
		dessertPanel.setBounds(0, 0, 1058, 664);
		orderPanel.add(dessertPanel);
		Image donut1 = new ImageIcon(this.getClass().getResource("/donut.png")).getImage();
		Image brownie1 = new ImageIcon(this.getClass().getResource("/brownie.png")).getImage();
		Image cheesecake = new ImageIcon(this.getClass().getResource("/cheesecake.png")).getImage();
		Image icecream = new ImageIcon(this.getClass().getResource("/icecream.png")).getImage();
		Image waffle = new ImageIcon(this.getClass().getResource("/waffle.png")).getImage();
		Image tiramisu = new ImageIcon(this.getClass().getResource("/tiramisu.png")).getImage();
		
		JPanel donutPanel = new JPanel();
		donutPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		donutPanel.setBackground(new Color(223, 171, 136));
		donutPanel.setBounds(249, 118, 250, 204);
		dessertPanel.add(donutPanel);
		donutPanel.setLayout(null);
		
		JLabel donutLabel = new JLabel();
		donutLabel.setBounds(60, 19, 130, 86);
		donutPanel.add(donutLabel);
		donutLabel.setBackground(new Color(236, 208, 247));
		donutLabel.setIcon(new ImageIcon(donut1));
		
		JLabel donutName = new JLabel("Donut");
		donutName.setForeground(new Color(255, 255, 255));
		donutName.setFont(new Font("Arial", Font.BOLD, 20));
		donutName.setBounds(15, 120, 147, 32);
		donutPanel.add(donutName);
		
		JLabel donutPrice = new JLabel("₱ 15.00");
		donutPrice.setForeground(Color.WHITE);
		donutPrice.setFont(new Font("Arial", Font.BOLD, 19));
		donutPrice.setBounds(165, 120, 80, 32);
		donutPanel.add(donutPrice);
		
		JButton buyDonutButton = new JButton("BUY");
		buyDonutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyDonutButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Donut          15.00\n");
							total+=15;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyDonutButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyDonutButton.setBackground(new Color(255, 236, 236));
		buyDonutButton.setFocusable(false);
		buyDonutButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyDonutButton.setBounds(85, 160, 87, 32);
		donutPanel.add(buyDonutButton);
		
		JPanel browniesPanel = new JPanel();
		browniesPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		browniesPanel.setBackground(new Color(223, 171, 136));
		browniesPanel.setBounds(249, 339, 250, 204);
		dessertPanel.add(browniesPanel);
		browniesPanel.setLayout(null);
		
		JLabel brownieLabel = new JLabel();
		brownieLabel.setBounds(70, 19, 110, 92);
		browniesPanel.add(brownieLabel);
		brownieLabel.setIcon(new ImageIcon(brownie1));
		
		JLabel browniesPrice = new JLabel("₱ 30.00");
		browniesPrice.setForeground(Color.WHITE);
		browniesPrice.setFont(new Font("Arial", Font.BOLD, 19));
		browniesPrice.setBounds(165, 120, 123, 32);
		browniesPanel.add(browniesPrice);
		
		JLabel browniesName = new JLabel("Brownies");
		browniesName.setForeground(Color.WHITE);
		browniesName.setFont(new Font("Arial", Font.BOLD, 20));
		browniesName.setBounds(15, 120, 147, 32);
		browniesPanel.add(browniesName);
		
		JButton buyBrowniesButton = new JButton("BUY");
		buyBrowniesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyBrowniesButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Brownies       30.00\n");
							total+=30;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyBrowniesButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyBrowniesButton.setBackground(new Color(255, 236, 236));
		buyBrowniesButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyBrowniesButton.setFocusable(false);
		buyBrowniesButton.setBounds(85, 160, 87, 32);
		browniesPanel.add(buyBrowniesButton);
		
		JPanel cheeseCakePanel = new JPanel();
		cheeseCakePanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		cheeseCakePanel.setBackground(new Color(223, 171, 136));
		cheeseCakePanel.setBounds(519, 118, 250, 204);
		dessertPanel.add(cheeseCakePanel);
		cheeseCakePanel.setLayout(null);
		
		JLabel cheesecakeLabel = new JLabel();
		cheesecakeLabel.setBounds(59, 12, 132, 96);
		cheeseCakePanel.add(cheesecakeLabel);
		cheesecakeLabel.setIcon(new ImageIcon(cheesecake));
		
		JLabel cheeseCakeName = new JLabel("Cheese Cake");
		cheeseCakeName.setForeground(Color.WHITE);
		cheeseCakeName.setFont(new Font("Arial", Font.BOLD, 20));
		cheeseCakeName.setBounds(15, 120, 147, 32);
		cheeseCakePanel.add(cheeseCakeName);
		
		JLabel cheeseCakePrice = new JLabel("₱ 25.00");
		cheeseCakePrice.setForeground(Color.WHITE);
		cheeseCakePrice.setFont(new Font("Arial", Font.BOLD, 19));
		cheeseCakePrice.setBounds(165, 120, 123, 32);
		cheeseCakePanel.add(cheeseCakePrice);
		
		JButton buyCheesecakeButton = new JButton("BUY");
		buyCheesecakeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyCheesecakeButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\rCheese Cake     25.00\n");
							total+=25;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyCheesecakeButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyCheesecakeButton.setBackground(new Color(255, 236, 236));
		buyCheesecakeButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyCheesecakeButton.setFocusable(false);
		buyCheesecakeButton.setBounds(85, 160, 87, 32);
		cheeseCakePanel.add(buyCheesecakeButton);
		
		JPanel icecreamPanel = new JPanel();
		icecreamPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		icecreamPanel.setBackground(new Color(223, 171, 136));
		icecreamPanel.setBounds(790, 118, 250, 204);
		dessertPanel.add(icecreamPanel);
		icecreamPanel.setLayout(null);
		
		JLabel icecreamLabel = new JLabel();
		icecreamLabel.setBounds(83, 11, 80, 112);
		icecreamPanel.add(icecreamLabel);
		icecreamLabel.setIcon(new ImageIcon(icecream));
		
		JLabel icecreamPrice = new JLabel("₱ 25.00");
		icecreamPrice.setForeground(Color.WHITE);
		icecreamPrice.setFont(new Font("Arial", Font.BOLD, 19));
		icecreamPrice.setBounds(165, 120, 123, 32);
		icecreamPanel.add(icecreamPrice);
		
		JLabel icecreamName = new JLabel("Ice cream");
		icecreamName.setForeground(Color.WHITE);
		icecreamName.setFont(new Font("Arial", Font.BOLD, 20));
		icecreamName.setBounds(15, 120, 147, 32);
		icecreamPanel.add(icecreamName);
		
		JButton buyIcecreamButton = new JButton("BUY");
		buyIcecreamButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyIcecreamButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Ice Cream      25.00\n");
							total+=25;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyIcecreamButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyIcecreamButton.setBackground(new Color(255, 236, 236));
		buyIcecreamButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyIcecreamButton.setFocusable(false);
		buyIcecreamButton.setBounds(85, 160, 87, 32);
		icecreamPanel.add(buyIcecreamButton);
		
		JPanel wafflePanel = new JPanel();
		wafflePanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		wafflePanel.setBackground(new Color(223, 171, 136));
		wafflePanel.setBounds(519, 339, 250, 204);
		dessertPanel.add(wafflePanel);
		wafflePanel.setLayout(null);
		
		JLabel waffleLabel = new JLabel();
		waffleLabel.setBounds(64, 19, 120, 84);
		wafflePanel.add(waffleLabel);
		waffleLabel.setIcon(new ImageIcon(waffle));
		
		JLabel wafflePrice = new JLabel("₱ 35.00");
		wafflePrice.setForeground(Color.WHITE);
		wafflePrice.setFont(new Font("Arial", Font.BOLD, 19));
		wafflePrice.setBounds(165, 120, 123, 32);
		wafflePanel.add(wafflePrice);
		
		JLabel waffleName = new JLabel("Waffle");
		waffleName.setForeground(Color.WHITE);
		waffleName.setFont(new Font("Arial", Font.BOLD, 20));
		waffleName.setBounds(15, 120, 147, 32);
		wafflePanel.add(waffleName);
		
		JButton buyWaffleButton = new JButton("BUY");
		buyWaffleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyWaffleButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Waffle         35.00\n");
							total+=35;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyWaffleButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyWaffleButton.setBackground(new Color(255, 236, 236));
		buyWaffleButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyWaffleButton.setFocusable(false);
		buyWaffleButton.setBounds(85, 160, 87, 32);
		wafflePanel.add(buyWaffleButton);
		
		JPanel tiramisuPanel = new JPanel();
		tiramisuPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		tiramisuPanel.setBackground(new Color(223, 171, 136));
		tiramisuPanel.setBounds(790, 339, 250, 204);
		dessertPanel.add(tiramisuPanel);
		tiramisuPanel.setLayout(null);
		
		JLabel tiramisuLabel = new JLabel();
		tiramisuLabel.setBounds(63, 8, 120, 120);
		tiramisuPanel.add(tiramisuLabel);
		tiramisuLabel.setIcon(new ImageIcon(tiramisu));
		
		JLabel tiramisuPrice = new JLabel("₱ 45.00");
		tiramisuPrice.setForeground(Color.WHITE);
		tiramisuPrice.setFont(new Font("Arial", Font.BOLD, 19));
		tiramisuPrice.setBounds(165, 120, 123, 32);
		tiramisuPanel.add(tiramisuPrice);
		
		JLabel TiramisuName = new JLabel("Tiramisu");
		TiramisuName.setForeground(Color.WHITE);
		TiramisuName.setFont(new Font("Arial", Font.BOLD, 20));
		TiramisuName.setBounds(15, 120, 147, 32);
		tiramisuPanel.add(TiramisuName);
		
		JButton buyTiramisuButton = new JButton("BUY");
		buyTiramisuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyTiramisuButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Tiramisu       45.00\n");
							total+=45;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyTiramisuButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyTiramisuButton.setBackground(new Color(255, 236, 236));
		buyTiramisuButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyTiramisuButton.setFocusable(false);
		buyTiramisuButton.setBounds(85, 160, 87, 32);
		tiramisuPanel.add(buyTiramisuButton);
		
		JLabel dessertsTitleLabel = new JLabel("DESSERTS");
		dessertsTitleLabel.setForeground(new Color(255, 255, 255));
		dessertsTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dessertsTitleLabel.setFont(new Font("Deli", Font.PLAIN, 55));
		dessertsTitleLabel.setBounds(345, 25, 582, 77);
		dessertPanel.add(dessertsTitleLabel);
		
		JPanel drinksPanel = new JPanel();
		drinksPanel.setBackground(new Color(121, 0, 17));
		drinksPanel.setLayout(null);
		drinksPanel.setBounds(0, 0, 1062, 664);
		Image coke = new ImageIcon(this.getClass().getResource("/Coke.png")).getImage();
		Image orangeJuice = new ImageIcon(this.getClass().getResource("/orangeJuice.png")).getImage();
		Image milkShake = new ImageIcon(this.getClass().getResource("/milkShake.png")).getImage();
		Image coffee = new ImageIcon(this.getClass().getResource("/coffee.png")).getImage();
		Image water = new ImageIcon(this.getClass().getResource("/water.png")).getImage();
		Image milktea1 = new ImageIcon(this.getClass().getResource("/milktea.png")).getImage();
		
		
		JPanel cokePanel = new JPanel();
		cokePanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		cokePanel.setBackground(new Color(223, 171, 136));
		cokePanel.setBounds(255, 110, 250, 233);
		drinksPanel.add(cokePanel);
		cokePanel.setLayout(null);
		
		JLabel cokeName = new JLabel("Coke");
		cokeName.setForeground(new Color(255, 255, 255));
		cokeName.setFont(new Font("Arial", Font.BOLD, 20));
		cokeName.setBounds(13, 135, 147, 32);
		cokePanel.add(cokeName);
		
		JLabel cokePrice = new JLabel("₱ 10.00");
		cokePrice.setForeground(Color.WHITE);
		cokePrice.setFont(new Font("Arial", Font.BOLD, 19));
		cokePrice.setBounds(164, 135, 80, 32);
		cokePanel.add(cokePrice);
		
		JButton buyCokeButton = new JButton("BUY");
		buyCokeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyCokeButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Coke           10.00\n");
							total+=10;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyCokeButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyCokeButton.setBackground(new Color(255, 236, 236));
		buyCokeButton.setFocusable(false);
		buyCokeButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyCokeButton.setBounds(85, 178, 87, 32);
		cokePanel.add(buyCokeButton);
	
		JLabel cokeLabel = new JLabel();
		cokeLabel.setBounds(68, 0, 94, 141);
		cokePanel.add(cokeLabel);
		cokeLabel.setIcon(new ImageIcon(coke));
	
		JPanel milkShakePanel = new JPanel();
		milkShakePanel.setLayout(null);
		milkShakePanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		milkShakePanel.setBackground(new Color(223, 171, 136));
		milkShakePanel.setBounds(523, 110, 250, 233);
		drinksPanel.add(milkShakePanel);
		
		JLabel milkShakeName = new JLabel("Milkshake");
		milkShakeName.setForeground(Color.WHITE);
		milkShakeName.setFont(new Font("Arial", Font.BOLD, 20));
		milkShakeName.setBounds(13, 135, 147, 32);
		milkShakePanel.add(milkShakeName);
		
		JLabel milkShakePrice = new JLabel("₱ 35.00");
		milkShakePrice.setForeground(Color.WHITE);
		milkShakePrice.setFont(new Font("Arial", Font.BOLD, 19));
		milkShakePrice.setBounds(164, 135, 80, 32);
		milkShakePanel.add(milkShakePrice);
		
		JButton buyMilkShakeButton = new JButton("BUY");
		buyMilkShakeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyMilkShakeButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\rMilk Shake      35.00\n");
							total+=35;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyMilkShakeButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyMilkShakeButton.setFocusable(false);
		buyMilkShakeButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyMilkShakeButton.setBackground(new Color(255, 236, 236));
		buyMilkShakeButton.setBounds(85, 178, 87, 32);
		milkShakePanel.add(buyMilkShakeButton);
		
		JLabel milkShakeLabel = new JLabel();
		milkShakeLabel.setBounds(51, 0, 130, 147);
		milkShakePanel.add(milkShakeLabel);
		milkShakeLabel.setIcon(new ImageIcon(milkShake));
		
		JPanel coffeePanel = new JPanel();
		coffeePanel.setLayout(null);
		coffeePanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		coffeePanel.setBackground(new Color(223, 171, 136));
		coffeePanel.setBounds(790, 110, 250, 233);
		drinksPanel.add(coffeePanel);
		
		JLabel coffeeName = new JLabel("Coffee");
		coffeeName.setForeground(Color.WHITE);
		coffeeName.setFont(new Font("Arial", Font.BOLD, 20));
		coffeeName.setBounds(13, 135, 147, 32);
		coffeePanel.add(coffeeName);
		
		JLabel coffeePrice = new JLabel("₱ 20.00");
		coffeePrice.setForeground(Color.WHITE);
		coffeePrice.setFont(new Font("Arial", Font.BOLD, 19));
		coffeePrice.setBounds(164, 135, 80, 32);
		coffeePanel.add(coffeePrice);
		
		JButton buyCoffeeButton = new JButton("BUY");
		buyCoffeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyCoffeeButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Coffee         20.00\n");
							total+=20;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyCoffeeButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyCoffeeButton.setFocusable(false);
		buyCoffeeButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyCoffeeButton.setBackground(new Color(255, 236, 236));
		buyCoffeeButton.setBounds(85, 178, 87, 32);
		coffeePanel.add(buyCoffeeButton);
		
		JLabel coffeeLabel = new JLabel();
		coffeeLabel.setBounds(63, 13, 128, 120);
		coffeePanel.add(coffeeLabel);
		coffeeLabel.setIcon(new ImageIcon(coffee));
		
		JPanel orangePanel = new JPanel();
		orangePanel.setLayout(null);
		orangePanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		orangePanel.setBackground(new Color(223, 171, 136));
		orangePanel.setBounds(255, 360, 250, 233);
		drinksPanel.add(orangePanel);
		
		JLabel orangeName = new JLabel("Orange Juice");
		orangeName.setForeground(Color.WHITE);
		orangeName.setFont(new Font("Arial", Font.BOLD, 20));
		orangeName.setBounds(13, 135, 147, 32);
		orangePanel.add(orangeName);
		
		JLabel orangePrice = new JLabel("₱ 15.00");
		orangePrice.setForeground(Color.WHITE);
		orangePrice.setFont(new Font("Arial", Font.BOLD, 19));
		orangePrice.setBounds(164, 135, 80, 32);
		orangePanel.add(orangePrice);
		
		JButton buyOrangeButton = new JButton("BUY");
		buyOrangeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyOrangeButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\rOrange Juice    15.00\n");
							total+=15;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyOrangeButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyOrangeButton.setFocusable(false);
		buyOrangeButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyOrangeButton.setBackground(new Color(255, 236, 236));
		buyOrangeButton.setBounds(85, 178, 87, 32);
		orangePanel.add(buyOrangeButton);
		
		JLabel orangeLabel = new JLabel();
		orangeLabel.setBounds(57, 5, 132, 139);
		orangePanel.add(orangeLabel);
		orangeLabel.setIcon(new ImageIcon(orangeJuice));
		
		JPanel waterPanel = new JPanel();
		waterPanel.setLayout(null);
		waterPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		waterPanel.setBackground(new Color(223, 171, 136));
		waterPanel.setBounds(523, 360, 250, 233);
		drinksPanel.add(waterPanel);
		
		JLabel waterName = new JLabel("Water");
		waterName.setForeground(Color.WHITE);
		waterName.setFont(new Font("Arial", Font.BOLD, 20));
		waterName.setBounds(13, 135, 147, 32);
		waterPanel.add(waterName);
		
		JLabel waterPrice = new JLabel("₱ 5.00");
		waterPrice.setForeground(Color.WHITE);
		waterPrice.setFont(new Font("Arial", Font.BOLD, 19));
		waterPrice.setBounds(164, 135, 80, 32);
		waterPanel.add(waterPrice);
		
		JButton buyWaterButton = new JButton("BUY");
		buyWaterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyWaterButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Water          5.00\n");
							total+=5;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyWaterButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyWaterButton.setFocusable(false);
		buyWaterButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyWaterButton.setBackground(new Color(255, 236, 236));
		buyWaterButton.setBounds(85, 178, 87, 32);
		waterPanel.add(buyWaterButton);
		
		JLabel waterLabel = new JLabel();
		waterLabel.setBounds(85, 0, 80, 141);
		waterPanel.add(waterLabel);
		waterLabel.setIcon(new ImageIcon(water));
		
		JPanel milkTeaPanel = new JPanel();
		milkTeaPanel.setLayout(null);
		milkTeaPanel.setBorder(new EmptyBorder(3, 3, 3, 3));
		milkTeaPanel.setBackground(new Color(223, 171, 136));
		milkTeaPanel.setBounds(790, 360, 250, 233);
		drinksPanel.add(milkTeaPanel);
		
		JLabel milkTeaName = new JLabel("Milktea");
		milkTeaName.setForeground(Color.WHITE);
		milkTeaName.setFont(new Font("Arial", Font.BOLD, 20));
		milkTeaName.setBounds(13, 135, 147, 32);
		milkTeaPanel.add(milkTeaName);
		
		JLabel milkTeaPrice = new JLabel("₱ 45.00");
		milkTeaPrice.setForeground(Color.WHITE);
		milkTeaPrice.setFont(new Font("Arial", Font.BOLD, 19));
		milkTeaPrice.setBounds(164, 135, 80, 32);
		milkTeaPanel.add(milkTeaPrice);
		
		JButton buyMilkTeaButton = new JButton("BUY");
		buyMilkTeaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						if(e.getSource()==buyMilkTeaButton) {
							textAreaSummary.setText(textAreaSummary.getText()+ "   \r\r Milktea        45.00\n");
							total+=45;
							totalTextField.setText(String.valueOf(total));
							
						}
					}
				});
		buyMilkTeaButton.setFont(new Font("Arial", Font.BOLD, 15));
		buyMilkTeaButton.setFocusable(false);
		buyMilkTeaButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buyMilkTeaButton.setBackground(new Color(255, 236, 236));
		buyMilkTeaButton.setBounds(85, 179, 87, 32);
		milkTeaPanel.add(buyMilkTeaButton);
		
		JLabel milkTeaLabel = new JLabel();
		milkTeaLabel.setBounds(85, 8, 70, 134);
		milkTeaPanel.add(milkTeaLabel);
		milkTeaLabel.setIcon(new ImageIcon(milktea1));
		
		JLabel drinksTitleLabel = new JLabel("DRINKS");
		drinksTitleLabel.setForeground(new Color(255, 255, 255));
		drinksTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		drinksTitleLabel.setFont(new Font("Deli", Font.PLAIN, 55));
		drinksTitleLabel.setBounds(345, 25, 582, 77);
		drinksPanel.add(drinksTitleLabel);
		
		
		//buttons in dashboard
		JButton bestSellerButton = new JButton("BEST SELLER");
		bestSellerButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		bestSellerButton.setFocusable(false);
		bestSellerButton.setBackground(new Color(255, 236, 236));
		Image image = new ImageIcon(this.getClass().getResource("/bestseller.png")).getImage();
		bestSellerButton.setIcon(new ImageIcon(image));
		bestSellerButton.setFont(new Font("Bebas Kai", Font.PLAIN, 25));
		bestSellerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bestSellerButton) {
					bestSellerPanel.setVisible(true);
				}
			}
		});
		bestSellerButton.setBounds(10, 115, 209, 74);
		bestSellerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		OrderDashBoardPanel.add(bestSellerButton);
		
		JButton foodsButton = new JButton(" FOODS");
		foodsButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		foodsButton.setFocusable(false);
		foodsButton.setBackground(new Color(255, 236, 236));
		Image image2 = new ImageIcon(this.getClass().getResource("/foods.png")).getImage();
		foodsButton.setIcon(new ImageIcon(image2));
		foodsButton.setFont(new Font("Bebas Kai", Font.PLAIN, 25));
		foodsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==foodsButton) {
					orderPanel.add(foodsPanel);
					foodsPanel.setVisible(true);
					bestSellerPanel.setVisible(false);
					dessertPanel.setVisible(false);
					drinksPanel.setVisible(false);
				}
			}
		});
		foodsButton.setAlignmentX(0.5f);
		foodsButton.setBounds(10, 246, 209, 74);
		OrderDashBoardPanel.add(foodsButton);
		
		JButton dessertButton = new JButton("DESSERTS");
		dessertButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		dessertButton.setFocusable(false);
		dessertButton.setBackground(new Color(255, 236, 236));
		Image image3 = new ImageIcon(this.getClass().getResource("/desserts.png")).getImage();
		dessertButton.setIcon(new ImageIcon(image3));
		dessertButton.setFont(new Font("Bebas Kai", Font.PLAIN, 25));
		dessertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==dessertButton) {
					orderPanel.add(dessertPanel);
					dessertPanel.setVisible(true);
					bestSellerPanel.setVisible(false);
					foodsPanel.setVisible(false);
					drinksPanel.setVisible(false);
					
				}
			}
		});
		dessertButton.setAlignmentX(0.5f);
		dessertButton.setBounds(10, 378, 209, 74);
		OrderDashBoardPanel.add(dessertButton);
		
		JButton drinksButton = new JButton("DRINKS");
		drinksButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		drinksButton.setFocusable(false);
		drinksButton.setBackground(new Color(255, 236, 236));
		Image image4 = new ImageIcon(this.getClass().getResource("/drinks.png")).getImage();
		drinksButton.setIcon(new ImageIcon(image4));
		drinksButton.setFont(new Font("Bebas Kai", Font.PLAIN, 25));
		drinksButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==drinksButton) {
					orderPanel.add(drinksPanel);
					drinksPanel.setVisible(true);
					bestSellerPanel.setVisible(false);
					foodsPanel.setVisible(false);
					dessertPanel.setVisible(false);	
				}
			}
		});
		drinksButton.setAlignmentX(0.5f);
		drinksButton.setBounds(10, 505, 209, 74);
		OrderDashBoardPanel.add(drinksButton);
		
		
		//backpanel in orderpage
		JPanel orderBackPanel = new JPanel();
		orderBackPanel.setFocusable(false);
		orderBackPanel.setBackground(new Color(181, 0, 26));
		orderBackPanel.setBounds(10, 1, 209, 60);
		OrderDashBoardPanel.add(orderBackPanel);
		orderBackPanel.setLayout(null);
		
		JButton orderBackButton = new JButton();
		orderBackButton.setFocusable(false);
		orderBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==orderBackButton) {
					mainPanel.setVisible(true);
					orderPanel.setVisible(false);
				}
			}
		});
		orderBackButton.setBackground(Color.WHITE);
		orderBackButton.setBounds(10, 7, 89, 44);
		orderBackPanel.add(orderBackButton);
		Image image1 = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
		orderBackButton.setIcon(new ImageIcon(image1));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(183, 6, 11));
		panel.setBounds(1057, 0, 283, 664);
		orderPanel.add(panel);
		panel.setLayout(null);
		
		textAreaSummary = new JTextArea();
		textAreaSummary.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textAreaSummary.setText("\r\n********ORDER SUMMARY******** \n\n  Item Name  \t   Price\n");
		textAreaSummary.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		textAreaSummary.setBounds(6, 11, 264, 533);
		panel.add(textAreaSummary);
		
		totalTextField = new JTextField();
		totalTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		totalTextField.setBounds(114, 560, 142, 29);
		panel.add(totalTextField);
		totalTextField.setColumns(10);
		
		JLabel totalLabel = new JLabel("TOTAL: ");
		totalLabel.setForeground(new Color(255, 255, 255));
		totalLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		totalLabel.setHorizontalAlignment(SwingConstants.LEFT);
		totalLabel.setBounds(30, 563, 73, 22);
		panel.add(totalLabel);
		
		JPanel userPanel = new JPanel();
		userPanel.setBounds(10, 11, 328, 69);
		userPanel.setBackground(new Color(181, 0, 26));
		mainPanel.add(userPanel);
		userPanel.setLayout(null);
		
		userIDLabel = new JLabel(" Welcome, ");
		userIDLabel.setFont(new Font("Keep Calm Med", Font.PLAIN, 20));
		userIDLabel.setBounds(15, 3, 308, 65);
		userIDLabel.setForeground(new Color(255, 255, 255));
		userPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		userPanel.add(userIDLabel);
		userIDLabel.setIcon(new ImageIcon("C:\\Users\\63951\\Downloads\\USERICON.png"));
		
		JButton homeOrderButton = new JButton("ORDER");
		homeOrderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==homeOrderButton) {
					mainPanel.setVisible(false);
					getContentPane().add(orderPanel);
					} if(e.getSource()==homeOrderButton) {
						orderPanel.setVisible(true);
					}
			}
		});
		
		homeOrderButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		homeOrderButton.setFocusable(false);
		homeOrderButton.setForeground(new Color(255, 255, 255));
		homeOrderButton.setBackground(new Color(181, 0, 26));
		homeOrderButton.setBounds(540, 140, 283, 85);
		homeOrderButton.setFont(new Font("Deli", Font.PLAIN, 52));
		mainPanel.add(homeOrderButton);
		
		JButton homeSettingButton = new JButton("SETTINGS");
		homeSettingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==homeSettingButton) {
					mainPanel.setVisible(false);
					getContentPane().add(mainSettingPanel);
					} if(e.getSource()==homeSettingButton) {
						mainSettingPanel.setVisible(true);
					}
			}
		});
		
		homeSettingButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		homeSettingButton.setFocusable(false);
		homeSettingButton.setForeground(new Color(255, 255, 255));
		homeSettingButton.setBackground(new Color(181, 0, 26));
		
		
		homeSettingButton.setBounds(540, 270, 283, 85);
		//homeSettingButton.setBackground(new Color(240, 240, 240));
		homeSettingButton.setFont(new Font("Deli", Font.PLAIN, 50));
		mainPanel.add(homeSettingButton);
		
		JButton homeExitButton = new JButton("EXIT");
		homeExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		homeExitButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		homeExitButton.setFocusable(false);
		homeExitButton.setForeground(new Color(255, 255, 255));
		homeExitButton.setBackground(new Color(181, 0, 26));
		homeExitButton.setBounds(540, 400, 283, 85);
		//homeExitButton.setBackground(new Color(255, 160, 162));
		homeExitButton.setFont(new Font("Deli", Font.PLAIN, 52));
		mainPanel.add(homeExitButton);
		
		JLabel lblNewLabe2 = new JLabel("New label");
		lblNewLabe2.setIcon(new ImageIcon("C:\\Users\\63951\\Downloads\\Cover1.png"));
		lblNewLabe2.setBounds(0, 0, 1350, 664);
		mainPanel.add(lblNewLabe2);
		
		JLabel lblNewLabe3 = new JLabel("New label");
		lblNewLabe3.setIcon(new ImageIcon("C:\\Users\\63951\\Downloads\\Cover1.png"));
		lblNewLabe3.setBounds(0, 0, 1350, 664);
		mainSettingPanel.add(lblNewLabe3);
		
		this.setVisible(true);
		
	}
}

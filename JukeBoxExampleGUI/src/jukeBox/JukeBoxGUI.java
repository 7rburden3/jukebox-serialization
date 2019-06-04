package jukeBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class JukeBoxGUI extends JFrame {
	
	private JukeBox theJukeBox;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JLabel playlistLabel;
	private JTextArea txtrPlaying;
	private JLabel lblNewLabel;
	private JButton btnNewButton_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JukeBoxGUI frame = new JukeBoxGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JukeBoxGUI() {
		theJukeBox = new JukeBox();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getBtnNewButton_4());
		contentPane.add(getBtnNewButton_5());
		contentPane.add(getBtnNewButton_6());
		contentPane.add(getBtnNewButton_7());
		contentPane.add(getPlaylistLabel());
		contentPane.add(getTxtrPlaying());
		contentPane.add(getLblNewLabel());
		contentPane.add(getBtnNewButton_8());
	}
	
	public void updateJukeBox() {
		playlistLabel.setText("Number of songs in playlist: " + theJukeBox.getSize());
		txtrPlaying.setText(theJukeBox.printPlayList());
		
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Song 1");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					theJukeBox.addS1();
					updateJukeBox();
					
				}
			});
			btnNewButton.setBounds(24, 42, 89, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Song 2");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					theJukeBox.addS2();
					updateJukeBox();
				}
			});
			btnNewButton_1.setBounds(24, 84, 89, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Song 3");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					theJukeBox.addS3();
					updateJukeBox();
				}
			});
			btnNewButton_2.setBounds(24, 125, 89, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("Song 4");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					theJukeBox.addS4();
					updateJukeBox();
				}
			});
			btnNewButton_3.setBounds(135, 42, 89, 23);
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("Song 5");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					theJukeBox.addS5();
					updateJukeBox();
				}
			});
			btnNewButton_4.setBounds(135, 84, 89, 23);
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("Song 6");
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					theJukeBox.addS6();
					updateJukeBox();
				}
			});
			btnNewButton_5.setBounds(135, 125, 89, 23);
		}
		return btnNewButton_5;
	}
	private JButton getBtnNewButton_6() {
		if (btnNewButton_6 == null) {
			btnNewButton_6 = new JButton("Song 7");
			btnNewButton_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					theJukeBox.addS7();
					updateJukeBox();
				}
			});
			btnNewButton_6.setBounds(244, 42, 89, 23);
		}
		return btnNewButton_6;
	}
	private JButton getBtnNewButton_7() {
		if (btnNewButton_7 == null) {
			btnNewButton_7 = new JButton("PLAY");
			btnNewButton_7.setForeground(Color.BLACK);
			btnNewButton_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					theJukeBox.play();
					updateJukeBox();
				}
			});
			btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnNewButton_7.setBounds(268, 0, 156, 38);
		}
		return btnNewButton_7;
	}
	private JLabel getPlaylistLabel() {
		if (playlistLabel == null) {
			playlistLabel = new JLabel("Number of songs in playlist: " + theJukeBox.getSize());
			playlistLabel.setBounds(48, 0, 187, 38);
		}
		return playlistLabel;
	}
	private JTextArea getTxtrPlaying() {
		if (txtrPlaying == null) {
			txtrPlaying = new JTextArea(theJukeBox.printPlayList());
			txtrPlaying.setBounds(205, 159, 219, 92);
		}
		return txtrPlaying;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Playlist");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(77, 159, 118, 50);
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton_8() {
		if (btnNewButton_8 == null) {
			btnNewButton_8 = new JButton("QUIT");
			btnNewButton_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
			btnNewButton_8.setBounds(24, 220, 89, 23);
		}
		return btnNewButton_8;
	}

}

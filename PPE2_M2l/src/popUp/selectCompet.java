package popUp;

import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import sql.CreatListCompet;
import sql.Suprime;

public class selectCompet {

	public static String choixCompetModif;

	public static void popup(boolean supr) {

		JFrame popCompet = new JFrame();
		popCompet.setBounds(100, 100, 450, 300);
		popCompet.setDefaultCloseOperation(1);
		popCompet.getContentPane().setLayout(null);
		popCompet.setVisible(true);
		
		

		JLabel lblNewLabel = new JLabel("Selectionner competition");
		lblNewLabel.setBounds(10, 11, 163, 27);
		popCompet.getContentPane().add(lblNewLabel);

		Choice choice = new Choice();
		CreatListCompet.listCompet(choice);
		choice.setBounds(10, 75, 414, 20);
		popCompet.getContentPane().add(choice);

		JButton btnSelectionnerCompetition = new JButton("selectionner competition");
		btnSelectionnerCompetition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				choixCompetModif = choice.getSelectedItem();
				System.out.println(getnumcompet());	
				
				popCompet.setVisible(false);				
			}
		});
		btnSelectionnerCompetition.setBounds(226, 228, 198, 23);
		popCompet.getContentPane().add(btnSelectionnerCompetition);
		
		JButton btnretour = new JButton("Retour");
		btnretour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				popCompet.setVisible(false);				
			}
		});
		btnretour.setBounds(10, 228, 198, 23);
		popCompet.getContentPane().add(btnretour);

	}

	public static int getnumcompet() {
		String resultat = choixCompetModif.substring(0, 2);

		int result = Integer.parseInt(resultat);

		return result;

	}

}

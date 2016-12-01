package pokemon.view;

import java.awt.Color;
import javax.swing.*;
import pokemon.controller.PokemonController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import pokemon.model.Pokemon;
import java.awt.Dimension;

public class PokemonPanel extends JPanel
{

	private PokemonController baseController;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		
	}
	
	
}

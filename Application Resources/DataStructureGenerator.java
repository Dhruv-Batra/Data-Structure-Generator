import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;


public class DataStructureGenerator
{
	private static String code;
	public static void main(String[] args) throws FileNotFoundException
	{
		JFrame frame = new JFrame("Data Structure Generator");
		frame.setBounds(100, 100, 1200, 700);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/******************************************************************/
		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(0, 0, 300, 678);
		leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		
		JLabel logo = null;
		try
		{
			logo = new JLabel(new ImageIcon(new URL("https://i.imgur.com/EcsHmx3.gif")));
         //logo created by Christopher Soto
		}
		catch(MalformedURLException e1)
		{
			
		}
		logo.setBounds(50, 50, 200, 200);
		logo.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		leftPanel.add(logo);
		
		JLabel firstLabel = new JLabel("First character's case:");
		firstLabel.setBounds(50, 350, 200, 25);
		leftPanel.add(firstLabel);
		JComboBox<String> firstLetter = new JComboBox<String>(new String[] {"default", "lowercase", "Uppercase"});
		firstLetter.setBounds(50, 375, 200, 25);
		leftPanel.add(firstLetter);
		
		JLabel othersLabel = new JLabel("Other characters' cases:");
		othersLabel.setBounds(50, 425, 200, 25);
		leftPanel.add(othersLabel);
		JComboBox<String> otherLetters = new JComboBox<String>(new String[] {"default", "lowercase", "UPPERCASE", "rAnDoM"});
		otherLetters.setBounds(50, 450, 200, 25);
		leftPanel.add(otherLetters);
		
		JButton help = new JButton("Help");
		help.setBounds(75, 525, 150, 50);
		help.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JFrame helpFrame = new JFrame("Help");
				helpFrame.setSize(500, 460);
				helpFrame.setLocationRelativeTo(frame);
				helpFrame.setResizable(false);
				JTextArea helpText = new JTextArea("How to use the Data Structure Code Generator:\n\n"
						+ "1. Choose a character or sequence of characters to act as your delimiter and enter it into the Delimiter box (a delimiter is what signals separation of elements in a list).\n\n"
						+ "2. Select the data type of your items from the dropdown.\n\n"
						+ "3. Enter the elements to put into the list into the Input box, separated by your chosen delimiter.\n\n"
						+ "4. Select a data structure to hold the list items from the dropdown.\n\n"
						+ "5. Enter a name for the list variable into the Variable name box.\n\n"
						+ "6. If you want to automatically alter the capitalization of the items in the list (assuming they are Strings), adjust the dropdowns on the left panel accordingly.\n\n"
						+ "7. Click the Generate button to generate the appropriate code. Click the Expand button if the code is too long to view in the given box.\n\n"
						+ "8. Click the Export as .txt file to download a text file with the given code. Its file path will be shown in the output box.\n\n"
						+ "9. Click the Generate Worksheet button on the right panel to create a worksheet for students' practice handling the selected data structure.");
				helpText.setBounds(0, 0, 500, 460);
				helpText.setLineWrap(true);
				helpText.setWrapStyleWord(true);
				helpText.setEditable(false);
				helpFrame.add(helpText);
				helpFrame.setLayout(null);
				helpFrame.setVisible(true);
			}
		});
		leftPanel.add(help);
		
		leftPanel.setLayout(null);
		frame.add(leftPanel);
		/******************************************************************/
		JPanel midPanel = new JPanel();
		midPanel.setBounds(300, 0, 600, 678);
		midPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		
		JLabel inputLabel = new JLabel("Input items here, separated by the delimiter:");
		inputLabel.setBounds(50, 25, 500, 25);
		midPanel.add(inputLabel);
		JTextArea inputText = new JTextArea();
		inputText.setBounds(50, 50, 500, 100);
		inputText.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		inputText.setLineWrap(true);
		inputText.setWrapStyleWord(true);
		midPanel.add(inputText);
		
		JLabel structureLabel = new JLabel("Data structure:");
		structureLabel.setBounds(50, 200, 100, 25);
		midPanel.add(structureLabel);
		JComboBox<String> structures = new JComboBox<String>(new String[] {"array", "ArrayList", "LinkedList", "Stack", "Queue", "HashSet", "TreeSet"});   
		structures.setBounds(200, 200, 200, 25);
		midPanel.add(structures);
		
		JLabel typeLabel = new JLabel("Data type:");
		typeLabel.setBounds(50, 250, 100, 25);
		midPanel.add(typeLabel);
		JComboBox<String> types = new JComboBox<String>(new String[] {"Integer", "Double", "Character", "String"});
		types.setBounds(200, 250, 200, 25);
		midPanel.add(types);
		
		JLabel variableLabel = new JLabel("Variable name:");
		variableLabel.setBounds(50, 300, 100, 25);
		midPanel.add(variableLabel);
		JTextField variable = new JTextField();
		variable.setBounds(200, 300, 200, 25);
		midPanel.add(variable);
		
		JLabel delimiterLabel = new JLabel("Delimiter:");
		delimiterLabel.setBounds(50, 350, 100, 25);
		midPanel.add(delimiterLabel);
		JTextField delimiter = new JTextField();
		delimiter.setBounds(200, 350, 200, 25);
		midPanel.add(delimiter);
		
		JTextArea output = new JTextArea();
		output.setBounds(50, 525, 500, 100);
		output.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		output.setEditable(false);
		output.setLineWrap(true);
		output.setWrapStyleWord(true);
		midPanel.add(output);
		
		JButton generate = new JButton("Generate");
		generate.setBounds(200, 425, 200, 50);
		generate.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(inputText.getText().equals("") || variable.getText().equals(""))
				{
					error(frame, "Error: must input items into the input box (separated by the delimiter) and a name for the variable");
					return;
				}
				code = Convert.convert(inputText.getText(), delimiter.getText(), (String)structures.getSelectedItem(), (String)types.getSelectedItem(), variable.getText(), (String)firstLetter.getSelectedItem(), (String)otherLetters.getSelectedItem());
				String[] lines = code.split("\n");
				if(lines.length > 6)
					output.setText(lines[0] + "\n" + lines[1] + "\n" + lines[2] + "\n" + lines[3] + "\n" + lines[4] + "\n...");
				else
					output.setText(code);
			}
		});
		midPanel.add(generate);
		
		JButton expand = new JButton("Expand");
		expand.setBounds(50, 500, 100, 25);
		expand.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JFrame newFrame = new JFrame("Generated Code");
				newFrame.setSize(420, 600);
				newFrame.setLocationRelativeTo(frame);
				newFrame.add(new JTextArea(code));
				newFrame.setVisible(true);
			}
		});
		midPanel.add(expand);
		
		JButton export = new JButton("Export as .txt file");
		export.setHorizontalTextPosition(SwingConstants.RIGHT);
		export.setBounds(400, 500, 150, 25);
		export.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(output.getText().equals(""))
				{
					error(frame, "Error: must generate code before exporting as text file");
					return;
				}
				if(inputText.getText().equals("") || variable.getText().equals(""))
				{
					error(frame, "Error: must input items into the input box (separated by the delimiter) and a name for the variable");
					return;
				}
				int c = 0;
				while(new File("generated-code-" + c + ".txt").exists())
					c++;
				PrintWriter pw;
				try
				{
					File file = new File("generated-code-" + c + ".txt");
					file.createNewFile();
					pw = new PrintWriter(file);
					pw.write(code);
					pw.close();
					output.setText("File written succesfully:\n" + file.getAbsolutePath());
				}
				catch(FileNotFoundException fnfe)
				{
					output.setText("failed to write file");
				}
				catch(IOException ioe)
				{
					output.setText("failed to write file");
				}
			}
		});
		midPanel.add(export);
		
		midPanel.setLayout(null);
		frame.add(midPanel);
		/******************************************************************/
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(900, 0, 300, 678);
		rightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		
		JButton worksheet = new JButton("Generate Custom Lab");
		worksheet.setBounds(50, 50, 200, 100);
		worksheet.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(inputText.getText().equals("") || variable.getText().equals(""))
				{
					error(frame, "Error: must input items into the input box (separated by the delimiter) and a name for the variable");
					return;
				}
				String generateText = Generate.generate(inputText.getText(), delimiter.getText(), (String)structures.getSelectedItem(), 
            (String)types.getSelectedItem(), variable.getText(), (String)firstLetter.getSelectedItem(), (String)otherLetters.getSelectedItem());
				output.setText("File written succesfully:\n" + generateText);
			}
		});
		rightPanel.add(worksheet);
		
		JTextArea description = new JTextArea("Welcome to Data Structure Generator! This tool can be used to convert data into data structures for easy copy and paste to avoid the hassle of typing. Simply input text, select parameters, and press the Generate button. It can also be used to create custom Java labs based on the input data and parameters. Easily create multiple forms of randomized Java labs to prevent cheating and file sharing among students by pressing the Generate Custom Lab button.");
		description.setBounds(50, 250, 200, 300);
		description.setBackground(new Color(238, 238, 238));
		description.setEditable(false);
		description.setLineWrap(true);
		description.setWrapStyleWord(true);
		rightPanel.add(description);
		
		rightPanel.setLayout(null);
		frame.add(rightPanel);
		/******************************************************************/
		frame.setLayout(null);
		frame.setVisible(true);
	}
	private static void error(JFrame frame, String message)
	{
		JFrame error = new JFrame("error");
		error.setSize(200, 100);
		error.setLocationRelativeTo(frame);
		error.setResizable(false);
		JTextArea text = new JTextArea(message);
		text.setBounds(0, 0, 200, 100);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		text.setEditable(false);
		error.add(text);
		error.setLayout(null);
		error.setVisible(true);
	}
}
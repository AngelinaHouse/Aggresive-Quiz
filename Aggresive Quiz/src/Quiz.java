import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static JFrame frame = new JFrame();
		static String name;
		static int q1;
		public static void main(String[] args)
			{
				// welcomes (kinda) player
				name = JOptionPane.showInputDialog(
						"What is your name?");  
				JOptionPane.showMessageDialog(
						frame, 
						"Hi, " + name + ". I have a terrible memory so I won't remember that... I'm not sorry");
				
				//quizzzzz
				//question 1
				Object[] options = {"Yes", "No", "I don't know"};
				q1 = JOptionPane.showOptionDialog(frame, "Would you like a fun fact?", "oop",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
				switch(q1)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Alright well, Donkey Kong got his name because his creator believed 'donkey'\n"
							+ " meant 'stupid' in english and wanted to convey the impression that the\n "
							+ "character was a 'stupid ape'.");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Well to bad your getting one, the word 'bankrupt' from the italian term for 'broken bench'."
							+ "You are now a broken bench for not wanting my exquisite fun facts");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(
						frame, 
							"Well in that case I'll ask you again");
					break;
					}
				}
			}
		

	}

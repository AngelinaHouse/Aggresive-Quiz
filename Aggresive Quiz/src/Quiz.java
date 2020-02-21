import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static JFrame frame = new JFrame();
		static String name;
		static int q1;
		static int q2;
		static int q3;
		static int q4;
		static int q5;
		static int q6;
		static int q7;
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
				q1 = JOptionPane.showOptionDialog(frame, "Would you like a fun fact?", "Question 1",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
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
				
				//question 2
				Object[] options2 = {"Sure", "No", "You pick"};
				q2 = JOptionPane.showOptionDialog(frame, "Would you like another fun fact?", "Question 2",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, options2, options2[0]);
				switch(q2)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"During WWII, the crew of the british submarine HMS Trident kept \n"
							+ "a fully grown reindeer called Pollyanna aboard their vessel for \n"
							+ "six weeks. It was given to them by the russians.");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Ok then.... Next Question");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(
						frame, 
							"Wow you really can't make a decision.");
					break;
					}
				}
				
				
				//question 3
				Object[] options3 = {"Why not", "No", "Im indecisive"};
				q3 = JOptionPane.showOptionDialog(frame, "Would you like another a fun fact?", "Question 3",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, options3, options3[0]);
				switch(q3)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Theres around 60,000 miles of blood vessels in the human body, \n"
							+ " which is enough to wrap around the world twice");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Well i dont care your getting a fact. \n"
							+ "The most shoplifted book is actually the Bible.");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(
						frame, 
							"Me too so I guess your fine.... but actually I'll ask you again.");
					break;
					}
				}
				
				//question 4
				Object[] options4 = {"Yes", "No im good", "I want to leave"};
				q4 = JOptionPane.showOptionDialog(frame, "Would you like another a fun fact?", "You can't leave",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, options4, options4[0]);
				switch(q4)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Oreo cookies are actually a knock-off brand of another company called Hydrox. \n"
							+ "Hydrox released their cookies in 1908 while Oreo started in 1912.");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Well too bad, Taylor Swift accedentaly released 8 seconds of white noise in 2014...\n "
							+ "It immedietly became became #1 on Canadian iTunes");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(
						frame, 
							"you cant leave");
					break;
					}
				}
				
				//question 5
				Object[] options5 = {"Si senor", "Nah", "Serisouly i want to leave"};
				q5 = JOptionPane.showOptionDialog(frame, "Fun fact?", "Your stuck here forever",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, options5, options5[0]);
				switch(q5)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Denmark and Finland are deemed the happiest countries in the world.");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"......ok then");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(
						frame, 
							"i said no");
					break;
					}
				}
				
				//question 6
				Object[] options6 = {"Indubitably", "no", "when will this end??"};
				q6 = JOptionPane.showOptionDialog(frame, "Fun fact?", "Your stuck here forever",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, options6, options6[0]);
				switch(q6)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Michelin Stars and Michelin Tires are the same company, Michelin \n"
							+ "Stars was created to make people drive farther away and make \n "
							+ "people have to buy new tires.");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Im going to keep asking so saying no makes no difference but heres a mind bender\n"
							+ "If you cut a hole in a net, it has less holes.");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(
						frame, 
							"never");
					break;
					}
				}
				
				
				//question 7
				Object[] options7 = {"Si senor", "Nah", "Serisouly i was to leave"};
				q7 = JOptionPane.showOptionDialog(frame, "Fun fact?", "Your stuck here forever",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, options7, options7[0]);
				switch(q7)
				{
				case 0:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"Denmark and Finland are deemed the happiest countries in the world.");
					break;
					}
				case 1:
					{
					JOptionPane.showMessageDialog(
							frame, 
							"......ok then");
					break;
					}
				case 2:
					{
					JOptionPane.showMessageDialog(
						frame, 
							"i said no");
					break;
					}
				}
				
			}
		

	}

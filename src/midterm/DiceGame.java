package midterm;

import javax.swing.JOptionPane; 
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) 
	{
		
		
		
		String guess;
		int numberOfGoodGuesses = 0;
		int numberOfBadGuesses = 0;

int computerNum = 0;
computerNum = 1 + (int) ( Math.random() * 6 );
String even ;
String odd ;
String diceNum;
String option;
boolean win = false;


int numberOfPlays = 0; 



do {    

	while (win == false) {


if ( computerNum == 1)
{
	diceNum = odd;
}

else if (computerNum == 3)
{
	diceNum = odd;
}

else if (computerNum == 5)
{
	diceNum = odd;
}

else if (computerNum == 2)
{
	diceNum = even;
}

else if (computerNum == 4)
{
	diceNum = even;
}

else if (computerNum == 6)
{
	diceNum = even;
}

		
		guess = JOptionPane.showInputDialog("even or odd?");
				
		
		
		if ( guess == diceNum)
		{
			JOptionPane.showMessageDialog(null,  "you win" );
			numberOfGoodGuesses++;
			win = true;
	   

		}

		else if (guess != diceNum)
		{
			JOptionPane.showMessageDialog(null,  "you lose");
			numberOfBadGuesses++;
		}
		
		
		option = JOptionPane.showInputDialog("want to play again? yes or no:");
		
		numberOfPlays++;
		
}
while(option.equalsIgnoreCase("yes"));

		
			
			JOptionPane.showMessageDialog(null,  "bye "   );
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Scanner inp = new Scanner( System.in );
	
		
		
	////////////////////////////input
	
	int diceNum;
	int even;
	int odd;
	
	computerNum = 1 + (int) ( Math.random() * 6 );
	
	
	if ( computerNum == 1)
	{
		diceNum = odd;
	}
	
	else if (computerNum == 3)
	{
		diceNum = odd;
	}
	
	else if (computerNum == 5)
	{
		diceNum = odd;
	}
	
	else if (computerNum == 2)
	{
		diceNum = even;
	}
	
	else if (computerNum == 4)
	{
		diceNum = even;
	}
	
	else if (computerNum == 6)
	{
		diceNum = even;
	}
	
	
	//////////////////////////process
	System.out.println( diceNum );
	
	*/
}
	}
	
}

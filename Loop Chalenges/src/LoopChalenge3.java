import java.util.Scanner;

public class LoopChalenge3
   {
	public static void main(String[] args)
			{
				
				Scanner userInput = new Scanner (System.in);
				System.out.println("what number should be the limit");

				int StoppingPoint = userInput.nextInt();
				System.out.println("your max number is " + StoppingPoint);
				//I just copied the first activity past this point and am trying to Jerry rig them together
				int counter = 1;
				while (counter < StoppingPoint)
					{
				System.out.println( counter );
				counter = counter * 2;
				
			}

			}
   }


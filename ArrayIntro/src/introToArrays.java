
public class introToArrays
	{

		public static void main(String[] args)
			{
				//fiveElements();
				//lastElement();
				//verticalcolumn();
				averageArray();
			}

		private static void fiveElements()
			{
				String [] challengeOne = new String [5];
				challengeOne [0] = "Fizz";
				challengeOne [1] = "Buzz";
				challengeOne [2] = "FizzBuzz";
				challengeOne [3] = "FizzBuzzFizz";
				challengeOne [4] = "FizzBuzzFizzBuzz";
				
				System.out.println(challengeOne[2]);
				
			}

		private static void lastElement()
			{
				int [] num = new int [5];
				num [0] = 1;
				num [1] = 12;
				num [2] = 113;
				num [3] = 1114;
				num [4] = 11115;
				
				System.out.println(num[num.length - 1]);
				
			}

		private static void verticalcolumn()
			{
				int [] num = new int [5];
				num [0] = 1;
				num [1] = 12;
				num [2] = 113;
				num [3] = 1114;
				num [4] = 11115;
				
				for(int i = 0; i < num.length; i++)
					{
						System.out.println(num[i]);
					}
				
			}

		private static void averageArray()
			{
				double [] num = new double [5];
				num [0] = 1;
				num [1] = 2;
				num [2] = 3;
				num [3] = 4;
				num [4] = 6;
				
				double sum = 0;
				
				for(int i = 0; i < num.length; i++)
					{
						sum = sum + num[i];
					}
				sum = sum / num.length;
				System.out.println(sum);
			}

	}

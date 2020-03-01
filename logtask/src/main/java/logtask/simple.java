package logtask;
import org.apache.log4j.Logger;
import java.util.Scanner;
public class simple {
		static final Logger logger = Logger.getLogger(simple.class);
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Do you want to calculate SimpleIntrest(S) or CompoundIntrest(C)");
			char enter=sc.next().charAt(0);
			if(enter=='S') 
			{
			System.out.println("Enter the amount");
			int amount=sc.nextInt();
			System.out.print("Enter the Rate of Intrest in deccimal");
			int rate=sc.nextInt();
			System.out.print("Enter the duration in Years");
			int duration=sc.nextInt();
			int intrest;
			calculate obj=new calculate();
			intrest=obj.calculation(amount,rate,duration);
			System.out.println(intrest);
			}
			else if(enter=='C')
			{	
				System.out.println("Enter the amount");
				Double amount=sc.nextDouble();
				System.out.print("Enter the Rate of Intrest on decimal");
				Double rate=sc.nextDouble();
				System.out.print("Enter the duration in Years");
				Double duration=sc.nextDouble();
				Double compound,increment;
				System.out.print("Enter the rate of intrest increment ");
				increment=sc.nextDouble();
				compound ci=new compound();
				compound=ci.intrestcalculation(amount,rate,duration,increment);
				System.out.println(compound);
			}
			else
			{
				System.out.print("Invalid Data");
				
			}
			sc.close();
			logger.debug("sample debug message");
			logger.info("sample info mesasge");
			logger.warn("sample warn message");
			logger.error("sampleerror message");
			logger.fatal("sample fatal message");
		}

	}


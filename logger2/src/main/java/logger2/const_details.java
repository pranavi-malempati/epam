package logger2;
import org.apache.log4j.Logger;
import java.util.Scanner;
public class const_details {
		static final Logger logger = Logger.getLogger(const_details.class);
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  type of material \n 1)standard materials \n 2)avg standard materials\n 3) high standard material \n 4) high standard material and fully automated home" );
		int material_standards=sc.nextInt();
		System.out.print("Enter  area of the house in sq fts");
		int house_area=sc.nextInt();
		const_inputs details=new const_inputs();
		double house_cost;
		house_cost=details.construction(material_standards,house_area);
		System.out.print("cost of the home"+house_cost);
		sc.close();
		logger.debug("sample debug message");
		logger.info("sample info mesasge");
		logger.warn("sample warn message");
		logger.error("sampleerror message");
		logger.fatal("sample fatal message");
		}
	}


package logger2;

public class const_inputs {
		double construction(int material_standards,int house_area)
		{
			if(material_standards==1)
			{
			return 	house_area*1200;
			}
			else if(material_standards==2)
			{
			return house_area*1500;	
			}
			else if(material_standards==3)
			{
				return house_area*1800;
			}
			else 
			{
				return house_area*2500;
			}
		}

	}


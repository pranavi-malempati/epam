package logtask;
import java.lang.Math;  
public class compound {
	Double intrestcalculation(Double amt,Double rate,Double duration,Double increment)
	{
		Double ci=amt*Math.pow(1+rate/increment,increment*duration);
		return ci-amt;
	}
	}


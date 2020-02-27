package epam_taskonlogging;

public class CompoundInterest {
	public double calculate_Compound_Interest(double principalAmount,double time,double rateOfInterest,double numberOfCompoundings_PerAnnum)
	{
		return (principalAmount*(Math.pow((1+rateOfInterest/(numberOfCompoundings_PerAnnum*100)),numberOfCompoundings_PerAnnum*time)));
	}
}

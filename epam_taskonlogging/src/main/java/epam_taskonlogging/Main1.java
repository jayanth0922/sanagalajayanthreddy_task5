package epam_taskonlogging;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main1 {
	private static final Logger log=LogManager.getLogger(Main1.class);
	static double principalAmount,time,rateOfInterest,simpleInterest,compoundInterest,numberOfCompoundings_PerAnnum;static Scanner input;
	public static double calSimpleInterest()
	{
		input=new Scanner(System.in);
		log.info("Enter Principal Amount:\n");
		principalAmount=input.nextDouble();
		log.info("Enter the Number of Years:\n");
		time=input.nextDouble();
	     log.info("Enter Rate Of Interest:\n");
		rateOfInterest=input.nextDouble();
		SimpleInterest simpleObj=new SimpleInterest();
		simpleInterest=simpleObj.calculate_Simple_Interest(principalAmount,time,rateOfInterest);
	
		return simpleInterest;
		}
	public static double calCompoundInterest()
	{
		input=new Scanner(System.in);
		log.info("Enter the Principal Amount:\n");
		principalAmount=input.nextDouble();
		log.info("Enter the Number of Years\n");
		time=input.nextDouble();
		log.info("Enter the Rate Of Interest:\n");
		rateOfInterest=input.nextDouble();
		log.info("Specify Compound Interval in Years Format:\n");
		numberOfCompoundings_PerAnnum=input.nextDouble();
		CompoundInterest compoundObj=new CompoundInterest();
		compoundInterest=compoundObj.calculate_Compound_Interest(principalAmount,time,rateOfInterest,numberOfCompoundings_PerAnnum);
		return compoundInterest;
	}
	
	
	public static void main(String args[]) {
		log.info("Enter simpleinterest for simple interest or compoundintersest for compound interest:\n");
		input=new Scanner(System.in);
		String ch=input.nextLine();
		switch(ch)
		{
			case "simpleinterest":
						log.info("simple interest is:"+calSimpleInterest());break;
			case "compoundinterest":
						log.info("compound interest is:"+calCompoundInterest());break;
			default:
					log.error("\nInvalid option");break;
	   }
		
	}
}

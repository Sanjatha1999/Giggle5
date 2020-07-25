Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@Sanjatha1999 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


yashaswinisarabu
/
yashaswinisarabuweek5
1
0
0
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
yashaswinisarabuweek5/week5.2
@yashaswinisarabu
yashaswinisarabu Create week5.2
Latest commit e9a4d83 on 7 Mar
 History
 1 contributor
43 lines (35 sloc)  1.18 KB
  
import java.util.*;
import  org.apache.log4j.*;

class SimpleInterest{
public double calculate(double principle,double time, double rate) {
double simpleinterest = (principle * time * rate)/100;
return simpleinterest;
}
}

class CompoundInterest {
public double calculate(double principle, double time, double rate) {
    double amount = principle * (Math.pow((1 + rate / 100), time));
    double compoundinterest = amount - principle;
    return compoundinterest;
   }
}

public class InterestCalculation {

public static void main(String[] args) {
// TODO Auto-generated method stub
final Logger logger = Logger.getLogger(InterestCalculation.class);
double simple,compound;
double principle,time,rate;
Scanner sc = new Scanner(System.in);
logger.info("Enter principle time and rate");
principle = sc.nextDouble();
time = sc.nextDouble();
rate = sc.nextDouble();

SimpleInterest simpleinterest = new SimpleInterest();
simple = simpleinterest.calculate(principle,time,rate);

CompoundInterest compoundinterest = new CompoundInterest();
compound = compoundinterest.calculate(principle,time,rate);

logger.info("Simple Interest is "+simple);
logger.info("Compound Interest is "+compound);
sc.close();
}

}
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About

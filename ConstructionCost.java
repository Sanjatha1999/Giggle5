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
yashaswinisarabuweek5/week5.1
@yashaswinisarabu
yashaswinisarabu Create week5.1
Latest commit 9e1527f on 7 Mar
 History
 1 contributor
71 lines (69 sloc)  1.86 KB
  
import java.util.*;
import  org.apache.log4j.*;

class StandardMaterial{
public double cost(double area){
double cost = area * 1200;
return cost;
}
}
class AboveStandardMaterial{
public double cost(double area){
double cost = area * 1500;
return cost;
}
}
class HighStandardMaterial{
public double cost(double area){
double cost = area * 1800;
return cost;
}
}
class HighStandardMaterialAndAutomation{
public double cost(double area){
double cost = area * 2500;
return cost;
}
}
public class ConstructionCost {
public static void main(String args[]) {
final Logger logger = Logger.getLogger(ConstructionCost.class);

StandardMaterial standardmaterial=new StandardMaterial();
AboveStandardMaterial abovestandardmaterial=new AboveStandardMaterial();
HighStandardMaterial highstandardmaterial=new HighStandardMaterial();
HighStandardMaterialAndAutomation highstandardmaterialandautomation =new HighStandardMaterialAndAutomation();
Scanner sc=new Scanner(System.in);
logger.info("Select the option from below...\n1.standard material  2.above standard material 3.high standard material");
int option=sc.nextInt();
if(option>3 || option<1) {
logger.info("Select only the above mentioned 3 options only");
option=sc.nextInt();
}
logger.info("Enter the area of your house in square feets");
double area=sc.nextDouble();
double cost=0.0;
switch(option) {
case 1:
cost=standardmaterial.cost(area);
break;
case 2:
cost=abovestandardmaterial.cost(area);
break;
case 3:
logger.info("1.need a fully automated home  2.do not need a fully automated home");
int automation=sc.nextInt();
if(automation>2 || automation<1) {
logger.info("you can only select either automation is needed or not");
automation=sc.nextInt();
}
if(automation ==1) {
cost=highstandardmaterialandautomation.cost(area);
break;
}
else {
cost=highstandardmaterial.cost(area);
break;
}
}
logger.info("Cost of the Construction materials is "+cost);
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

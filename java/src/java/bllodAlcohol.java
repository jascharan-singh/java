package java;
import java.text.DecimalFormat;
import java.util.Scanner;


public class bllodAlcohol {

	public static void main(String[] args) {
	Scanner keyboard=new Scanner(System.in);
	System.out.println("The number of drinks ingested");
	int numDrinks=keyboard.nextInt();
	System.out.println("The number of ounces of alcohol per drink.");
	double ouncesAlcohol=keyboard.nextDouble();
	System.out.println("The weight of the drinker in pounds.");
	double weight=keyboard.nextDouble();
	double BAC=  (4.136*numDrinks*ouncesAlcohol) / (weight);
	DecimalFormat df= new DecimalFormat(".00");
	System.out.println("BLOOD ALCOHOL CONCENTRATION(BAC) "+ df.format(BAC));
	if (BAC==0.2) {
		System.out.println("TYPICAL EFFECTS: \nSome loss of judgement, relaxation, slight body warmth, altered mood");
		System.out.println("PREDICTABLE EFFECTS ON DRIVING: \nDicline in visual function (rapid tracking of moving target), decline in ability to perform to tasks at the same time (divided attention)");
	}
	if(BAC>0.2 && BAC<=0.5) {
		System.out.println("TYPICAL EFFECTS: \nExxaggerated behaviur, may have lose of small-muscle control(e.g. focusing your eyes), impaired judgment, usually good felling, lowered alertness, release of in inhibition.");
		System.out.println("PREDICTABLE EFFECTS ON DRIVING: \nReduced coordination, reduce abbility to track moving objects, dificulity steering, reduce respoce to emergency driving station.");
	}
	if(BAC>0.5 && BAC<=0.8) {
		System.out.println("TYPICAL EFFECTS: \nMuscle cordination becomes poor(e.g. balance, speatch, vision,reaction time, and hearing) harder to detect danger, judgement, self control, reaseaning, and memory are impaired");
		System.out.println("PREDICTABLE EFFECTS ON DRIVING: \nConcentration, short term memory lose, speed control, reduce information, processing capability(eg. single detection, visual search),impared perception");
	}
	if (BAC>0.8 && BAC<=0.10) {
		System.out.println("TYPICAL EFFECTS: \nClear Deterioration of reaction time and controled, slurred speatch, poor cordination, and slowed thinking");
		System.out.println("PREDICTABLE EFFECTS ON DRIVING: \nReduce to maintain lane position and break appropriately");
	}
	if(BAC>0.10 && BAC<=0.15) {
		System.out.println("TYPICAL EFFECTS: \nFar less muscle control than normal, vomting may occur (unless this level is reached slowly or a person has developed a tolrance for alcohol),major loss of balance");
		System.out.println("PREDICTABLE EFFECTS ON DRIVING: \nSubstantial Impairment in vehicle control, attention to driving task, and innecessery visual and auditory information processing");
	}
	else {
		System.out.println("please try again");
	}
	}
}

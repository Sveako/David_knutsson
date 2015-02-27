import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;


public class depaturThread extends Thread{
	
	private SkanetrafikenGUI gui;
	
	public depaturThread(SkanetrafikenGUI gui){
		this.gui= gui;	

}

	public void run(){
		String searchURL = Constants.getURL("80000","81216",20); //Malmö C = 80000,  Lund C, 81216 Malmö Gatorg 80100, Hässleholm C 93070
		System.out.println(searchURL);
		System.out.println("// Results when searching:");
		
		
		
		
		Journeys journeys = Parser.getJourneys(searchURL);
		for (Journey journey : journeys.getJourneys()) {
			System.out.print(journey.getStartStation()+" - ");
			System.out.print(journey.getEndStation());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
			//resultat.append(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late \n");
			
			String getStartStation = gui.frånText.getText();
			String getEndStation = gui.tillText.getText();
			
		gui.resultText.append(getStartStation +" till " + getEndStation + " avgår " + time +  "\n");
		
		
	}
	}
}
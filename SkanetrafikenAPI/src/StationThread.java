import java.util.ArrayList;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;


public class StationThread extends Thread {
	private SkanetrafikenGUI gui;
	
	public StationThread(SkanetrafikenGUI gui){
	this.gui= gui;	
		
	
	}
	
	public void run(){
		
		   System.out.println("// Stations when searching for stations containing \""+gui.s�kText.getText()+"\"");
		   //** get names of all stations */
			ArrayList<Station> searchStations = new ArrayList<Station>(); 
			//** search all stations fron malm� */
			searchStations.addAll(Parser.getStationsFromURL(gui.s�kText.getText()));
			gui.resultat.setText("");
			for (Station s: searchStations){
				gui.resultat.append(s.getStationName() +" number:" +s.getStationNbr () + "\n" );
			}
		}
	
	}

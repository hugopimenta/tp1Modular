package sports;

import athletes.Athlete;

import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Racing extends Sport{

	private List<Double> results;
	
	@Override
	public void getFinalResult(){ //faster in 3 runs
				
		for(Athlete a:this.athleteList){ //run through all Athletes inside list and set Final Result
			results = a.getResults();
			
			double final_result = 10000;
			for (int i = 0; i < results.size(); i++) {
				
				if(results.get(i) <= final_result)
				{
					final_result = results.get(i);
				}
			}		
			
			a.setFinalResult(final_result);
					
			//System.out.println(a.getName() + " " +final_result);
					
		}
		//print resultado poderiamos dividir isso em outra funcao?
		Collections.sort(this.athleteList, new Comparator<Athlete>(){
			
			public int compare(Athlete a1, Athlete a2){
				double x = a1.getFinalResult();
				double y = a2.getFinalResult();
				return Double.compare(x,y); //Desempate alfabetico?
					
			}
		});
		
		System.out.println(this.getName()+ "\n");
		
		for(Athlete a:this.athleteList){ 
			
			System.out.println(a.getName() + " " + a.getFinalResult());
			
		}
		
		System.out.println("\n");
	}	
}

package s03t02n01adriamarticomas;

public class App {

	public static void main(String[] args) {		
		Borsa borsa1 = new Borsa();
		
		AgentBorsa agent1 = new AgentBorsa("Pere Pages");
		AgentBorsa agent2 = new AgentBorsa("Andrea Cases");
		AgentBorsa agent3 = new AgentBorsa("Nil Robira");
		
		borsa1.subscribe(agent1);
		borsa1.subscribe(agent2);
		borsa1.subscribe(agent3);
		
		agent1.subscribeBorsa(borsa1);
		agent2.subscribeBorsa(borsa1);
		agent3.subscribeBorsa(borsa1);
		
		borsa1.upload("amazon ha pujat un punt");
	}

}




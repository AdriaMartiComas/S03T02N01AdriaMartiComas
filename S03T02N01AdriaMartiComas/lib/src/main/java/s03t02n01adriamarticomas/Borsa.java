package s03t02n01adriamarticomas;

import java.util.ArrayList;

public class Borsa {
	ArrayList<AgentBorsa> subs = new ArrayList<AgentBorsa>();
	private String titol;
	
	public String getTitol() {
		return titol;
	}

	public void setTitol(String titol) {
		this.titol = titol;
	}

	public void subscribe(AgentBorsa sub) {
		subs.add(sub);
	}
	
	public void unSubscribe(AgentBorsa sub) {
		subs.remove(sub);
	}
	
	public void notifySubscribers() {
		for(AgentBorsa sub : subs) {
			sub.update();
		}
	}
	
	public void upload(String titul) {
		this.titol = titul;
		notifySubscribers();
	}


	
}

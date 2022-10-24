package s03t02n01adriamarticomas;

public class AgentBorsa {
	private String name;
	private Borsa borsa = new Borsa();
	
	
	
	public AgentBorsa(String name) {
		super();
		this.name = name;
	}
	public void update() {
		System.out.println("Hola " + name + ", hi ha hagut el seguent canvi a la borsa: "+ borsa.getTitol());
	}
	public void subscribeBorsa(Borsa b) {
		borsa = b;
	}

}

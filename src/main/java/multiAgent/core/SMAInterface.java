package multiAgent.core;

public interface SMAInterface {

	public void initAgent(Environnement env);
	
	public void run();

	public void addAgent(Agent agent);

	public void removeAgent(Agent agent);
	
	public void log();
}

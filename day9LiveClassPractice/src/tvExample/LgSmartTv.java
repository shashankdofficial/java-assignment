package tvExample;

public class LgSmartTv extends LgOldTv{
	
	@Override
	public void changeChannel() {
		System.out.println("Channel Changed in Smart Way...");
	}
	
	public void playGame() {
		System.out.println("Game Start...");
	}
}

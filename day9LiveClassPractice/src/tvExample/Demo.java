package tvExample;

public class Demo {

	public static void main(String[] args) {

		//Now let suppose we create
		LgOldTv remote = new LgOldTv();
		
		//So after that we can call 3 methods of only the methods which is present in LgOldTv class
		remote.changeChannel();
		remote.start();
		remote.increaseVolume();
		
		//But when we create a Object of LgSmartTv
		
		LgSmartTv sremote = new LgSmartTv();
		
		//Then we can call
		sremote.changeChannel();
		sremote.start();
		sremote.increaseVolume();
		sremote.playGame();
		
		//All tehse method because LgSmart Tv inhertis the LgOldTv class
		
		
		//Now if we try to create
				////////LgSmartTv remote = new LgOldTv();
		//We cannot do tat because we cannot create the object of parent class with it's child class.
				
		//we can create from it's parents to child class
		
		LgOldTv nremote = new LgSmartTv();
		
		nremote.changeChannel();
		nremote.start();
		nremote.increaseVolume();
		//but with this we cannot call playGame()
		//so for that we have to downCast
		
		LgSmartTv nsremote = (LgSmartTv)nremote;
		nsremote.playGame();
				
	}

}

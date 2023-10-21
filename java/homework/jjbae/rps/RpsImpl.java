package homework.jjbae.rps;

public class RpsImpl implements RpsInterface {

	@Override
	public int getRps() {
		// TODO Auto-generated method stub
		int result = (int)(Math.random() * 3) + 1;
		
		return result;
	}
}

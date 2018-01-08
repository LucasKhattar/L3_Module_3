package interfaces;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String words) {
		 //TODO Auto-generated method stub
		String mixed = "";
		words = words.toLowerCase();
		for (int i = 0; i < words.length(); i++) {
			String c = words.charAt(i) + "";
			String newC;
			if(i%2==0) {
				newC = c.toLowerCase();
			}
			else {
				newC = c.toUpperCase();
			}
			mixed = mixed + newC;
		}
		return mixed;
	}

}

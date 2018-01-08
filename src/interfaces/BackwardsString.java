package interfaces;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String words) {
		// TODO Auto-generated method stub
		String reve = "";
		for (int i = 0; i < words.length(); i++) {
			String rev = words.charAt(i)+reve;
			reve = rev;
		}
		return reve;
	}

}

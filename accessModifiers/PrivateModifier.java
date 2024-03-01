package accessModifiers;

public class PrivateModifier {
//Private modifier can access by few people who owns
//Class never be a private only class members can be a private
	private int d=10;
	private int e=20;
	private int f;
	PrivateModifier() {
		addition();
	};
	public static void main(String[] args) {
		PublicModifier pm = new PublicModifier();
		System.out.println(pm.c);
		PrivateModifier privatemod = new PrivateModifier();
		System.out.println(privatemod.f);	
	};
	private void addition() {
		f=d+e;
		System.out.println(f);
	}
}

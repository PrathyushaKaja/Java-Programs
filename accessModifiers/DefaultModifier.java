package accessModifiers;

class DefaultModifier {
//If we are not specifying any visibility keyword then those are called default modifiers
	String name ="prathyusha";
	DefaultModifier(){
		name();
	};
	public static void main(String[] args) {
		DefaultModifier dm = new DefaultModifier();
			System.out.println(dm.name);
		
	}
	void name() {
		System.out.println(name);
	}
}

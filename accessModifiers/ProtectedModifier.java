package accessModifiers;

public class ProtectedModifier {
//Protected Modifier is similar to default modifier
//Class never be a protected only class members can be a protected
	protected int rollNo=200;
	protected ProtectedModifier() {
		printRollNo();
	}
	public static void main(String[] args) {
		ProtectedModifier protectMod = new ProtectedModifier();
		System.out.println(protectMod.rollNo);

	}
	protected void printRollNo() {
		System.out.println(rollNo);
	}
}

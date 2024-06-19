package OOPS;

@FunctionalInterface
interface functionalInterface {
    void access();
}

class Server implements functionalInterface {

    @Override
    public void access() {
        System.out.println("Access Granted");
    }
}
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functionalInterface obj = new Server();
		obj.access();

	}

}


class Dog1 {
	void barking() {
		System.out.println("all dogs bark!!!");
	}
}

public class BabyDog extends Dog1 {
	public static void main(String[] args) {
		BabyDog dog1 = new BabyDog();
		dog1.barking();

	}
}

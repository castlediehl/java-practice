import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal anObj = new Animal();
		Dog d1 = new Dog();
//		d1.makeNoise();
//		Method m2 = [(Animal)d1.getDeclaredMethod(makeNoise)];
		try {
			Method m1 = Animal.class.getDeclaredMethod("makeNoise");
			m1.setAccessible(true);
			System.out.println("Method Name: " + m1.getName() + " > ");
			try {
				m1.invoke(anObj);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

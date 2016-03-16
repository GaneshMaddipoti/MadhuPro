package SeleniumTasks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoEx {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {

		String name = "SeleniumTasks.Moto";

		Object d = Class.forName(name).newInstance();

		Moto moto = (Moto) d;

		System.out.println(d.getClass().getMethod("getMobileName").invoke(d));

		System.out.println(d.getClass().getSimpleName());

		Moto mobile = Moto.class.newInstance();

		System.out.println(mobile.getClass().getPackage());

		Method[] allMethods = mobile.getClass().getDeclaredMethods();

		for (Method m : allMethods) {
			System.out.println(m.getName());
		}

		mobile.setMobileName("Moto G 3rd Gen");
		System.out.println(mobile.getMobileName());

		System.out.println("Method Content: " + mobile.getClass().getMethod("getMobileName").invoke(mobile));
		System.out.println("Static Method: " + mobile.getClass().getMethod("getName").invoke(null));

	}

}


import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import com.sample.demoapp.interfaces.Arithmetic;

public class App {

	public static void main(String args[])
			throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		URL url = new URL(
				"file:/Users/harikrishnagurram/Documents/TechnicalDocuments/Java/examples/classloading/implementation/implementation.jar");

		URLClassLoader classLoader = new URLClassLoader(new URL[] { url });
		Class clazz = classLoader.loadClass("com.sample.demoapp.interfaces.impl.ArithmeticImpl");

		Arithmetic arithmetic = (Arithmetic) clazz.newInstance();

		System.out.println("Sum of 10 and 20 is " + arithmetic.add(10, 20));
		System.out.println("Subtraction of 10 and 20 is " + arithmetic.sub(10, 20));
		System.out.println("Multiplication of 10 and 20 is " + arithmetic.mul(10, 20));
		System.out.println("Division of 10 and 20 is " + arithmetic.div(10, 20));
	}
}


package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Program {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class c1 = teste.class;
		
		Annotation tab = c1.getAnnotation(Tabela.class);
		String t = ((Tabela) tab).value();
		
		
		Constructor con = (Constructor) c1.getConstructor(String.class);
		teste tb = (teste)con.newInstance(t);
		
		System.out.println(tb.getName());
		
		

	}

}

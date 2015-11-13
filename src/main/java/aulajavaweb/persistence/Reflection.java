package aulajavaweb.persistence;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class Reflection {

	public void getSelect(Class<?> clazz) {
		StringBuilder sb = new StringBuilder();
		sb.append("select  ");
		
		// Métodos declarados na classe.
		ArrayList<Field> fields = new ArrayList();
		fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
		// métodos não privados 
		fields.addAll(Arrays.asList(clazz.getFields()));
		for(int i = 0; i < fields.size(); i++) {
			sb.append(fields.get(0)) ;
			if(i + 1 < fields.size()) {
				sb.append(", ");
			}
		}
	
		sb.append(" from ");
		sb.append(clazz.getSimpleName());
	}
	
}
package Assignment7.q1;
import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@Target(value = {ElementType.CONSTRUCTOR, ElementType.METHOD,
ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
 @interface Author
{
String name() default "unknown";
}

@Target(value = {ElementType.CONSTRUCTOR, ElementType.METHOD,
ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
 @interface Version
{
double number();
}

class AnnotatedClass{
	@Author(name = "Rishabh")
	@Version(number = 1.0D)
	public AnnotatedClass() {
		System.out.println("India");
	}

	@Author(name = "Rishu")
	@Version(number = 1.2D)
	public AnnotatedClass(String str) {
		System.out.println("India" + str);
	}
	
	@Author(name = "Author1")
	@Version(number = 2.0f)
	public void annotatedMethod1()
	{}
	@Author(name = "Author2")
	@Version(number = 4.0)
	public void annotatedMethod2()
	{}
}

@Author(name = "yogesh")
class Test {

}

@Author(name = "Vidit")
class ExtendedTest extends Test {

}

public class CustomAnnotation {
	
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println("-----------Annotaed class---------");
			Class<?> clazz=Class.forName("Assignment7.q1.AnnotatedClass");
			System.out.println("-----------Method Annotations---------");
			Method methods[]=clazz.getDeclaredMethods();
			readAnnotation(methods);
			System.out.println("-----------Constructor Annotations---------");
			Constructor constructors[]=clazz.getConstructors();
			readAnnotation(constructors);
			
			System.out.println("-----------Class Annotations---------");
			readAnnotation(clazz);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		try {
			System.out.println("-----------Test Class----------------\n");

			Class<?> clazz2 = Class.forName("Assignment7.q1.Test");

			System.out.println("Class Annotations=>");
			readAnnotation(clazz2);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void readAnnotation(Method methods[]) {
		int i=0;
		for(Method method:methods) {
			System.out.println("["+i+"]"+method);
			
			if(method.isAnnotationPresent(Author.class)) {
				Author annotation=method.getAnnotation(Author.class);
				System.out.println("author:"+annotation.name());
			}
if(method.isAnnotationPresent(Version.class)) {
	Version annotation=method.getAnnotation(Version.class);
	System.out.println("version:"+annotation.number());
			}
i++;
		}
	}
	
	public static void readAnnotation(Constructor<?> constructors[]) {
		int i=0;
		for(Constructor<?> constructor:constructors) {
			System.out.println("["+i+"]"+constructor);
			
			if(constructor.isAnnotationPresent(Author.class)) {
				Author annotation=constructor.getAnnotation(Author.class);
				System.out.println("author:"+annotation.name());
			}
if(constructor.isAnnotationPresent(Version.class)) {
	Version annotation=constructor.getAnnotation(Version.class);
	System.out.println("version:"+annotation.number());
			}
i++;
		}
	}
	

	public static void readAnnotation(Class<?> clazz) {
		Annotation[] annotations = clazz.getAnnotations();
		
		for (Annotation annotation : annotations) {
			if (annotation instanceof Author) {
				Author author = (Author) annotation;
				System.out.println("author : " + author.name());
			}
			if (annotation instanceof Version) {
				Version version = (Version) annotation;
				System.out.println("version : " + version.number());
			}
		}
	}
	
}

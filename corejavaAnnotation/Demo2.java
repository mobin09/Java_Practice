package corejavaAnnotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) // @Retention is used to specified at what level our annotation is used
@interface CricketPlayer{
	String country() default "India";
	int runs() default 100;
}

@CricketPlayer(country = "Nepal", runs = 200)
class ViratKohli{
	private int innings;
	private String name;
	public int getInnings() {
		return innings;
	}
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}


class Demo2 {

	public static void main(String[] args) {
		ViratKohli v = new ViratKohli();
		Class c= v.getClass();
		Annotation a =c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp = (CricketPlayer)a;
		int rn = cp.runs();
		String country = cp.country();
		System.out.println(rn + ":" + country);
	}

}

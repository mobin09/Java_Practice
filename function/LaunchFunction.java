

/**
 * @author Mobin Arshad
 * Function<input, output>
 * 
 */

package function;
import java.util.function.Function;
import java.util.function.Predicate;
public class LaunchFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i*i;
		System.out.println(f.apply(20));
		
		Predicate<Integer> p = i -> i%2==0;
		System.out.println(p.test(20));
		System.out.println(p.test(21));

	}

}

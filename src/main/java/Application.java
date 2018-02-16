import static java.util.Arrays.asList;

import com.google.inject.Binder;
import com.google.inject.Module;

import io.bootique.Bootique;
import io.bootique.csv.CSVModule;
/**
 * Hello world!
 *
 */
public class Application implements Module {

	public static void main(String[] args) {
		Bootique.app(args).autoLoadModules().module(Application.class).exec().exit();
	}

	@Override
	public void configure(Binder binder) {
		CSVModule.extend(binder).addSimpleListener(s -> System.out.println(asList(s)));
	}
	
}

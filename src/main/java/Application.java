import static java.lang.System.out;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;

import com.google.inject.Binder;
import com.google.inject.Module;

import io.bootique.Bootique;
import io.bootique.csv.CSVModule;

/**
 * Demo appliction for bootique-csv module
 * @author franck
 */
public class Application implements Module {

	public static void main(String[] args) {
		Bootique.app(args).autoLoadModules().module(Application.class).exec().exit();
	}

	@Override
	public void configure(Binder binder) {
		CSVModule.extend(binder)
		    .addRowListener(s -> out.println("l1 -> "+asList(s)))
		    .addRowListener(s -> out.println("l2 -> "+asList(s)))
		    .addDocumentListener(s -> out.println("ALL rows\n" + s.stream().map(Arrays::asList).collect(toList())));
	}
	
}

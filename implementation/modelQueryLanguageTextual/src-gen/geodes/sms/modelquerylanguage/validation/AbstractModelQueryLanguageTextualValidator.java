/*
 * generated by Xtext 2.28.0
 */
package geodes.sms.modelquerylanguage.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractModelQueryLanguageTextualValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("geodes.sms.modelquerylanguage"));
		return result;
	}
}

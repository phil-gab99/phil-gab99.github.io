/*
 * generated by Xtext 2.28.0
 */
package geodes.sms.modelquerylanguage.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ModelQueryLanguageTextualAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("geodes/sms/modelquerylanguage/parser/antlr/internal/InternalModelQueryLanguageTextual.tokens");
	}
}

/*
 * generated by Xtext 2.28.0
 */
package geodes.sms.modelquerylanguage.formatting2

import ModelQueryLanguage.QueryFile
import com.google.inject.Inject
import geodes.sms.modelquerylanguage.services.ModelQueryLanguageTextualGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ModelQueryLanguageTextualFormatter extends AbstractFormatter2 {
	
	@Inject extension ModelQueryLanguageTextualGrammarAccess

	def dispatch void format(QueryFile queryFile, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (modelQuery : queryFile.queries) {
			modelQuery.format
		}
	}
	
}

/*
 * generated by Xtext 2.15.0
 */
package uam.mde20.sqlsi.xtext.formatting2

import com.google.inject.Inject
import datamodels.DataModel
import datamodels.Entity
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import uam.mde20.sqlsi.xtext.services.DatamodelsGrammarAccess

class DatamodelsFormatter extends AbstractFormatter2 {
	
	@Inject extension DatamodelsGrammarAccess

	def dispatch void format(DataModel dataModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (entity : dataModel.entities) {
			entity.format
		}
	}

	def dispatch void format(Entity entity, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (property : entity.properties) {
			property.format
		}
	}
	
	// TODO: implement for 
}

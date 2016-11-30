/**
 *
 * $Id$
 */
package smalluml.validation;

import org.eclipse.emf.common.util.EList;

import smalluml.Parameter;
import smalluml.Type;

/**
 * A sample validator interface for {@link smalluml.Method}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MethodValidator {
	boolean validate();

	boolean validateParameter(EList<Parameter> value);
	boolean validateReturnType(Type value);
}

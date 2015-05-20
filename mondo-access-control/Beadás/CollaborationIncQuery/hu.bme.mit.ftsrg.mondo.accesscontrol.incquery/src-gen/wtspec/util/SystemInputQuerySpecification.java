package wtspec.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import wtspec.SystemInputMatch;
import wtspec.SystemInputMatcher;

/**
 * A pattern-specific query specification that can instantiate SystemInputMatcher in a type-safe way.
 * 
 * @see SystemInputMatcher
 * @see SystemInputMatch
 * 
 */
@SuppressWarnings("all")
public final class SystemInputQuerySpecification extends BaseGeneratedEMFQuerySpecification<SystemInputMatcher> {
  private SystemInputQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SystemInputQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SystemInputMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SystemInputMatcher.on(engine);
  }
  
  @Override
  public SystemInputMatch newEmptyMatch() {
    return SystemInputMatch.newEmptyMatch();
  }
  
  @Override
  public SystemInputMatch newMatch(final Object... parameters) {
    return SystemInputMatch.newMatch((WTSpec.SystemInput) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SystemInputQuerySpecification INSTANCE = make();
    
    public static SystemInputQuerySpecification make() {
      return new SystemInputQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SystemInputQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "wtspec.systemInput";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("I","n");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("I", "WTSpec.SystemInput"),new PParameter("n", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_I = body.getOrCreateVariableByName("I");
      	PVariable var_n = body.getOrCreateVariableByName("n");
      	PVariable var__WT = body.getOrCreateVariableByName("_WT");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_I, "I"),
      				
      		new ExportedParameter(body, var_n, "n")
      	));
      	new TypeBinary(body, CONTEXT, var__WT, var_I, getFeatureLiteral("http://WTSpec/2.0", "WT", "itsInputs"), "http://WTSpec/2.0/WT.itsInputs");
      	new TypeBinary(body, CONTEXT, var_I, var_n, getFeatureLiteral("http://WTSpec/2.0", "SystemInput", "sysId"), "http://WTSpec/2.0/SystemInput.sysId");
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}

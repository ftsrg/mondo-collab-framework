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
import wtspec.SystemOutputMatch;
import wtspec.SystemOutputMatcher;

/**
 * A pattern-specific query specification that can instantiate SystemOutputMatcher in a type-safe way.
 * 
 * @see SystemOutputMatcher
 * @see SystemOutputMatch
 * 
 */
@SuppressWarnings("all")
public final class SystemOutputQuerySpecification extends BaseGeneratedEMFQuerySpecification<SystemOutputMatcher> {
  private SystemOutputQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SystemOutputQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SystemOutputMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SystemOutputMatcher.on(engine);
  }
  
  @Override
  public SystemOutputMatch newEmptyMatch() {
    return SystemOutputMatch.newEmptyMatch();
  }
  
  @Override
  public SystemOutputMatch newMatch(final Object... parameters) {
    return SystemOutputMatch.newMatch((WTSpec.SystemOutput) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SystemOutputQuerySpecification INSTANCE = make();
    
    public static SystemOutputQuerySpecification make() {
      return new SystemOutputQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SystemOutputQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "wtspec.systemOutput";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("O","n");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("O", "WTSpec.SystemOutput"),new PParameter("n", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_O = body.getOrCreateVariableByName("O");
      	PVariable var_n = body.getOrCreateVariableByName("n");
      	PVariable var__WT = body.getOrCreateVariableByName("_WT");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_O, "O"),
      				
      		new ExportedParameter(body, var_n, "n")
      	));
      	new TypeBinary(body, CONTEXT, var__WT, var_O, getFeatureLiteral("http://WTSpec/2.0", "WT", "itsOutputs"), "http://WTSpec/2.0/WT.itsOutputs");
      	new TypeBinary(body, CONTEXT, var_O, var_n, getFeatureLiteral("http://WTSpec/2.0", "SystemOutput", "sysId"), "http://WTSpec/2.0/SystemOutput.sysId");
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

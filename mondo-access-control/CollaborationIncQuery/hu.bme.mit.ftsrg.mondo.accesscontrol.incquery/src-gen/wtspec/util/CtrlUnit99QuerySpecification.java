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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import wtspec.CtrlUnit99Match;
import wtspec.CtrlUnit99Matcher;

/**
 * A pattern-specific query specification that can instantiate CtrlUnit99Matcher in a type-safe way.
 * 
 * @see CtrlUnit99Matcher
 * @see CtrlUnit99Match
 * 
 */
@SuppressWarnings("all")
public final class CtrlUnit99QuerySpecification extends BaseGeneratedEMFQuerySpecification<CtrlUnit99Matcher> {
  private CtrlUnit99QuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CtrlUnit99QuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CtrlUnit99Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CtrlUnit99Matcher.on(engine);
  }
  
  @Override
  public CtrlUnit99Match newEmptyMatch() {
    return CtrlUnit99Match.newEmptyMatch();
  }
  
  @Override
  public CtrlUnit99Match newMatch(final Object... parameters) {
    return CtrlUnit99Match.newMatch((WTSpec.Subsystem) parameters[0], (java.lang.String) parameters[1], (WTSpec.CtrlUnit99) parameters[2], (java.lang.String) parameters[3]);
  }
  
  private static class LazyHolder {
    private final static CtrlUnit99QuerySpecification INSTANCE = make();
    
    public static CtrlUnit99QuerySpecification make() {
      return new CtrlUnit99QuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CtrlUnit99QuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "wtspec.ctrlUnit99";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("S","s_id","WTC","c_id");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("S", "WTSpec.Subsystem"),new PParameter("s_id", "java.lang.String"),new PParameter("WTC", "WTSpec.CtrlUnit99"),new PParameter("c_id", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_S = body.getOrCreateVariableByName("S");
      	PVariable var_s_id = body.getOrCreateVariableByName("s_id");
      	PVariable var_WTC = body.getOrCreateVariableByName("WTC");
      	PVariable var_c_id = body.getOrCreateVariableByName("c_id");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_S, "S"),
      				
      		new ExportedParameter(body, var_s_id, "s_id"),
      				
      		new ExportedParameter(body, var_WTC, "WTC"),
      				
      		new ExportedParameter(body, var_c_id, "c_id")
      	));
      	new TypeUnary(body, var_WTC, getClassifierLiteral("http://WTSpec/2.0", "CtrlUnit99"), "http://WTSpec/2.0/CtrlUnit99");
      	new TypeBinary(body, CONTEXT, var_S, var_WTC, getFeatureLiteral("http://WTSpec/2.0", "Subsystem", "itsWTCs"), "http://WTSpec/2.0/Subsystem.itsWTCs");
      	new TypeBinary(body, CONTEXT, var_S, var_s_id, getFeatureLiteral("http://WTSpec/2.0", "Subsystem", "sysId"), "http://WTSpec/2.0/Subsystem.sysId");
      	new TypeBinary(body, CONTEXT, var_WTC, var_c_id, getFeatureLiteral("http://WTSpec/2.0", "wtc", "sysId"), "http://WTSpec/2.0/wtc.sysId");
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

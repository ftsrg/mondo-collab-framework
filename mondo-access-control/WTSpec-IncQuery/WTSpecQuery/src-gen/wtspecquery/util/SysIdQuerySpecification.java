package wtspecquery.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import wtspecquery.SysIdMatch;
import wtspecquery.SysIdMatcher;

/**
 * A pattern-specific query specification that can instantiate SysIdMatcher in a type-safe way.
 * 
 * @see SysIdMatcher
 * @see SysIdMatch
 * 
 */
@SuppressWarnings("all")
public final class SysIdQuerySpecification extends BaseGeneratedQuerySpecification<SysIdMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SysIdQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected SysIdMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SysIdMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "wtspecquery.sysId";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("S","N");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("S", ""),new PParameter("N", "java.lang.String"));
  }
  
  @Override
  public SysIdMatch newEmptyMatch() {
    return SysIdMatch.newEmptyMatch();
  }
  
  @Override
  public SysIdMatch newMatch(final Object... parameters) {
    return SysIdMatch.newMatch((wtspec.Subsystem) parameters[0], (java.lang.String) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_S = body.getOrCreateVariableByName("S");
      PVariable var_N = body.getOrCreateVariableByName("N");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_S, "S"), 
        new ExportedParameter(body, var_N, "N")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_S, var_N, getFeatureLiteral("http://WTSpec/2.0", "Subsystem", "sysId"), "http://WTSpec/2.0/Subsystem.sysId");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static SysIdQuerySpecification INSTANCE = make();
    
    public static SysIdQuerySpecification make() {
      return new SysIdQuerySpecification();					
      
    }
  }
}

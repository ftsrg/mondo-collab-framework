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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import wtspecquery.CtrlUnit99Match;
import wtspecquery.CtrlUnit99Matcher;

/**
 * A pattern-specific query specification that can instantiate CtrlUnit99Matcher in a type-safe way.
 * 
 * @see CtrlUnit99Matcher
 * @see CtrlUnit99Match
 * 
 */
@SuppressWarnings("all")
public final class CtrlUnit99QuerySpecification extends BaseGeneratedQuerySpecification<CtrlUnit99Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CtrlUnit99QuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
    
  }
  
  @Override
  protected CtrlUnit99Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CtrlUnit99Matcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "wtspecquery.ctrlUnit99";
    
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("S","WTC");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("S", ""),new PParameter("WTC", ""));
  }
  
  @Override
  public CtrlUnit99Match newEmptyMatch() {
    return CtrlUnit99Match.newEmptyMatch();
  }
  
  @Override
  public CtrlUnit99Match newMatch(final Object... parameters) {
    return CtrlUnit99Match.newMatch((wtspec.Subsystem) parameters[0], (wtspec.CtrlUnit99) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody> bodies = Sets.newLinkedHashSet();
    {
      PBody body = new PBody(this);
      PVariable var_S = body.getOrCreateVariableByName("S");
      PVariable var_WTC = body.getOrCreateVariableByName("WTC");
      body.setExportedParameters(Arrays.<ExportedParameter>asList(
        new ExportedParameter(body, var_S, "S"), 
        new ExportedParameter(body, var_WTC, "WTC")
      ));
      
      
      new TypeBinary(body, CONTEXT, var_S, var_WTC, getFeatureLiteral("http://WTSpec/2.0", "Subsystem", "itsWTCs"), "http://WTSpec/2.0/Subsystem.itsWTCs");
      new TypeUnary(body, var_WTC, getClassifierLiteral("http://WTSpec/2.0", "CtrlUnit99"), "http://WTSpec/2.0/CtrlUnit99");
      bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static CtrlUnit99QuerySpecification INSTANCE = make();
    
    public static CtrlUnit99QuerySpecification make() {
      return new CtrlUnit99QuerySpecification();					
      
    }
  }
}

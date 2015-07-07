/**
 * Copyright (c) 2004-2015 Gabor Bergmann and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Gabor Bergmann - initial API and implementation
 */
package org.mondo.collaboration.security.lens.arbiter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author Bergmann Gabor
 */
@SuppressWarnings("all")
public abstract class Asset {
  @Data
  public static class ObjectAsset extends Asset {
    private final EObject object;
    
    @Override
    public Tuple toTuple() {
      return new FlatTuple(this.object);
    }
    
    public ObjectAsset(final EObject object) {
      super();
      this.object = object;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.object== null) ? 0 : this.object.hashCode());
      return result;
    }
    
    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Asset.ObjectAsset other = (Asset.ObjectAsset) obj;
      if (this.object == null) {
        if (other.object != null)
          return false;
      } else if (!this.object.equals(other.object))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      String result = new ToStringBuilder(this)
      	.addAllFields()
      	.toString();
      return result;
    }
    
    @Pure
    public EObject getObject() {
      return this.object;
    }
  }
  
  @Data
  public static class ReferenceAsset extends Asset {
    private final EObject source;
    
    private final EReference reference;
    
    private final EObject target;
    
    @Override
    public Tuple toTuple() {
      return new FlatTuple(this.source, this.reference, this.target);
    }
    
    public ReferenceAsset(final EObject source, final EReference reference, final EObject target) {
      super();
      this.source = source;
      this.reference = reference;
      this.target = target;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.source== null) ? 0 : this.source.hashCode());
      result = prime * result + ((this.reference== null) ? 0 : this.reference.hashCode());
      result = prime * result + ((this.target== null) ? 0 : this.target.hashCode());
      return result;
    }
    
    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Asset.ReferenceAsset other = (Asset.ReferenceAsset) obj;
      if (this.source == null) {
        if (other.source != null)
          return false;
      } else if (!this.source.equals(other.source))
        return false;
      if (this.reference == null) {
        if (other.reference != null)
          return false;
      } else if (!this.reference.equals(other.reference))
        return false;
      if (this.target == null) {
        if (other.target != null)
          return false;
      } else if (!this.target.equals(other.target))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      String result = new ToStringBuilder(this)
      	.addAllFields()
      	.toString();
      return result;
    }
    
    @Pure
    public EObject getSource() {
      return this.source;
    }
    
    @Pure
    public EReference getReference() {
      return this.reference;
    }
    
    @Pure
    public EObject getTarget() {
      return this.target;
    }
  }
  
  @Data
  public static class AttributeAsset extends Asset {
    private final EObject source;
    
    private final EAttribute attribute;
    
    @Override
    public Tuple toTuple() {
      return new FlatTuple(this.source, this.attribute);
    }
    
    public AttributeAsset(final EObject source, final EAttribute attribute) {
      super();
      this.source = source;
      this.attribute = attribute;
    }
    
    @Override
    @Pure
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((this.source== null) ? 0 : this.source.hashCode());
      result = prime * result + ((this.attribute== null) ? 0 : this.attribute.hashCode());
      return result;
    }
    
    @Override
    @Pure
    public boolean equals(final Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Asset.AttributeAsset other = (Asset.AttributeAsset) obj;
      if (this.source == null) {
        if (other.source != null)
          return false;
      } else if (!this.source.equals(other.source))
        return false;
      if (this.attribute == null) {
        if (other.attribute != null)
          return false;
      } else if (!this.attribute.equals(other.attribute))
        return false;
      return true;
    }
    
    @Override
    @Pure
    public String toString() {
      String result = new ToStringBuilder(this)
      	.addAllFields()
      	.toString();
      return result;
    }
    
    @Pure
    public EObject getSource() {
      return this.source;
    }
    
    @Pure
    public EAttribute getAttribute() {
      return this.attribute;
    }
  }
  
  public abstract Tuple toTuple();
}

/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.disges.thrift.plugin.testdata.objects.included.package1;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectInnerStruct implements org.apache.thrift.TBase<ObjectInnerStruct, ObjectInnerStruct._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ObjectInnerStruct");

  private static final org.apache.thrift.protocol.TField STRING_VARIABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("stringVariable", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INNER_STRUCT_FIELD_DESC = new org.apache.thrift.protocol.TField("innerStruct", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField INNER_STRUCT_PACKAGE2_FIELD_DESC = new org.apache.thrift.protocol.TField("innerStructPackage2", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ObjectInnerStructStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ObjectInnerStructTupleSchemeFactory());
  }

  public String stringVariable; // required
  public SimpleStruct innerStruct; // required
  public org.disges.thrift.plugin.testdata.objects.included.package2.SimpleStructPackage2 innerStructPackage2; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STRING_VARIABLE((short)1, "stringVariable"),
    INNER_STRUCT((short)2, "innerStruct"),
    INNER_STRUCT_PACKAGE2((short)3, "innerStructPackage2");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STRING_VARIABLE
          return STRING_VARIABLE;
        case 2: // INNER_STRUCT
          return INNER_STRUCT;
        case 3: // INNER_STRUCT_PACKAGE2
          return INNER_STRUCT_PACKAGE2;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STRING_VARIABLE, new org.apache.thrift.meta_data.FieldMetaData("stringVariable", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INNER_STRUCT, new org.apache.thrift.meta_data.FieldMetaData("innerStruct", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SimpleStruct.class)));
    tmpMap.put(_Fields.INNER_STRUCT_PACKAGE2, new org.apache.thrift.meta_data.FieldMetaData("innerStructPackage2", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.disges.thrift.plugin.testdata.objects.included.package2.SimpleStructPackage2.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ObjectInnerStruct.class, metaDataMap);
  }

  public ObjectInnerStruct() {
  }

  public ObjectInnerStruct(
    String stringVariable,
    SimpleStruct innerStruct,
    org.disges.thrift.plugin.testdata.objects.included.package2.SimpleStructPackage2 innerStructPackage2)
  {
    this();
    this.stringVariable = stringVariable;
    this.innerStruct = innerStruct;
    this.innerStructPackage2 = innerStructPackage2;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ObjectInnerStruct(ObjectInnerStruct other) {
    if (other.isSetStringVariable()) {
      this.stringVariable = other.stringVariable;
    }
    if (other.isSetInnerStruct()) {
      this.innerStruct = new SimpleStruct(other.innerStruct);
    }
    if (other.isSetInnerStructPackage2()) {
      this.innerStructPackage2 = new org.disges.thrift.plugin.testdata.objects.included.package2.SimpleStructPackage2(other.innerStructPackage2);
    }
  }

  public ObjectInnerStruct deepCopy() {
    return new ObjectInnerStruct(this);
  }

  @Override
  public void clear() {
    this.stringVariable = null;
    this.innerStruct = null;
    this.innerStructPackage2 = null;
  }

  public String getStringVariable() {
    return this.stringVariable;
  }

  public ObjectInnerStruct setStringVariable(String stringVariable) {
    this.stringVariable = stringVariable;
    return this;
  }

  public void unsetStringVariable() {
    this.stringVariable = null;
  }

  /** Returns true if field stringVariable is set (has been assigned a value) and false otherwise */
  public boolean isSetStringVariable() {
    return this.stringVariable != null;
  }

  public void setStringVariableIsSet(boolean value) {
    if (!value) {
      this.stringVariable = null;
    }
  }

  public SimpleStruct getInnerStruct() {
    return this.innerStruct;
  }

  public ObjectInnerStruct setInnerStruct(SimpleStruct innerStruct) {
    this.innerStruct = innerStruct;
    return this;
  }

  public void unsetInnerStruct() {
    this.innerStruct = null;
  }

  /** Returns true if field innerStruct is set (has been assigned a value) and false otherwise */
  public boolean isSetInnerStruct() {
    return this.innerStruct != null;
  }

  public void setInnerStructIsSet(boolean value) {
    if (!value) {
      this.innerStruct = null;
    }
  }

  public org.disges.thrift.plugin.testdata.objects.included.package2.SimpleStructPackage2 getInnerStructPackage2() {
    return this.innerStructPackage2;
  }

  public ObjectInnerStruct setInnerStructPackage2(org.disges.thrift.plugin.testdata.objects.included.package2.SimpleStructPackage2 innerStructPackage2) {
    this.innerStructPackage2 = innerStructPackage2;
    return this;
  }

  public void unsetInnerStructPackage2() {
    this.innerStructPackage2 = null;
  }

  /** Returns true if field innerStructPackage2 is set (has been assigned a value) and false otherwise */
  public boolean isSetInnerStructPackage2() {
    return this.innerStructPackage2 != null;
  }

  public void setInnerStructPackage2IsSet(boolean value) {
    if (!value) {
      this.innerStructPackage2 = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STRING_VARIABLE:
      if (value == null) {
        unsetStringVariable();
      } else {
        setStringVariable((String)value);
      }
      break;

    case INNER_STRUCT:
      if (value == null) {
        unsetInnerStruct();
      } else {
        setInnerStruct((SimpleStruct)value);
      }
      break;

    case INNER_STRUCT_PACKAGE2:
      if (value == null) {
        unsetInnerStructPackage2();
      } else {
        setInnerStructPackage2((org.disges.thrift.plugin.testdata.objects.included.package2.SimpleStructPackage2)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STRING_VARIABLE:
      return getStringVariable();

    case INNER_STRUCT:
      return getInnerStruct();

    case INNER_STRUCT_PACKAGE2:
      return getInnerStructPackage2();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STRING_VARIABLE:
      return isSetStringVariable();
    case INNER_STRUCT:
      return isSetInnerStruct();
    case INNER_STRUCT_PACKAGE2:
      return isSetInnerStructPackage2();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ObjectInnerStruct)
      return this.equals((ObjectInnerStruct)that);
    return false;
  }

  public boolean equals(ObjectInnerStruct that) {
    if (that == null)
      return false;

    boolean this_present_stringVariable = true && this.isSetStringVariable();
    boolean that_present_stringVariable = true && that.isSetStringVariable();
    if (this_present_stringVariable || that_present_stringVariable) {
      if (!(this_present_stringVariable && that_present_stringVariable))
        return false;
      if (!this.stringVariable.equals(that.stringVariable))
        return false;
    }

    boolean this_present_innerStruct = true && this.isSetInnerStruct();
    boolean that_present_innerStruct = true && that.isSetInnerStruct();
    if (this_present_innerStruct || that_present_innerStruct) {
      if (!(this_present_innerStruct && that_present_innerStruct))
        return false;
      if (!this.innerStruct.equals(that.innerStruct))
        return false;
    }

    boolean this_present_innerStructPackage2 = true && this.isSetInnerStructPackage2();
    boolean that_present_innerStructPackage2 = true && that.isSetInnerStructPackage2();
    if (this_present_innerStructPackage2 || that_present_innerStructPackage2) {
      if (!(this_present_innerStructPackage2 && that_present_innerStructPackage2))
        return false;
      if (!this.innerStructPackage2.equals(that.innerStructPackage2))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ObjectInnerStruct other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ObjectInnerStruct typedOther = (ObjectInnerStruct)other;

    lastComparison = Boolean.valueOf(isSetStringVariable()).compareTo(typedOther.isSetStringVariable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringVariable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stringVariable, typedOther.stringVariable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInnerStruct()).compareTo(typedOther.isSetInnerStruct());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInnerStruct()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.innerStruct, typedOther.innerStruct);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInnerStructPackage2()).compareTo(typedOther.isSetInnerStructPackage2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInnerStructPackage2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.innerStructPackage2, typedOther.innerStructPackage2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ObjectInnerStruct(");
    boolean first = true;

    sb.append("stringVariable:");
    if (this.stringVariable == null) {
      sb.append("null");
    } else {
      sb.append(this.stringVariable);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("innerStruct:");
    if (this.innerStruct == null) {
      sb.append("null");
    } else {
      sb.append(this.innerStruct);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("innerStructPackage2:");
    if (this.innerStructPackage2 == null) {
      sb.append("null");
    } else {
      sb.append(this.innerStructPackage2);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (stringVariable == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'stringVariable' was not present! Struct: " + toString());
    }
    if (innerStruct == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'innerStruct' was not present! Struct: " + toString());
    }
    if (innerStructPackage2 == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'innerStructPackage2' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (innerStruct != null) {
      innerStruct.validate();
    }
    if (innerStructPackage2 != null) {
      innerStructPackage2.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ObjectInnerStructStandardSchemeFactory implements SchemeFactory {
    public ObjectInnerStructStandardScheme getScheme() {
      return new ObjectInnerStructStandardScheme();
    }
  }

  private static class ObjectInnerStructStandardScheme extends StandardScheme<ObjectInnerStruct> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ObjectInnerStruct struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STRING_VARIABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stringVariable = iprot.readString();
              struct.setStringVariableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INNER_STRUCT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.innerStruct = new SimpleStruct();
              struct.innerStruct.read(iprot);
              struct.setInnerStructIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INNER_STRUCT_PACKAGE2
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.innerStructPackage2 = new org.disges.thrift.plugin.testdata.objects.included.package2.SimpleStructPackage2();
              struct.innerStructPackage2.read(iprot);
              struct.setInnerStructPackage2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ObjectInnerStruct struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stringVariable != null) {
        oprot.writeFieldBegin(STRING_VARIABLE_FIELD_DESC);
        oprot.writeString(struct.stringVariable);
        oprot.writeFieldEnd();
      }
      if (struct.innerStruct != null) {
        oprot.writeFieldBegin(INNER_STRUCT_FIELD_DESC);
        struct.innerStruct.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.innerStructPackage2 != null) {
        oprot.writeFieldBegin(INNER_STRUCT_PACKAGE2_FIELD_DESC);
        struct.innerStructPackage2.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ObjectInnerStructTupleSchemeFactory implements SchemeFactory {
    public ObjectInnerStructTupleScheme getScheme() {
      return new ObjectInnerStructTupleScheme();
    }
  }

  private static class ObjectInnerStructTupleScheme extends TupleScheme<ObjectInnerStruct> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ObjectInnerStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.stringVariable);
      struct.innerStruct.write(oprot);
      struct.innerStructPackage2.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ObjectInnerStruct struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.stringVariable = iprot.readString();
      struct.setStringVariableIsSet(true);
      struct.innerStruct = new SimpleStruct();
      struct.innerStruct.read(iprot);
      struct.setInnerStructIsSet(true);
      struct.innerStructPackage2 = new org.disges.thrift.plugin.testdata.objects.included.package2.SimpleStructPackage2();
      struct.innerStructPackage2.read(iprot);
      struct.setInnerStructPackage2IsSet(true);
    }
  }

}


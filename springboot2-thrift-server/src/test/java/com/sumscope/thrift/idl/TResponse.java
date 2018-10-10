/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.sumscope.thrift.idl;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-08-13")
public class TResponse implements org.apache.thrift.TBase<TResponse, TResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResponse");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RET_FIELD_DESC = new org.apache.thrift.protocol.TField("ret", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField RETOBJ_FIELD_DESC = new org.apache.thrift.protocol.TField("retobj", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TResponseTupleSchemeFactory();

  public int status; // required
  public java.lang.String ret; // required
  public java.nio.ByteBuffer retobj; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    RET((short)2, "ret"),
    RETOBJ((short)3, "retobj");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // RET
          return RET;
        case 3: // RETOBJ
          return RETOBJ;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STATUS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RETOBJ};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RET, new org.apache.thrift.meta_data.FieldMetaData("ret", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RETOBJ, new org.apache.thrift.meta_data.FieldMetaData("retobj", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResponse.class, metaDataMap);
  }

  public TResponse() {
  }

  public TResponse(
    int status,
    java.lang.String ret)
  {
    this();
    this.status = status;
    setStatusIsSet(true);
    this.ret = ret;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResponse(TResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.status = other.status;
    if (other.isSetRet()) {
      this.ret = other.ret;
    }
    if (other.isSetRetobj()) {
      this.retobj = org.apache.thrift.TBaseHelper.copyBinary(other.retobj);
    }
  }

  public TResponse deepCopy() {
    return new TResponse(this);
  }

  @Override
  public void clear() {
    setStatusIsSet(false);
    this.status = 0;
    this.ret = null;
    this.retobj = null;
  }

  public int getStatus() {
    return this.status;
  }

  public TResponse setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  public java.lang.String getRet() {
    return this.ret;
  }

  public TResponse setRet(java.lang.String ret) {
    this.ret = ret;
    return this;
  }

  public void unsetRet() {
    this.ret = null;
  }

  /** Returns true if field ret is set (has been assigned a value) and false otherwise */
  public boolean isSetRet() {
    return this.ret != null;
  }

  public void setRetIsSet(boolean value) {
    if (!value) {
      this.ret = null;
    }
  }

  public byte[] getRetobj() {
    setRetobj(org.apache.thrift.TBaseHelper.rightSize(retobj));
    return retobj == null ? null : retobj.array();
  }

  public java.nio.ByteBuffer bufferForRetobj() {
    return org.apache.thrift.TBaseHelper.copyBinary(retobj);
  }

  public TResponse setRetobj(byte[] retobj) {
    this.retobj = retobj == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(retobj.clone());
    return this;
  }

  public TResponse setRetobj(java.nio.ByteBuffer retobj) {
    this.retobj = org.apache.thrift.TBaseHelper.copyBinary(retobj);
    return this;
  }

  public void unsetRetobj() {
    this.retobj = null;
  }

  /** Returns true if field retobj is set (has been assigned a value) and false otherwise */
  public boolean isSetRetobj() {
    return this.retobj != null;
  }

  public void setRetobjIsSet(boolean value) {
    if (!value) {
      this.retobj = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.Integer)value);
      }
      break;

    case RET:
      if (value == null) {
        unsetRet();
      } else {
        setRet((java.lang.String)value);
      }
      break;

    case RETOBJ:
      if (value == null) {
        unsetRetobj();
      } else {
        if (value instanceof byte[]) {
          setRetobj((byte[])value);
        } else {
          setRetobj((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case RET:
      return getRet();

    case RETOBJ:
      return getRetobj();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case RET:
      return isSetRet();
    case RETOBJ:
      return isSetRetobj();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TResponse)
      return this.equals((TResponse)that);
    return false;
  }

  public boolean equals(TResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_ret = true && this.isSetRet();
    boolean that_present_ret = true && that.isSetRet();
    if (this_present_ret || that_present_ret) {
      if (!(this_present_ret && that_present_ret))
        return false;
      if (!this.ret.equals(that.ret))
        return false;
    }

    boolean this_present_retobj = true && this.isSetRetobj();
    boolean that_present_retobj = true && that.isSetRetobj();
    if (this_present_retobj || that_present_retobj) {
      if (!(this_present_retobj && that_present_retobj))
        return false;
      if (!this.retobj.equals(that.retobj))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + status;

    hashCode = hashCode * 8191 + ((isSetRet()) ? 131071 : 524287);
    if (isSetRet())
      hashCode = hashCode * 8191 + ret.hashCode();

    hashCode = hashCode * 8191 + ((isSetRetobj()) ? 131071 : 524287);
    if (isSetRetobj())
      hashCode = hashCode * 8191 + retobj.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRet()).compareTo(other.isSetRet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ret, other.ret);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRetobj()).compareTo(other.isSetRetobj());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRetobj()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.retobj, other.retobj);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TResponse(");
    boolean first = true;

    sb.append("status:");
    sb.append(this.status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ret:");
    if (this.ret == null) {
      sb.append("null");
    } else {
      sb.append(this.ret);
    }
    first = false;
    if (isSetRetobj()) {
      if (!first) sb.append(", ");
      sb.append("retobj:");
      if (this.retobj == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.retobj, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'status' because it's a primitive and you chose the non-beans generator.
    if (ret == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ret' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TResponseStandardScheme getScheme() {
      return new TResponseStandardScheme();
    }
  }

  private static class TResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<TResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = iprot.readI32();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ret = iprot.readString();
              struct.setRetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RETOBJ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.retobj = iprot.readBinary();
              struct.setRetobjIsSet(true);
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
      if (!struct.isSetStatus()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(struct.status);
      oprot.writeFieldEnd();
      if (struct.ret != null) {
        oprot.writeFieldBegin(RET_FIELD_DESC);
        oprot.writeString(struct.ret);
        oprot.writeFieldEnd();
      }
      if (struct.retobj != null) {
        if (struct.isSetRetobj()) {
          oprot.writeFieldBegin(RETOBJ_FIELD_DESC);
          oprot.writeBinary(struct.retobj);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TResponseTupleScheme getScheme() {
      return new TResponseTupleScheme();
    }
  }

  private static class TResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<TResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.status);
      oprot.writeString(struct.ret);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRetobj()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRetobj()) {
        oprot.writeBinary(struct.retobj);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.status = iprot.readI32();
      struct.setStatusIsSet(true);
      struct.ret = iprot.readString();
      struct.setRetIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.retobj = iprot.readBinary();
        struct.setRetobjIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


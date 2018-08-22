/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class TableStatsRequest implements org.apache.thrift.TBase<TableStatsRequest, TableStatsRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TableStatsRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TableStatsRequest");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TBL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tblName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COL_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("colNames", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField CAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catName", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableStatsRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableStatsRequestTupleSchemeFactory());
  }

  private String dbName; // required
  private String tblName; // required
  private List<String> colNames; // required
  private String catName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "dbName"),
    TBL_NAME((short)2, "tblName"),
    COL_NAMES((short)3, "colNames"),
    CAT_NAME((short)4, "catName");

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
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // TBL_NAME
          return TBL_NAME;
        case 3: // COL_NAMES
          return COL_NAMES;
        case 4: // CAT_NAME
          return CAT_NAME;
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
  private static final _Fields optionals[] = {_Fields.CAT_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TBL_NAME, new org.apache.thrift.meta_data.FieldMetaData("tblName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COL_NAMES, new org.apache.thrift.meta_data.FieldMetaData("colNames", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("catName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TableStatsRequest.class, metaDataMap);
  }

  public TableStatsRequest() {
  }

  public TableStatsRequest(
    String dbName,
    String tblName,
    List<String> colNames)
  {
    this();
    this.dbName = dbName;
    this.tblName = tblName;
    this.colNames = colNames;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableStatsRequest(TableStatsRequest other) {
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTblName()) {
      this.tblName = other.tblName;
    }
    if (other.isSetColNames()) {
      List<String> __this__colNames = new ArrayList<String>(other.colNames);
      this.colNames = __this__colNames;
    }
    if (other.isSetCatName()) {
      this.catName = other.catName;
    }
  }

  public TableStatsRequest deepCopy() {
    return new TableStatsRequest(this);
  }

  @Override
  public void clear() {
    this.dbName = null;
    this.tblName = null;
    this.colNames = null;
    this.catName = null;
  }

  public String getDbName() {
    return this.dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  public String getTblName() {
    return this.tblName;
  }

  public void setTblName(String tblName) {
    this.tblName = tblName;
  }

  public void unsetTblName() {
    this.tblName = null;
  }

  /** Returns true if field tblName is set (has been assigned a value) and false otherwise */
  public boolean isSetTblName() {
    return this.tblName != null;
  }

  public void setTblNameIsSet(boolean value) {
    if (!value) {
      this.tblName = null;
    }
  }

  public int getColNamesSize() {
    return (this.colNames == null) ? 0 : this.colNames.size();
  }

  public java.util.Iterator<String> getColNamesIterator() {
    return (this.colNames == null) ? null : this.colNames.iterator();
  }

  public void addToColNames(String elem) {
    if (this.colNames == null) {
      this.colNames = new ArrayList<String>();
    }
    this.colNames.add(elem);
  }

  public List<String> getColNames() {
    return this.colNames;
  }

  public void setColNames(List<String> colNames) {
    this.colNames = colNames;
  }

  public void unsetColNames() {
    this.colNames = null;
  }

  /** Returns true if field colNames is set (has been assigned a value) and false otherwise */
  public boolean isSetColNames() {
    return this.colNames != null;
  }

  public void setColNamesIsSet(boolean value) {
    if (!value) {
      this.colNames = null;
    }
  }

  public String getCatName() {
    return this.catName;
  }

  public void setCatName(String catName) {
    this.catName = catName;
  }

  public void unsetCatName() {
    this.catName = null;
  }

  /** Returns true if field catName is set (has been assigned a value) and false otherwise */
  public boolean isSetCatName() {
    return this.catName != null;
  }

  public void setCatNameIsSet(boolean value) {
    if (!value) {
      this.catName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((String)value);
      }
      break;

    case TBL_NAME:
      if (value == null) {
        unsetTblName();
      } else {
        setTblName((String)value);
      }
      break;

    case COL_NAMES:
      if (value == null) {
        unsetColNames();
      } else {
        setColNames((List<String>)value);
      }
      break;

    case CAT_NAME:
      if (value == null) {
        unsetCatName();
      } else {
        setCatName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDbName();

    case TBL_NAME:
      return getTblName();

    case COL_NAMES:
      return getColNames();

    case CAT_NAME:
      return getCatName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DB_NAME:
      return isSetDbName();
    case TBL_NAME:
      return isSetTblName();
    case COL_NAMES:
      return isSetColNames();
    case CAT_NAME:
      return isSetCatName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableStatsRequest)
      return this.equals((TableStatsRequest)that);
    return false;
  }

  public boolean equals(TableStatsRequest that) {
    if (that == null)
      return false;

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_tblName = true && this.isSetTblName();
    boolean that_present_tblName = true && that.isSetTblName();
    if (this_present_tblName || that_present_tblName) {
      if (!(this_present_tblName && that_present_tblName))
        return false;
      if (!this.tblName.equals(that.tblName))
        return false;
    }

    boolean this_present_colNames = true && this.isSetColNames();
    boolean that_present_colNames = true && that.isSetColNames();
    if (this_present_colNames || that_present_colNames) {
      if (!(this_present_colNames && that_present_colNames))
        return false;
      if (!this.colNames.equals(that.colNames))
        return false;
    }

    boolean this_present_catName = true && this.isSetCatName();
    boolean that_present_catName = true && that.isSetCatName();
    if (this_present_catName || that_present_catName) {
      if (!(this_present_catName && that_present_catName))
        return false;
      if (!this.catName.equals(that.catName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dbName = true && (isSetDbName());
    list.add(present_dbName);
    if (present_dbName)
      list.add(dbName);

    boolean present_tblName = true && (isSetTblName());
    list.add(present_tblName);
    if (present_tblName)
      list.add(tblName);

    boolean present_colNames = true && (isSetColNames());
    list.add(present_colNames);
    if (present_colNames)
      list.add(colNames);

    boolean present_catName = true && (isSetCatName());
    list.add(present_catName);
    if (present_catName)
      list.add(catName);

    return list.hashCode();
  }

  @Override
  public int compareTo(TableStatsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDbName()).compareTo(other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, other.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTblName()).compareTo(other.isSetTblName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTblName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tblName, other.tblName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColNames()).compareTo(other.isSetColNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colNames, other.colNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCatName()).compareTo(other.isSetCatName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catName, other.catName);
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
    StringBuilder sb = new StringBuilder("TableStatsRequest(");
    boolean first = true;

    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tblName:");
    if (this.tblName == null) {
      sb.append("null");
    } else {
      sb.append(this.tblName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("colNames:");
    if (this.colNames == null) {
      sb.append("null");
    } else {
      sb.append(this.colNames);
    }
    first = false;
    if (isSetCatName()) {
      if (!first) sb.append(", ");
      sb.append("catName:");
      if (this.catName == null) {
        sb.append("null");
      } else {
        sb.append(this.catName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDbName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbName' is unset! Struct:" + toString());
    }

    if (!isSetTblName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tblName' is unset! Struct:" + toString());
    }

    if (!isSetColNames()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'colNames' is unset! Struct:" + toString());
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TableStatsRequestStandardSchemeFactory implements SchemeFactory {
    public TableStatsRequestStandardScheme getScheme() {
      return new TableStatsRequestStandardScheme();
    }
  }

  private static class TableStatsRequestStandardScheme extends StandardScheme<TableStatsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TableStatsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TBL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tblName = iprot.readString();
              struct.setTblNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COL_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list450 = iprot.readListBegin();
                struct.colNames = new ArrayList<String>(_list450.size);
                String _elem451;
                for (int _i452 = 0; _i452 < _list450.size; ++_i452)
                {
                  _elem451 = iprot.readString();
                  struct.colNames.add(_elem451);
                }
                iprot.readListEnd();
              }
              struct.setColNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catName = iprot.readString();
              struct.setCatNameIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TableStatsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.tblName != null) {
        oprot.writeFieldBegin(TBL_NAME_FIELD_DESC);
        oprot.writeString(struct.tblName);
        oprot.writeFieldEnd();
      }
      if (struct.colNames != null) {
        oprot.writeFieldBegin(COL_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.colNames.size()));
          for (String _iter453 : struct.colNames)
          {
            oprot.writeString(_iter453);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.catName != null) {
        if (struct.isSetCatName()) {
          oprot.writeFieldBegin(CAT_NAME_FIELD_DESC);
          oprot.writeString(struct.catName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableStatsRequestTupleSchemeFactory implements SchemeFactory {
    public TableStatsRequestTupleScheme getScheme() {
      return new TableStatsRequestTupleScheme();
    }
  }

  private static class TableStatsRequestTupleScheme extends TupleScheme<TableStatsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TableStatsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dbName);
      oprot.writeString(struct.tblName);
      {
        oprot.writeI32(struct.colNames.size());
        for (String _iter454 : struct.colNames)
        {
          oprot.writeString(_iter454);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetCatName()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCatName()) {
        oprot.writeString(struct.catName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TableStatsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dbName = iprot.readString();
      struct.setDbNameIsSet(true);
      struct.tblName = iprot.readString();
      struct.setTblNameIsSet(true);
      {
        org.apache.thrift.protocol.TList _list455 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.colNames = new ArrayList<String>(_list455.size);
        String _elem456;
        for (int _i457 = 0; _i457 < _list455.size; ++_i457)
        {
          _elem456 = iprot.readString();
          struct.colNames.add(_elem456);
        }
      }
      struct.setColNamesIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.catName = iprot.readString();
        struct.setCatNameIsSet(true);
      }
    }
  }

}


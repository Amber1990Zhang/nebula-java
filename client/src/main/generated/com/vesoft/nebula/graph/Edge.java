/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.graph;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class Edge implements TBase, java.io.Serializable, Cloneable, Comparable<Edge> {
  private static final TStruct STRUCT_DESC = new TStruct("Edge");
  private static final TField TYPE_FIELD_DESC = new TField("type", TType.STRING, (short)1);
  private static final TField RANKING_FIELD_DESC = new TField("ranking", TType.I64, (short)2);
  private static final TField SRC_FIELD_DESC = new TField("src", TType.I64, (short)3);
  private static final TField DST_FIELD_DESC = new TField("dst", TType.I64, (short)4);

  public byte[] type;
  public long ranking;
  public long src;
  public long dst;
  public static final int TYPE = 1;
  public static final int RANKING = 2;
  public static final int SRC = 3;
  public static final int DST = 4;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __RANKING_ISSET_ID = 0;
  private static final int __SRC_ISSET_ID = 1;
  private static final int __DST_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(TYPE, new FieldMetaData("type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(RANKING, new FieldMetaData("ranking", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(SRC, new FieldMetaData("src", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(DST, new FieldMetaData("dst", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(Edge.class, metaDataMap);
  }

  public Edge() {
  }

  public Edge(
    byte[] type,
    long ranking)
  {
    this();
    this.type = type;
    this.ranking = ranking;
    setRankingIsSet(true);
  }

  public Edge(
    byte[] type,
    long ranking,
    long src,
    long dst)
  {
    this();
    this.type = type;
    this.ranking = ranking;
    setRankingIsSet(true);
    this.src = src;
    setSrcIsSet(true);
    this.dst = dst;
    setDstIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Edge(Edge other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetType()) {
      this.type = TBaseHelper.deepCopy(other.type);
    }
    this.ranking = TBaseHelper.deepCopy(other.ranking);
    this.src = TBaseHelper.deepCopy(other.src);
    this.dst = TBaseHelper.deepCopy(other.dst);
  }

  public Edge deepCopy() {
    return new Edge(this);
  }

  @Deprecated
  public Edge clone() {
    return new Edge(this);
  }

  public byte[]  getType() {
    return this.type;
  }

  public Edge setType(byte[] type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  // Returns true if field type is set (has been assigned a value) and false otherwise
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public long  getRanking() {
    return this.ranking;
  }

  public Edge setRanking(long ranking) {
    this.ranking = ranking;
    setRankingIsSet(true);
    return this;
  }

  public void unsetRanking() {
    __isset_bit_vector.clear(__RANKING_ISSET_ID);
  }

  // Returns true if field ranking is set (has been assigned a value) and false otherwise
  public boolean isSetRanking() {
    return __isset_bit_vector.get(__RANKING_ISSET_ID);
  }

  public void setRankingIsSet(boolean value) {
    __isset_bit_vector.set(__RANKING_ISSET_ID, value);
  }

  public long  getSrc() {
    return this.src;
  }

  public Edge setSrc(long src) {
    this.src = src;
    setSrcIsSet(true);
    return this;
  }

  public void unsetSrc() {
    __isset_bit_vector.clear(__SRC_ISSET_ID);
  }

  // Returns true if field src is set (has been assigned a value) and false otherwise
  public boolean isSetSrc() {
    return __isset_bit_vector.get(__SRC_ISSET_ID);
  }

  public void setSrcIsSet(boolean value) {
    __isset_bit_vector.set(__SRC_ISSET_ID, value);
  }

  public long  getDst() {
    return this.dst;
  }

  public Edge setDst(long dst) {
    this.dst = dst;
    setDstIsSet(true);
    return this;
  }

  public void unsetDst() {
    __isset_bit_vector.clear(__DST_ISSET_ID);
  }

  // Returns true if field dst is set (has been assigned a value) and false otherwise
  public boolean isSetDst() {
    return __isset_bit_vector.get(__DST_ISSET_ID);
  }

  public void setDstIsSet(boolean value) {
    __isset_bit_vector.set(__DST_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((byte[])value);
      }
      break;

    case RANKING:
      if (value == null) {
        unsetRanking();
      } else {
        setRanking((Long)value);
      }
      break;

    case SRC:
      if (value == null) {
        unsetSrc();
      } else {
        setSrc((Long)value);
      }
      break;

    case DST:
      if (value == null) {
        unsetDst();
      } else {
        setDst((Long)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case TYPE:
      return getType();

    case RANKING:
      return new Long(getRanking());

    case SRC:
      return new Long(getSrc());

    case DST:
      return new Long(getDst());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case TYPE:
      return isSetType();
    case RANKING:
      return isSetRanking();
    case SRC:
      return isSetSrc();
    case DST:
      return isSetDst();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Edge)
      return this.equals((Edge)that);
    return false;
  }

  public boolean equals(Edge that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!TBaseHelper.equalsSlow(this.type, that.type))
        return false;
    }

    boolean this_present_ranking = true;
    boolean that_present_ranking = true;
    if (this_present_ranking || that_present_ranking) {
      if (!(this_present_ranking && that_present_ranking))
        return false;
      if (!TBaseHelper.equalsNobinary(this.ranking, that.ranking))
        return false;
    }

    boolean this_present_src = true && this.isSetSrc();
    boolean that_present_src = true && that.isSetSrc();
    if (this_present_src || that_present_src) {
      if (!(this_present_src && that_present_src))
        return false;
      if (!TBaseHelper.equalsNobinary(this.src, that.src))
        return false;
    }

    boolean this_present_dst = true && this.isSetDst();
    boolean that_present_dst = true && that.isSetDst();
    if (this_present_dst || that_present_dst) {
      if (!(this_present_dst && that_present_dst))
        return false;
      if (!TBaseHelper.equalsNobinary(this.dst, that.dst))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_type = true && (isSetType());
    builder.append(present_type);
    if (present_type)
      builder.append(type);

    boolean present_ranking = true;
    builder.append(present_ranking);
    if (present_ranking)
      builder.append(ranking);

    boolean present_src = true && (isSetSrc());
    builder.append(present_src);
    if (present_src)
      builder.append(src);

    boolean present_dst = true && (isSetDst());
    builder.append(present_dst);
    if (present_dst)
      builder.append(dst);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(Edge other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(type, other.type);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetRanking()).compareTo(other.isSetRanking());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(ranking, other.ranking);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSrc()).compareTo(other.isSetSrc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(src, other.src);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDst()).compareTo(other.isSetDst());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(dst, other.dst);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case TYPE:
          if (field.type == TType.STRING) {
            this.type = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RANKING:
          if (field.type == TType.I64) {
            this.ranking = iprot.readI64();
            setRankingIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SRC:
          if (field.type == TType.I64) {
            this.src = iprot.readI64();
            setSrcIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DST:
          if (field.type == TType.I64) {
            this.dst = iprot.readI64();
            setDstIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeBinary(this.type);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(RANKING_FIELD_DESC);
    oprot.writeI64(this.ranking);
    oprot.writeFieldEnd();
    if (isSetSrc()) {
      oprot.writeFieldBegin(SRC_FIELD_DESC);
      oprot.writeI64(this.src);
      oprot.writeFieldEnd();
    }
    if (isSetDst()) {
      oprot.writeFieldBegin(DST_FIELD_DESC);
      oprot.writeI64(this.dst);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("Edge");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("type");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getType() == null) {
      sb.append("null");
    } else {
        int __type_size = Math.min(this. getType().length, 128);
        for (int i = 0; i < __type_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this. getType()[i]).length() > 1 ? Integer.toHexString(this. getType()[i]).substring(Integer.toHexString(this. getType()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getType()[i]).toUpperCase());
        }
        if (this. getType().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("ranking");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getRanking(), indent + 1, prettyPrint));
    first = false;
    if (isSetSrc())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("src");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getSrc(), indent + 1, prettyPrint));
      first = false;
    }
    if (isSetDst())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("dst");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getDst(), indent + 1, prettyPrint));
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}


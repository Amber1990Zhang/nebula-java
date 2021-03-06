/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.storage;

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
public class QueryResponse implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("QueryResponse");
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField VERTEX_SCHEMA_FIELD_DESC = new TField("vertex_schema", TType.MAP, (short)2);
  private static final TField EDGE_SCHEMA_FIELD_DESC = new TField("edge_schema", TType.MAP, (short)3);
  private static final TField VERTICES_FIELD_DESC = new TField("vertices", TType.LIST, (short)4);
  private static final TField TOTAL_EDGES_FIELD_DESC = new TField("total_edges", TType.I32, (short)5);

  public ResponseCommon result;
  public Map<Integer,com.vesoft.nebula.Schema> vertex_schema;
  public Map<Integer,com.vesoft.nebula.Schema> edge_schema;
  public List<VertexData> vertices;
  public int total_edges;
  public static final int RESULT = 1;
  public static final int VERTEX_SCHEMA = 2;
  public static final int EDGE_SCHEMA = 3;
  public static final int VERTICES = 4;
  public static final int TOTAL_EDGES = 5;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __TOTAL_EDGES_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(RESULT, new FieldMetaData("result", TFieldRequirementType.REQUIRED, 
        new StructMetaData(TType.STRUCT, ResponseCommon.class)));
    tmpMetaDataMap.put(VERTEX_SCHEMA, new FieldMetaData("vertex_schema", TFieldRequirementType.OPTIONAL, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.Schema.class))));
    tmpMetaDataMap.put(EDGE_SCHEMA, new FieldMetaData("edge_schema", TFieldRequirementType.OPTIONAL, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I32), 
            new StructMetaData(TType.STRUCT, com.vesoft.nebula.Schema.class))));
    tmpMetaDataMap.put(VERTICES, new FieldMetaData("vertices", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, VertexData.class))));
    tmpMetaDataMap.put(TOTAL_EDGES, new FieldMetaData("total_edges", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(QueryResponse.class, metaDataMap);
  }

  public QueryResponse() {
  }

  public QueryResponse(
    ResponseCommon result)
  {
    this();
    this.result = result;
  }

  public QueryResponse(
    ResponseCommon result,
    Map<Integer,com.vesoft.nebula.Schema> vertex_schema,
    Map<Integer,com.vesoft.nebula.Schema> edge_schema,
    List<VertexData> vertices,
    int total_edges)
  {
    this();
    this.result = result;
    this.vertex_schema = vertex_schema;
    this.edge_schema = edge_schema;
    this.vertices = vertices;
    this.total_edges = total_edges;
    setTotal_edgesIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryResponse(QueryResponse other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetResult()) {
      this.result = TBaseHelper.deepCopy(other.result);
    }
    if (other.isSetVertex_schema()) {
      this.vertex_schema = TBaseHelper.deepCopy(other.vertex_schema);
    }
    if (other.isSetEdge_schema()) {
      this.edge_schema = TBaseHelper.deepCopy(other.edge_schema);
    }
    if (other.isSetVertices()) {
      this.vertices = TBaseHelper.deepCopy(other.vertices);
    }
    this.total_edges = TBaseHelper.deepCopy(other.total_edges);
  }

  public QueryResponse deepCopy() {
    return new QueryResponse(this);
  }

  @Deprecated
  public QueryResponse clone() {
    return new QueryResponse(this);
  }

  public ResponseCommon  getResult() {
    return this.result;
  }

  public QueryResponse setResult(ResponseCommon result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  // Returns true if field result is set (has been assigned a value) and false otherwise
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public Map<Integer,com.vesoft.nebula.Schema>  getVertex_schema() {
    return this.vertex_schema;
  }

  public QueryResponse setVertex_schema(Map<Integer,com.vesoft.nebula.Schema> vertex_schema) {
    this.vertex_schema = vertex_schema;
    return this;
  }

  public void unsetVertex_schema() {
    this.vertex_schema = null;
  }

  // Returns true if field vertex_schema is set (has been assigned a value) and false otherwise
  public boolean isSetVertex_schema() {
    return this.vertex_schema != null;
  }

  public void setVertex_schemaIsSet(boolean value) {
    if (!value) {
      this.vertex_schema = null;
    }
  }

  public Map<Integer,com.vesoft.nebula.Schema>  getEdge_schema() {
    return this.edge_schema;
  }

  public QueryResponse setEdge_schema(Map<Integer,com.vesoft.nebula.Schema> edge_schema) {
    this.edge_schema = edge_schema;
    return this;
  }

  public void unsetEdge_schema() {
    this.edge_schema = null;
  }

  // Returns true if field edge_schema is set (has been assigned a value) and false otherwise
  public boolean isSetEdge_schema() {
    return this.edge_schema != null;
  }

  public void setEdge_schemaIsSet(boolean value) {
    if (!value) {
      this.edge_schema = null;
    }
  }

  public List<VertexData>  getVertices() {
    return this.vertices;
  }

  public QueryResponse setVertices(List<VertexData> vertices) {
    this.vertices = vertices;
    return this;
  }

  public void unsetVertices() {
    this.vertices = null;
  }

  // Returns true if field vertices is set (has been assigned a value) and false otherwise
  public boolean isSetVertices() {
    return this.vertices != null;
  }

  public void setVerticesIsSet(boolean value) {
    if (!value) {
      this.vertices = null;
    }
  }

  public int  getTotal_edges() {
    return this.total_edges;
  }

  public QueryResponse setTotal_edges(int total_edges) {
    this.total_edges = total_edges;
    setTotal_edgesIsSet(true);
    return this;
  }

  public void unsetTotal_edges() {
    __isset_bit_vector.clear(__TOTAL_EDGES_ISSET_ID);
  }

  // Returns true if field total_edges is set (has been assigned a value) and false otherwise
  public boolean isSetTotal_edges() {
    return __isset_bit_vector.get(__TOTAL_EDGES_ISSET_ID);
  }

  public void setTotal_edgesIsSet(boolean value) {
    __isset_bit_vector.set(__TOTAL_EDGES_ISSET_ID, value);
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((ResponseCommon)value);
      }
      break;

    case VERTEX_SCHEMA:
      if (value == null) {
        unsetVertex_schema();
      } else {
        setVertex_schema((Map<Integer,com.vesoft.nebula.Schema>)value);
      }
      break;

    case EDGE_SCHEMA:
      if (value == null) {
        unsetEdge_schema();
      } else {
        setEdge_schema((Map<Integer,com.vesoft.nebula.Schema>)value);
      }
      break;

    case VERTICES:
      if (value == null) {
        unsetVertices();
      } else {
        setVertices((List<VertexData>)value);
      }
      break;

    case TOTAL_EDGES:
      if (value == null) {
        unsetTotal_edges();
      } else {
        setTotal_edges((Integer)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return getResult();

    case VERTEX_SCHEMA:
      return getVertex_schema();

    case EDGE_SCHEMA:
      return getEdge_schema();

    case VERTICES:
      return getVertices();

    case TOTAL_EDGES:
      return new Integer(getTotal_edges());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return isSetResult();
    case VERTEX_SCHEMA:
      return isSetVertex_schema();
    case EDGE_SCHEMA:
      return isSetEdge_schema();
    case VERTICES:
      return isSetVertices();
    case TOTAL_EDGES:
      return isSetTotal_edges();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryResponse)
      return this.equals((QueryResponse)that);
    return false;
  }

  public boolean equals(QueryResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!TBaseHelper.equalsNobinary(this.result, that.result))
        return false;
    }

    boolean this_present_vertex_schema = true && this.isSetVertex_schema();
    boolean that_present_vertex_schema = true && that.isSetVertex_schema();
    if (this_present_vertex_schema || that_present_vertex_schema) {
      if (!(this_present_vertex_schema && that_present_vertex_schema))
        return false;
      if (!TBaseHelper.equalsNobinary(this.vertex_schema, that.vertex_schema))
        return false;
    }

    boolean this_present_edge_schema = true && this.isSetEdge_schema();
    boolean that_present_edge_schema = true && that.isSetEdge_schema();
    if (this_present_edge_schema || that_present_edge_schema) {
      if (!(this_present_edge_schema && that_present_edge_schema))
        return false;
      if (!TBaseHelper.equalsNobinary(this.edge_schema, that.edge_schema))
        return false;
    }

    boolean this_present_vertices = true && this.isSetVertices();
    boolean that_present_vertices = true && that.isSetVertices();
    if (this_present_vertices || that_present_vertices) {
      if (!(this_present_vertices && that_present_vertices))
        return false;
      if (!TBaseHelper.equalsNobinary(this.vertices, that.vertices))
        return false;
    }

    boolean this_present_total_edges = true && this.isSetTotal_edges();
    boolean that_present_total_edges = true && that.isSetTotal_edges();
    if (this_present_total_edges || that_present_total_edges) {
      if (!(this_present_total_edges && that_present_total_edges))
        return false;
      if (!TBaseHelper.equalsNobinary(this.total_edges, that.total_edges))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_result = true && (isSetResult());
    builder.append(present_result);
    if (present_result)
      builder.append(result);

    boolean present_vertex_schema = true && (isSetVertex_schema());
    builder.append(present_vertex_schema);
    if (present_vertex_schema)
      builder.append(vertex_schema);

    boolean present_edge_schema = true && (isSetEdge_schema());
    builder.append(present_edge_schema);
    if (present_edge_schema)
      builder.append(edge_schema);

    boolean present_vertices = true && (isSetVertices());
    builder.append(present_vertices);
    if (present_vertices)
      builder.append(vertices);

    boolean present_total_edges = true && (isSetTotal_edges());
    builder.append(present_total_edges);
    if (present_total_edges)
      builder.append(total_edges);

    return builder.toHashCode();
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
        case RESULT:
          if (field.type == TType.STRUCT) {
            this.result = new ResponseCommon();
            this.result.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VERTEX_SCHEMA:
          if (field.type == TType.MAP) {
            {
              TMap _map16 = iprot.readMapBegin();
              this.vertex_schema = new HashMap<Integer,com.vesoft.nebula.Schema>(Math.max(0, 2*_map16.size));
              for (int _i17 = 0; 
                   (_map16.size < 0) ? iprot.peekMap() : (_i17 < _map16.size); 
                   ++_i17)
              {
                int _key18;
                com.vesoft.nebula.Schema _val19;
                _key18 = iprot.readI32();
                _val19 = new com.vesoft.nebula.Schema();
                _val19.read(iprot);
                this.vertex_schema.put(_key18, _val19);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EDGE_SCHEMA:
          if (field.type == TType.MAP) {
            {
              TMap _map20 = iprot.readMapBegin();
              this.edge_schema = new HashMap<Integer,com.vesoft.nebula.Schema>(Math.max(0, 2*_map20.size));
              for (int _i21 = 0; 
                   (_map20.size < 0) ? iprot.peekMap() : (_i21 < _map20.size); 
                   ++_i21)
              {
                int _key22;
                com.vesoft.nebula.Schema _val23;
                _key22 = iprot.readI32();
                _val23 = new com.vesoft.nebula.Schema();
                _val23.read(iprot);
                this.edge_schema.put(_key22, _val23);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VERTICES:
          if (field.type == TType.LIST) {
            {
              TList _list24 = iprot.readListBegin();
              this.vertices = new ArrayList<VertexData>(Math.max(0, _list24.size));
              for (int _i25 = 0; 
                   (_list24.size < 0) ? iprot.peekList() : (_i25 < _list24.size); 
                   ++_i25)
              {
                VertexData _elem26;
                _elem26 = new VertexData();
                _elem26.read(iprot);
                this.vertices.add(_elem26);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TOTAL_EDGES:
          if (field.type == TType.I32) {
            this.total_edges = iprot.readI32();
            setTotal_edgesIsSet(true);
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
    if (this.result != null) {
      oprot.writeFieldBegin(RESULT_FIELD_DESC);
      this.result.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.vertex_schema != null) {
      if (isSetVertex_schema()) {
        oprot.writeFieldBegin(VERTEX_SCHEMA_FIELD_DESC);
        {
          oprot.writeMapBegin(new TMap(TType.I32, TType.STRUCT, this.vertex_schema.size()));
          for (Map.Entry<Integer, com.vesoft.nebula.Schema> _iter27 : this.vertex_schema.entrySet())          {
            oprot.writeI32(_iter27.getKey());
            _iter27.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.edge_schema != null) {
      if (isSetEdge_schema()) {
        oprot.writeFieldBegin(EDGE_SCHEMA_FIELD_DESC);
        {
          oprot.writeMapBegin(new TMap(TType.I32, TType.STRUCT, this.edge_schema.size()));
          for (Map.Entry<Integer, com.vesoft.nebula.Schema> _iter28 : this.edge_schema.entrySet())          {
            oprot.writeI32(_iter28.getKey());
            _iter28.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.vertices != null) {
      if (isSetVertices()) {
        oprot.writeFieldBegin(VERTICES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.vertices.size()));
          for (VertexData _iter29 : this.vertices)          {
            _iter29.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (isSetTotal_edges()) {
      oprot.writeFieldBegin(TOTAL_EDGES_FIELD_DESC);
      oprot.writeI32(this.total_edges);
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
    StringBuilder sb = new StringBuilder("QueryResponse");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("result");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getResult() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getResult(), indent + 1, prettyPrint));
    }
    first = false;
    if (isSetVertex_schema())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("vertex_schema");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getVertex_schema() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getVertex_schema(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetEdge_schema())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("edge_schema");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getEdge_schema() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getEdge_schema(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetVertices())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("vertices");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getVertices() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getVertices(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetTotal_edges())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("total_edges");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getTotal_edges(), indent + 1, prettyPrint));
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (result == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'result' was not present! Struct: " + toString());
    }
    // check that fields of type enum have valid values
  }

}


/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.ifree.serrpc.builder;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Members extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8551184019695450683L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Members\",\"namespace\":\"com.ifree.serrpc.builder\",\"fields\":[{\"name\":\"userName\",\"type\":\"string\"},{\"name\":\"userPwd\",\"type\":\"string\"},{\"name\":\"realName\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence userName;
  @Deprecated public java.lang.CharSequence userPwd;
  @Deprecated public java.lang.CharSequence realName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Members() {}

  /**
   * All-args constructor.
   */
  public Members(java.lang.CharSequence userName, java.lang.CharSequence userPwd, java.lang.CharSequence realName) {
    this.userName = userName;
    this.userPwd = userPwd;
    this.realName = realName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userName;
    case 1: return userPwd;
    case 2: return realName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userName = (java.lang.CharSequence)value$; break;
    case 1: userPwd = (java.lang.CharSequence)value$; break;
    case 2: realName = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'userName' field.
   */
  public java.lang.CharSequence getUserName() {
    return userName;
  }

  /**
   * Sets the value of the 'userName' field.
   * @param value the value to set.
   */
  public void setUserName(java.lang.CharSequence value) {
    this.userName = value;
  }

  /**
   * Gets the value of the 'userPwd' field.
   */
  public java.lang.CharSequence getUserPwd() {
    return userPwd;
  }

  /**
   * Sets the value of the 'userPwd' field.
   * @param value the value to set.
   */
  public void setUserPwd(java.lang.CharSequence value) {
    this.userPwd = value;
  }

  /**
   * Gets the value of the 'realName' field.
   */
  public java.lang.CharSequence getRealName() {
    return realName;
  }

  /**
   * Sets the value of the 'realName' field.
   * @param value the value to set.
   */
  public void setRealName(java.lang.CharSequence value) {
    this.realName = value;
  }

  /**
   * Creates a new Members RecordBuilder.
   * @return A new Members RecordBuilder
   */
  public static com.ifree.serrpc.builder.Members.Builder newBuilder() {
    return new com.ifree.serrpc.builder.Members.Builder();
  }
  
  /**
   * Creates a new Members RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Members RecordBuilder
   */
  public static com.ifree.serrpc.builder.Members.Builder newBuilder(com.ifree.serrpc.builder.Members.Builder other) {
    return new com.ifree.serrpc.builder.Members.Builder(other);
  }
  
  /**
   * Creates a new Members RecordBuilder by copying an existing Members instance.
   * @param other The existing instance to copy.
   * @return A new Members RecordBuilder
   */
  public static com.ifree.serrpc.builder.Members.Builder newBuilder(com.ifree.serrpc.builder.Members other) {
    return new com.ifree.serrpc.builder.Members.Builder(other);
  }
  
  /**
   * RecordBuilder for Members instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Members>
    implements org.apache.avro.data.RecordBuilder<Members> {

    private java.lang.CharSequence userName;
    private java.lang.CharSequence userPwd;
    private java.lang.CharSequence realName;

    /** Creates a new Builder */
    private Builder() {
      super(com.ifree.serrpc.builder.Members.SCHEMA$);
    }
    
    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.ifree.serrpc.builder.Members.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userName)) {
        this.userName = data().deepCopy(fields()[0].schema(), other.userName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userPwd)) {
        this.userPwd = data().deepCopy(fields()[1].schema(), other.userPwd);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.realName)) {
        this.realName = data().deepCopy(fields()[2].schema(), other.realName);
        fieldSetFlags()[2] = true;
      }
    }
    
    /**
     * Creates a Builder by copying an existing Members instance
     * @param other The existing instance to copy.
     */
    private Builder(com.ifree.serrpc.builder.Members other) {
            super(com.ifree.serrpc.builder.Members.SCHEMA$);
      if (isValidValue(fields()[0], other.userName)) {
        this.userName = data().deepCopy(fields()[0].schema(), other.userName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userPwd)) {
        this.userPwd = data().deepCopy(fields()[1].schema(), other.userPwd);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.realName)) {
        this.realName = data().deepCopy(fields()[2].schema(), other.realName);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'userName' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserName() {
      return userName;
    }

    /**
      * Sets the value of the 'userName' field.
      * @param value The value of 'userName'.
      * @return This builder.
      */
    public com.ifree.serrpc.builder.Members.Builder setUserName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.userName = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'userName' field has been set.
      * @return True if the 'userName' field has been set, false otherwise.
      */
    public boolean hasUserName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userName' field.
      * @return This builder.
      */
    public com.ifree.serrpc.builder.Members.Builder clearUserName() {
      userName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userPwd' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserPwd() {
      return userPwd;
    }

    /**
      * Sets the value of the 'userPwd' field.
      * @param value The value of 'userPwd'.
      * @return This builder.
      */
    public com.ifree.serrpc.builder.Members.Builder setUserPwd(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.userPwd = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'userPwd' field has been set.
      * @return True if the 'userPwd' field has been set, false otherwise.
      */
    public boolean hasUserPwd() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userPwd' field.
      * @return This builder.
      */
    public com.ifree.serrpc.builder.Members.Builder clearUserPwd() {
      userPwd = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'realName' field.
      * @return The value.
      */
    public java.lang.CharSequence getRealName() {
      return realName;
    }

    /**
      * Sets the value of the 'realName' field.
      * @param value The value of 'realName'.
      * @return This builder.
      */
    public com.ifree.serrpc.builder.Members.Builder setRealName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.realName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'realName' field has been set.
      * @return True if the 'realName' field has been set, false otherwise.
      */
    public boolean hasRealName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'realName' field.
      * @return This builder.
      */
    public com.ifree.serrpc.builder.Members.Builder clearRealName() {
      realName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public Members build() {
      try {
        Members record = new Members();
        record.userName = fieldSetFlags()[0] ? this.userName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.userPwd = fieldSetFlags()[1] ? this.userPwd : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.realName = fieldSetFlags()[2] ? this.realName : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);  

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, org.apache.avro.specific.SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);  

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, org.apache.avro.specific.SpecificData.getDecoder(in));
  }

}

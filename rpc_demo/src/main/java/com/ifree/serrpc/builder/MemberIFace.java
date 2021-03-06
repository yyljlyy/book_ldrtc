/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.ifree.serrpc.builder;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface MemberIFace {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"MemberIFace\",\"namespace\":\"com.ifree.serrpc.builder\",\"types\":[{\"type\":\"record\",\"name\":\"Members\",\"fields\":[{\"name\":\"userName\",\"type\":\"string\"},{\"name\":\"userPwd\",\"type\":\"string\"},{\"name\":\"realName\",\"type\":[\"string\",\"null\"]}]},{\"type\":\"record\",\"name\":\"Retmsg\",\"fields\":[{\"name\":\"msg\",\"type\":\"string\"}]}],\"messages\":{\"login\":{\"doc\":\"member login.\",\"request\":[{\"name\":\"m\",\"type\":\"Members\"}],\"response\":\"Retmsg\"}}}");
  /**
   * member login.
   */
  com.ifree.serrpc.builder.Retmsg login(com.ifree.serrpc.builder.Members m) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends MemberIFace {
    public static final org.apache.avro.Protocol PROTOCOL = com.ifree.serrpc.builder.MemberIFace.PROTOCOL;
    /**
     * member login.
     * @throws java.io.IOException The async call could not be completed.
     */
    void login(com.ifree.serrpc.builder.Members m, org.apache.avro.ipc.Callback<com.ifree.serrpc.builder.Retmsg> callback) throws java.io.IOException;
  }
}
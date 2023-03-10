// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userpointservice/enums/point-type.proto

package com.example.pointservice.stub.enums;

/**
 * Protobuf enum {@code enums.Reason}
 */
public enum Reason
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CREDIT_CARD_PAYMENT = 0;</code>
   */
  CREDIT_CARD_PAYMENT(0),
  /**
   * <code>SELLER_OFFER = 1;</code>
   */
  SELLER_OFFER(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>CREDIT_CARD_PAYMENT = 0;</code>
   */
  public static final int CREDIT_CARD_PAYMENT_VALUE = 0;
  /**
   * <code>SELLER_OFFER = 1;</code>
   */
  public static final int SELLER_OFFER_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Reason valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Reason forNumber(int value) {
    switch (value) {
      case 0: return CREDIT_CARD_PAYMENT;
      case 1: return SELLER_OFFER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Reason>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Reason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Reason>() {
          public Reason findValueByNumber(int number) {
            return Reason.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.example.pointservice.stub.enums.PointType.getDescriptor().getEnumTypes().get(0);
  }

  private static final Reason[] VALUES = values();

  public static Reason valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Reason(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:enums.Reason)
}


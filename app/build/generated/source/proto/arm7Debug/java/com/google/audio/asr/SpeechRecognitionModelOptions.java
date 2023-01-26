// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/audio/asr/speech_recognition_model_options.proto

package com.google.audio.asr;

/**
 * Protobuf type {@code asr.SpeechRecognitionModelOptions}
 */
public  final class SpeechRecognitionModelOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:asr.SpeechRecognitionModelOptions)
    SpeechRecognitionModelOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpeechRecognitionModelOptions.newBuilder() to construct.
  private SpeechRecognitionModelOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpeechRecognitionModelOptions() {
    locale_ = "";
    model_ = 0;
    biasWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SpeechRecognitionModelOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SpeechRecognitionModelOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            locale_ = bs;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
            com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel value = com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel.valueOf(rawValue);
            if (value == null) {
              unknownFields.mergeVarintField(2, rawValue);
            } else {
              bitField0_ |= 0x00000002;
              model_ = rawValue;
            }
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            if (!((mutable_bitField0_ & 0x00000004) != 0)) {
              biasWords_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            biasWords_.add(bs);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        biasWords_ = biasWords_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.audio.asr.SpeechRecognitionModelOptionsProto.internal_static_asr_SpeechRecognitionModelOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.audio.asr.SpeechRecognitionModelOptionsProto.internal_static_asr_SpeechRecognitionModelOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.audio.asr.SpeechRecognitionModelOptions.class, com.google.audio.asr.SpeechRecognitionModelOptions.Builder.class);
  }

  /**
   * <pre>
   * Select which model to use. Not all models are necessarily available for all
   * recognition systems or locales. It is up to the individual session to warn
   * the user about availability
   * </pre>
   *
   * Protobuf enum {@code asr.SpeechRecognitionModelOptions.SpecificModel}
   */
  public enum SpecificModel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DICTATION_DEFAULT = 0;</code>
     */
    DICTATION_DEFAULT(0),
    /**
     * <code>VIDEO = 1;</code>
     */
    VIDEO(1),
    ;

    /**
     * <code>DICTATION_DEFAULT = 0;</code>
     */
    public static final int DICTATION_DEFAULT_VALUE = 0;
    /**
     * <code>VIDEO = 1;</code>
     */
    public static final int VIDEO_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SpecificModel valueOf(int value) {
      return forNumber(value);
    }

    public static SpecificModel forNumber(int value) {
      switch (value) {
        case 0: return DICTATION_DEFAULT;
        case 1: return VIDEO;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SpecificModel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SpecificModel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SpecificModel>() {
            public SpecificModel findValueByNumber(int number) {
              return SpecificModel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.audio.asr.SpeechRecognitionModelOptions.getDescriptor().getEnumTypes().get(0);
    }

    private static final SpecificModel[] VALUES = values();

    public static SpecificModel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SpecificModel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:asr.SpeechRecognitionModelOptions.SpecificModel)
  }

  private int bitField0_;
  public static final int LOCALE_FIELD_NUMBER = 1;
  private volatile java.lang.Object locale_;
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>optional string locale = 1;</code>
   */
  public boolean hasLocale() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>optional string locale = 1;</code>
   */
  public java.lang.String getLocale() {
    java.lang.Object ref = locale_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        locale_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Required.
   * </pre>
   *
   * <code>optional string locale = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLocaleBytes() {
    java.lang.Object ref = locale_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      locale_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODEL_FIELD_NUMBER = 2;
  private int model_;
  /**
   * <code>optional .asr.SpeechRecognitionModelOptions.SpecificModel model = 2 [default = DICTATION_DEFAULT];</code>
   */
  public boolean hasModel() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .asr.SpeechRecognitionModelOptions.SpecificModel model = 2 [default = DICTATION_DEFAULT];</code>
   */
  public com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel getModel() {
    @SuppressWarnings("deprecation")
    com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel result = com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel.valueOf(model_);
    return result == null ? com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel.DICTATION_DEFAULT : result;
  }

  public static final int BIAS_WORDS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList biasWords_;
  /**
   * <pre>
   * Words to be passed to the speech recognizer as bias. It is up to each
   * implementation to decide whether these will be used or not.
   * </pre>
   *
   * <code>repeated string bias_words = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getBiasWordsList() {
    return biasWords_;
  }
  /**
   * <pre>
   * Words to be passed to the speech recognizer as bias. It is up to each
   * implementation to decide whether these will be used or not.
   * </pre>
   *
   * <code>repeated string bias_words = 3;</code>
   */
  public int getBiasWordsCount() {
    return biasWords_.size();
  }
  /**
   * <pre>
   * Words to be passed to the speech recognizer as bias. It is up to each
   * implementation to decide whether these will be used or not.
   * </pre>
   *
   * <code>repeated string bias_words = 3;</code>
   */
  public java.lang.String getBiasWords(int index) {
    return biasWords_.get(index);
  }
  /**
   * <pre>
   * Words to be passed to the speech recognizer as bias. It is up to each
   * implementation to decide whether these will be used or not.
   * </pre>
   *
   * <code>repeated string bias_words = 3;</code>
   */
  public com.google.protobuf.ByteString
      getBiasWordsBytes(int index) {
    return biasWords_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, locale_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, model_);
    }
    for (int i = 0; i < biasWords_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, biasWords_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, locale_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, model_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < biasWords_.size(); i++) {
        dataSize += computeStringSizeNoTag(biasWords_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getBiasWordsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.audio.asr.SpeechRecognitionModelOptions)) {
      return super.equals(obj);
    }
    com.google.audio.asr.SpeechRecognitionModelOptions other = (com.google.audio.asr.SpeechRecognitionModelOptions) obj;

    if (hasLocale() != other.hasLocale()) return false;
    if (hasLocale()) {
      if (!getLocale()
          .equals(other.getLocale())) return false;
    }
    if (hasModel() != other.hasModel()) return false;
    if (hasModel()) {
      if (model_ != other.model_) return false;
    }
    if (!getBiasWordsList()
        .equals(other.getBiasWordsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasLocale()) {
      hash = (37 * hash) + LOCALE_FIELD_NUMBER;
      hash = (53 * hash) + getLocale().hashCode();
    }
    if (hasModel()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + model_;
    }
    if (getBiasWordsCount() > 0) {
      hash = (37 * hash) + BIAS_WORDS_FIELD_NUMBER;
      hash = (53 * hash) + getBiasWordsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.audio.asr.SpeechRecognitionModelOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.audio.asr.SpeechRecognitionModelOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.audio.asr.SpeechRecognitionModelOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code asr.SpeechRecognitionModelOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:asr.SpeechRecognitionModelOptions)
      com.google.audio.asr.SpeechRecognitionModelOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.audio.asr.SpeechRecognitionModelOptionsProto.internal_static_asr_SpeechRecognitionModelOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.audio.asr.SpeechRecognitionModelOptionsProto.internal_static_asr_SpeechRecognitionModelOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.audio.asr.SpeechRecognitionModelOptions.class, com.google.audio.asr.SpeechRecognitionModelOptions.Builder.class);
    }

    // Construct using com.google.audio.asr.SpeechRecognitionModelOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      locale_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      model_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      biasWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.audio.asr.SpeechRecognitionModelOptionsProto.internal_static_asr_SpeechRecognitionModelOptions_descriptor;
    }

    @java.lang.Override
    public com.google.audio.asr.SpeechRecognitionModelOptions getDefaultInstanceForType() {
      return com.google.audio.asr.SpeechRecognitionModelOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.audio.asr.SpeechRecognitionModelOptions build() {
      com.google.audio.asr.SpeechRecognitionModelOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.audio.asr.SpeechRecognitionModelOptions buildPartial() {
      com.google.audio.asr.SpeechRecognitionModelOptions result = new com.google.audio.asr.SpeechRecognitionModelOptions(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.locale_ = locale_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.model_ = model_;
      if (((bitField0_ & 0x00000004) != 0)) {
        biasWords_ = biasWords_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.biasWords_ = biasWords_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.audio.asr.SpeechRecognitionModelOptions) {
        return mergeFrom((com.google.audio.asr.SpeechRecognitionModelOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.audio.asr.SpeechRecognitionModelOptions other) {
      if (other == com.google.audio.asr.SpeechRecognitionModelOptions.getDefaultInstance()) return this;
      if (other.hasLocale()) {
        bitField0_ |= 0x00000001;
        locale_ = other.locale_;
        onChanged();
      }
      if (other.hasModel()) {
        setModel(other.getModel());
      }
      if (!other.biasWords_.isEmpty()) {
        if (biasWords_.isEmpty()) {
          biasWords_ = other.biasWords_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureBiasWordsIsMutable();
          biasWords_.addAll(other.biasWords_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.audio.asr.SpeechRecognitionModelOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.audio.asr.SpeechRecognitionModelOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object locale_ = "";
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string locale = 1;</code>
     */
    public boolean hasLocale() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string locale = 1;</code>
     */
    public java.lang.String getLocale() {
      java.lang.Object ref = locale_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          locale_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string locale = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLocaleBytes() {
      java.lang.Object ref = locale_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        locale_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string locale = 1;</code>
     */
    public Builder setLocale(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      locale_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string locale = 1;</code>
     */
    public Builder clearLocale() {
      bitField0_ = (bitField0_ & ~0x00000001);
      locale_ = getDefaultInstance().getLocale();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * </pre>
     *
     * <code>optional string locale = 1;</code>
     */
    public Builder setLocaleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      locale_ = value;
      onChanged();
      return this;
    }

    private int model_ = 0;
    /**
     * <code>optional .asr.SpeechRecognitionModelOptions.SpecificModel model = 2 [default = DICTATION_DEFAULT];</code>
     */
    public boolean hasModel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .asr.SpeechRecognitionModelOptions.SpecificModel model = 2 [default = DICTATION_DEFAULT];</code>
     */
    public com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel getModel() {
      @SuppressWarnings("deprecation")
      com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel result = com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel.valueOf(model_);
      return result == null ? com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel.DICTATION_DEFAULT : result;
    }
    /**
     * <code>optional .asr.SpeechRecognitionModelOptions.SpecificModel model = 2 [default = DICTATION_DEFAULT];</code>
     */
    public Builder setModel(com.google.audio.asr.SpeechRecognitionModelOptions.SpecificModel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      model_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .asr.SpeechRecognitionModelOptions.SpecificModel model = 2 [default = DICTATION_DEFAULT];</code>
     */
    public Builder clearModel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      model_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList biasWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureBiasWordsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        biasWords_ = new com.google.protobuf.LazyStringArrayList(biasWords_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Words to be passed to the speech recognizer as bias. It is up to each
     * implementation to decide whether these will be used or not.
     * </pre>
     *
     * <code>repeated string bias_words = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getBiasWordsList() {
      return biasWords_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Words to be passed to the speech recognizer as bias. It is up to each
     * implementation to decide whether these will be used or not.
     * </pre>
     *
     * <code>repeated string bias_words = 3;</code>
     */
    public int getBiasWordsCount() {
      return biasWords_.size();
    }
    /**
     * <pre>
     * Words to be passed to the speech recognizer as bias. It is up to each
     * implementation to decide whether these will be used or not.
     * </pre>
     *
     * <code>repeated string bias_words = 3;</code>
     */
    public java.lang.String getBiasWords(int index) {
      return biasWords_.get(index);
    }
    /**
     * <pre>
     * Words to be passed to the speech recognizer as bias. It is up to each
     * implementation to decide whether these will be used or not.
     * </pre>
     *
     * <code>repeated string bias_words = 3;</code>
     */
    public com.google.protobuf.ByteString
        getBiasWordsBytes(int index) {
      return biasWords_.getByteString(index);
    }
    /**
     * <pre>
     * Words to be passed to the speech recognizer as bias. It is up to each
     * implementation to decide whether these will be used or not.
     * </pre>
     *
     * <code>repeated string bias_words = 3;</code>
     */
    public Builder setBiasWords(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBiasWordsIsMutable();
      biasWords_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Words to be passed to the speech recognizer as bias. It is up to each
     * implementation to decide whether these will be used or not.
     * </pre>
     *
     * <code>repeated string bias_words = 3;</code>
     */
    public Builder addBiasWords(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBiasWordsIsMutable();
      biasWords_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Words to be passed to the speech recognizer as bias. It is up to each
     * implementation to decide whether these will be used or not.
     * </pre>
     *
     * <code>repeated string bias_words = 3;</code>
     */
    public Builder addAllBiasWords(
        java.lang.Iterable<java.lang.String> values) {
      ensureBiasWordsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, biasWords_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Words to be passed to the speech recognizer as bias. It is up to each
     * implementation to decide whether these will be used or not.
     * </pre>
     *
     * <code>repeated string bias_words = 3;</code>
     */
    public Builder clearBiasWords() {
      biasWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Words to be passed to the speech recognizer as bias. It is up to each
     * implementation to decide whether these will be used or not.
     * </pre>
     *
     * <code>repeated string bias_words = 3;</code>
     */
    public Builder addBiasWordsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureBiasWordsIsMutable();
      biasWords_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:asr.SpeechRecognitionModelOptions)
  }

  // @@protoc_insertion_point(class_scope:asr.SpeechRecognitionModelOptions)
  private static final com.google.audio.asr.SpeechRecognitionModelOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.audio.asr.SpeechRecognitionModelOptions();
  }

  public static com.google.audio.asr.SpeechRecognitionModelOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<SpeechRecognitionModelOptions>
      PARSER = new com.google.protobuf.AbstractParser<SpeechRecognitionModelOptions>() {
    @java.lang.Override
    public SpeechRecognitionModelOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SpeechRecognitionModelOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpeechRecognitionModelOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpeechRecognitionModelOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.audio.asr.SpeechRecognitionModelOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

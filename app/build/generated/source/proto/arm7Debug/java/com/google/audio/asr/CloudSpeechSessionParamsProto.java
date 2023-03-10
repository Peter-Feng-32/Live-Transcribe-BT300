// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/audio/asr/cloud_speech_session_params.proto

package com.google.audio.asr;

public final class CloudSpeechSessionParamsProto {
  private CloudSpeechSessionParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asr_CloudSpeechSessionParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asr_CloudSpeechSessionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asr_CloudSpeechSessionParams_EncoderParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asr_CloudSpeechSessionParams_EncoderParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6com/google/audio/asr/cloud_speech_sess" +
      "ion_params.proto\022\003asr\032>com/google/audio/" +
      "asr/cloud_speech_stream_observer_params." +
      "proto\032(com/google/audio/codec_and_bitrat" +
      "e.proto\"\302\002\n\030CloudSpeechSessionParams\022=\n\017" +
      "observer_params\030\001 \001(\0132$.asr.CloudSpeechS" +
      "treamObserverParams\022\030\n\020filter_profanity\030" +
      "\002 \001(\010\022C\n\016encoder_params\030\003 \001(\0132+.asr.Clou" +
      "dSpeechSessionParams.EncoderParams\032\207\001\n\rE" +
      "ncoderParams\022\035\n\016enable_encoder\030\001 \001(\010:\005fa" +
      "lse\022>\n\005codec\030\002 \001(\0162\026.audio.CodecAndBitra" +
      "te:\027OGG_OPUS_BITRATE_32KBPS\022\027\n\tallow_vbr" +
      "\030\003 \001(\010:\004trueB7\n\024com.google.audio.asrB\035Cl" +
      "oudSpeechSessionParamsProtoP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.audio.asr.CloudSpeechSessionObserverParamsProto.getDescriptor(),
          com.google.audio.CodecAndBitrateOuterClass.getDescriptor(),
        });
    internal_static_asr_CloudSpeechSessionParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_asr_CloudSpeechSessionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asr_CloudSpeechSessionParams_descriptor,
        new java.lang.String[] { "ObserverParams", "FilterProfanity", "EncoderParams", });
    internal_static_asr_CloudSpeechSessionParams_EncoderParams_descriptor =
      internal_static_asr_CloudSpeechSessionParams_descriptor.getNestedTypes().get(0);
    internal_static_asr_CloudSpeechSessionParams_EncoderParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asr_CloudSpeechSessionParams_EncoderParams_descriptor,
        new java.lang.String[] { "EnableEncoder", "Codec", "AllowVbr", });
    com.google.audio.asr.CloudSpeechSessionObserverParamsProto.getDescriptor();
    com.google.audio.CodecAndBitrateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

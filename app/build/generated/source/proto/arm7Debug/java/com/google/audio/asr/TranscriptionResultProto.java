// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/audio/asr/transcription_result.proto

package com.google.audio.asr;

public final class TranscriptionResultProto {
  private TranscriptionResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asr_TranscriptionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asr_TranscriptionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asr_TranscriptionResult_Word_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asr_TranscriptionResult_Word_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/com/google/audio/asr/transcription_res" +
      "ult.proto\022\003asr\032&com/google/audio/speaker" +
      "_id_info.proto\032\037google/protobuf/timestam" +
      "p.proto\"\333\003\n\023TranscriptionResult\022\014\n\004text\030" +
      "\001 \001(\t\022\022\n\nconfidence\030\002 \001(\002\0223\n\017start_times" +
      "tamp\030\007 \001(\0132\032.google.protobuf.Timestamp\0221" +
      "\n\rend_timestamp\030\003 \001(\0132\032.google.protobuf." +
      "Timestamp\022*\n\014speaker_info\030\005 \001(\0132\024.audio." +
      "SpeakerIdInfo\0228\n\021word_level_detail\030\004 \003(\013" +
      "2\035.asr.TranscriptionResult.Word\022\025\n\rlangu" +
      "age_code\030\006 \001(\t\032\274\001\n\004Word\022\014\n\004text\030\001 \001(\t\022\022\n" +
      "\nconfidence\030\002 \001(\002\022*\n\014speaker_info\030\003 \001(\0132" +
      "\024.audio.SpeakerIdInfo\0223\n\017start_timestamp" +
      "\030\004 \001(\0132\032.google.protobuf.Timestamp\0221\n\ren" +
      "d_timestamp\030\005 \001(\0132\032.google.protobuf.Time" +
      "stampB2\n\024com.google.audio.asrB\030Transcrip" +
      "tionResultProtoP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.audio.SpeakerIdInfoOuterClass.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_asr_TranscriptionResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_asr_TranscriptionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asr_TranscriptionResult_descriptor,
        new java.lang.String[] { "Text", "Confidence", "StartTimestamp", "EndTimestamp", "SpeakerInfo", "WordLevelDetail", "LanguageCode", });
    internal_static_asr_TranscriptionResult_Word_descriptor =
      internal_static_asr_TranscriptionResult_descriptor.getNestedTypes().get(0);
    internal_static_asr_TranscriptionResult_Word_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asr_TranscriptionResult_Word_descriptor,
        new java.lang.String[] { "Text", "Confidence", "SpeakerInfo", "StartTimestamp", "EndTimestamp", });
    com.google.audio.SpeakerIdInfoOuterClass.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/audio/asr/transcription_result_formatter_options.proto

package com.google.audio.asr;

public final class TranscriptionResultFormatterOptionsProto {
  private TranscriptionResultFormatterOptionsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_asr_TranscriptionResultFormatterOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_asr_TranscriptionResultFormatterOptions_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAcom/google/audio/asr/transcription_res" +
      "ult_formatter_options.proto\022\003asr\032\036google" +
      "/protobuf/duration.proto\"\262\007\n#Transcripti" +
      "onResultFormatterOptions\022L\n)extended_sil" +
      "ence_duration_for_line_breaks\030\001 \001(\0132\031.go" +
      "ogle.protobuf.Duration\022+\n num_extended_s" +
      "ilence_line_breaks\030\002 \001(\005:\0010\022*\n\037num_langu" +
      "age_switch_line_breaks\030\003 \001(\005:\0011\022+\n\034itali" +
      "cize_current_hypothesis\030\004 \001(\010:\005false\022p\n\031" +
      "transcript_coloring_style\030\005 \001(\0162@.asr.Tr" +
      "anscriptionResultFormatterOptions.Transc" +
      "riptColoringStyle:\013NO_COLORING\022X\n\rtext_c" +
      "olormap\030\006 \001(\01625.asr.TranscriptionResultF" +
      "ormatterOptions.TextColormap:\nDARK_THEME" +
      "\022x\n\030speaker_indication_style\030\007 \001(\0162?.asr" +
      ".TranscriptionResultFormatterOptions.Spe" +
      "akerIndicationStyle:\025NO_SPEAKER_INDICATI" +
      "ON\"F\n\014TextColormap\022\025\n\021UNSPECIFIED_THEME\020" +
      "\000\022\017\n\013LIGHT_THEME\020\001\022\016\n\nDARK_THEME\020\002\"\260\001\n\027T" +
      "ranscriptColoringStyle\022\036\n\032UNSPECIFIED_CO" +
      "LORING_STYLE\020\000\022\017\n\013NO_COLORING\020\001\022\'\n#COLOR" +
      "_BY_UTTERANCE_LEVEL_CONFIDENCE\020\002\022\"\n\036COLO" +
      "R_BY_WORD_LEVEL_CONFIDENCE\020\003\022\027\n\023COLOR_BY" +
      "_SPEAKER_ID\020\004\"v\n\026SpeakerIndicationStyle\022" +
      "(\n$UNSPECIFIED_SPEAKER_INDICATION_STYLE\020" +
      "\000\022\031\n\025NO_SPEAKER_INDICATION\020\001\022\027\n\023SHOW_SPE" +
      "AKER_NUMBER\020\002BB\n\024com.google.audio.asrB(T" +
      "ranscriptionResultFormatterOptionsProtoP" +
      "\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_asr_TranscriptionResultFormatterOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_asr_TranscriptionResultFormatterOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_asr_TranscriptionResultFormatterOptions_descriptor,
        new java.lang.String[] { "ExtendedSilenceDurationForLineBreaks", "NumExtendedSilenceLineBreaks", "NumLanguageSwitchLineBreaks", "ItalicizeCurrentHypothesis", "TranscriptColoringStyle", "TextColormap", "SpeakerIndicationStyle", });
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/audio/network_state.proto

package com.google.audio;

public final class NetworkStateOuterClass {
  private NetworkStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_audio_NetworkState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_audio_NetworkState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$com/google/audio/network_state.proto\022\005" +
      "audio\":\n\014NetworkState\022\021\n\tconnected\030\001 \001(\010" +
      "\022\027\n\017network_metered\030\002 \001(\010B\024\n\020com.google." +
      "audioP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_audio_NetworkState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_audio_NetworkState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_audio_NetworkState_descriptor,
        new java.lang.String[] { "Connected", "NetworkMetered", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
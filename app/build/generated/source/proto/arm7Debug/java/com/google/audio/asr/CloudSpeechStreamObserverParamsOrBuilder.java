// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/audio/asr/cloud_speech_stream_observer_params.proto

package com.google.audio.asr;

public interface CloudSpeechStreamObserverParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:asr.CloudSpeechStreamObserverParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * When true, hypotheses are held a bit longer until they likely will not
   * change again before being displayed.
   * </pre>
   *
   * <code>optional bool reject_unstable_hypotheses = 1;</code>
   */
  boolean hasRejectUnstableHypotheses();
  /**
   * <pre>
   * When true, hypotheses are held a bit longer until they likely will not
   * change again before being displayed.
   * </pre>
   *
   * <code>optional bool reject_unstable_hypotheses = 1;</code>
   */
  boolean getRejectUnstableHypotheses();
}
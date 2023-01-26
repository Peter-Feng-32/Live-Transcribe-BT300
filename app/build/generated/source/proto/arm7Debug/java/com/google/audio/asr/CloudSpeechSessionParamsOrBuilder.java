// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/audio/asr/cloud_speech_session_params.proto

package com.google.audio.asr;

public interface CloudSpeechSessionParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:asr.CloudSpeechSessionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Parameters for the observer, who converts the speech protos into
   * TranscriptionResult.
   * </pre>
   *
   * <code>optional .asr.CloudSpeechStreamObserverParams observer_params = 1;</code>
   */
  boolean hasObserverParams();
  /**
   * <pre>
   * Parameters for the observer, who converts the speech protos into
   * TranscriptionResult.
   * </pre>
   *
   * <code>optional .asr.CloudSpeechStreamObserverParams observer_params = 1;</code>
   */
  com.google.audio.asr.CloudSpeechStreamObserverParams getObserverParams();
  /**
   * <pre>
   * Parameters for the observer, who converts the speech protos into
   * TranscriptionResult.
   * </pre>
   *
   * <code>optional .asr.CloudSpeechStreamObserverParams observer_params = 1;</code>
   */
  com.google.audio.asr.CloudSpeechStreamObserverParamsOrBuilder getObserverParamsOrBuilder();

  /**
   * <pre>
   * Allows profanity to be filtered by the Cloud Speech API.
   * </pre>
   *
   * <code>optional bool filter_profanity = 2;</code>
   */
  boolean hasFilterProfanity();
  /**
   * <pre>
   * Allows profanity to be filtered by the Cloud Speech API.
   * </pre>
   *
   * <code>optional bool filter_profanity = 2;</code>
   */
  boolean getFilterProfanity();

  /**
   * <code>optional .asr.CloudSpeechSessionParams.EncoderParams encoder_params = 3;</code>
   */
  boolean hasEncoderParams();
  /**
   * <code>optional .asr.CloudSpeechSessionParams.EncoderParams encoder_params = 3;</code>
   */
  com.google.audio.asr.CloudSpeechSessionParams.EncoderParams getEncoderParams();
  /**
   * <code>optional .asr.CloudSpeechSessionParams.EncoderParams encoder_params = 3;</code>
   */
  com.google.audio.asr.CloudSpeechSessionParams.EncoderParamsOrBuilder getEncoderParamsOrBuilder();
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/audio/network_state.proto

package com.google.audio;

public interface NetworkStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:audio.NetworkState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If the network is connected.
   * </pre>
   *
   * <code>optional bool connected = 1;</code>
   */
  boolean hasConnected();
  /**
   * <pre>
   * If the network is connected.
   * </pre>
   *
   * <code>optional bool connected = 1;</code>
   */
  boolean getConnected();

  /**
   * <pre>
   * Typically, if false, this means using WiFi.
   * </pre>
   *
   * <code>optional bool network_metered = 2;</code>
   */
  boolean hasNetworkMetered();
  /**
   * <pre>
   * Typically, if false, this means using WiFi.
   * </pre>
   *
   * <code>optional bool network_metered = 2;</code>
   */
  boolean getNetworkMetered();
}
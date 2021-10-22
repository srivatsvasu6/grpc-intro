// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transfer-service.proto

package com.srivats.models;

public interface TransferResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TransferResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.TransferStatus status = 1;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.TransferStatus status = 1;</code>
   * @return The status.
   */
  com.srivats.models.TransferStatus getStatus();

  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  java.util.List<com.srivats.models.Account> 
      getAccountsList();
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  com.srivats.models.Account getAccounts(int index);
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  int getAccountsCount();
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  java.util.List<? extends com.srivats.models.AccountOrBuilder> 
      getAccountsOrBuilderList();
  /**
   * <code>repeated .Account accounts = 2;</code>
   */
  com.srivats.models.AccountOrBuilder getAccountsOrBuilder(
      int index);
}

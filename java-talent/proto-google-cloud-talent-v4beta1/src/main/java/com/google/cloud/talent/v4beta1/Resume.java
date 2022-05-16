/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Resource that represents a resume.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.Resume}
 */
public final class Resume extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.Resume)
    ResumeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Resume.newBuilder() to construct.
  private Resume(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Resume() {
    structuredResume_ = "";
    resumeType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Resume();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Resume(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              structuredResume_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              resumeType_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.ProfileResourceProto
        .internal_static_google_cloud_talent_v4beta1_Resume_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.ProfileResourceProto
        .internal_static_google_cloud_talent_v4beta1_Resume_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.Resume.class,
            com.google.cloud.talent.v4beta1.Resume.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The format of a structured resume.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.talent.v4beta1.Resume.ResumeType}
   */
  public enum ResumeType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>RESUME_TYPE_UNSPECIFIED = 0;</code>
     */
    RESUME_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The profile contents in HR-XML format.
     * See https://schemas.liquid-technologies.com/hr-xml/2007-04-15/ for more
     * information about Human Resources XML.
     * </pre>
     *
     * <code>HRXML = 1;</code>
     */
    HRXML(1),
    /**
     *
     *
     * <pre>
     * Resume type not specified.
     * </pre>
     *
     * <code>OTHER_RESUME_TYPE = 2;</code>
     */
    OTHER_RESUME_TYPE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>RESUME_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int RESUME_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The profile contents in HR-XML format.
     * See https://schemas.liquid-technologies.com/hr-xml/2007-04-15/ for more
     * information about Human Resources XML.
     * </pre>
     *
     * <code>HRXML = 1;</code>
     */
    public static final int HRXML_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Resume type not specified.
     * </pre>
     *
     * <code>OTHER_RESUME_TYPE = 2;</code>
     */
    public static final int OTHER_RESUME_TYPE_VALUE = 2;

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
    public static ResumeType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ResumeType forNumber(int value) {
      switch (value) {
        case 0:
          return RESUME_TYPE_UNSPECIFIED;
        case 1:
          return HRXML;
        case 2:
          return OTHER_RESUME_TYPE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ResumeType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ResumeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ResumeType>() {
          public ResumeType findValueByNumber(int number) {
            return ResumeType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.Resume.getDescriptor().getEnumTypes().get(0);
    }

    private static final ResumeType[] VALUES = values();

    public static ResumeType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ResumeType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.Resume.ResumeType)
  }

  public static final int STRUCTURED_RESUME_FIELD_NUMBER = 1;
  private volatile java.lang.Object structuredResume_;
  /**
   *
   *
   * <pre>
   * Users can create a profile with only this field field, if [resume_type][google.cloud.talent.v4beta1.Resume.resume_type]
   * is [HRXML][google.cloud.talent.v4beta1.Resume.ResumeType.HRXML]. For example, the API parses this field and
   * creates a profile
   * with all structured fields populated. [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord],
   * [EducationRecord][google.cloud.talent.v4beta1.EducationRecord], and so on. An error is thrown if this field cannot be
   * parsed.
   * Note that the use of the functionality offered by this field to extract
   * data from resumes is an Alpha feature and as such is not covered by any
   * SLA.
   * </pre>
   *
   * <code>string structured_resume = 1;</code>
   *
   * @return The structuredResume.
   */
  @java.lang.Override
  public java.lang.String getStructuredResume() {
    java.lang.Object ref = structuredResume_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      structuredResume_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Users can create a profile with only this field field, if [resume_type][google.cloud.talent.v4beta1.Resume.resume_type]
   * is [HRXML][google.cloud.talent.v4beta1.Resume.ResumeType.HRXML]. For example, the API parses this field and
   * creates a profile
   * with all structured fields populated. [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord],
   * [EducationRecord][google.cloud.talent.v4beta1.EducationRecord], and so on. An error is thrown if this field cannot be
   * parsed.
   * Note that the use of the functionality offered by this field to extract
   * data from resumes is an Alpha feature and as such is not covered by any
   * SLA.
   * </pre>
   *
   * <code>string structured_resume = 1;</code>
   *
   * @return The bytes for structuredResume.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getStructuredResumeBytes() {
    java.lang.Object ref = structuredResume_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      structuredResume_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESUME_TYPE_FIELD_NUMBER = 2;
  private int resumeType_;
  /**
   *
   *
   * <pre>
   * The format of [structured_resume][google.cloud.talent.v4beta1.Resume.structured_resume].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Resume.ResumeType resume_type = 2;</code>
   *
   * @return The enum numeric value on the wire for resumeType.
   */
  @java.lang.Override
  public int getResumeTypeValue() {
    return resumeType_;
  }
  /**
   *
   *
   * <pre>
   * The format of [structured_resume][google.cloud.talent.v4beta1.Resume.structured_resume].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Resume.ResumeType resume_type = 2;</code>
   *
   * @return The resumeType.
   */
  @java.lang.Override
  public com.google.cloud.talent.v4beta1.Resume.ResumeType getResumeType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.talent.v4beta1.Resume.ResumeType result =
        com.google.cloud.talent.v4beta1.Resume.ResumeType.valueOf(resumeType_);
    return result == null ? com.google.cloud.talent.v4beta1.Resume.ResumeType.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(structuredResume_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, structuredResume_);
    }
    if (resumeType_
        != com.google.cloud.talent.v4beta1.Resume.ResumeType.RESUME_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, resumeType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(structuredResume_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, structuredResume_);
    }
    if (resumeType_
        != com.google.cloud.talent.v4beta1.Resume.ResumeType.RESUME_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, resumeType_);
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.Resume)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.Resume other = (com.google.cloud.talent.v4beta1.Resume) obj;

    if (!getStructuredResume().equals(other.getStructuredResume())) return false;
    if (resumeType_ != other.resumeType_) return false;
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
    hash = (37 * hash) + STRUCTURED_RESUME_FIELD_NUMBER;
    hash = (53 * hash) + getStructuredResume().hashCode();
    hash = (37 * hash) + RESUME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + resumeType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.Resume parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.Resume parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.Resume prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Resource that represents a resume.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.Resume}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.Resume)
      com.google.cloud.talent.v4beta1.ResumeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.ProfileResourceProto
          .internal_static_google_cloud_talent_v4beta1_Resume_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.ProfileResourceProto
          .internal_static_google_cloud_talent_v4beta1_Resume_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.Resume.class,
              com.google.cloud.talent.v4beta1.Resume.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.Resume.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      structuredResume_ = "";

      resumeType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.ProfileResourceProto
          .internal_static_google_cloud_talent_v4beta1_Resume_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.Resume getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.Resume.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.Resume build() {
      com.google.cloud.talent.v4beta1.Resume result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.Resume buildPartial() {
      com.google.cloud.talent.v4beta1.Resume result =
          new com.google.cloud.talent.v4beta1.Resume(this);
      result.structuredResume_ = structuredResume_;
      result.resumeType_ = resumeType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4beta1.Resume) {
        return mergeFrom((com.google.cloud.talent.v4beta1.Resume) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.Resume other) {
      if (other == com.google.cloud.talent.v4beta1.Resume.getDefaultInstance()) return this;
      if (!other.getStructuredResume().isEmpty()) {
        structuredResume_ = other.structuredResume_;
        onChanged();
      }
      if (other.resumeType_ != 0) {
        setResumeTypeValue(other.getResumeTypeValue());
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
      com.google.cloud.talent.v4beta1.Resume parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4beta1.Resume) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object structuredResume_ = "";
    /**
     *
     *
     * <pre>
     * Users can create a profile with only this field field, if [resume_type][google.cloud.talent.v4beta1.Resume.resume_type]
     * is [HRXML][google.cloud.talent.v4beta1.Resume.ResumeType.HRXML]. For example, the API parses this field and
     * creates a profile
     * with all structured fields populated. [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord],
     * [EducationRecord][google.cloud.talent.v4beta1.EducationRecord], and so on. An error is thrown if this field cannot be
     * parsed.
     * Note that the use of the functionality offered by this field to extract
     * data from resumes is an Alpha feature and as such is not covered by any
     * SLA.
     * </pre>
     *
     * <code>string structured_resume = 1;</code>
     *
     * @return The structuredResume.
     */
    public java.lang.String getStructuredResume() {
      java.lang.Object ref = structuredResume_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        structuredResume_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Users can create a profile with only this field field, if [resume_type][google.cloud.talent.v4beta1.Resume.resume_type]
     * is [HRXML][google.cloud.talent.v4beta1.Resume.ResumeType.HRXML]. For example, the API parses this field and
     * creates a profile
     * with all structured fields populated. [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord],
     * [EducationRecord][google.cloud.talent.v4beta1.EducationRecord], and so on. An error is thrown if this field cannot be
     * parsed.
     * Note that the use of the functionality offered by this field to extract
     * data from resumes is an Alpha feature and as such is not covered by any
     * SLA.
     * </pre>
     *
     * <code>string structured_resume = 1;</code>
     *
     * @return The bytes for structuredResume.
     */
    public com.google.protobuf.ByteString getStructuredResumeBytes() {
      java.lang.Object ref = structuredResume_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        structuredResume_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Users can create a profile with only this field field, if [resume_type][google.cloud.talent.v4beta1.Resume.resume_type]
     * is [HRXML][google.cloud.talent.v4beta1.Resume.ResumeType.HRXML]. For example, the API parses this field and
     * creates a profile
     * with all structured fields populated. [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord],
     * [EducationRecord][google.cloud.talent.v4beta1.EducationRecord], and so on. An error is thrown if this field cannot be
     * parsed.
     * Note that the use of the functionality offered by this field to extract
     * data from resumes is an Alpha feature and as such is not covered by any
     * SLA.
     * </pre>
     *
     * <code>string structured_resume = 1;</code>
     *
     * @param value The structuredResume to set.
     * @return This builder for chaining.
     */
    public Builder setStructuredResume(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      structuredResume_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Users can create a profile with only this field field, if [resume_type][google.cloud.talent.v4beta1.Resume.resume_type]
     * is [HRXML][google.cloud.talent.v4beta1.Resume.ResumeType.HRXML]. For example, the API parses this field and
     * creates a profile
     * with all structured fields populated. [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord],
     * [EducationRecord][google.cloud.talent.v4beta1.EducationRecord], and so on. An error is thrown if this field cannot be
     * parsed.
     * Note that the use of the functionality offered by this field to extract
     * data from resumes is an Alpha feature and as such is not covered by any
     * SLA.
     * </pre>
     *
     * <code>string structured_resume = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStructuredResume() {

      structuredResume_ = getDefaultInstance().getStructuredResume();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Users can create a profile with only this field field, if [resume_type][google.cloud.talent.v4beta1.Resume.resume_type]
     * is [HRXML][google.cloud.talent.v4beta1.Resume.ResumeType.HRXML]. For example, the API parses this field and
     * creates a profile
     * with all structured fields populated. [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord],
     * [EducationRecord][google.cloud.talent.v4beta1.EducationRecord], and so on. An error is thrown if this field cannot be
     * parsed.
     * Note that the use of the functionality offered by this field to extract
     * data from resumes is an Alpha feature and as such is not covered by any
     * SLA.
     * </pre>
     *
     * <code>string structured_resume = 1;</code>
     *
     * @param value The bytes for structuredResume to set.
     * @return This builder for chaining.
     */
    public Builder setStructuredResumeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      structuredResume_ = value;
      onChanged();
      return this;
    }

    private int resumeType_ = 0;
    /**
     *
     *
     * <pre>
     * The format of [structured_resume][google.cloud.talent.v4beta1.Resume.structured_resume].
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Resume.ResumeType resume_type = 2;</code>
     *
     * @return The enum numeric value on the wire for resumeType.
     */
    @java.lang.Override
    public int getResumeTypeValue() {
      return resumeType_;
    }
    /**
     *
     *
     * <pre>
     * The format of [structured_resume][google.cloud.talent.v4beta1.Resume.structured_resume].
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Resume.ResumeType resume_type = 2;</code>
     *
     * @param value The enum numeric value on the wire for resumeType to set.
     * @return This builder for chaining.
     */
    public Builder setResumeTypeValue(int value) {

      resumeType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The format of [structured_resume][google.cloud.talent.v4beta1.Resume.structured_resume].
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Resume.ResumeType resume_type = 2;</code>
     *
     * @return The resumeType.
     */
    @java.lang.Override
    public com.google.cloud.talent.v4beta1.Resume.ResumeType getResumeType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.talent.v4beta1.Resume.ResumeType result =
          com.google.cloud.talent.v4beta1.Resume.ResumeType.valueOf(resumeType_);
      return result == null
          ? com.google.cloud.talent.v4beta1.Resume.ResumeType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The format of [structured_resume][google.cloud.talent.v4beta1.Resume.structured_resume].
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Resume.ResumeType resume_type = 2;</code>
     *
     * @param value The resumeType to set.
     * @return This builder for chaining.
     */
    public Builder setResumeType(com.google.cloud.talent.v4beta1.Resume.ResumeType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      resumeType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The format of [structured_resume][google.cloud.talent.v4beta1.Resume.structured_resume].
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Resume.ResumeType resume_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResumeType() {

      resumeType_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.Resume)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.Resume)
  private static final com.google.cloud.talent.v4beta1.Resume DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.Resume();
  }

  public static com.google.cloud.talent.v4beta1.Resume getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Resume> PARSER =
      new com.google.protobuf.AbstractParser<Resume>() {
        @java.lang.Override
        public Resume parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Resume(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Resume> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Resume> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.Resume getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

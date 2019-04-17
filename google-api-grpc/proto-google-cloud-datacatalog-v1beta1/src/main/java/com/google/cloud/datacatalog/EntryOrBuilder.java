// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

public interface EntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.Entry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The Data Catalog resource name of the entry in URL format. For
   * example,
   * "projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The Data Catalog resource name of the entry in URL format. For
   * example,
   * "projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The full name of the cloud resource the entry belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * Data Catalog supports resources from select Google Cloud Platform systems.
   * `linked_resource` is the full name of the Google Cloud Platform resource.
   * For example, the `linked_resource` for a table resource from BigQuery is:
   * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
   * </pre>
   *
   * <code>string linked_resource = 9;</code>
   */
  java.lang.String getLinkedResource();
  /**
   *
   *
   * <pre>
   * The full name of the cloud resource the entry belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name
   * Data Catalog supports resources from select Google Cloud Platform systems.
   * `linked_resource` is the full name of the Google Cloud Platform resource.
   * For example, the `linked_resource` for a table resource from BigQuery is:
   * "//bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId".
   * </pre>
   *
   * <code>string linked_resource = 9;</code>
   */
  com.google.protobuf.ByteString getLinkedResourceBytes();

  /**
   *
   *
   * <pre>
   * Type of entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryType type = 2;</code>
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Type of entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryType type = 2;</code>
   */
  com.google.cloud.datacatalog.EntryType getType();

  /**
   *
   *
   * <pre>
   * Specification that applies to a BigQuery table. This is only valid on
   * entries of type TABLE.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   */
  boolean hasBigqueryTableSpec();
  /**
   *
   *
   * <pre>
   * Specification that applies to a BigQuery table. This is only valid on
   * entries of type TABLE.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   */
  com.google.cloud.datacatalog.BigQueryTableSpec getBigqueryTableSpec();
  /**
   *
   *
   * <pre>
   * Specification that applies to a BigQuery table. This is only valid on
   * entries of type TABLE.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   */
  com.google.cloud.datacatalog.BigQueryTableSpecOrBuilder getBigqueryTableSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information such as title and description.
   * A short name to identify the entry, for example,
   * "Analytics Data - Jan 2011".
   * </pre>
   *
   * <code>string display_name = 3;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Display information such as title and description.
   * A short name to identify the entry, for example,
   * "Analytics Data - Jan 2011".
   * </pre>
   *
   * <code>string display_name = 3;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Entry description, which can consist of several sentences or paragraphs
   * that describe entry contents.
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Entry description, which can consist of several sentences or paragraphs
   * that describe entry contents.
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Schema of the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Schema schema = 5;</code>
   */
  boolean hasSchema();
  /**
   *
   *
   * <pre>
   * Schema of the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Schema schema = 5;</code>
   */
  com.google.cloud.datacatalog.Schema getSchema();
  /**
   *
   *
   * <pre>
   * Schema of the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Schema schema = 5;</code>
   */
  com.google.cloud.datacatalog.SchemaOrBuilder getSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * Timestamps about the underlying Google Cloud Platform resource -- not about
   * this Data Catalog Entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.SystemTimestamps source_system_timestamps = 7;</code>
   */
  boolean hasSourceSystemTimestamps();
  /**
   *
   *
   * <pre>
   * Timestamps about the underlying Google Cloud Platform resource -- not about
   * this Data Catalog Entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.SystemTimestamps source_system_timestamps = 7;</code>
   */
  com.google.cloud.datacatalog.SystemTimestamps getSourceSystemTimestamps();
  /**
   *
   *
   * <pre>
   * Timestamps about the underlying Google Cloud Platform resource -- not about
   * this Data Catalog Entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.SystemTimestamps source_system_timestamps = 7;</code>
   */
  com.google.cloud.datacatalog.SystemTimestampsOrBuilder getSourceSystemTimestampsOrBuilder();

  public com.google.cloud.datacatalog.Entry.TypeSpecCase getTypeSpecCase();
}

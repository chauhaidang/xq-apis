/*
 * TestPlan microservice
 * TestPlan microservice api documentation
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: service.testplan@xq.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xq.testplan.api.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.xq.testplan.api.invoker.ApiClient;
/**
 * Requirement request payload object
 */
@JsonPropertyOrder({
  Requirement.JSON_PROPERTY_TITLE,
  Requirement.JSON_PROPERTY_DESCRIPTION,
  Requirement.JSON_PROPERTY_SCOPES,
  Requirement.JSON_PROPERTY_TAGS,
  Requirement.JSON_PROPERTY_REFERENCES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-06-01T15:22:16.597293+07:00[Asia/Ho_Chi_Minh]", comments = "Generator version: 7.12.0")
public class Requirement {
  public static final String JSON_PROPERTY_TITLE = "title";
  @javax.annotation.Nonnull
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nonnull
  private String description;

  public static final String JSON_PROPERTY_SCOPES = "scopes";
  @javax.annotation.Nonnull
  private String scopes;

  public static final String JSON_PROPERTY_TAGS = "tags";
  @javax.annotation.Nonnull
  private String tags;

  public static final String JSON_PROPERTY_REFERENCES = "references";
  @javax.annotation.Nonnull
  private String references;

  public Requirement() { 
  }

  public Requirement title(@javax.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Requirement title
   * @return title
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@javax.annotation.Nonnull String title) {
    this.title = title;
  }


  public Requirement description(@javax.annotation.Nonnull String description) {
    this.description = description;
    return this;
  }

  /**
   * Requirement description
   * @return description
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(@javax.annotation.Nonnull String description) {
    this.description = description;
  }


  public Requirement scopes(@javax.annotation.Nonnull String scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Requirement scopes
   * @return scopes
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScopes() {
    return scopes;
  }


  @JsonProperty(JSON_PROPERTY_SCOPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScopes(@javax.annotation.Nonnull String scopes) {
    this.scopes = scopes;
  }


  public Requirement tags(@javax.annotation.Nonnull String tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Requirement tags
   * @return tags
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTags() {
    return tags;
  }


  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTags(@javax.annotation.Nonnull String tags) {
    this.tags = tags;
  }


  public Requirement references(@javax.annotation.Nonnull String references) {
    this.references = references;
    return this;
  }

  /**
   * Requirement references
   * @return references
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReferences() {
    return references;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReferences(@javax.annotation.Nonnull String references) {
    this.references = references;
  }


  /**
   * Return true if this Requirement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Requirement requirement = (Requirement) o;
    return Objects.equals(this.title, requirement.title) &&
        Objects.equals(this.description, requirement.description) &&
        Objects.equals(this.scopes, requirement.scopes) &&
        Objects.equals(this.tags, requirement.tags) &&
        Objects.equals(this.references, requirement.references);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, scopes, tags, references);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Requirement {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `title` to the URL query string
    if (getTitle() != null) {
      joiner.add(String.format("%stitle%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTitle()))));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDescription()))));
    }

    // add `scopes` to the URL query string
    if (getScopes() != null) {
      joiner.add(String.format("%sscopes%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getScopes()))));
    }

    // add `tags` to the URL query string
    if (getTags() != null) {
      joiner.add(String.format("%stags%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getTags()))));
    }

    // add `references` to the URL query string
    if (getReferences() != null) {
      joiner.add(String.format("%sreferences%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getReferences()))));
    }

    return joiner.toString();
  }
}


/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LinkRelation;
import java.io.IOException;

/**
 * Link
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:15:56.866+01:00")
public class Link {
  @SerializedName("deprecation")
  private String deprecation = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("hreflang")
  private String hreflang = null;

  @SerializedName("media")
  private String media = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("profile")
  private String profile = null;

  @SerializedName("rel")
  private LinkRelation rel = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("type")
  private String type = null;

  public Link deprecation(String deprecation) {
    this.deprecation = deprecation;
    return this;
  }

   /**
   * Get deprecation
   * @return deprecation
  **/
  @ApiModelProperty(value = "")
  public String getDeprecation() {
    return deprecation;
  }

  public void setDeprecation(String deprecation) {
    this.deprecation = deprecation;
  }

  public Link href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @ApiModelProperty(value = "")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Link hreflang(String hreflang) {
    this.hreflang = hreflang;
    return this;
  }

   /**
   * Get hreflang
   * @return hreflang
  **/
  @ApiModelProperty(value = "")
  public String getHreflang() {
    return hreflang;
  }

  public void setHreflang(String hreflang) {
    this.hreflang = hreflang;
  }

  public Link media(String media) {
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @ApiModelProperty(value = "")
  public String getMedia() {
    return media;
  }

  public void setMedia(String media) {
    this.media = media;
  }

  public Link name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Link profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(value = "")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public Link rel(LinkRelation rel) {
    this.rel = rel;
    return this;
  }

   /**
   * Get rel
   * @return rel
  **/
  @ApiModelProperty(value = "")
  public LinkRelation getRel() {
    return rel;
  }

  public void setRel(LinkRelation rel) {
    this.rel = rel;
  }

  public Link title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Link type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.deprecation, link.deprecation) &&
        Objects.equals(this.href, link.href) &&
        Objects.equals(this.hreflang, link.hreflang) &&
        Objects.equals(this.media, link.media) &&
        Objects.equals(this.name, link.name) &&
        Objects.equals(this.profile, link.profile) &&
        Objects.equals(this.rel, link.rel) &&
        Objects.equals(this.title, link.title) &&
        Objects.equals(this.type, link.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deprecation, href, hreflang, media, name, profile, rel, title, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    hreflang: ").append(toIndentedString(hreflang)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


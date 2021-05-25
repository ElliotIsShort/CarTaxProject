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
import io.swagger.client.model.EmbeddedCollectionCar;
import io.swagger.client.model.Link;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Resources of Car
 */
@ApiModel(description = "Resources of Car")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:15:56.866+01:00")
public class CollectionModelCar {
  @SerializedName("_embedded")
  private EmbeddedCollectionCar embedded = null;

  @SerializedName("_links")
  private Map<String, Link> links = new HashMap<String, Link>();

  public CollectionModelCar embedded(EmbeddedCollectionCar embedded) {
    this.embedded = embedded;
    return this;
  }

   /**
   * Get embedded
   * @return embedded
  **/
  @ApiModelProperty(required = true, value = "")
  public EmbeddedCollectionCar getEmbedded() {
    return embedded;
  }

  public void setEmbedded(EmbeddedCollectionCar embedded) {
    this.embedded = embedded;
  }

  public CollectionModelCar links(Map<String, Link> links) {
    this.links = links;
    return this;
  }

  public CollectionModelCar putLinksItem(String key, Link linksItem) {
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * Link collection
   * @return links
  **/
  @ApiModelProperty(required = true, value = "Link collection")
  public Map<String, Link> getLinks() {
    return links;
  }

  public void setLinks(Map<String, Link> links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionModelCar collectionModelCar = (CollectionModelCar) o;
    return Objects.equals(this.embedded, collectionModelCar.embedded) &&
        Objects.equals(this.links, collectionModelCar.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionModelCar {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

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
import io.swagger.client.model.Links;
import io.swagger.client.model.RegistrationRes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EntityModelTax
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:15:56.866+01:00")
public class EntityModelTax {
  @SerializedName("links")
  private Links links = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("tax")
  private List<RegistrationRes> tax = null;

  @SerializedName("taxid")
  private Integer taxid = null;

  @SerializedName("type")
  private String type = null;

  public EntityModelTax links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public EntityModelTax price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public EntityModelTax tax(List<RegistrationRes> tax) {
    this.tax = tax;
    return this;
  }

  public EntityModelTax addTaxItem(RegistrationRes taxItem) {
    if (this.tax == null) {
      this.tax = new ArrayList<RegistrationRes>();
    }
    this.tax.add(taxItem);
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public List<RegistrationRes> getTax() {
    return tax;
  }

  public void setTax(List<RegistrationRes> tax) {
    this.tax = tax;
  }

  public EntityModelTax taxid(Integer taxid) {
    this.taxid = taxid;
    return this;
  }

   /**
   * Get taxid
   * @return taxid
  **/
  @ApiModelProperty(value = "")
  public Integer getTaxid() {
    return taxid;
  }

  public void setTaxid(Integer taxid) {
    this.taxid = taxid;
  }

  public EntityModelTax type(String type) {
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
    EntityModelTax entityModelTax = (EntityModelTax) o;
    return Objects.equals(this.links, entityModelTax.links) &&
        Objects.equals(this.price, entityModelTax.price) &&
        Objects.equals(this.tax, entityModelTax.tax) &&
        Objects.equals(this.taxid, entityModelTax.taxid) &&
        Objects.equals(this.type, entityModelTax.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, price, tax, taxid, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityModelTax {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    taxid: ").append(toIndentedString(taxid)).append("\n");
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

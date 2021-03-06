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
import io.swagger.client.model.CarReq;
import io.swagger.client.model.Tax;
import java.io.IOException;

/**
 * RegistrationReq
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:15:56.866+01:00")
public class RegistrationReq {
  @SerializedName("carid")
  private CarReq carid = null;

  @SerializedName("expiry")
  private String expiry = null;

  @SerializedName("registrationid")
  private Integer registrationid = null;

  @SerializedName("taxid")
  private Tax taxid = null;

  public RegistrationReq carid(CarReq carid) {
    this.carid = carid;
    return this;
  }

   /**
   * Get carid
   * @return carid
  **/
  @ApiModelProperty(value = "")
  public CarReq getCarid() {
    return carid;
  }

  public void setCarid(CarReq carid) {
    this.carid = carid;
  }

  public RegistrationReq expiry(String expiry) {
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @ApiModelProperty(value = "")
  public String getExpiry() {
    return expiry;
  }

  public void setExpiry(String expiry) {
    this.expiry = expiry;
  }

  public RegistrationReq registrationid(Integer registrationid) {
    this.registrationid = registrationid;
    return this;
  }

   /**
   * Get registrationid
   * @return registrationid
  **/
  @ApiModelProperty(value = "")
  public Integer getRegistrationid() {
    return registrationid;
  }

  public void setRegistrationid(Integer registrationid) {
    this.registrationid = registrationid;
  }

  public RegistrationReq taxid(Tax taxid) {
    this.taxid = taxid;
    return this;
  }

   /**
   * Get taxid
   * @return taxid
  **/
  @ApiModelProperty(value = "")
  public Tax getTaxid() {
    return taxid;
  }

  public void setTaxid(Tax taxid) {
    this.taxid = taxid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationReq registrationReq = (RegistrationReq) o;
    return Objects.equals(this.carid, registrationReq.carid) &&
        Objects.equals(this.expiry, registrationReq.expiry) &&
        Objects.equals(this.registrationid, registrationReq.registrationid) &&
        Objects.equals(this.taxid, registrationReq.taxid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carid, expiry, registrationid, taxid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationReq {\n");
    
    sb.append("    carid: ").append(toIndentedString(carid)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    registrationid: ").append(toIndentedString(registrationid)).append("\n");
    sb.append("    taxid: ").append(toIndentedString(taxid)).append("\n");
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


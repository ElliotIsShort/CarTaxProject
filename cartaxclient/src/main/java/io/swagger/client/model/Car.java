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
import io.swagger.client.model.Customer;
import io.swagger.client.model.Registration;
import java.io.IOException;

/**
 * Car
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-24T14:15:56.866+01:00")
public class Car {
  @SerializedName("car")
  private Registration car = null;

  @SerializedName("carid")
  private Integer carid = null;

  @SerializedName("customerid")
  private Customer customerid = null;

  @SerializedName("make")
  private String make = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("regplate")
  private String regplate = null;

  public Car car(Registration car) {
    this.car = car;
    return this;
  }

   /**
   * Get car
   * @return car
  **/
  @ApiModelProperty(value = "")
  public Registration getCar() {
    return car;
  }

  public void setCar(Registration car) {
    this.car = car;
  }

  public Car carid(Integer carid) {
    this.carid = carid;
    return this;
  }

   /**
   * Get carid
   * @return carid
  **/
  @ApiModelProperty(value = "")
  public Integer getCarid() {
    return carid;
  }

  public void setCarid(Integer carid) {
    this.carid = carid;
  }

  public Car customerid(Customer customerid) {
    this.customerid = customerid;
    return this;
  }

   /**
   * Get customerid
   * @return customerid
  **/
  @ApiModelProperty(value = "")
  public Customer getCustomerid() {
    return customerid;
  }

  public void setCustomerid(Customer customerid) {
    this.customerid = customerid;
  }

  public Car make(String make) {
    this.make = make;
    return this;
  }

   /**
   * Get make
   * @return make
  **/
  @ApiModelProperty(value = "")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public Car model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Car regplate(String regplate) {
    this.regplate = regplate;
    return this;
  }

   /**
   * Get regplate
   * @return regplate
  **/
  @ApiModelProperty(value = "")
  public String getRegplate() {
    return regplate;
  }

  public void setRegplate(String regplate) {
    this.regplate = regplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(this.car, car.car) &&
        Objects.equals(this.carid, car.carid) &&
        Objects.equals(this.customerid, car.customerid) &&
        Objects.equals(this.make, car.make) &&
        Objects.equals(this.model, car.model) &&
        Objects.equals(this.regplate, car.regplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(car, carid, customerid, make, model, regplate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Car {\n");
    
    sb.append("    car: ").append(toIndentedString(car)).append("\n");
    sb.append("    carid: ").append(toIndentedString(carid)).append("\n");
    sb.append("    customerid: ").append(toIndentedString(customerid)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    regplate: ").append(toIndentedString(regplate)).append("\n");
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


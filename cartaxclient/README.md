# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AddressEntityApi;

import java.io.File;
import java.util.*;

public class AddressEntityApiExample {

    public static void main(String[] args) {
        
        AddressEntityApi apiInstance = new AddressEntityApi();
        Integer id = 56; // Integer | id
        try {
            apiInstance.deleteCarUsingDELETE(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressEntityApi#deleteCarUsingDELETE");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:4000*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AddressEntityApi* | [**deleteCarUsingDELETE**](docs/AddressEntityApi.md#deleteCarUsingDELETE) | **DELETE** /car/{id} | deleteCar
*AddressEntityApi* | [**deleteCustomerUsingDELETE**](docs/AddressEntityApi.md#deleteCustomerUsingDELETE) | **DELETE** /customer/{id} | deleteCustomer
*AddressEntityApi* | [**deleteRegistrationUsingDELETE**](docs/AddressEntityApi.md#deleteRegistrationUsingDELETE) | **DELETE** /registration/{id} | deleteRegistration
*AddressEntityApi* | [**deleteTaxUsingDELETE**](docs/AddressEntityApi.md#deleteTaxUsingDELETE) | **DELETE** /tax/{id} | deleteTax
*AddressEntityApi* | [**findAllCarUsingGET**](docs/AddressEntityApi.md#findAllCarUsingGET) | **GET** /car | findAllCar
*AddressEntityApi* | [**findAllCustomerUsingGET**](docs/AddressEntityApi.md#findAllCustomerUsingGET) | **GET** /customer | findAllCustomer
*AddressEntityApi* | [**findAllRegistrationUsingGET**](docs/AddressEntityApi.md#findAllRegistrationUsingGET) | **GET** /registration | findAllRegistration
*AddressEntityApi* | [**findAllTaxUsingGET**](docs/AddressEntityApi.md#findAllTaxUsingGET) | **GET** /tax | findAllTax
*AddressEntityApi* | [**findByIdCarUsingGET**](docs/AddressEntityApi.md#findByIdCarUsingGET) | **GET** /car/{id} | findByIdCar
*AddressEntityApi* | [**findByIdCustomerUsingGET**](docs/AddressEntityApi.md#findByIdCustomerUsingGET) | **GET** /customer/{id} | findByIdCustomer
*AddressEntityApi* | [**findByIdRegistrationUsingGET**](docs/AddressEntityApi.md#findByIdRegistrationUsingGET) | **GET** /registration/{id} | findByIdRegistration
*AddressEntityApi* | [**findByIdTaxUsingGET**](docs/AddressEntityApi.md#findByIdTaxUsingGET) | **GET** /tax/{id} | findByIdTax
*AddressEntityApi* | [**saveCarUsingPATCH**](docs/AddressEntityApi.md#saveCarUsingPATCH) | **PATCH** /car/{id} | saveCar
*AddressEntityApi* | [**saveCarUsingPOST**](docs/AddressEntityApi.md#saveCarUsingPOST) | **POST** /car | saveCar
*AddressEntityApi* | [**saveCarUsingPUT**](docs/AddressEntityApi.md#saveCarUsingPUT) | **PUT** /car/{id} | saveCar
*AddressEntityApi* | [**saveCustomerUsingPATCH**](docs/AddressEntityApi.md#saveCustomerUsingPATCH) | **PATCH** /customer/{id} | saveCustomer
*AddressEntityApi* | [**saveCustomerUsingPOST**](docs/AddressEntityApi.md#saveCustomerUsingPOST) | **POST** /customer | saveCustomer
*AddressEntityApi* | [**saveCustomerUsingPUT**](docs/AddressEntityApi.md#saveCustomerUsingPUT) | **PUT** /customer/{id} | saveCustomer
*AddressEntityApi* | [**saveRegistrationUsingPATCH**](docs/AddressEntityApi.md#saveRegistrationUsingPATCH) | **PATCH** /registration/{id} | saveRegistration
*AddressEntityApi* | [**saveRegistrationUsingPOST**](docs/AddressEntityApi.md#saveRegistrationUsingPOST) | **POST** /registration | saveRegistration
*AddressEntityApi* | [**saveRegistrationUsingPUT**](docs/AddressEntityApi.md#saveRegistrationUsingPUT) | **PUT** /registration/{id} | saveRegistration
*AddressEntityApi* | [**saveTaxUsingPATCH**](docs/AddressEntityApi.md#saveTaxUsingPATCH) | **PATCH** /tax/{id} | saveTax
*AddressEntityApi* | [**saveTaxUsingPOST**](docs/AddressEntityApi.md#saveTaxUsingPOST) | **POST** /tax | saveTax
*AddressEntityApi* | [**saveTaxUsingPUT**](docs/AddressEntityApi.md#saveTaxUsingPUT) | **PUT** /tax/{id} | saveTax
*BasicErrorControllerApi* | [**errorUsingDELETE**](docs/BasicErrorControllerApi.md#errorUsingDELETE) | **DELETE** /error | error
*BasicErrorControllerApi* | [**errorUsingGET**](docs/BasicErrorControllerApi.md#errorUsingGET) | **GET** /error | error
*BasicErrorControllerApi* | [**errorUsingHEAD**](docs/BasicErrorControllerApi.md#errorUsingHEAD) | **HEAD** /error | error
*BasicErrorControllerApi* | [**errorUsingOPTIONS**](docs/BasicErrorControllerApi.md#errorUsingOPTIONS) | **OPTIONS** /error | error
*BasicErrorControllerApi* | [**errorUsingPATCH**](docs/BasicErrorControllerApi.md#errorUsingPATCH) | **PATCH** /error | error
*BasicErrorControllerApi* | [**errorUsingPOST**](docs/BasicErrorControllerApi.md#errorUsingPOST) | **POST** /error | error
*BasicErrorControllerApi* | [**errorUsingPUT**](docs/BasicErrorControllerApi.md#errorUsingPUT) | **PUT** /error | error
*CarEntityApi* | [**carCarUsingDELETE**](docs/CarEntityApi.md#carCarUsingDELETE) | **DELETE** /car/{id}/car | carCar
*CarEntityApi* | [**carCarUsingGET**](docs/CarEntityApi.md#carCarUsingGET) | **GET** /car/{id}/car | carCar
*CarEntityApi* | [**carCarUsingPATCH**](docs/CarEntityApi.md#carCarUsingPATCH) | **PATCH** /car/{id}/car | carCar
*CarEntityApi* | [**carCarUsingPOST**](docs/CarEntityApi.md#carCarUsingPOST) | **POST** /car/{id}/car | carCar
*CarEntityApi* | [**carCarUsingPUT**](docs/CarEntityApi.md#carCarUsingPUT) | **PUT** /car/{id}/car | carCar
*CarEntityApi* | [**carCustomeridUsingDELETE**](docs/CarEntityApi.md#carCustomeridUsingDELETE) | **DELETE** /car/{id}/customerid | carCustomerid
*CarEntityApi* | [**carCustomeridUsingGET**](docs/CarEntityApi.md#carCustomeridUsingGET) | **GET** /car/{id}/customerid | carCustomerid
*CarEntityApi* | [**carCustomeridUsingPATCH**](docs/CarEntityApi.md#carCustomeridUsingPATCH) | **PATCH** /car/{id}/customerid | carCustomerid
*CarEntityApi* | [**carCustomeridUsingPOST**](docs/CarEntityApi.md#carCustomeridUsingPOST) | **POST** /car/{id}/customerid | carCustomerid
*CarEntityApi* | [**carCustomeridUsingPUT**](docs/CarEntityApi.md#carCustomeridUsingPUT) | **PUT** /car/{id}/customerid | carCustomerid
*CustomerEntityApi* | [**customerCustomerUsingDELETE**](docs/CustomerEntityApi.md#customerCustomerUsingDELETE) | **DELETE** /customer/{id}/customer/{carId} | customerCustomer
*CustomerEntityApi* | [**customerCustomerUsingDELETE1**](docs/CustomerEntityApi.md#customerCustomerUsingDELETE1) | **DELETE** /customer/{id}/customer | customerCustomer
*CustomerEntityApi* | [**customerCustomerUsingGET**](docs/CustomerEntityApi.md#customerCustomerUsingGET) | **GET** /customer/{id}/customer | customerCustomer
*CustomerEntityApi* | [**customerCustomerUsingGET1**](docs/CustomerEntityApi.md#customerCustomerUsingGET1) | **GET** /customer/{id}/customer/{carId} | customerCustomer
*CustomerEntityApi* | [**customerCustomerUsingPATCH**](docs/CustomerEntityApi.md#customerCustomerUsingPATCH) | **PATCH** /customer/{id}/customer | customerCustomer
*CustomerEntityApi* | [**customerCustomerUsingPOST**](docs/CustomerEntityApi.md#customerCustomerUsingPOST) | **POST** /customer/{id}/customer | customerCustomer
*CustomerEntityApi* | [**customerCustomerUsingPUT**](docs/CustomerEntityApi.md#customerCustomerUsingPUT) | **PUT** /customer/{id}/customer | customerCustomer
*ProfileControllerApi* | [**listAllFormsOfMetadataUsingGET**](docs/ProfileControllerApi.md#listAllFormsOfMetadataUsingGET) | **GET** /profile | listAllFormsOfMetadata
*ProfileControllerApi* | [**profileOptionsUsingOPTIONS**](docs/ProfileControllerApi.md#profileOptionsUsingOPTIONS) | **OPTIONS** /profile | profileOptions
*RegistrationEntityApi* | [**registrationCaridUsingDELETE**](docs/RegistrationEntityApi.md#registrationCaridUsingDELETE) | **DELETE** /registration/{id}/carid | registrationCarid
*RegistrationEntityApi* | [**registrationCaridUsingGET**](docs/RegistrationEntityApi.md#registrationCaridUsingGET) | **GET** /registration/{id}/carid | registrationCarid
*RegistrationEntityApi* | [**registrationCaridUsingPATCH**](docs/RegistrationEntityApi.md#registrationCaridUsingPATCH) | **PATCH** /registration/{id}/carid | registrationCarid
*RegistrationEntityApi* | [**registrationCaridUsingPOST**](docs/RegistrationEntityApi.md#registrationCaridUsingPOST) | **POST** /registration/{id}/carid | registrationCarid
*RegistrationEntityApi* | [**registrationCaridUsingPUT**](docs/RegistrationEntityApi.md#registrationCaridUsingPUT) | **PUT** /registration/{id}/carid | registrationCarid
*RegistrationEntityApi* | [**registrationTaxidUsingDELETE**](docs/RegistrationEntityApi.md#registrationTaxidUsingDELETE) | **DELETE** /registration/{id}/taxid | registrationTaxid
*RegistrationEntityApi* | [**registrationTaxidUsingGET**](docs/RegistrationEntityApi.md#registrationTaxidUsingGET) | **GET** /registration/{id}/taxid | registrationTaxid
*RegistrationEntityApi* | [**registrationTaxidUsingPATCH**](docs/RegistrationEntityApi.md#registrationTaxidUsingPATCH) | **PATCH** /registration/{id}/taxid | registrationTaxid
*RegistrationEntityApi* | [**registrationTaxidUsingPOST**](docs/RegistrationEntityApi.md#registrationTaxidUsingPOST) | **POST** /registration/{id}/taxid | registrationTaxid
*RegistrationEntityApi* | [**registrationTaxidUsingPUT**](docs/RegistrationEntityApi.md#registrationTaxidUsingPUT) | **PUT** /registration/{id}/taxid | registrationTaxid
*TaxEntityApi* | [**taxTaxUsingDELETE**](docs/TaxEntityApi.md#taxTaxUsingDELETE) | **DELETE** /tax/{id}/tax/{registrationId} | taxTax
*TaxEntityApi* | [**taxTaxUsingDELETE1**](docs/TaxEntityApi.md#taxTaxUsingDELETE1) | **DELETE** /tax/{id}/tax | taxTax
*TaxEntityApi* | [**taxTaxUsingGET**](docs/TaxEntityApi.md#taxTaxUsingGET) | **GET** /tax/{id}/tax | taxTax
*TaxEntityApi* | [**taxTaxUsingGET1**](docs/TaxEntityApi.md#taxTaxUsingGET1) | **GET** /tax/{id}/tax/{registrationId} | taxTax
*TaxEntityApi* | [**taxTaxUsingPATCH**](docs/TaxEntityApi.md#taxTaxUsingPATCH) | **PATCH** /tax/{id}/tax | taxTax
*TaxEntityApi* | [**taxTaxUsingPOST**](docs/TaxEntityApi.md#taxTaxUsingPOST) | **POST** /tax/{id}/tax | taxTax
*TaxEntityApi* | [**taxTaxUsingPUT**](docs/TaxEntityApi.md#taxTaxUsingPUT) | **PUT** /tax/{id}/tax | taxTax


## Documentation for Models

 - [Car](docs/Car.md)
 - [CarReq](docs/CarReq.md)
 - [CarRes](docs/CarRes.md)
 - [CollectionModelCar](docs/CollectionModelCar.md)
 - [CollectionModelCustomer](docs/CollectionModelCustomer.md)
 - [CollectionModelRegistration](docs/CollectionModelRegistration.md)
 - [CollectionModelTax](docs/CollectionModelTax.md)
 - [Customer](docs/Customer.md)
 - [CustomerReq](docs/CustomerReq.md)
 - [CustomerRes](docs/CustomerRes.md)
 - [EmbeddedCollectionCar](docs/EmbeddedCollectionCar.md)
 - [EmbeddedCollectionCustomer](docs/EmbeddedCollectionCustomer.md)
 - [EmbeddedCollectionRegistration](docs/EmbeddedCollectionRegistration.md)
 - [EmbeddedCollectionTax](docs/EmbeddedCollectionTax.md)
 - [EntityModelCar](docs/EntityModelCar.md)
 - [EntityModelCustomer](docs/EntityModelCustomer.md)
 - [EntityModelRegistration](docs/EntityModelRegistration.md)
 - [EntityModelTax](docs/EntityModelTax.md)
 - [Link](docs/Link.md)
 - [LinkRelation](docs/LinkRelation.md)
 - [Links](docs/Links.md)
 - [ModelAndView](docs/ModelAndView.md)
 - [Registration](docs/Registration.md)
 - [RegistrationReq](docs/RegistrationReq.md)
 - [RegistrationRes](docs/RegistrationRes.md)
 - [RepresentationModelobject](docs/RepresentationModelobject.md)
 - [Tax](docs/Tax.md)
 - [TemplateVariable](docs/TemplateVariable.md)
 - [UriTemplate](docs/UriTemplate.md)
 - [View](docs/View.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




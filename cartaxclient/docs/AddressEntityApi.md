# AddressEntityApi

All URIs are relative to *https://localhost:4000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCarUsingDELETE**](AddressEntityApi.md#deleteCarUsingDELETE) | **DELETE** /car/{id} | deleteCar
[**deleteCustomerUsingDELETE**](AddressEntityApi.md#deleteCustomerUsingDELETE) | **DELETE** /customer/{id} | deleteCustomer
[**deleteRegistrationUsingDELETE**](AddressEntityApi.md#deleteRegistrationUsingDELETE) | **DELETE** /registration/{id} | deleteRegistration
[**deleteTaxUsingDELETE**](AddressEntityApi.md#deleteTaxUsingDELETE) | **DELETE** /tax/{id} | deleteTax
[**findAllCarUsingGET**](AddressEntityApi.md#findAllCarUsingGET) | **GET** /car | findAllCar
[**findAllCustomerUsingGET**](AddressEntityApi.md#findAllCustomerUsingGET) | **GET** /customer | findAllCustomer
[**findAllRegistrationUsingGET**](AddressEntityApi.md#findAllRegistrationUsingGET) | **GET** /registration | findAllRegistration
[**findAllTaxUsingGET**](AddressEntityApi.md#findAllTaxUsingGET) | **GET** /tax | findAllTax
[**findByIdCarUsingGET**](AddressEntityApi.md#findByIdCarUsingGET) | **GET** /car/{id} | findByIdCar
[**findByIdCustomerUsingGET**](AddressEntityApi.md#findByIdCustomerUsingGET) | **GET** /customer/{id} | findByIdCustomer
[**findByIdRegistrationUsingGET**](AddressEntityApi.md#findByIdRegistrationUsingGET) | **GET** /registration/{id} | findByIdRegistration
[**findByIdTaxUsingGET**](AddressEntityApi.md#findByIdTaxUsingGET) | **GET** /tax/{id} | findByIdTax
[**saveCarUsingPATCH**](AddressEntityApi.md#saveCarUsingPATCH) | **PATCH** /car/{id} | saveCar
[**saveCarUsingPOST**](AddressEntityApi.md#saveCarUsingPOST) | **POST** /car | saveCar
[**saveCarUsingPUT**](AddressEntityApi.md#saveCarUsingPUT) | **PUT** /car/{id} | saveCar
[**saveCustomerUsingPATCH**](AddressEntityApi.md#saveCustomerUsingPATCH) | **PATCH** /customer/{id} | saveCustomer
[**saveCustomerUsingPOST**](AddressEntityApi.md#saveCustomerUsingPOST) | **POST** /customer | saveCustomer
[**saveCustomerUsingPUT**](AddressEntityApi.md#saveCustomerUsingPUT) | **PUT** /customer/{id} | saveCustomer
[**saveRegistrationUsingPATCH**](AddressEntityApi.md#saveRegistrationUsingPATCH) | **PATCH** /registration/{id} | saveRegistration
[**saveRegistrationUsingPOST**](AddressEntityApi.md#saveRegistrationUsingPOST) | **POST** /registration | saveRegistration
[**saveRegistrationUsingPUT**](AddressEntityApi.md#saveRegistrationUsingPUT) | **PUT** /registration/{id} | saveRegistration
[**saveTaxUsingPATCH**](AddressEntityApi.md#saveTaxUsingPATCH) | **PATCH** /tax/{id} | saveTax
[**saveTaxUsingPOST**](AddressEntityApi.md#saveTaxUsingPOST) | **POST** /tax | saveTax
[**saveTaxUsingPUT**](AddressEntityApi.md#saveTaxUsingPUT) | **PUT** /tax/{id} | saveTax


<a name="deleteCarUsingDELETE"></a>
# **deleteCarUsingDELETE**
> deleteCarUsingDELETE(id)

deleteCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer id = 56; // Integer | id
try {
    apiInstance.deleteCarUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#deleteCarUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteCustomerUsingDELETE"></a>
# **deleteCustomerUsingDELETE**
> deleteCustomerUsingDELETE(id)

deleteCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer id = 56; // Integer | id
try {
    apiInstance.deleteCustomerUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#deleteCustomerUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteRegistrationUsingDELETE"></a>
# **deleteRegistrationUsingDELETE**
> deleteRegistrationUsingDELETE(id)

deleteRegistration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer id = 56; // Integer | id
try {
    apiInstance.deleteRegistrationUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#deleteRegistrationUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteTaxUsingDELETE"></a>
# **deleteTaxUsingDELETE**
> deleteTaxUsingDELETE(id)

deleteTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer id = 56; // Integer | id
try {
    apiInstance.deleteTaxUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#deleteTaxUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findAllCarUsingGET"></a>
# **findAllCarUsingGET**
> CollectionModelCar findAllCarUsingGET(page, size, sort)

findAllCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer page = 56; // Integer | page
Integer size = 56; // Integer | size
String sort = "sort_example"; // String | sort
try {
    CollectionModelCar result = apiInstance.findAllCarUsingGET(page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#findAllCarUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| page | [optional]
 **size** | **Integer**| size | [optional]
 **sort** | **String**| sort | [optional]

### Return type

[**CollectionModelCar**](CollectionModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/x-spring-data-compact+json, text/uri-list

<a name="findAllCustomerUsingGET"></a>
# **findAllCustomerUsingGET**
> CollectionModelCustomer findAllCustomerUsingGET(page, size, sort)

findAllCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer page = 56; // Integer | page
Integer size = 56; // Integer | size
String sort = "sort_example"; // String | sort
try {
    CollectionModelCustomer result = apiInstance.findAllCustomerUsingGET(page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#findAllCustomerUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| page | [optional]
 **size** | **Integer**| size | [optional]
 **sort** | **String**| sort | [optional]

### Return type

[**CollectionModelCustomer**](CollectionModelCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/x-spring-data-compact+json, text/uri-list

<a name="findAllRegistrationUsingGET"></a>
# **findAllRegistrationUsingGET**
> CollectionModelRegistration findAllRegistrationUsingGET(page, size, sort)

findAllRegistration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer page = 56; // Integer | page
Integer size = 56; // Integer | size
String sort = "sort_example"; // String | sort
try {
    CollectionModelRegistration result = apiInstance.findAllRegistrationUsingGET(page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#findAllRegistrationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| page | [optional]
 **size** | **Integer**| size | [optional]
 **sort** | **String**| sort | [optional]

### Return type

[**CollectionModelRegistration**](CollectionModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/x-spring-data-compact+json, text/uri-list

<a name="findAllTaxUsingGET"></a>
# **findAllTaxUsingGET**
> CollectionModelTax findAllTaxUsingGET(page, size, sort)

findAllTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer page = 56; // Integer | page
Integer size = 56; // Integer | size
String sort = "sort_example"; // String | sort
try {
    CollectionModelTax result = apiInstance.findAllTaxUsingGET(page, size, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#findAllTaxUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| page | [optional]
 **size** | **Integer**| size | [optional]
 **sort** | **String**| sort | [optional]

### Return type

[**CollectionModelTax**](CollectionModelTax.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json, application/json, application/x-spring-data-compact+json, text/uri-list

<a name="findByIdCarUsingGET"></a>
# **findByIdCarUsingGET**
> EntityModelCar findByIdCarUsingGET(id)

findByIdCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer id = 56; // Integer | id
try {
    EntityModelCar result = apiInstance.findByIdCarUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#findByIdCarUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**EntityModelCar**](EntityModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findByIdCustomerUsingGET"></a>
# **findByIdCustomerUsingGET**
> EntityModelCustomer findByIdCustomerUsingGET(id)

findByIdCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer id = 56; // Integer | id
try {
    EntityModelCustomer result = apiInstance.findByIdCustomerUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#findByIdCustomerUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**EntityModelCustomer**](EntityModelCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findByIdRegistrationUsingGET"></a>
# **findByIdRegistrationUsingGET**
> EntityModelRegistration findByIdRegistrationUsingGET(id)

findByIdRegistration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer id = 56; // Integer | id
try {
    EntityModelRegistration result = apiInstance.findByIdRegistrationUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#findByIdRegistrationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**EntityModelRegistration**](EntityModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findByIdTaxUsingGET"></a>
# **findByIdTaxUsingGET**
> EntityModelTax findByIdTaxUsingGET(id)

findByIdTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Integer id = 56; // Integer | id
try {
    EntityModelTax result = apiInstance.findByIdTaxUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#findByIdTaxUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**EntityModelTax**](EntityModelTax.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="saveCarUsingPATCH"></a>
# **saveCarUsingPATCH**
> EntityModelCar saveCarUsingPATCH(body, id)

saveCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
CarReq body = new CarReq(); // CarReq | body
Integer id = 56; // Integer | id
try {
    EntityModelCar result = apiInstance.saveCarUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveCarUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CarReq**](CarReq.md)| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelCar**](EntityModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveCarUsingPOST"></a>
# **saveCarUsingPOST**
> EntityModelCar saveCarUsingPOST(body)

saveCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
CarReq body = new CarReq(); // CarReq | body
try {
    EntityModelCar result = apiInstance.saveCarUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveCarUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CarReq**](CarReq.md)| body |

### Return type

[**EntityModelCar**](EntityModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveCarUsingPUT"></a>
# **saveCarUsingPUT**
> EntityModelCar saveCarUsingPUT(body, id)

saveCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
CarReq body = new CarReq(); // CarReq | body
Integer id = 56; // Integer | id
try {
    EntityModelCar result = apiInstance.saveCarUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveCarUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CarReq**](CarReq.md)| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelCar**](EntityModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveCustomerUsingPATCH"></a>
# **saveCustomerUsingPATCH**
> EntityModelCustomer saveCustomerUsingPATCH(body, id)

saveCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
CustomerReq body = new CustomerReq(); // CustomerReq | body
Integer id = 56; // Integer | id
try {
    EntityModelCustomer result = apiInstance.saveCustomerUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveCustomerUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerReq**](CustomerReq.md)| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelCustomer**](EntityModelCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveCustomerUsingPOST"></a>
# **saveCustomerUsingPOST**
> EntityModelCustomer saveCustomerUsingPOST(body)

saveCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
CustomerReq body = new CustomerReq(); // CustomerReq | body
try {
    EntityModelCustomer result = apiInstance.saveCustomerUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveCustomerUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerReq**](CustomerReq.md)| body |

### Return type

[**EntityModelCustomer**](EntityModelCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveCustomerUsingPUT"></a>
# **saveCustomerUsingPUT**
> EntityModelCustomer saveCustomerUsingPUT(body, id)

saveCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
CustomerReq body = new CustomerReq(); // CustomerReq | body
Integer id = 56; // Integer | id
try {
    EntityModelCustomer result = apiInstance.saveCustomerUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveCustomerUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerReq**](CustomerReq.md)| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelCustomer**](EntityModelCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveRegistrationUsingPATCH"></a>
# **saveRegistrationUsingPATCH**
> EntityModelRegistration saveRegistrationUsingPATCH(body, id)

saveRegistration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
RegistrationReq body = new RegistrationReq(); // RegistrationReq | body
Integer id = 56; // Integer | id
try {
    EntityModelRegistration result = apiInstance.saveRegistrationUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveRegistrationUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegistrationReq**](RegistrationReq.md)| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelRegistration**](EntityModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveRegistrationUsingPOST"></a>
# **saveRegistrationUsingPOST**
> EntityModelRegistration saveRegistrationUsingPOST(body)

saveRegistration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
RegistrationReq body = new RegistrationReq(); // RegistrationReq | body
try {
    EntityModelRegistration result = apiInstance.saveRegistrationUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveRegistrationUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegistrationReq**](RegistrationReq.md)| body |

### Return type

[**EntityModelRegistration**](EntityModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveRegistrationUsingPUT"></a>
# **saveRegistrationUsingPUT**
> EntityModelRegistration saveRegistrationUsingPUT(body, id)

saveRegistration

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
RegistrationReq body = new RegistrationReq(); // RegistrationReq | body
Integer id = 56; // Integer | id
try {
    EntityModelRegistration result = apiInstance.saveRegistrationUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveRegistrationUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegistrationReq**](RegistrationReq.md)| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelRegistration**](EntityModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveTaxUsingPATCH"></a>
# **saveTaxUsingPATCH**
> EntityModelTax saveTaxUsingPATCH(body, id)

saveTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Tax body = new Tax(); // Tax | body
Integer id = 56; // Integer | id
try {
    EntityModelTax result = apiInstance.saveTaxUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveTaxUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Tax**](Tax.md)| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelTax**](EntityModelTax.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveTaxUsingPOST"></a>
# **saveTaxUsingPOST**
> EntityModelTax saveTaxUsingPOST(body)

saveTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Tax body = new Tax(); // Tax | body
try {
    EntityModelTax result = apiInstance.saveTaxUsingPOST(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveTaxUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Tax**](Tax.md)| body |

### Return type

[**EntityModelTax**](EntityModelTax.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveTaxUsingPUT"></a>
# **saveTaxUsingPUT**
> EntityModelTax saveTaxUsingPUT(body, id)

saveTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddressEntityApi;


AddressEntityApi apiInstance = new AddressEntityApi();
Tax body = new Tax(); // Tax | body
Integer id = 56; // Integer | id
try {
    EntityModelTax result = apiInstance.saveTaxUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddressEntityApi#saveTaxUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Tax**](Tax.md)| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelTax**](EntityModelTax.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


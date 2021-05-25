# RegistrationEntityApi

All URIs are relative to *https://localhost:4000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registrationCaridUsingDELETE**](RegistrationEntityApi.md#registrationCaridUsingDELETE) | **DELETE** /registration/{id}/carid | registrationCarid
[**registrationCaridUsingGET**](RegistrationEntityApi.md#registrationCaridUsingGET) | **GET** /registration/{id}/carid | registrationCarid
[**registrationCaridUsingPATCH**](RegistrationEntityApi.md#registrationCaridUsingPATCH) | **PATCH** /registration/{id}/carid | registrationCarid
[**registrationCaridUsingPOST**](RegistrationEntityApi.md#registrationCaridUsingPOST) | **POST** /registration/{id}/carid | registrationCarid
[**registrationCaridUsingPUT**](RegistrationEntityApi.md#registrationCaridUsingPUT) | **PUT** /registration/{id}/carid | registrationCarid
[**registrationTaxidUsingDELETE**](RegistrationEntityApi.md#registrationTaxidUsingDELETE) | **DELETE** /registration/{id}/taxid | registrationTaxid
[**registrationTaxidUsingGET**](RegistrationEntityApi.md#registrationTaxidUsingGET) | **GET** /registration/{id}/taxid | registrationTaxid
[**registrationTaxidUsingPATCH**](RegistrationEntityApi.md#registrationTaxidUsingPATCH) | **PATCH** /registration/{id}/taxid | registrationTaxid
[**registrationTaxidUsingPOST**](RegistrationEntityApi.md#registrationTaxidUsingPOST) | **POST** /registration/{id}/taxid | registrationTaxid
[**registrationTaxidUsingPUT**](RegistrationEntityApi.md#registrationTaxidUsingPUT) | **PUT** /registration/{id}/taxid | registrationTaxid


<a name="registrationCaridUsingDELETE"></a>
# **registrationCaridUsingDELETE**
> registrationCaridUsingDELETE(id)

registrationCarid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationEntityApi;


RegistrationEntityApi apiInstance = new RegistrationEntityApi();
Integer id = 56; // Integer | id
try {
    apiInstance.registrationCaridUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationEntityApi#registrationCaridUsingDELETE");
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

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="registrationCaridUsingGET"></a>
# **registrationCaridUsingGET**
> EntityModelCar registrationCaridUsingGET(id)

registrationCarid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationEntityApi;


RegistrationEntityApi apiInstance = new RegistrationEntityApi();
Integer id = 56; // Integer | id
try {
    EntityModelCar result = apiInstance.registrationCaridUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationEntityApi#registrationCaridUsingGET");
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
 - **Accept**: application/hal+json

<a name="registrationCaridUsingPATCH"></a>
# **registrationCaridUsingPATCH**
> EntityModelCar registrationCaridUsingPATCH(body, id)

registrationCarid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationEntityApi;


RegistrationEntityApi apiInstance = new RegistrationEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelCar result = apiInstance.registrationCaridUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationEntityApi#registrationCaridUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelCar**](EntityModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="registrationCaridUsingPOST"></a>
# **registrationCaridUsingPOST**
> EntityModelCar registrationCaridUsingPOST(body, id)

registrationCarid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationEntityApi;


RegistrationEntityApi apiInstance = new RegistrationEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelCar result = apiInstance.registrationCaridUsingPOST(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationEntityApi#registrationCaridUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelCar**](EntityModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="registrationCaridUsingPUT"></a>
# **registrationCaridUsingPUT**
> EntityModelCar registrationCaridUsingPUT(body, id)

registrationCarid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationEntityApi;


RegistrationEntityApi apiInstance = new RegistrationEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelCar result = apiInstance.registrationCaridUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationEntityApi#registrationCaridUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelCar**](EntityModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="registrationTaxidUsingDELETE"></a>
# **registrationTaxidUsingDELETE**
> registrationTaxidUsingDELETE(id)

registrationTaxid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationEntityApi;


RegistrationEntityApi apiInstance = new RegistrationEntityApi();
Integer id = 56; // Integer | id
try {
    apiInstance.registrationTaxidUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationEntityApi#registrationTaxidUsingDELETE");
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

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="registrationTaxidUsingGET"></a>
# **registrationTaxidUsingGET**
> EntityModelTax registrationTaxidUsingGET(id)

registrationTaxid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationEntityApi;


RegistrationEntityApi apiInstance = new RegistrationEntityApi();
Integer id = 56; // Integer | id
try {
    EntityModelTax result = apiInstance.registrationTaxidUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationEntityApi#registrationTaxidUsingGET");
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
 - **Accept**: application/hal+json

<a name="registrationTaxidUsingPATCH"></a>
# **registrationTaxidUsingPATCH**
> EntityModelTax registrationTaxidUsingPATCH(body, id)

registrationTaxid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationEntityApi;


RegistrationEntityApi apiInstance = new RegistrationEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelTax result = apiInstance.registrationTaxidUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationEntityApi#registrationTaxidUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelTax**](EntityModelTax.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="registrationTaxidUsingPOST"></a>
# **registrationTaxidUsingPOST**
> EntityModelTax registrationTaxidUsingPOST(body, id)

registrationTaxid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationEntityApi;


RegistrationEntityApi apiInstance = new RegistrationEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelTax result = apiInstance.registrationTaxidUsingPOST(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationEntityApi#registrationTaxidUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelTax**](EntityModelTax.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="registrationTaxidUsingPUT"></a>
# **registrationTaxidUsingPUT**
> EntityModelTax registrationTaxidUsingPUT(body, id)

registrationTaxid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RegistrationEntityApi;


RegistrationEntityApi apiInstance = new RegistrationEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelTax result = apiInstance.registrationTaxidUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistrationEntityApi#registrationTaxidUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelTax**](EntityModelTax.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*


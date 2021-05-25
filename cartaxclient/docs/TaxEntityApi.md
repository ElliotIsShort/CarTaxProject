# TaxEntityApi

All URIs are relative to *https://localhost:4000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**taxTaxUsingDELETE**](TaxEntityApi.md#taxTaxUsingDELETE) | **DELETE** /tax/{id}/tax/{registrationId} | taxTax
[**taxTaxUsingDELETE1**](TaxEntityApi.md#taxTaxUsingDELETE1) | **DELETE** /tax/{id}/tax | taxTax
[**taxTaxUsingGET**](TaxEntityApi.md#taxTaxUsingGET) | **GET** /tax/{id}/tax | taxTax
[**taxTaxUsingGET1**](TaxEntityApi.md#taxTaxUsingGET1) | **GET** /tax/{id}/tax/{registrationId} | taxTax
[**taxTaxUsingPATCH**](TaxEntityApi.md#taxTaxUsingPATCH) | **PATCH** /tax/{id}/tax | taxTax
[**taxTaxUsingPOST**](TaxEntityApi.md#taxTaxUsingPOST) | **POST** /tax/{id}/tax | taxTax
[**taxTaxUsingPUT**](TaxEntityApi.md#taxTaxUsingPUT) | **PUT** /tax/{id}/tax | taxTax


<a name="taxTaxUsingDELETE"></a>
# **taxTaxUsingDELETE**
> taxTaxUsingDELETE(id, registrationId)

taxTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxEntityApi;


TaxEntityApi apiInstance = new TaxEntityApi();
Integer id = 56; // Integer | id
String registrationId = "registrationId_example"; // String | registrationId
try {
    apiInstance.taxTaxUsingDELETE(id, registrationId);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxEntityApi#taxTaxUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |
 **registrationId** | **String**| registrationId |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="taxTaxUsingDELETE1"></a>
# **taxTaxUsingDELETE1**
> taxTaxUsingDELETE1(id)

taxTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxEntityApi;


TaxEntityApi apiInstance = new TaxEntityApi();
Integer id = 56; // Integer | id
try {
    apiInstance.taxTaxUsingDELETE1(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxEntityApi#taxTaxUsingDELETE1");
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

<a name="taxTaxUsingGET"></a>
# **taxTaxUsingGET**
> CollectionModelRegistration taxTaxUsingGET(id)

taxTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxEntityApi;


TaxEntityApi apiInstance = new TaxEntityApi();
Integer id = 56; // Integer | id
try {
    CollectionModelRegistration result = apiInstance.taxTaxUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxEntityApi#taxTaxUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**CollectionModelRegistration**](CollectionModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="taxTaxUsingGET1"></a>
# **taxTaxUsingGET1**
> EntityModelRegistration taxTaxUsingGET1(id, registrationId)

taxTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxEntityApi;


TaxEntityApi apiInstance = new TaxEntityApi();
Integer id = 56; // Integer | id
String registrationId = "registrationId_example"; // String | registrationId
try {
    EntityModelRegistration result = apiInstance.taxTaxUsingGET1(id, registrationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxEntityApi#taxTaxUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |
 **registrationId** | **String**| registrationId |

### Return type

[**EntityModelRegistration**](EntityModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/hal+json
 - **Accept**: */*

<a name="taxTaxUsingPATCH"></a>
# **taxTaxUsingPATCH**
> CollectionModelRegistration taxTaxUsingPATCH(body, id)

taxTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxEntityApi;


TaxEntityApi apiInstance = new TaxEntityApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | body
Integer id = 56; // Integer | id
try {
    CollectionModelRegistration result = apiInstance.taxTaxUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxEntityApi#taxTaxUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**| body |
 **id** | **Integer**| id |

### Return type

[**CollectionModelRegistration**](CollectionModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="taxTaxUsingPOST"></a>
# **taxTaxUsingPOST**
> CollectionModelRegistration taxTaxUsingPOST(body, id)

taxTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxEntityApi;


TaxEntityApi apiInstance = new TaxEntityApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | body
Integer id = 56; // Integer | id
try {
    CollectionModelRegistration result = apiInstance.taxTaxUsingPOST(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxEntityApi#taxTaxUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**| body |
 **id** | **Integer**| id |

### Return type

[**CollectionModelRegistration**](CollectionModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="taxTaxUsingPUT"></a>
# **taxTaxUsingPUT**
> CollectionModelRegistration taxTaxUsingPUT(body, id)

taxTax

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TaxEntityApi;


TaxEntityApi apiInstance = new TaxEntityApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | body
Integer id = 56; // Integer | id
try {
    CollectionModelRegistration result = apiInstance.taxTaxUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxEntityApi#taxTaxUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**| body |
 **id** | **Integer**| id |

### Return type

[**CollectionModelRegistration**](CollectionModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*


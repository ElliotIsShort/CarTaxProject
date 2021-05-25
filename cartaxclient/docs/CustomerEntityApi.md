# CustomerEntityApi

All URIs are relative to *https://localhost:4000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerCustomerUsingDELETE**](CustomerEntityApi.md#customerCustomerUsingDELETE) | **DELETE** /customer/{id}/customer/{carId} | customerCustomer
[**customerCustomerUsingDELETE1**](CustomerEntityApi.md#customerCustomerUsingDELETE1) | **DELETE** /customer/{id}/customer | customerCustomer
[**customerCustomerUsingGET**](CustomerEntityApi.md#customerCustomerUsingGET) | **GET** /customer/{id}/customer | customerCustomer
[**customerCustomerUsingGET1**](CustomerEntityApi.md#customerCustomerUsingGET1) | **GET** /customer/{id}/customer/{carId} | customerCustomer
[**customerCustomerUsingPATCH**](CustomerEntityApi.md#customerCustomerUsingPATCH) | **PATCH** /customer/{id}/customer | customerCustomer
[**customerCustomerUsingPOST**](CustomerEntityApi.md#customerCustomerUsingPOST) | **POST** /customer/{id}/customer | customerCustomer
[**customerCustomerUsingPUT**](CustomerEntityApi.md#customerCustomerUsingPUT) | **PUT** /customer/{id}/customer | customerCustomer


<a name="customerCustomerUsingDELETE"></a>
# **customerCustomerUsingDELETE**
> customerCustomerUsingDELETE(carId, id)

customerCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerEntityApi;


CustomerEntityApi apiInstance = new CustomerEntityApi();
String carId = "carId_example"; // String | carId
Integer id = 56; // Integer | id
try {
    apiInstance.customerCustomerUsingDELETE(carId, id);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerEntityApi#customerCustomerUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carId** | **String**| carId |
 **id** | **Integer**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="customerCustomerUsingDELETE1"></a>
# **customerCustomerUsingDELETE1**
> customerCustomerUsingDELETE1(id)

customerCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerEntityApi;


CustomerEntityApi apiInstance = new CustomerEntityApi();
Integer id = 56; // Integer | id
try {
    apiInstance.customerCustomerUsingDELETE1(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerEntityApi#customerCustomerUsingDELETE1");
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

<a name="customerCustomerUsingGET"></a>
# **customerCustomerUsingGET**
> CollectionModelCar customerCustomerUsingGET(id)

customerCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerEntityApi;


CustomerEntityApi apiInstance = new CustomerEntityApi();
Integer id = 56; // Integer | id
try {
    CollectionModelCar result = apiInstance.customerCustomerUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerEntityApi#customerCustomerUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

[**CollectionModelCar**](CollectionModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/hal+json

<a name="customerCustomerUsingGET1"></a>
# **customerCustomerUsingGET1**
> EntityModelCar customerCustomerUsingGET1(carId, id)

customerCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerEntityApi;


CustomerEntityApi apiInstance = new CustomerEntityApi();
String carId = "carId_example"; // String | carId
Integer id = 56; // Integer | id
try {
    EntityModelCar result = apiInstance.customerCustomerUsingGET1(carId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerEntityApi#customerCustomerUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **carId** | **String**| carId |
 **id** | **Integer**| id |

### Return type

[**EntityModelCar**](EntityModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/hal+json
 - **Accept**: */*

<a name="customerCustomerUsingPATCH"></a>
# **customerCustomerUsingPATCH**
> CollectionModelCar customerCustomerUsingPATCH(body, id)

customerCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerEntityApi;


CustomerEntityApi apiInstance = new CustomerEntityApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | body
Integer id = 56; // Integer | id
try {
    CollectionModelCar result = apiInstance.customerCustomerUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerEntityApi#customerCustomerUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**| body |
 **id** | **Integer**| id |

### Return type

[**CollectionModelCar**](CollectionModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="customerCustomerUsingPOST"></a>
# **customerCustomerUsingPOST**
> CollectionModelCar customerCustomerUsingPOST(body, id)

customerCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerEntityApi;


CustomerEntityApi apiInstance = new CustomerEntityApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | body
Integer id = 56; // Integer | id
try {
    CollectionModelCar result = apiInstance.customerCustomerUsingPOST(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerEntityApi#customerCustomerUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**| body |
 **id** | **Integer**| id |

### Return type

[**CollectionModelCar**](CollectionModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="customerCustomerUsingPUT"></a>
# **customerCustomerUsingPUT**
> CollectionModelCar customerCustomerUsingPUT(body, id)

customerCustomer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerEntityApi;


CustomerEntityApi apiInstance = new CustomerEntityApi();
List<String> body = Arrays.asList(new List<String>()); // List<String> | body
Integer id = 56; // Integer | id
try {
    CollectionModelCar result = apiInstance.customerCustomerUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerEntityApi#customerCustomerUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **List&lt;String&gt;**| body |
 **id** | **Integer**| id |

### Return type

[**CollectionModelCar**](CollectionModelCar.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*


# CarEntityApi

All URIs are relative to *https://localhost:4000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**carCarUsingDELETE**](CarEntityApi.md#carCarUsingDELETE) | **DELETE** /car/{id}/car | carCar
[**carCarUsingGET**](CarEntityApi.md#carCarUsingGET) | **GET** /car/{id}/car | carCar
[**carCarUsingPATCH**](CarEntityApi.md#carCarUsingPATCH) | **PATCH** /car/{id}/car | carCar
[**carCarUsingPOST**](CarEntityApi.md#carCarUsingPOST) | **POST** /car/{id}/car | carCar
[**carCarUsingPUT**](CarEntityApi.md#carCarUsingPUT) | **PUT** /car/{id}/car | carCar
[**carCustomeridUsingDELETE**](CarEntityApi.md#carCustomeridUsingDELETE) | **DELETE** /car/{id}/customerid | carCustomerid
[**carCustomeridUsingGET**](CarEntityApi.md#carCustomeridUsingGET) | **GET** /car/{id}/customerid | carCustomerid
[**carCustomeridUsingPATCH**](CarEntityApi.md#carCustomeridUsingPATCH) | **PATCH** /car/{id}/customerid | carCustomerid
[**carCustomeridUsingPOST**](CarEntityApi.md#carCustomeridUsingPOST) | **POST** /car/{id}/customerid | carCustomerid
[**carCustomeridUsingPUT**](CarEntityApi.md#carCustomeridUsingPUT) | **PUT** /car/{id}/customerid | carCustomerid


<a name="carCarUsingDELETE"></a>
# **carCarUsingDELETE**
> carCarUsingDELETE(id)

carCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarEntityApi;


CarEntityApi apiInstance = new CarEntityApi();
Integer id = 56; // Integer | id
try {
    apiInstance.carCarUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CarEntityApi#carCarUsingDELETE");
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

<a name="carCarUsingGET"></a>
# **carCarUsingGET**
> EntityModelRegistration carCarUsingGET(id)

carCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarEntityApi;


CarEntityApi apiInstance = new CarEntityApi();
Integer id = 56; // Integer | id
try {
    EntityModelRegistration result = apiInstance.carCarUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarEntityApi#carCarUsingGET");
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
 - **Accept**: application/hal+json

<a name="carCarUsingPATCH"></a>
# **carCarUsingPATCH**
> EntityModelRegistration carCarUsingPATCH(body, id)

carCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarEntityApi;


CarEntityApi apiInstance = new CarEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelRegistration result = apiInstance.carCarUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarEntityApi#carCarUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelRegistration**](EntityModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="carCarUsingPOST"></a>
# **carCarUsingPOST**
> EntityModelRegistration carCarUsingPOST(body, id)

carCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarEntityApi;


CarEntityApi apiInstance = new CarEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelRegistration result = apiInstance.carCarUsingPOST(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarEntityApi#carCarUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelRegistration**](EntityModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="carCarUsingPUT"></a>
# **carCarUsingPUT**
> EntityModelRegistration carCarUsingPUT(body, id)

carCar

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarEntityApi;


CarEntityApi apiInstance = new CarEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelRegistration result = apiInstance.carCarUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarEntityApi#carCarUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelRegistration**](EntityModelRegistration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="carCustomeridUsingDELETE"></a>
# **carCustomeridUsingDELETE**
> carCustomeridUsingDELETE(id)

carCustomerid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarEntityApi;


CarEntityApi apiInstance = new CarEntityApi();
Integer id = 56; // Integer | id
try {
    apiInstance.carCustomeridUsingDELETE(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CarEntityApi#carCustomeridUsingDELETE");
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

<a name="carCustomeridUsingGET"></a>
# **carCustomeridUsingGET**
> EntityModelCustomer carCustomeridUsingGET(id)

carCustomerid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarEntityApi;


CarEntityApi apiInstance = new CarEntityApi();
Integer id = 56; // Integer | id
try {
    EntityModelCustomer result = apiInstance.carCustomeridUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarEntityApi#carCustomeridUsingGET");
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
 - **Accept**: application/hal+json

<a name="carCustomeridUsingPATCH"></a>
# **carCustomeridUsingPATCH**
> EntityModelCustomer carCustomeridUsingPATCH(body, id)

carCustomerid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarEntityApi;


CarEntityApi apiInstance = new CarEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelCustomer result = apiInstance.carCustomeridUsingPATCH(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarEntityApi#carCustomeridUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelCustomer**](EntityModelCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="carCustomeridUsingPOST"></a>
# **carCustomeridUsingPOST**
> EntityModelCustomer carCustomeridUsingPOST(body, id)

carCustomerid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarEntityApi;


CarEntityApi apiInstance = new CarEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelCustomer result = apiInstance.carCustomeridUsingPOST(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarEntityApi#carCustomeridUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelCustomer**](EntityModelCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*

<a name="carCustomeridUsingPUT"></a>
# **carCustomeridUsingPUT**
> EntityModelCustomer carCustomeridUsingPUT(body, id)

carCustomerid

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CarEntityApi;


CarEntityApi apiInstance = new CarEntityApi();
String body = "body_example"; // String | body
Integer id = 56; // Integer | id
try {
    EntityModelCustomer result = apiInstance.carCustomeridUsingPUT(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CarEntityApi#carCustomeridUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| body |
 **id** | **Integer**| id |

### Return type

[**EntityModelCustomer**](EntityModelCustomer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/uri-list, application/x-spring-data-compact+json
 - **Accept**: */*


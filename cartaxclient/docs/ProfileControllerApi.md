# ProfileControllerApi

All URIs are relative to *https://localhost:4000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAllFormsOfMetadataUsingGET**](ProfileControllerApi.md#listAllFormsOfMetadataUsingGET) | **GET** /profile | listAllFormsOfMetadata
[**profileOptionsUsingOPTIONS**](ProfileControllerApi.md#profileOptionsUsingOPTIONS) | **OPTIONS** /profile | profileOptions


<a name="listAllFormsOfMetadataUsingGET"></a>
# **listAllFormsOfMetadataUsingGET**
> RepresentationModelobject listAllFormsOfMetadataUsingGET()

listAllFormsOfMetadata

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProfileControllerApi;


ProfileControllerApi apiInstance = new ProfileControllerApi();
try {
    RepresentationModelobject result = apiInstance.listAllFormsOfMetadataUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileControllerApi#listAllFormsOfMetadataUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RepresentationModelobject**](RepresentationModelobject.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="profileOptionsUsingOPTIONS"></a>
# **profileOptionsUsingOPTIONS**
> Object profileOptionsUsingOPTIONS()

profileOptions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProfileControllerApi;


ProfileControllerApi apiInstance = new ProfileControllerApi();
try {
    Object result = apiInstance.profileOptionsUsingOPTIONS();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileControllerApi#profileOptionsUsingOPTIONS");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


# RestApisTestPlanApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRequirement**](RestApisTestPlanApi.md#createRequirement) | **POST** /api/requirement/create | Create a test requirement |
| [**createRequirementWithHttpInfo**](RestApisTestPlanApi.md#createRequirementWithHttpInfo) | **POST** /api/requirement/create | Create a test requirement |
| [**deleteAllRequirements**](RestApisTestPlanApi.md#deleteAllRequirements) | **DELETE** /api/requirement/delete/all | Delete all test requirements |
| [**deleteAllRequirementsWithHttpInfo**](RestApisTestPlanApi.md#deleteAllRequirementsWithHttpInfo) | **DELETE** /api/requirement/delete/all | Delete all test requirements |
| [**deleteRequirement**](RestApisTestPlanApi.md#deleteRequirement) | **DELETE** /api/requirement/delete | Delete a test requirement |
| [**deleteRequirementWithHttpInfo**](RestApisTestPlanApi.md#deleteRequirementWithHttpInfo) | **DELETE** /api/requirement/delete | Delete a test requirement |
| [**fetchRequirement**](RestApisTestPlanApi.md#fetchRequirement) | **GET** /api/requirement/{uuid} | Get a test requirement |
| [**fetchRequirementWithHttpInfo**](RestApisTestPlanApi.md#fetchRequirementWithHttpInfo) | **GET** /api/requirement/{uuid} | Get a test requirement |
| [**getAllRequirements**](RestApisTestPlanApi.md#getAllRequirements) | **GET** /api/requirement/all | Get all test requirements |
| [**getAllRequirementsWithHttpInfo**](RestApisTestPlanApi.md#getAllRequirementsWithHttpInfo) | **GET** /api/requirement/all | Get all test requirements |
| [**updateRequirement**](RestApisTestPlanApi.md#updateRequirement) | **PUT** /api/requirement/update | Update a test requirement |
| [**updateRequirementWithHttpInfo**](RestApisTestPlanApi.md#updateRequirementWithHttpInfo) | **PUT** /api/requirement/update | Update a test requirement |



## createRequirement

> Response createRequirement(requirement)

Create a test requirement

API endpoint to create a test requirement information by input request

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        Requirement requirement = new Requirement(); // Requirement | 
        try {
            Response result = apiInstance.createRequirement(requirement);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#createRequirement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requirement** | [**Requirement**](Requirement.md)|  | |

### Return type

[**Response**](Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Http status created |  -  |

## createRequirementWithHttpInfo

> ApiResponse<Response> createRequirement createRequirementWithHttpInfo(requirement)

Create a test requirement

API endpoint to create a test requirement information by input request

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.ApiResponse;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        Requirement requirement = new Requirement(); // Requirement | 
        try {
            ApiResponse<Response> response = apiInstance.createRequirementWithHttpInfo(requirement);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#createRequirement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requirement** | [**Requirement**](Requirement.md)|  | |

### Return type

ApiResponse<[**Response**](Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Http status created |  -  |


## deleteAllRequirements

> Response deleteAllRequirements()

Delete all test requirements

API endpoint to delete all test requirements

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        try {
            Response result = apiInstance.deleteAllRequirements();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#deleteAllRequirements");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Response**](Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Http status success |  -  |
| **500** | An error occurred. Please try again or contact product support |  -  |

## deleteAllRequirementsWithHttpInfo

> ApiResponse<Response> deleteAllRequirements deleteAllRequirementsWithHttpInfo()

Delete all test requirements

API endpoint to delete all test requirements

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.ApiResponse;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        try {
            ApiResponse<Response> response = apiInstance.deleteAllRequirementsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#deleteAllRequirements");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**Response**](Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Http status success |  -  |
| **500** | An error occurred. Please try again or contact product support |  -  |


## deleteRequirement

> Response deleteRequirement(uuid)

Delete a test requirement

API endpoint to delete a test requirement by uuid

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        String uuid = "uuid_example"; // String | 
        try {
            Response result = apiInstance.deleteRequirement(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#deleteRequirement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **String**|  | |

### Return type

[**Response**](Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Http status success |  -  |
| **500** | Http status internal server error - can not delete a test requirement |  -  |

## deleteRequirementWithHttpInfo

> ApiResponse<Response> deleteRequirement deleteRequirementWithHttpInfo(uuid)

Delete a test requirement

API endpoint to delete a test requirement by uuid

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.ApiResponse;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        String uuid = "uuid_example"; // String | 
        try {
            ApiResponse<Response> response = apiInstance.deleteRequirementWithHttpInfo(uuid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#deleteRequirement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **String**|  | |

### Return type

ApiResponse<[**Response**](Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **200** | Http status success |  -  |
| **500** | Http status internal server error - can not delete a test requirement |  -  |


## fetchRequirement

> Requirement fetchRequirement(uuid)

Get a test requirement

API endpoint to get a test requirement information by uuid

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        String uuid = "uuid_example"; // String | 
        try {
            Requirement result = apiInstance.fetchRequirement(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#fetchRequirement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **String**|  | |

### Return type

[**Requirement**](Requirement.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Http status success |  -  |

## fetchRequirementWithHttpInfo

> ApiResponse<Requirement> fetchRequirement fetchRequirementWithHttpInfo(uuid)

Get a test requirement

API endpoint to get a test requirement information by uuid

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.ApiResponse;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        String uuid = "uuid_example"; // String | 
        try {
            ApiResponse<Requirement> response = apiInstance.fetchRequirementWithHttpInfo(uuid);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#fetchRequirement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **String**|  | |

### Return type

ApiResponse<[**Requirement**](Requirement.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Http status success |  -  |


## getAllRequirements

> ListRequirementsDto getAllRequirements()

Get all test requirements

API endpoint to get all test requirements

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        try {
            ListRequirementsDto result = apiInstance.getAllRequirements();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#getAllRequirements");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListRequirementsDto**](ListRequirementsDto.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | An error occurred. Please try again or contact product support |  -  |
| **200** | Request processed successfully |  -  |

## getAllRequirementsWithHttpInfo

> ApiResponse<ListRequirementsDto> getAllRequirements getAllRequirementsWithHttpInfo()

Get all test requirements

API endpoint to get all test requirements

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.ApiResponse;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        try {
            ApiResponse<ListRequirementsDto> response = apiInstance.getAllRequirementsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#getAllRequirements");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListRequirementsDto**](ListRequirementsDto.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **500** | An error occurred. Please try again or contact product support |  -  |
| **200** | Request processed successfully |  -  |


## updateRequirement

> Response updateRequirement(uuid, requirement)

Update a test requirement

API endpoint to update a test requirement by input request

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        String uuid = "uuid_example"; // String | 
        Requirement requirement = new Requirement(); // Requirement | 
        try {
            Response result = apiInstance.updateRequirement(uuid, requirement);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#updateRequirement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **String**|  | |
| **requirement** | [**Requirement**](Requirement.md)|  | |

### Return type

[**Response**](Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **500** | Http status internal server error - can not update a test requirement |  -  |
| **200** | Http status success |  -  |

## updateRequirementWithHttpInfo

> ApiResponse<Response> updateRequirement updateRequirementWithHttpInfo(uuid, requirement)

Update a test requirement

API endpoint to update a test requirement by input request

### Example

```java
// Import classes:
import com.xq.testplan.api.invoker.ApiClient;
import com.xq.testplan.api.invoker.ApiException;
import com.xq.testplan.api.invoker.ApiResponse;
import com.xq.testplan.api.invoker.Configuration;
import com.xq.testplan.api.invoker.models.*;
import com.xq.testplan.api.client.RestApisTestPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        RestApisTestPlanApi apiInstance = new RestApisTestPlanApi(defaultClient);
        String uuid = "uuid_example"; // String | 
        Requirement requirement = new Requirement(); // Requirement | 
        try {
            ApiResponse<Response> response = apiInstance.updateRequirementWithHttpInfo(uuid, requirement);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RestApisTestPlanApi#updateRequirement");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **uuid** | **String**|  | |
| **requirement** | [**Requirement**](Requirement.md)|  | |

### Return type

ApiResponse<[**Response**](Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **417** | Expectation failed |  -  |
| **500** | Http status internal server error - can not update a test requirement |  -  |
| **200** | Http status success |  -  |


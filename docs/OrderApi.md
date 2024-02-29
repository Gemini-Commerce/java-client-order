# OrderApi

All URIs are relative to *https://dom.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**approveOrder**](OrderApi.md#approveOrder) | **POST** /order.Order/ApproveOrder | Approve Order |
| [**assignShipment**](OrderApi.md#assignShipment) | **POST** /order.Order/AssignShipment | Assign Shipment |
| [**calculateRefund**](OrderApi.md#calculateRefund) | **POST** /order.Order/CalculateRefund | Calculate Refund |
| [**cancelFulfillment**](OrderApi.md#cancelFulfillment) | **POST** /order.Order/CancelFulfillment | Cancel Fulfillment |
| [**cancelOrder**](OrderApi.md#cancelOrder) | **POST** /order.Order/CancelOrder | Cancel Order |
| [**cancelShipment**](OrderApi.md#cancelShipment) | **POST** /order.Order/CancelShipment | Cancel Shipment |
| [**completeShipmentPacking**](OrderApi.md#completeShipmentPacking) | **POST** /order.Order/CompleteShipmentPacking | Complete Shipment Packing |
| [**createFulfillment**](OrderApi.md#createFulfillment) | **POST** /order.Order/CreateFulfillment | Create Fulfillment |
| [**createOrder**](OrderApi.md#createOrder) | **POST** /order.Order/CreateOrder | Create Order |
| [**createOrderHistory**](OrderApi.md#createOrderHistory) | **POST** /order.Order/CreateHistory | Create Order History |
| [**createPayment**](OrderApi.md#createPayment) | **POST** /order.Order/CreatePayment | Create Payment |
| [**createPaymentTransaction**](OrderApi.md#createPaymentTransaction) | **POST** /order.Order/CreatePaymentTransaction | Create Payment Transaction |
| [**createRefund**](OrderApi.md#createRefund) | **POST** /order.Order/CreateRefund | Create Refund |
| [**createRefundTransaction**](OrderApi.md#createRefundTransaction) | **POST** /order.Order/CreateRefundTransaction | Create Refund Transaction |
| [**createShipment**](OrderApi.md#createShipment) | **POST** /order.Order/CreateShipment | Create Shipment |
| [**deleteOrder**](OrderApi.md#deleteOrder) | **POST** /order.Order/DeleteOrder | Delete Order |
| [**getFulfillment**](OrderApi.md#getFulfillment) | **POST** /order.Order/GetFulfillment | Get Fulfillment |
| [**getOrder**](OrderApi.md#getOrder) | **POST** /order.Order/GetOrder | Get Order |
| [**getOrderByCartId**](OrderApi.md#getOrderByCartId) | **POST** /order.Order/GetOrderByCartId | Get Order by Cart ID |
| [**getOrderByOrderNumber**](OrderApi.md#getOrderByOrderNumber) | **POST** /order.Order/GetOrderByOrderNumber | Get Order by Order Number |
| [**getPayment**](OrderApi.md#getPayment) | **POST** /order.Order/GetPayment | Get Payment |
| [**getShipment**](OrderApi.md#getShipment) | **POST** /order.Order/GetShipment | Get Shipment |
| [**getTransaction**](OrderApi.md#getTransaction) | **POST** /order.Order/GetTransaction | Get Transaction |
| [**holdOrder**](OrderApi.md#holdOrder) | **POST** /order.Order/HoldOrder | Hold Order |
| [**importOrder**](OrderApi.md#importOrder) | **POST** /order.Order/ImportOrder | Import Order |
| [**listFulfillments**](OrderApi.md#listFulfillments) | **POST** /order.Order/ListFulfillments | List Fulfillments |
| [**listOrders**](OrderApi.md#listOrders) | **POST** /order.Order/ListOrders | List Orders |
| [**listOrdersByCustomer**](OrderApi.md#listOrdersByCustomer) | **POST** /order.Order/ListOrdersByCustomer | List Orders by Customer |
| [**listOrdersByNumbers**](OrderApi.md#listOrdersByNumbers) | **POST** /order.Order/ListOrdersByNumbers | List Orders by Numbers |
| [**listShipments**](OrderApi.md#listShipments) | **POST** /order.Order/ListShipments | List Shipments |
| [**orderAddDocument**](OrderApi.md#orderAddDocument) | **POST** /order.Order/AddDocument | Documents |
| [**orderRemoveDocumentByCode**](OrderApi.md#orderRemoveDocumentByCode) | **POST** /order.Order/RemoveDocumentByCode |  |
| [**printOrdersLabels**](OrderApi.md#printOrdersLabels) | **POST** /order.Order/PrintOrdersLabels | Print Orders Labels |
| [**quashFulfillment**](OrderApi.md#quashFulfillment) | **POST** /order.Order/QuashFulfillment | Quash Fulfillment |
| [**quashShipment**](OrderApi.md#quashShipment) | **POST** /order.Order/QuashShipment | Quash Shipment |
| [**receiveFulfillment**](OrderApi.md#receiveFulfillment) | **POST** /order.Order/ReceiveFulfillment | Receive Fulfillment |
| [**reportFulfillmentError**](OrderApi.md#reportFulfillmentError) | **POST** /order.Order/ReportFulfillmentError | Report Fulfillment Error |
| [**reportFulfillmentNotResolvable**](OrderApi.md#reportFulfillmentNotResolvable) | **POST** /order.Order/ReportFulfillmentNotResolvable | Report Fulfillment Not Resolvable |
| [**reportFulfillmentReady**](OrderApi.md#reportFulfillmentReady) | **POST** /order.Order/ReportFulfillmentReady | Report Fulfillment Ready |
| [**reportShipmentDelivery**](OrderApi.md#reportShipmentDelivery) | **POST** /order.Order/ReportShipmentDelivery | Report Shipment Delivery |
| [**reportShipmentMissingStock**](OrderApi.md#reportShipmentMissingStock) | **POST** /order.Order/ReportShipmentMissingStock | Report Shipment Missing Stock |
| [**resolveShipmentMissingStock**](OrderApi.md#resolveShipmentMissingStock) | **POST** /order.Order/ResolveShipmentMissingStock | Resolve Shipment Missing Stock |
| [**retryFulfillment**](OrderApi.md#retryFulfillment) | **POST** /order.Order/RetryFulfillment | Retry Fulfillment |
| [**searchOrders**](OrderApi.md#searchOrders) | **POST** /order.Order/SearchOrders | Search Orders |
| [**sendFulfillment**](OrderApi.md#sendFulfillment) | **POST** /order.Order/SendFulfillment | Send Fulfillment |
| [**sendOrderNotification**](OrderApi.md#sendOrderNotification) | **POST** /order.Order/SendOrderNotification | Send Order Notification |
| [**startFulfillmentProcessing**](OrderApi.md#startFulfillmentProcessing) | **POST** /order.Order/StartFulfillmentProcessing | Start Fulfillment Processing |
| [**startShipmentProcessing**](OrderApi.md#startShipmentProcessing) | **POST** /order.Order/StartShipmentProcessing | Start Shipment Processing |
| [**unholdOrder**](OrderApi.md#unholdOrder) | **POST** /order.Order/UnholdOrder | Unhold Order |
| [**updateOrder**](OrderApi.md#updateOrder) | **POST** /order.Order/UpdateOrder | Update Order |
| [**updatePayment**](OrderApi.md#updatePayment) | **POST** /order.Order/UpdatePayment | Update Payment |


<a id="approveOrder"></a>
# **approveOrder**
> Object approveOrder(body)

Approve Order

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderApproveOrderRequest body = new OrderApproveOrderRequest(); // OrderApproveOrderRequest | 
    try {
      Object result = apiInstance.approveOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#approveOrder");
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
| **body** | [**OrderApproveOrderRequest**](OrderApproveOrderRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="assignShipment"></a>
# **assignShipment**
> Object assignShipment(body)

Assign Shipment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderAssignShipmentRequest body = new OrderAssignShipmentRequest(); // OrderAssignShipmentRequest | 
    try {
      Object result = apiInstance.assignShipment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#assignShipment");
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
| **body** | [**OrderAssignShipmentRequest**](OrderAssignShipmentRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="calculateRefund"></a>
# **calculateRefund**
> OrderCalculateRefundResponse calculateRefund(body)

Calculate Refund

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCalculateRefundRequest body = new OrderCalculateRefundRequest(); // OrderCalculateRefundRequest | 
    try {
      OrderCalculateRefundResponse result = apiInstance.calculateRefund(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#calculateRefund");
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
| **body** | [**OrderCalculateRefundRequest**](OrderCalculateRefundRequest.md)|  | |

### Return type

[**OrderCalculateRefundResponse**](OrderCalculateRefundResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="cancelFulfillment"></a>
# **cancelFulfillment**
> Object cancelFulfillment(body)

Cancel Fulfillment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCancelFulfillmentRequest body = new OrderCancelFulfillmentRequest(); // OrderCancelFulfillmentRequest | 
    try {
      Object result = apiInstance.cancelFulfillment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#cancelFulfillment");
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
| **body** | [**OrderCancelFulfillmentRequest**](OrderCancelFulfillmentRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="cancelOrder"></a>
# **cancelOrder**
> Object cancelOrder(body)

Cancel Order

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCancelOrderRequest body = new OrderCancelOrderRequest(); // OrderCancelOrderRequest | 
    try {
      Object result = apiInstance.cancelOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#cancelOrder");
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
| **body** | [**OrderCancelOrderRequest**](OrderCancelOrderRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="cancelShipment"></a>
# **cancelShipment**
> Object cancelShipment(body)

Cancel Shipment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCancelShipmentRequest body = new OrderCancelShipmentRequest(); // OrderCancelShipmentRequest | 
    try {
      Object result = apiInstance.cancelShipment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#cancelShipment");
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
| **body** | [**OrderCancelShipmentRequest**](OrderCancelShipmentRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="completeShipmentPacking"></a>
# **completeShipmentPacking**
> Object completeShipmentPacking(body)

Complete Shipment Packing

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCompleteShipmentPackingRequest body = new OrderCompleteShipmentPackingRequest(); // OrderCompleteShipmentPackingRequest | 
    try {
      Object result = apiInstance.completeShipmentPacking(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#completeShipmentPacking");
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
| **body** | [**OrderCompleteShipmentPackingRequest**](OrderCompleteShipmentPackingRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createFulfillment"></a>
# **createFulfillment**
> OrderFulfillment createFulfillment(body)

Create Fulfillment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCreateFulfillmentRequest body = new OrderCreateFulfillmentRequest(); // OrderCreateFulfillmentRequest | 
    try {
      OrderFulfillment result = apiInstance.createFulfillment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createFulfillment");
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
| **body** | [**OrderCreateFulfillmentRequest**](OrderCreateFulfillmentRequest.md)|  | |

### Return type

[**OrderFulfillment**](OrderFulfillment.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createOrder"></a>
# **createOrder**
> OrderOrderData createOrder(body)

Create Order

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCreateOrderRequest body = new OrderCreateOrderRequest(); // OrderCreateOrderRequest | 
    try {
      OrderOrderData result = apiInstance.createOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createOrder");
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
| **body** | [**OrderCreateOrderRequest**](OrderCreateOrderRequest.md)|  | |

### Return type

[**OrderOrderData**](OrderOrderData.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createOrderHistory"></a>
# **createOrderHistory**
> OrderDataHistory createOrderHistory(body)

Create Order History

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCreateHistoryRequest body = new OrderCreateHistoryRequest(); // OrderCreateHistoryRequest | 
    try {
      OrderDataHistory result = apiInstance.createOrderHistory(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createOrderHistory");
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
| **body** | [**OrderCreateHistoryRequest**](OrderCreateHistoryRequest.md)|  | |

### Return type

[**OrderDataHistory**](OrderDataHistory.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createPayment"></a>
# **createPayment**
> OrderPayment createPayment(body)

Create Payment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCreatePaymentRequest body = new OrderCreatePaymentRequest(); // OrderCreatePaymentRequest | 
    try {
      OrderPayment result = apiInstance.createPayment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createPayment");
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
| **body** | [**OrderCreatePaymentRequest**](OrderCreatePaymentRequest.md)|  | |

### Return type

[**OrderPayment**](OrderPayment.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createPaymentTransaction"></a>
# **createPaymentTransaction**
> OrderTransaction createPaymentTransaction(body)

Create Payment Transaction

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCreatePaymentTransactionRequest body = new OrderCreatePaymentTransactionRequest(); // OrderCreatePaymentTransactionRequest | 
    try {
      OrderTransaction result = apiInstance.createPaymentTransaction(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createPaymentTransaction");
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
| **body** | [**OrderCreatePaymentTransactionRequest**](OrderCreatePaymentTransactionRequest.md)|  | |

### Return type

[**OrderTransaction**](OrderTransaction.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createRefund"></a>
# **createRefund**
> OrderRefund createRefund(body)

Create Refund

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCreateRefundRequest body = new OrderCreateRefundRequest(); // OrderCreateRefundRequest | 
    try {
      OrderRefund result = apiInstance.createRefund(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createRefund");
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
| **body** | [**OrderCreateRefundRequest**](OrderCreateRefundRequest.md)|  | |

### Return type

[**OrderRefund**](OrderRefund.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createRefundTransaction"></a>
# **createRefundTransaction**
> OrderTransaction createRefundTransaction(body)

Create Refund Transaction

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCreateRefundTransactionRequest body = new OrderCreateRefundTransactionRequest(); // OrderCreateRefundTransactionRequest | 
    try {
      OrderTransaction result = apiInstance.createRefundTransaction(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createRefundTransaction");
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
| **body** | [**OrderCreateRefundTransactionRequest**](OrderCreateRefundTransactionRequest.md)|  | |

### Return type

[**OrderTransaction**](OrderTransaction.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createShipment"></a>
# **createShipment**
> OrderShipment createShipment(body)

Create Shipment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderCreateShipmentRequest body = new OrderCreateShipmentRequest(); // OrderCreateShipmentRequest | 
    try {
      OrderShipment result = apiInstance.createShipment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createShipment");
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
| **body** | [**OrderCreateShipmentRequest**](OrderCreateShipmentRequest.md)|  | |

### Return type

[**OrderShipment**](OrderShipment.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="deleteOrder"></a>
# **deleteOrder**
> Object deleteOrder(body)

Delete Order

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderDeleteOrderRequest body = new OrderDeleteOrderRequest(); // OrderDeleteOrderRequest | 
    try {
      Object result = apiInstance.deleteOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteOrder");
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
| **body** | [**OrderDeleteOrderRequest**](OrderDeleteOrderRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getFulfillment"></a>
# **getFulfillment**
> OrderFulfillment getFulfillment(body)

Get Fulfillment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderGetFulfillmentRequest body = new OrderGetFulfillmentRequest(); // OrderGetFulfillmentRequest | 
    try {
      OrderFulfillment result = apiInstance.getFulfillment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getFulfillment");
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
| **body** | [**OrderGetFulfillmentRequest**](OrderGetFulfillmentRequest.md)|  | |

### Return type

[**OrderFulfillment**](OrderFulfillment.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getOrder"></a>
# **getOrder**
> OrderOrderData getOrder(body)

Get Order

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderGetOrderRequest body = new OrderGetOrderRequest(); // OrderGetOrderRequest | 
    try {
      OrderOrderData result = apiInstance.getOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrder");
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
| **body** | [**OrderGetOrderRequest**](OrderGetOrderRequest.md)|  | |

### Return type

[**OrderOrderData**](OrderOrderData.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getOrderByCartId"></a>
# **getOrderByCartId**
> OrderOrderData getOrderByCartId(body)

Get Order by Cart ID

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderGetOrderByCartIdRequest body = new OrderGetOrderByCartIdRequest(); // OrderGetOrderByCartIdRequest | 
    try {
      OrderOrderData result = apiInstance.getOrderByCartId(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderByCartId");
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
| **body** | [**OrderGetOrderByCartIdRequest**](OrderGetOrderByCartIdRequest.md)|  | |

### Return type

[**OrderOrderData**](OrderOrderData.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getOrderByOrderNumber"></a>
# **getOrderByOrderNumber**
> OrderOrderData getOrderByOrderNumber(body)

Get Order by Order Number

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderGetOrderByOrderNumberRequest body = new OrderGetOrderByOrderNumberRequest(); // OrderGetOrderByOrderNumberRequest | 
    try {
      OrderOrderData result = apiInstance.getOrderByOrderNumber(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderByOrderNumber");
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
| **body** | [**OrderGetOrderByOrderNumberRequest**](OrderGetOrderByOrderNumberRequest.md)|  | |

### Return type

[**OrderOrderData**](OrderOrderData.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getPayment"></a>
# **getPayment**
> OrderPayment getPayment(body)

Get Payment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderGetPaymentRequest body = new OrderGetPaymentRequest(); // OrderGetPaymentRequest | 
    try {
      OrderPayment result = apiInstance.getPayment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getPayment");
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
| **body** | [**OrderGetPaymentRequest**](OrderGetPaymentRequest.md)|  | |

### Return type

[**OrderPayment**](OrderPayment.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getShipment"></a>
# **getShipment**
> OrderShipment getShipment(body)

Get Shipment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderGetShipmentRequest body = new OrderGetShipmentRequest(); // OrderGetShipmentRequest | 
    try {
      OrderShipment result = apiInstance.getShipment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getShipment");
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
| **body** | [**OrderGetShipmentRequest**](OrderGetShipmentRequest.md)|  | |

### Return type

[**OrderShipment**](OrderShipment.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getTransaction"></a>
# **getTransaction**
> OrderTransaction getTransaction(body)

Get Transaction

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderGetTransactionRequest body = new OrderGetTransactionRequest(); // OrderGetTransactionRequest | 
    try {
      OrderTransaction result = apiInstance.getTransaction(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getTransaction");
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
| **body** | [**OrderGetTransactionRequest**](OrderGetTransactionRequest.md)|  | |

### Return type

[**OrderTransaction**](OrderTransaction.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="holdOrder"></a>
# **holdOrder**
> Object holdOrder(body)

Hold Order

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderHoldOrderRequest body = new OrderHoldOrderRequest(); // OrderHoldOrderRequest | 
    try {
      Object result = apiInstance.holdOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#holdOrder");
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
| **body** | [**OrderHoldOrderRequest**](OrderHoldOrderRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="importOrder"></a>
# **importOrder**
> OrderOrderData importOrder(body)

Import Order

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderImportOrderRequest body = new OrderImportOrderRequest(); // OrderImportOrderRequest | 
    try {
      OrderOrderData result = apiInstance.importOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#importOrder");
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
| **body** | [**OrderImportOrderRequest**](OrderImportOrderRequest.md)|  | |

### Return type

[**OrderOrderData**](OrderOrderData.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listFulfillments"></a>
# **listFulfillments**
> OrderListFulfillmentsResponse listFulfillments(body)

List Fulfillments

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderListFulfillmentsRequest body = new OrderListFulfillmentsRequest(); // OrderListFulfillmentsRequest | 
    try {
      OrderListFulfillmentsResponse result = apiInstance.listFulfillments(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#listFulfillments");
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
| **body** | [**OrderListFulfillmentsRequest**](OrderListFulfillmentsRequest.md)|  | |

### Return type

[**OrderListFulfillmentsResponse**](OrderListFulfillmentsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listOrders"></a>
# **listOrders**
> OrderListOrdersResponse listOrders(body)

List Orders

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderListOrdersRequest body = new OrderListOrdersRequest(); // OrderListOrdersRequest | 
    try {
      OrderListOrdersResponse result = apiInstance.listOrders(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#listOrders");
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
| **body** | [**OrderListOrdersRequest**](OrderListOrdersRequest.md)|  | |

### Return type

[**OrderListOrdersResponse**](OrderListOrdersResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listOrdersByCustomer"></a>
# **listOrdersByCustomer**
> OrderListOrdersByCustomerResponse listOrdersByCustomer(body)

List Orders by Customer

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderListOrdersByCustomerRequest body = new OrderListOrdersByCustomerRequest(); // OrderListOrdersByCustomerRequest | 
    try {
      OrderListOrdersByCustomerResponse result = apiInstance.listOrdersByCustomer(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#listOrdersByCustomer");
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
| **body** | [**OrderListOrdersByCustomerRequest**](OrderListOrdersByCustomerRequest.md)|  | |

### Return type

[**OrderListOrdersByCustomerResponse**](OrderListOrdersByCustomerResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listOrdersByNumbers"></a>
# **listOrdersByNumbers**
> OrderListOrdersByNumbersResponse listOrdersByNumbers(body)

List Orders by Numbers

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderListOrdersByNumbersRequest body = new OrderListOrdersByNumbersRequest(); // OrderListOrdersByNumbersRequest | 
    try {
      OrderListOrdersByNumbersResponse result = apiInstance.listOrdersByNumbers(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#listOrdersByNumbers");
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
| **body** | [**OrderListOrdersByNumbersRequest**](OrderListOrdersByNumbersRequest.md)|  | |

### Return type

[**OrderListOrdersByNumbersResponse**](OrderListOrdersByNumbersResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listShipments"></a>
# **listShipments**
> OrderListShipmentsResponse listShipments(body)

List Shipments

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderListShipmentsRequest body = new OrderListShipmentsRequest(); // OrderListShipmentsRequest | 
    try {
      OrderListShipmentsResponse result = apiInstance.listShipments(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#listShipments");
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
| **body** | [**OrderListShipmentsRequest**](OrderListShipmentsRequest.md)|  | |

### Return type

[**OrderListShipmentsResponse**](OrderListShipmentsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="orderAddDocument"></a>
# **orderAddDocument**
> Object orderAddDocument(body)

Documents

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderAddDocumentRequest body = new OrderAddDocumentRequest(); // OrderAddDocumentRequest | 
    try {
      Object result = apiInstance.orderAddDocument(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#orderAddDocument");
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
| **body** | [**OrderAddDocumentRequest**](OrderAddDocumentRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="orderRemoveDocumentByCode"></a>
# **orderRemoveDocumentByCode**
> Object orderRemoveDocumentByCode(body)



### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderRemoveDocumentByCodeRequest body = new OrderRemoveDocumentByCodeRequest(); // OrderRemoveDocumentByCodeRequest | 
    try {
      Object result = apiInstance.orderRemoveDocumentByCode(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#orderRemoveDocumentByCode");
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
| **body** | [**OrderRemoveDocumentByCodeRequest**](OrderRemoveDocumentByCodeRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="printOrdersLabels"></a>
# **printOrdersLabels**
> OrderPrintOrdersLabelsResponse printOrdersLabels(body)

Print Orders Labels

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderPrintOrdersLabelsRequest body = new OrderPrintOrdersLabelsRequest(); // OrderPrintOrdersLabelsRequest | 
    try {
      OrderPrintOrdersLabelsResponse result = apiInstance.printOrdersLabels(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#printOrdersLabels");
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
| **body** | [**OrderPrintOrdersLabelsRequest**](OrderPrintOrdersLabelsRequest.md)|  | |

### Return type

[**OrderPrintOrdersLabelsResponse**](OrderPrintOrdersLabelsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="quashFulfillment"></a>
# **quashFulfillment**
> Object quashFulfillment(body)

Quash Fulfillment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderQuashFulfillmentRequest body = new OrderQuashFulfillmentRequest(); // OrderQuashFulfillmentRequest | 
    try {
      Object result = apiInstance.quashFulfillment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#quashFulfillment");
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
| **body** | [**OrderQuashFulfillmentRequest**](OrderQuashFulfillmentRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="quashShipment"></a>
# **quashShipment**
> Object quashShipment(body)

Quash Shipment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderQuashShipmentRequest body = new OrderQuashShipmentRequest(); // OrderQuashShipmentRequest | 
    try {
      Object result = apiInstance.quashShipment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#quashShipment");
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
| **body** | [**OrderQuashShipmentRequest**](OrderQuashShipmentRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="receiveFulfillment"></a>
# **receiveFulfillment**
> Object receiveFulfillment(body)

Receive Fulfillment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderReceiveFulfillmentRequest body = new OrderReceiveFulfillmentRequest(); // OrderReceiveFulfillmentRequest | 
    try {
      Object result = apiInstance.receiveFulfillment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#receiveFulfillment");
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
| **body** | [**OrderReceiveFulfillmentRequest**](OrderReceiveFulfillmentRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="reportFulfillmentError"></a>
# **reportFulfillmentError**
> Object reportFulfillmentError(body)

Report Fulfillment Error

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderReportFulfillmentErrorRequest body = new OrderReportFulfillmentErrorRequest(); // OrderReportFulfillmentErrorRequest | 
    try {
      Object result = apiInstance.reportFulfillmentError(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#reportFulfillmentError");
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
| **body** | [**OrderReportFulfillmentErrorRequest**](OrderReportFulfillmentErrorRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="reportFulfillmentNotResolvable"></a>
# **reportFulfillmentNotResolvable**
> Object reportFulfillmentNotResolvable(body)

Report Fulfillment Not Resolvable

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderReportFulfillmentNotResolvableRequest body = new OrderReportFulfillmentNotResolvableRequest(); // OrderReportFulfillmentNotResolvableRequest | 
    try {
      Object result = apiInstance.reportFulfillmentNotResolvable(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#reportFulfillmentNotResolvable");
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
| **body** | [**OrderReportFulfillmentNotResolvableRequest**](OrderReportFulfillmentNotResolvableRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="reportFulfillmentReady"></a>
# **reportFulfillmentReady**
> Object reportFulfillmentReady(body)

Report Fulfillment Ready

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderReportFulfillmentReadyRequest body = new OrderReportFulfillmentReadyRequest(); // OrderReportFulfillmentReadyRequest | 
    try {
      Object result = apiInstance.reportFulfillmentReady(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#reportFulfillmentReady");
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
| **body** | [**OrderReportFulfillmentReadyRequest**](OrderReportFulfillmentReadyRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="reportShipmentDelivery"></a>
# **reportShipmentDelivery**
> Object reportShipmentDelivery(body)

Report Shipment Delivery

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderReportShipmentDeliveryRequest body = new OrderReportShipmentDeliveryRequest(); // OrderReportShipmentDeliveryRequest | 
    try {
      Object result = apiInstance.reportShipmentDelivery(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#reportShipmentDelivery");
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
| **body** | [**OrderReportShipmentDeliveryRequest**](OrderReportShipmentDeliveryRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="reportShipmentMissingStock"></a>
# **reportShipmentMissingStock**
> Object reportShipmentMissingStock(body)

Report Shipment Missing Stock

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderReportShipmentMissingStockRequest body = new OrderReportShipmentMissingStockRequest(); // OrderReportShipmentMissingStockRequest | 
    try {
      Object result = apiInstance.reportShipmentMissingStock(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#reportShipmentMissingStock");
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
| **body** | [**OrderReportShipmentMissingStockRequest**](OrderReportShipmentMissingStockRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="resolveShipmentMissingStock"></a>
# **resolveShipmentMissingStock**
> Object resolveShipmentMissingStock(body)

Resolve Shipment Missing Stock

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderResolveShipmentMissingStockRequest body = new OrderResolveShipmentMissingStockRequest(); // OrderResolveShipmentMissingStockRequest | 
    try {
      Object result = apiInstance.resolveShipmentMissingStock(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#resolveShipmentMissingStock");
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
| **body** | [**OrderResolveShipmentMissingStockRequest**](OrderResolveShipmentMissingStockRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="retryFulfillment"></a>
# **retryFulfillment**
> Object retryFulfillment(body)

Retry Fulfillment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderRetryFulfillmentRequest body = new OrderRetryFulfillmentRequest(); // OrderRetryFulfillmentRequest | 
    try {
      Object result = apiInstance.retryFulfillment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#retryFulfillment");
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
| **body** | [**OrderRetryFulfillmentRequest**](OrderRetryFulfillmentRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="searchOrders"></a>
# **searchOrders**
> OrderSearchOrdersResponse searchOrders(body)

Search Orders

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderSearchOrdersRequest body = new OrderSearchOrdersRequest(); // OrderSearchOrdersRequest | 
    try {
      OrderSearchOrdersResponse result = apiInstance.searchOrders(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#searchOrders");
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
| **body** | [**OrderSearchOrdersRequest**](OrderSearchOrdersRequest.md)|  | |

### Return type

[**OrderSearchOrdersResponse**](OrderSearchOrdersResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="sendFulfillment"></a>
# **sendFulfillment**
> Object sendFulfillment(body)

Send Fulfillment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderSendFulfillmentRequest body = new OrderSendFulfillmentRequest(); // OrderSendFulfillmentRequest | 
    try {
      Object result = apiInstance.sendFulfillment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#sendFulfillment");
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
| **body** | [**OrderSendFulfillmentRequest**](OrderSendFulfillmentRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="sendOrderNotification"></a>
# **sendOrderNotification**
> Object sendOrderNotification(body)

Send Order Notification

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderSendOrderNotificationRequest body = new OrderSendOrderNotificationRequest(); // OrderSendOrderNotificationRequest | 
    try {
      Object result = apiInstance.sendOrderNotification(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#sendOrderNotification");
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
| **body** | [**OrderSendOrderNotificationRequest**](OrderSendOrderNotificationRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="startFulfillmentProcessing"></a>
# **startFulfillmentProcessing**
> Object startFulfillmentProcessing(body)

Start Fulfillment Processing

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderStartFulfillmentProcessingRequest body = new OrderStartFulfillmentProcessingRequest(); // OrderStartFulfillmentProcessingRequest | 
    try {
      Object result = apiInstance.startFulfillmentProcessing(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#startFulfillmentProcessing");
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
| **body** | [**OrderStartFulfillmentProcessingRequest**](OrderStartFulfillmentProcessingRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="startShipmentProcessing"></a>
# **startShipmentProcessing**
> Object startShipmentProcessing(body)

Start Shipment Processing

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderStartShipmentProcessingRequest body = new OrderStartShipmentProcessingRequest(); // OrderStartShipmentProcessingRequest | 
    try {
      Object result = apiInstance.startShipmentProcessing(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#startShipmentProcessing");
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
| **body** | [**OrderStartShipmentProcessingRequest**](OrderStartShipmentProcessingRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="unholdOrder"></a>
# **unholdOrder**
> Object unholdOrder(body)

Unhold Order

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderUnholdOrderRequest body = new OrderUnholdOrderRequest(); // OrderUnholdOrderRequest | 
    try {
      Object result = apiInstance.unholdOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#unholdOrder");
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
| **body** | [**OrderUnholdOrderRequest**](OrderUnholdOrderRequest.md)|  | |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updateOrder"></a>
# **updateOrder**
> OrderOrderData updateOrder(body)

Update Order

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderUpdateOrderRequest body = new OrderUpdateOrderRequest(); // OrderUpdateOrderRequest | 
    try {
      OrderOrderData result = apiInstance.updateOrder(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updateOrder");
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
| **body** | [**OrderUpdateOrderRequest**](OrderUpdateOrderRequest.md)|  | |

### Return type

[**OrderOrderData**](OrderOrderData.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updatePayment"></a>
# **updatePayment**
> OrderPayment updatePayment(body)

Update Payment

### Example
```java
// Import classes:
import GeminiCommerce_Order.ApiClient;
import GeminiCommerce_Order.ApiException;
import GeminiCommerce_Order.Configuration;
import GeminiCommerce_Order.auth.*;
import GeminiCommerce_Order.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://dom.api.gogemini.io");
    
    // Configure API key authorization: Authorization
    ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
    Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Authorization.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    OrderUpdatePaymentRequest body = new OrderUpdatePaymentRequest(); // OrderUpdatePaymentRequest | 
    try {
      OrderPayment result = apiInstance.updatePayment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#updatePayment");
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
| **body** | [**OrderUpdatePaymentRequest**](OrderUpdatePaymentRequest.md)|  | |

### Return type

[**OrderPayment**](OrderPayment.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |


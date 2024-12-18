# openapi-java-client

order Service
- API version: v1
  - Build date: 2024-11-18T17:02:39.571052266Z[Etc/UTC]
  - Generator version: 7.9.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import GeminiCommerce.Order.ApiClient;
import GeminiCommerce.Order.ApiException;
import GeminiCommerce.Order.Configuration;
import GeminiCommerce.Order.auth.*;
import org.openapitools.client.model.*;
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

## Documentation for API Endpoints

All URIs are relative to *https://dom.api.gogemini.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrderApi* | [**approveOrder**](docs/OrderApi.md#approveOrder) | **POST** /order.Order/ApproveOrder | Approve Order
*OrderApi* | [**assignShipment**](docs/OrderApi.md#assignShipment) | **POST** /order.Order/AssignShipment | Assign Shipment
*OrderApi* | [**calculateRefund**](docs/OrderApi.md#calculateRefund) | **POST** /order.Order/CalculateRefund | Calculate Refund
*OrderApi* | [**cancelFulfillment**](docs/OrderApi.md#cancelFulfillment) | **POST** /order.Order/CancelFulfillment | Cancel Fulfillment
*OrderApi* | [**cancelOrder**](docs/OrderApi.md#cancelOrder) | **POST** /order.Order/CancelOrder | Cancel Order
*OrderApi* | [**cancelShipment**](docs/OrderApi.md#cancelShipment) | **POST** /order.Order/CancelShipment | Cancel Shipment
*OrderApi* | [**completeShipmentPacking**](docs/OrderApi.md#completeShipmentPacking) | **POST** /order.Order/CompleteShipmentPacking | Complete Shipment Packing
*OrderApi* | [**createFulfillment**](docs/OrderApi.md#createFulfillment) | **POST** /order.Order/CreateFulfillment | Create Fulfillment
*OrderApi* | [**createOrder**](docs/OrderApi.md#createOrder) | **POST** /order.Order/CreateOrder | Create Order
*OrderApi* | [**createOrderHistory**](docs/OrderApi.md#createOrderHistory) | **POST** /order.Order/CreateHistory | Create Order History
*OrderApi* | [**createPayment**](docs/OrderApi.md#createPayment) | **POST** /order.Order/CreatePayment | Create Payment
*OrderApi* | [**createPaymentTransaction**](docs/OrderApi.md#createPaymentTransaction) | **POST** /order.Order/CreatePaymentTransaction | Create Payment Transaction
*OrderApi* | [**createRefund**](docs/OrderApi.md#createRefund) | **POST** /order.Order/CreateRefund | Create Refund
*OrderApi* | [**createRefundTransaction**](docs/OrderApi.md#createRefundTransaction) | **POST** /order.Order/CreateRefundTransaction | Create Refund Transaction
*OrderApi* | [**createShipment**](docs/OrderApi.md#createShipment) | **POST** /order.Order/CreateShipment | Create Shipment
*OrderApi* | [**deleteOrder**](docs/OrderApi.md#deleteOrder) | **POST** /order.Order/DeleteOrder | Delete Order
*OrderApi* | [**getFulfillment**](docs/OrderApi.md#getFulfillment) | **POST** /order.Order/GetFulfillment | Get Fulfillment
*OrderApi* | [**getOrder**](docs/OrderApi.md#getOrder) | **POST** /order.Order/GetOrder | Get Order
*OrderApi* | [**getOrderByCartId**](docs/OrderApi.md#getOrderByCartId) | **POST** /order.Order/GetOrderByCartId | Get Order by Cart ID
*OrderApi* | [**getOrderByOrderNumber**](docs/OrderApi.md#getOrderByOrderNumber) | **POST** /order.Order/GetOrderByOrderNumber | Get Order by Order Number
*OrderApi* | [**getPayment**](docs/OrderApi.md#getPayment) | **POST** /order.Order/GetPayment | Get Payment
*OrderApi* | [**getShipment**](docs/OrderApi.md#getShipment) | **POST** /order.Order/GetShipment | Get Shipment
*OrderApi* | [**getTransaction**](docs/OrderApi.md#getTransaction) | **POST** /order.Order/GetTransaction | Get Transaction
*OrderApi* | [**holdOrder**](docs/OrderApi.md#holdOrder) | **POST** /order.Order/HoldOrder | Hold Order
*OrderApi* | [**importOrder**](docs/OrderApi.md#importOrder) | **POST** /order.Order/ImportOrder | Import Order
*OrderApi* | [**listFulfillments**](docs/OrderApi.md#listFulfillments) | **POST** /order.Order/ListFulfillments | List Fulfillments
*OrderApi* | [**listOrders**](docs/OrderApi.md#listOrders) | **POST** /order.Order/ListOrders | List Orders
*OrderApi* | [**listOrdersByCustomer**](docs/OrderApi.md#listOrdersByCustomer) | **POST** /order.Order/ListOrdersByCustomer | List Orders by Customer
*OrderApi* | [**listOrdersByNumbers**](docs/OrderApi.md#listOrdersByNumbers) | **POST** /order.Order/ListOrdersByNumbers | List Orders by Numbers
*OrderApi* | [**listShipments**](docs/OrderApi.md#listShipments) | **POST** /order.Order/ListShipments | List Shipments
*OrderApi* | [**orderAddDocument**](docs/OrderApi.md#orderAddDocument) | **POST** /order.Order/AddDocument | Documents
*OrderApi* | [**orderRemoveDocumentByCode**](docs/OrderApi.md#orderRemoveDocumentByCode) | **POST** /order.Order/RemoveDocumentByCode | 
*OrderApi* | [**printOrdersLabels**](docs/OrderApi.md#printOrdersLabels) | **POST** /order.Order/PrintOrdersLabels | Print Orders Labels
*OrderApi* | [**quashFulfillment**](docs/OrderApi.md#quashFulfillment) | **POST** /order.Order/QuashFulfillment | Quash Fulfillment
*OrderApi* | [**quashShipment**](docs/OrderApi.md#quashShipment) | **POST** /order.Order/QuashShipment | Quash Shipment
*OrderApi* | [**receiveFulfillment**](docs/OrderApi.md#receiveFulfillment) | **POST** /order.Order/ReceiveFulfillment | Receive Fulfillment
*OrderApi* | [**reportFulfillmentError**](docs/OrderApi.md#reportFulfillmentError) | **POST** /order.Order/ReportFulfillmentError | Report Fulfillment Error
*OrderApi* | [**reportFulfillmentNotResolvable**](docs/OrderApi.md#reportFulfillmentNotResolvable) | **POST** /order.Order/ReportFulfillmentNotResolvable | Report Fulfillment Not Resolvable
*OrderApi* | [**reportFulfillmentReady**](docs/OrderApi.md#reportFulfillmentReady) | **POST** /order.Order/ReportFulfillmentReady | Report Fulfillment Ready
*OrderApi* | [**reportShipmentDelivery**](docs/OrderApi.md#reportShipmentDelivery) | **POST** /order.Order/ReportShipmentDelivery | Report Shipment Delivery
*OrderApi* | [**reportShipmentMissingStock**](docs/OrderApi.md#reportShipmentMissingStock) | **POST** /order.Order/ReportShipmentMissingStock | Report Shipment Missing Stock
*OrderApi* | [**resolveShipmentMissingStock**](docs/OrderApi.md#resolveShipmentMissingStock) | **POST** /order.Order/ResolveShipmentMissingStock | Resolve Shipment Missing Stock
*OrderApi* | [**retryFulfillment**](docs/OrderApi.md#retryFulfillment) | **POST** /order.Order/RetryFulfillment | Retry Fulfillment
*OrderApi* | [**searchOrders**](docs/OrderApi.md#searchOrders) | **POST** /order.Order/SearchOrders | Search Orders
*OrderApi* | [**sendFulfillment**](docs/OrderApi.md#sendFulfillment) | **POST** /order.Order/SendFulfillment | Send Fulfillment
*OrderApi* | [**sendOrderNotification**](docs/OrderApi.md#sendOrderNotification) | **POST** /order.Order/SendOrderNotification | Send Order Notification
*OrderApi* | [**startFulfillmentProcessing**](docs/OrderApi.md#startFulfillmentProcessing) | **POST** /order.Order/StartFulfillmentProcessing | Start Fulfillment Processing
*OrderApi* | [**startShipmentProcessing**](docs/OrderApi.md#startShipmentProcessing) | **POST** /order.Order/StartShipmentProcessing | Start Shipment Processing
*OrderApi* | [**unholdOrder**](docs/OrderApi.md#unholdOrder) | **POST** /order.Order/UnholdOrder | Unhold Order
*OrderApi* | [**updateOrder**](docs/OrderApi.md#updateOrder) | **POST** /order.Order/UpdateOrder | Update Order
*OrderApi* | [**updatePayment**](docs/OrderApi.md#updatePayment) | **POST** /order.Order/UpdatePayment | Update Payment


## Documentation for Models

 - [BehaviorOptionsInventory](docs/BehaviorOptionsInventory.md)
 - [BehaviorOptionsInventoryAction](docs/BehaviorOptionsInventoryAction.md)
 - [BehaviorOptionsPaymentAction](docs/BehaviorOptionsPaymentAction.md)
 - [CancelOrderRequestBehaviorOptions](docs/CancelOrderRequestBehaviorOptions.md)
 - [CancelOrderRequestBehaviorOptionsPayment](docs/CancelOrderRequestBehaviorOptionsPayment.md)
 - [CreateOrderRequestInitialPayment](docs/CreateOrderRequestInitialPayment.md)
 - [ImportOrderRequestImportedPayment](docs/ImportOrderRequestImportedPayment.md)
 - [InitialPaymentInitialTransaction](docs/InitialPaymentInitialTransaction.md)
 - [ItemProductConfigurationStep](docs/ItemProductConfigurationStep.md)
 - [OptionImage](docs/OptionImage.md)
 - [OrderAddDocumentRequest](docs/OrderAddDocumentRequest.md)
 - [OrderApproveOrderRequest](docs/OrderApproveOrderRequest.md)
 - [OrderAssignShipmentRequest](docs/OrderAssignShipmentRequest.md)
 - [OrderByDirection](docs/OrderByDirection.md)
 - [OrderCalculateRefundRequest](docs/OrderCalculateRefundRequest.md)
 - [OrderCalculateRefundResponse](docs/OrderCalculateRefundResponse.md)
 - [OrderCancelFulfillmentRequest](docs/OrderCancelFulfillmentRequest.md)
 - [OrderCancelOrderRequest](docs/OrderCancelOrderRequest.md)
 - [OrderCancelShipmentRequest](docs/OrderCancelShipmentRequest.md)
 - [OrderCompleteShipmentPackingRequest](docs/OrderCompleteShipmentPackingRequest.md)
 - [OrderCreateFulfillmentRequest](docs/OrderCreateFulfillmentRequest.md)
 - [OrderCreateHistoryRequest](docs/OrderCreateHistoryRequest.md)
 - [OrderCreateOrderRequest](docs/OrderCreateOrderRequest.md)
 - [OrderCreatePaymentRequest](docs/OrderCreatePaymentRequest.md)
 - [OrderCreatePaymentTransactionRequest](docs/OrderCreatePaymentTransactionRequest.md)
 - [OrderCreateRefundRequest](docs/OrderCreateRefundRequest.md)
 - [OrderCreateRefundTransactionRequest](docs/OrderCreateRefundTransactionRequest.md)
 - [OrderCreateShipmentRequest](docs/OrderCreateShipmentRequest.md)
 - [OrderCurrency](docs/OrderCurrency.md)
 - [OrderDataCustomerInfo](docs/OrderDataCustomerInfo.md)
 - [OrderDataDocument](docs/OrderDataDocument.md)
 - [OrderDataHistory](docs/OrderDataHistory.md)
 - [OrderDataPaymentInfo](docs/OrderDataPaymentInfo.md)
 - [OrderDataPromotionInfo](docs/OrderDataPromotionInfo.md)
 - [OrderDataShipmentInfo](docs/OrderDataShipmentInfo.md)
 - [OrderDataSubtotal](docs/OrderDataSubtotal.md)
 - [OrderDataSubtotalCode](docs/OrderDataSubtotalCode.md)
 - [OrderDataTotal](docs/OrderDataTotal.md)
 - [OrderDataTotalCode](docs/OrderDataTotalCode.md)
 - [OrderDeleteOrderRequest](docs/OrderDeleteOrderRequest.md)
 - [OrderFulfillment](docs/OrderFulfillment.md)
 - [OrderFulfillmentItem](docs/OrderFulfillmentItem.md)
 - [OrderGetFulfillmentRequest](docs/OrderGetFulfillmentRequest.md)
 - [OrderGetOrderByCartIdRequest](docs/OrderGetOrderByCartIdRequest.md)
 - [OrderGetOrderByOrderNumberRequest](docs/OrderGetOrderByOrderNumberRequest.md)
 - [OrderGetOrderRequest](docs/OrderGetOrderRequest.md)
 - [OrderGetPaymentRequest](docs/OrderGetPaymentRequest.md)
 - [OrderGetShipmentRequest](docs/OrderGetShipmentRequest.md)
 - [OrderGetTransactionRequest](docs/OrderGetTransactionRequest.md)
 - [OrderHoldOrderRequest](docs/OrderHoldOrderRequest.md)
 - [OrderImportOrderRequest](docs/OrderImportOrderRequest.md)
 - [OrderListFulfillmentsRequest](docs/OrderListFulfillmentsRequest.md)
 - [OrderListFulfillmentsResponse](docs/OrderListFulfillmentsResponse.md)
 - [OrderListOrdersByCustomerRequest](docs/OrderListOrdersByCustomerRequest.md)
 - [OrderListOrdersByCustomerResponse](docs/OrderListOrdersByCustomerResponse.md)
 - [OrderListOrdersByNumbersRequest](docs/OrderListOrdersByNumbersRequest.md)
 - [OrderListOrdersByNumbersResponse](docs/OrderListOrdersByNumbersResponse.md)
 - [OrderListOrdersRequest](docs/OrderListOrdersRequest.md)
 - [OrderListOrdersResponse](docs/OrderListOrdersResponse.md)
 - [OrderListShipmentsRequest](docs/OrderListShipmentsRequest.md)
 - [OrderListShipmentsResponse](docs/OrderListShipmentsResponse.md)
 - [OrderLocalizedText](docs/OrderLocalizedText.md)
 - [OrderMoney](docs/OrderMoney.md)
 - [OrderOrderBy](docs/OrderOrderBy.md)
 - [OrderOrderData](docs/OrderOrderData.md)
 - [OrderOrderDataItem](docs/OrderOrderDataItem.md)
 - [OrderPayment](docs/OrderPayment.md)
 - [OrderPaymentAmount](docs/OrderPaymentAmount.md)
 - [OrderPaymentAmountCode](docs/OrderPaymentAmountCode.md)
 - [OrderPaymentFilter](docs/OrderPaymentFilter.md)
 - [OrderPaymentFilterCondition](docs/OrderPaymentFilterCondition.md)
 - [OrderPostalAddress](docs/OrderPostalAddress.md)
 - [OrderPrintOrdersLabelsRequest](docs/OrderPrintOrdersLabelsRequest.md)
 - [OrderPrintOrdersLabelsResponse](docs/OrderPrintOrdersLabelsResponse.md)
 - [OrderQuashFulfillmentRequest](docs/OrderQuashFulfillmentRequest.md)
 - [OrderQuashShipmentRequest](docs/OrderQuashShipmentRequest.md)
 - [OrderReceiveFulfillmentRequest](docs/OrderReceiveFulfillmentRequest.md)
 - [OrderRefund](docs/OrderRefund.md)
 - [OrderRefundAmount](docs/OrderRefundAmount.md)
 - [OrderRefundAmountCode](docs/OrderRefundAmountCode.md)
 - [OrderRefundItem](docs/OrderRefundItem.md)
 - [OrderRemoveDocumentByCodeRequest](docs/OrderRemoveDocumentByCodeRequest.md)
 - [OrderReportFulfillmentErrorRequest](docs/OrderReportFulfillmentErrorRequest.md)
 - [OrderReportFulfillmentNotResolvableRequest](docs/OrderReportFulfillmentNotResolvableRequest.md)
 - [OrderReportFulfillmentReadyRequest](docs/OrderReportFulfillmentReadyRequest.md)
 - [OrderReportShipmentDeliveryRequest](docs/OrderReportShipmentDeliveryRequest.md)
 - [OrderReportShipmentMissingStockRequest](docs/OrderReportShipmentMissingStockRequest.md)
 - [OrderResolveShipmentMissingStockRequest](docs/OrderResolveShipmentMissingStockRequest.md)
 - [OrderRetryFulfillmentRequest](docs/OrderRetryFulfillmentRequest.md)
 - [OrderSearchOrdersRequest](docs/OrderSearchOrdersRequest.md)
 - [OrderSearchOrdersResponse](docs/OrderSearchOrdersResponse.md)
 - [OrderSendFulfillmentRequest](docs/OrderSendFulfillmentRequest.md)
 - [OrderSendOrderNotificationRequest](docs/OrderSendOrderNotificationRequest.md)
 - [OrderShipment](docs/OrderShipment.md)
 - [OrderShipmentItem](docs/OrderShipmentItem.md)
 - [OrderStartFulfillmentProcessingRequest](docs/OrderStartFulfillmentProcessingRequest.md)
 - [OrderStartShipmentProcessingRequest](docs/OrderStartShipmentProcessingRequest.md)
 - [OrderStatusFilter](docs/OrderStatusFilter.md)
 - [OrderStatusFilterCondition](docs/OrderStatusFilterCondition.md)
 - [OrderTransaction](docs/OrderTransaction.md)
 - [OrderTransactionType](docs/OrderTransactionType.md)
 - [OrderUnholdOrderRequest](docs/OrderUnholdOrderRequest.md)
 - [OrderUpdateOrderRequest](docs/OrderUpdateOrderRequest.md)
 - [OrderUpdatePaymentRequest](docs/OrderUpdatePaymentRequest.md)
 - [PaymentCcInfo](docs/PaymentCcInfo.md)
 - [PrintOrdersLabelsResponseFailedOrder](docs/PrintOrdersLabelsResponseFailedOrder.md)
 - [ProductConfigurationStepOption](docs/ProductConfigurationStepOption.md)
 - [ProtobufAny](docs/ProtobufAny.md)
 - [ProtobufNullValue](docs/ProtobufNullValue.md)
 - [RpcStatus](docs/RpcStatus.md)
 - [ShipmentTracking](docs/ShipmentTracking.md)
 - [UpdateOrderRequestPayload](docs/UpdateOrderRequestPayload.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Authorization"></a>
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

<a id="standardAuthorization"></a>
### standardAuthorization

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@gemini-commerce.com


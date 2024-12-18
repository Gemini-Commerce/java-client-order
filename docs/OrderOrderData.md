# # OrderOrderData


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional] [readonly]
**updatedAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional] [readonly]
**id**| **String** |   | [optional] [readonly]
**grn**| **String** |   | [optional] [readonly]
**number**| **String** |   | [optional]
**status**| **String** |   | [optional] [readonly]
**channel**| **String** |   | [optional]
**market**| **String** |   | [optional]
**locale**| **String** |   |
**additionalInfo**| **Object** |   | [optional]
**documents**| [**List<OrderDataDocument>**](OrderDataDocument.md) |   | [optional] [default to new ArrayList<>()]
**items**| [**List<OrderOrderDataItem>**](OrderOrderDataItem.md) |   | [optional] [default to new ArrayList<>()]
**payments**| [**List<OrderPayment>**](OrderPayment.md) |   | [optional] [default to new ArrayList<>()]
**shipments**| [**List<OrderShipment>**](OrderShipment.md) |   | [optional] [default to new ArrayList<>()]
**paymentsInfo**| [**List<OrderDataPaymentInfo>**](OrderDataPaymentInfo.md) |   | [optional] [default to new ArrayList<>()]
**shipmentsInfo**| [**List<OrderDataShipmentInfo>**](OrderDataShipmentInfo.md) |   | [optional] [default to new ArrayList<>()]
**promotions**| [**List<OrderDataPromotionInfo>**](OrderDataPromotionInfo.md) |   | [optional] [default to new ArrayList<>()]
**currency**| [**OrderCurrency**](OrderCurrency.md) |  for more information please, see Model/OrderCurrency.php  | [optional] [default to OrderCurrency.XXX]
**subtotals**| [**Map<String, OrderDataSubtotal>**](OrderDataSubtotal.md) |   | [optional] [default to new HashMap<>()]
**totals**| [**Map<String, OrderDataTotal>**](OrderDataTotal.md) |   | [optional] [default to new HashMap<>()]
**vatIncluded**| **Boolean** |   | [optional]
**billingAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**shippingAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**customerInfo**| [**OrderDataCustomerInfo**](OrderDataCustomerInfo.md) |   | [optional]
**cartGrn**| **String** |   | [optional]
**onHold**| **Boolean** |   | [optional]
**historyEvents**| [**List<OrderDataHistory>**](OrderDataHistory.md) |   | [optional] [default to new ArrayList<>()]
**fulfillments**| [**List<OrderFulfillment>**](OrderFulfillment.md) |   | [optional] [readonly] [default to new ArrayList<>()]
**notes**| **String** |   | [optional]
**isDeleted**| **Boolean** | this field is used to delete an order in \&quot;soft-delete mode\&quot;. This field must be used from get/list endpoint to exclude these orders.  | [optional]
**insertedAt**| [**OffsetDateTime**](OffsetDateTime.md) | this field is used to save the original created_at order date. The created_at field is used to filter data.  | [optional] [readonly]
**deletedAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional] [readonly]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)


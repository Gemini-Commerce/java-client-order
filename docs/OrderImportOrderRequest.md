# # OrderImportOrderRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   | [optional]
**createdAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**number**| **String** |   | [optional]
**channel**| **String** |   | [optional]
**market**| **String** |   | [optional]
**locale**| **String** |   | [optional]
**customerInfo**| [**OrderDataCustomerInfo**](OrderDataCustomerInfo.md) |   | [optional]
**shippingAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**billingAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**payments**| [**List<ImportOrderRequestImportedPayment>**](ImportOrderRequestImportedPayment.md) |   | [optional]
**paymentsInfo**| [**List<OrderDataPaymentInfo>**](OrderDataPaymentInfo.md) |   | [optional]
**shipmentsInfo**| [**List<OrderDataShipmentInfo>**](OrderDataShipmentInfo.md) |   | [optional]
**items**| [**List<OrderOrderDataItem>**](OrderOrderDataItem.md) |   | [optional]
**subtotals**| [**Map<String, OrderDataSubtotal>**](OrderDataSubtotal.md) |   | [optional] [default to new HashMap<>()]
**totals**| [**Map<String, OrderDataTotal>**](OrderDataTotal.md) |   | [optional] [default to new HashMap<>()]
**status**| **String** |   | [optional]
**currency**| [**OrderCurrency**](OrderCurrency.md) |  for more information please, see Model/OrderCurrency.php  | [optional] [default to OrderCurrency.XXX]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)


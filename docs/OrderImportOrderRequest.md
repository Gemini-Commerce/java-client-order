# # OrderImportOrderRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   |
**createdAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional]
**number**| **String** |   |
**channel**| **String** |   | [optional]
**market**| **String** |   |
**locale**| **String** |   |
**customerInfo**| [**OrderDataCustomerInfo**](OrderDataCustomerInfo.md) |   |
**shippingAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   |
**billingAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   |
**payments**| [**List<ImportOrderRequestImportedPayment>**](ImportOrderRequestImportedPayment.md) |   | [default to new ArrayList<>()]
**paymentsInfo**| [**List<OrderDataPaymentInfo>**](OrderDataPaymentInfo.md) |   | [default to new ArrayList<>()]
**shipmentsInfo**| [**List<OrderDataShipmentInfo>**](OrderDataShipmentInfo.md) |   | [default to new ArrayList<>()]
**items**| [**List<OrderOrderDataItem>**](OrderOrderDataItem.md) |   | [default to new ArrayList<>()]
**subtotals**| [**Map<String, OrderDataSubtotal>**](OrderDataSubtotal.md) |   | [default to new HashMap<>()]
**totals**| [**Map<String, OrderDataTotal>**](OrderDataTotal.md) |   | [default to new HashMap<>()]
**status**| **String** |   |
**currency**| [**OrderCurrency**](OrderCurrency.md) |  for more information please, see Model/OrderCurrency.php  | [default to OrderCurrency.XXX]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)


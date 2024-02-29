# # OrderCreateOrderRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   | [optional]
**number**| **String** |   | [optional]
**channel**| **String** |   | [optional]
**market**| **String** |   | [optional]
**locale**| **String** |   | [optional]
**items**| [**List<OrderOrderDataItem>**](OrderOrderDataItem.md) |   | [optional]
**paymentsInfo**| [**List<OrderDataPaymentInfo>**](OrderDataPaymentInfo.md) |   | [optional]
**shipmentsInfo**| [**List<OrderDataShipmentInfo>**](OrderDataShipmentInfo.md) |   | [optional]
**promotions**| [**List<OrderDataPromotionInfo>**](OrderDataPromotionInfo.md) |   | [optional]
**payments**| [**List<CreateOrderRequestInitialPayment>**](CreateOrderRequestInitialPayment.md) |   | [optional]
**currency**| [**OrderCurrency**](OrderCurrency.md) |  for more information please, see Model/OrderCurrency.php  | [optional] [default to OrderCurrency.XXX]
**subtotals**| [**Map<String, OrderDataSubtotal>**](OrderDataSubtotal.md) |   | [optional] [default to new HashMap<>()]
**totals**| [**Map<String, OrderDataTotal>**](OrderDataTotal.md) |   | [optional] [default to new HashMap<>()]
**vatIncluded**| **Boolean** |   | [optional]
**billingAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**shippingAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**customerInfo**| [**OrderDataCustomerInfo**](OrderDataCustomerInfo.md) |   | [optional]
**cartGrn**| **String** |   | [optional]
**onHold**| **Boolean** |   | [optional]
**notes**| **String** |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)


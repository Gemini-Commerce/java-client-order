# # OrderCreateOrderRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   |
**number**| **String** |   |
**channel**| **String** |   | [optional]
**market**| **String** |   |
**locale**| **String** |   |
**items**| [**List<OrderOrderDataItem>**](OrderOrderDataItem.md) |   | [default to new ArrayList<>()]
**paymentsInfo**| [**List<OrderDataPaymentInfo>**](OrderDataPaymentInfo.md) |   | [optional] [default to new ArrayList<>()]
**shipmentsInfo**| [**List<OrderDataShipmentInfo>**](OrderDataShipmentInfo.md) |   | [optional] [default to new ArrayList<>()]
**promotions**| [**List<OrderDataPromotionInfo>**](OrderDataPromotionInfo.md) |   | [optional] [default to new ArrayList<>()]
**payments**| [**List<CreateOrderRequestInitialPayment>**](CreateOrderRequestInitialPayment.md) |   | [optional] [default to new ArrayList<>()]
**currency**| [**OrderCurrency**](OrderCurrency.md) |  for more information please, see Model/OrderCurrency.php  | [default to OrderCurrency.XXX]
**subtotals**| [**Map<String, OrderDataSubtotal>**](OrderDataSubtotal.md) |   | [default to new HashMap<>()]
**totals**| [**Map<String, OrderDataTotal>**](OrderDataTotal.md) |   | [default to new HashMap<>()]
**vatIncluded**| **Boolean** |   |
**billingAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   |
**shippingAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   |
**customerInfo**| [**OrderDataCustomerInfo**](OrderDataCustomerInfo.md) |   |
**cartGrn**| **String** |   | [optional]
**onHold**| **Boolean** |   | [optional]
**notes**| **String** |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)


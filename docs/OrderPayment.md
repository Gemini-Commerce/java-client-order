# # OrderPayment


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId**| **String** |   | [optional]
**id**| **String** |   | [optional]
**code**| **String** | payment type stripe, paypal..  | [optional]
**additionalInfo**| **String** |   | [optional]
**amounts**| [**List<OrderPaymentAmount>**](OrderPaymentAmount.md) |   | [optional] [default to new ArrayList<>()]
**ccInfo**| [**PaymentCcInfo**](PaymentCcInfo.md) |   | [optional]
**transactions**| [**List<OrderTransaction>**](OrderTransaction.md) |   | [optional] [default to new ArrayList<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)


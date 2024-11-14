# # OrderCreateShipmentRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   |
**orderId**| **String** |   |
**items**| [**List<OrderShipmentItem>**](OrderShipmentItem.md) |   | [default to new ArrayList<>()]
**address**| [**OrderPostalAddress**](OrderPostalAddress.md) |   |
**fromAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**returnAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**tracking**| [**List<ShipmentTracking>**](ShipmentTracking.md) |   | [optional] [default to new ArrayList<>()]
**returnTracking**| [**List<ShipmentTracking>**](ShipmentTracking.md) |   | [optional] [default to new ArrayList<>()]
**code**| **String** |   | [optional]
**method**| **String** |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)


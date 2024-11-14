# # OrderShipment


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional] [readonly]
**updatedAt**| [**OffsetDateTime**](OffsetDateTime.md) |   | [optional] [readonly]
**orderId**| **String** |   | [optional]
**id**| **String** |   | [optional]
**status**| **String** |   | [optional]
**items**| [**List<OrderShipmentItem>**](OrderShipmentItem.md) |   | [optional] [default to new ArrayList<>()]
**address**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**fromAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**returnAddress**| [**OrderPostalAddress**](OrderPostalAddress.md) |   | [optional]
**tracking**| [**List<ShipmentTracking>**](ShipmentTracking.md) |   | [optional] [default to new ArrayList<>()]
**returnTracking**| [**List<ShipmentTracking>**](ShipmentTracking.md) |   | [optional] [default to new ArrayList<>()]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)


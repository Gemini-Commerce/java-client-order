# # OrderListOrdersRequest


## Properties 


Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId**| **String** |   |
**pageSize**| **Long** | The maximum number of orders to return. The service may return fewer than this value. If unspecified, at most 10 orders will be returned. The maximum value is 100; values above 100 will be coerced to 100.  | [optional]
**pageToken**| **String** | A page token, received from a previous &#x60;ListOrders&#x60; call. Provide this to retrieve the subsequent page.   When paginating, all other parameters provided to &#x60;ListOrders&#x60; must match the call that provided the page token.  | [optional]
**orderBy**| [**List<OrderOrderBy>**](OrderOrderBy.md) |   | [optional]
**statusFilter**| [**OrderStatusFilter**](OrderStatusFilter.md) |   | [optional]


[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)


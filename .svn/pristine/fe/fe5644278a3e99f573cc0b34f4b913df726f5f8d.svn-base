---
Packing Lifecycle API

---

# PLC API I

> 该部分为API的元信息; 用以描述对象定义和schema
>

## JSON返回头
API请求返回的json固定格式

### schema

{
"result":0,
"data":{} // 可选
}

{
"result":-1,
"errmsg":"", // 可选
"errcode":"" // 可选
}


## ShippingsVw
运单号信息

### schema

```json
{
   "id":"123456", //运单唯一编号
   "shipDate":"yyyy-MM-dd HH:mm",//运单运输日期
   "vehicleId":"12345",//车辆唯一编号
   "fromId":"",//运输起始地点编号
   "toId":"",//运输目标地点编号
   "shipStatus": 0,//运单状态值; not start:0 ; ongoing:1 ; finished:2 ; canceled:3
   "createDate":"yyyy-MM-dd HH:mm",//创建日期
   "lastModify":"yyyy-MM-dd HH:mm",//最后修改日期
   "fromName":"",//运输起始地点名称
   "fromLatitude":"",//运输起始地点纬度
   "fromLongitude":"",//运输起始地点经度
   "fromCoordType" 0,//运输起始地点坐标系值 GCJ_02:0 ; BD_09:1; WGS84:2
   "fromLocationType": 0,//地点类型bosch factory:0; bosch warehouse:1; customer:5; supplier:8;
   "fromProvince":"",//起始地点所在省
   "fromCity":"",//起始地点所在市
   "fromAddress":"",//起始地点所在地址
   "toName":"",//目标地点名称
   "toLatitude":"",//目标地点纬度
   "toLongitude":"",//目标地点经度
   "toCoordType":0,//目标地点坐标系值
   "toLocationType":"",//目标地点类型
   "toProvince":"",//目标地点所在省
   "toCity":"",//目标地点所在市
   "toAddress":"",//目标地点所在地址
   "shipStatusName":"",//运单状态名称
   "shipStatusDesc":"",//运单状态描述
   "vehicleNo":"苏E23U53",//运输车辆车牌
   "vehicleCompany":"",//运输车辆所属公司
   "vehicleDriver":"",//运输车辆司机
   "vehicleType": 0//运输车辆类型 small:0; middle:1; larger:4;
}
```





## VehicleTrack

车辆轨迹信息

### schema

```json
{
  "vehicleId": 1234, 	   //车辆id
  "latitude" : "27.2334",  //纬度
  "longitude": "124.2213", //经度
  "coordType": 0, // 坐标系 GCJ_02:0 ; BD_09:1; WGS84:2
  "trackTime": "yyyy-MM-dd HH:mm"
}
```


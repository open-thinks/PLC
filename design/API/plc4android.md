---
Packing Lifecycle API

---

# PLC API II

> *API_URI*: API根路径URL
> 本地测试: http://localhost:8088/plcserver/
> 远程测试:暂定
>


## 运单API

###  /ships/list
列出所有的运单号，可以根据运单状态进行筛选列出

#### 请求地址

*API_URI*/ships/list[?status=0]

#### 请求类型

GET/POST

#### 请求参数
status : 运单状态值; 不传默认为 0,即列出所有未开始的运单
1. not start : 0
2. ongoing  : 1
3. finished  : 2
4. canceled   : 3
5. all : -1

#### 请求响应

```json
{
  "result":0,
  "data":[
    shipVw :: ShippingsVw //参见 ShippingsVw schema
  ]
}
```

sample

```json
{
  "result":0,
  "data":[
    {
      "id":"",
      "shipDate":"yyyy-MM-dd HH:mm",
      "vehicleId":"12345",
      "fromName":"",
      "fromLatitude":"",
      "fromLongitude":"",
      "toName":"",
      "toLatitude":"",
      "toLongitude":"",
      "shipStatus": 0,
      "shipStatusName":"",
      "vehicleNo":"苏E23U53"，
      "vehicleType": 0
    }
  ]
}
```



## 包装API

### /packings/outbound/{shipId}

包装出库并关联到相应的运单

#### 请求地址

*API_URI*/packings/outbound/*123456*

#### 请求类型

POST + JSON ( contentType: "application/json; charset=utf-8 )

#### 请求参数

请求体类型为application/json

请求体数据为JSON数组

```json
[
  {"id": 123456 }, // 包装唯一编号
  {"id": 234567 }
]
```

#### 请求响应

```json
{
  "result":0
}
//或者
{
  "result":-1,
  "errmsg":""
}
```



## 车辆轨迹API

### /vehicles/track

更新车辆轨迹信息

#### 请求地址

*API_URI*/vehicles/track

#### 请求类型

POST + JSON ( contentType: "application/json; charset=utf-8 )

#### 请求参数

请求体类型为application/json

请求体数据为JSON对象

```json
vehicleTrack :: VehicleTrack schema //参见 VehicleTrack schema
```

sample

```json
{
  "vehicleId": 1234, 	   //车辆id
  "latitude" : "27.2334",  //纬度
  "longitude": "124.2213", //经度
  "coordType": 0, // 坐标系 GCJ_02:0 ; BD_09:1; WGS84:2 ;不传默认为 0
}
// 或者
{
  "vehicleId": 1234, 	   //车辆id
  "latitude" : "27.2334",  //纬度
  "longitude": "124.2213" //经度
}

```



#### 请求响应

```json
{
  "result":0
}
//或者
{
  "result":-1,
  "errmsg":""
}
```

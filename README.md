# SmartFlightCheckInKiosk


## 2.1Check in

验证信息的方式有三种
passengers can get booking information in 3 ways:
1.booking number
2.surname and ID number
3.scan the ID document

After the successful retrieval, the system will show the summary of the booked flight passengers will then choose the seat and type of meal(through a series of screens)
last screen: ask to scan the ID document and confirm

## 2.2额外选项

座位档次选择及费用（选座，航空餐档次等） 不同档次会有不同的payment
支付界面（credit card信息输入）
确认界面（信息核对）

## 2.3 Boarding pass

（**Book**)=>{

**determine** the number of

 (1.carry-on baggages 2.check-in baggages)

  }

（**CheckIn**）=>{
**print**(

1. the boarding pass, 

2. a tag(to attached to the carry-on baggage), 

3. a ticket(上面带有放行李的drop-in-counter序号 )

)}

(这部分超过本项目范围**at the drop-in-counter**）=>{

1. check the weight of the baggages

2. pay extra charge of the baggages

   }

## 2.4 Passengers list 

把乘客消息可视化

1. After the closing time of ticket sales, arrange the passenger information according to the seat list and send it to the back-end system.
2. After the check-in is complete, it is automatically marked in the back-end list.
3. The passengers who have not completed check-in will be screened forward 15 minutes before the check-in stop to allow broadcast notifications.

## 2.5 Other requirements 

验错和取消
提示与帮助
易于添加新的选项/重命名

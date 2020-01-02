# 基于sofa-bolt通信，简易分布式服务实践
## 实现基本功能
    1.基于spring 
    2.消费者订阅
    3.消费端负载均衡器
    4.服务注册
    5.rpc 调用

## rpc实现
    1.基于sofa-bolt通信架框
    
## 消费者实现
    1.消费者注解
    2.扫描生成代理
    3.配置负载均衡器
    4.序列化参数，及服务提供者接口
    5.通过rpc框架调用服务端

## 提供者实现
    1.提供者注解
    2.扫描生成接代理
    3.收到消息并反序列化消息
    4.匹配服务提供都接口实现
    5.调用服务提代者接口

## 注册中心
    1.仅实现单机
    2.接收订阅者信息
    3.接收服务发布者信息
    4.服务连接断开，踢除服务
    
## 服务注册订单客户端
    1.向注中心发布服务端
    2.监听或获取订阅的服务信息
    
## 简易负载均衡器
    1.通过注册客户端监听服信息
    2.实现轮询负载均衡


## spring-boot 自动配置
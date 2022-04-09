# consul练习项目目录结构
1. consul-consumer 消费服务
2. consul-provider 服务提供者1
3. consul-provider2 服务提供者2

    **consul-consumer中使用了两种方式来访问其他服务**
    1. 使用restTemplate直接通过服务名访问
    2. 使用feign来访问其他服务

# 配置说明
```yml
spring:
  application:
    name: consul-provider # 应用名称
  # 配置 Consul 注册中心
  cloud:
    consul:
      # 注册中心的访问地址
      host: localhost
      port: 8500
      # 服务提供者信息
      discovery:
        register: true                                # 是否需要注册
        instance-id: ${spring.application.name}-02    # 注册实例 id（必须唯一）
        service-name: ${spring.application.name}      # 服务名称
#        port: ${server.port}                          # 服务端口
        prefer-ip-address: true                       # 是否使用 ip 地址注册
#        ip-address: ${spring.cloud.client.ip-address} # 服务请
```

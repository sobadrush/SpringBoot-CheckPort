# SpringBoot-HelloWorld
> 驗證防火牆用的服務

## cmd 動態指定 port
```bash
java -jar springboot-port.jar --server.port=${portNumber}
```

## 測試
```http request
GET http://localhost:${portNumber}/SpringBoot-CheckPort/helloController/sayHello
```
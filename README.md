# spring-boot-mybatis-mysql-test-demo
spring-boot-mybatis-mysql demo

使用SpringBoot，通过Mybatis连接Mysql数据库，并添加基础日志配置

[pom.xml](https://github.com/YuLaiZ/spring-boot-mybatis-mysql-test-demo/tree/master/pom.xml)引用依赖
- spring boot 1.5.9.RELEASE
- mybatis-spring-boot-starter 1.3.1
- mybatis-spring 1.3.1
- mybatis 3.4.5
- mysql-connector-java 5.1.45
- lombok 1.16.20

1. 修改[application.yml](https://github.com/YuLaiZ/spring-boot-mybatis-mysql-test-demo/tree/master/src/main/resources/application.yml)文件中的datasource连接信息
2. 修改[TestMapper.xml](https://github.com/YuLaiZ/spring-boot-mybatis-mysql-test-demo/tree/master/src/main/resources/mapper/TestMapper.xml)文件中的测试SQL语句
3. 启动[Application.java](https://github.com/YuLaiZ/spring-boot-mybatis-mysql-test-demo/blob/master/src/main/java/com/yulaiz/test/demo/web/Application.java)
4. 访问[http://localhost:8080/test-demo/](http://localhost:8080/test-demo/)开始测试

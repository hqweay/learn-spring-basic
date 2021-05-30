# learn-spring-framework

一个尝试为理解 Spring 提供些许帮助的 demo 项目，力求不混淆 Spring 体系下的一些概念。该项目主要涉及 IOC 及 AOP，在引入最小依赖的前提下通过控制变量，列举了 Spring 相关内容的一些用法。此外，该项目还试图提供一些 Spring 涉及到的相关思想的简易实现。

## TLDR;

提供了一些简易例子：

- [x] IOC
  - [x] 注入方式：Constructor 注入、Setter 注入、注解注入
  - [x] 自动扫描、自动扫描与注解注入关系
  - [x] 作用域：单例与多例
  - [x] Bean 的生命周期

- [x] springAOP
  - [x] 使用 Spring-AOP + Aspects 实现
  - [x] 使用纯 Spring-AOP 实现

- [x] myAOP
  - [x] 通过继承实现
  - [x] 通过 Java 动态代理实现


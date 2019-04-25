**v0.0.1(0.0.1-SNAPSHOT)**

更新内容：

1、初始化一个简单的spring boot项目。

2、增加Dockerfile将它build成镜像

```shell
$ cd src/main/docker
$ docker build -t [镜像名]:[标签名] .
```

3、运行镜像测试

```shell
$ docker run -d -p 8080:8080 dockerpenguin/docker-demo
```

浏览器访问127.0.0.1:8080/hello

**v1.0**

更新内容：

1、增加jpa模块，编写一个user查询的例子
2、增加init-data.sql文件，设置初始化数据
3、更新Dockerfile版本信息，build镜像
4、增加docker-compose.yml文件，增加一个mysql镜像作为web的数据源
5、运行镜像测试

```shell
$ cd src/main/docker
# 创建一个私有网络foo,该网络已经配置在docker-compose.yml的容器中
$ docker network create foo
# 启动容器组
$ docker-compose up -d
```

浏览器访问127.0.0.1:8080/getUser或127.0.0.1:8080/getUsers

```shell
# 停止并删除容器
$ docker-compose down
```


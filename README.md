本地仓库计算机的一个文件夹
自定义
maven中央仓库
http://repo1.maven.org/maven2/
    下载速度慢  配置国内仓库
    http://maven.aliyun.com/nexus/content/groups/public/
    http://maven.aliyun.com/mvn/view

本地仓库没有的时候去   maven中央仓库选择
定位jar包
https://mvnrepository.com/
统一版本管理
 <properties>
        <!-- spring版本 -->
        <spring.version>4.3.0.RELEASE</spring.version>
 </properties>
 子项目可能会用到的标签  在在项目引用值用aid   g id  版本号有父项目统一管理
 <dependencyManagement>
   <dependencies>

   </dependencies>
 </dependencyManagement>
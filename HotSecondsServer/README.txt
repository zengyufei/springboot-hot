
一键秒级远程热部署使用说明
****** HotSecondsServer端 ******
1.上传本包在服务器端，目录为$path1，配置JAVA_HOME，执行sh install.sh
2.hot-seconds-remote.xml复制到服务器端目录，目录为$path2,根据需要修改hot-seconds-remote.xml配置
3.添加jvm参数 -XXaltjvm=dcevm -javaagent:$path1/HotSecondsServer.jar=hotconf=$path2/hot-seconds-remote.xml
这里的$path1和$path2分别是1和2中的目录，请替换这两个目录


****** HotSecondsClient端 ******
IDEA的Plugin Marketplace搜索HotSecondsClient安装后即可使用
 

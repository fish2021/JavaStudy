## 1.git的安装

## 2.github的注册

## 3.git使用

### 		1.git的基本命令

​				配置git需要本地仓库来存放代码，比如在一个文件夹中鼠标右键使用git BASH初始化成git             仓库

```
git init
```

​         			

设置username 和  email

```
$ git config --global user.namae "名字"
$ git config --global user.email "邮箱"
```



### 		2.git向github提交代码

​          本地初始化ssh key

```
$ ssh-keygen -t rsa -C "your_email@youremail.com"
```

  会在默认位置生成密钥    直接点击回车确认（表示不设置密码）之后生成成功

打开 id_rsa.pub 复制里面的key    将这个密钥添加到github设置中的SSH Keys中



检验是否安装成功

```
$ ssh -T git@github.com
```



在github上创建一个空的仓库   然后在本地添加远程地址

```
$ git remote add origin git@github.com:github用户名/仓库名
```



先拉取新新创建的空仓库

```
$ git pull origin <远程分支名>:<本地分支名>
```

或者使用

```
$ git pull origin <远程分支名>
```

push操作

将本地分支推送到远程指定分支上

```
$ git push origin <本地分支名>:<远程分支名>
```

或者使用    当远程与本地分支名相同时

```
git push origin <本地分支名>
```


#简介
最近东西写的挺多的，这不又要弄一个类似于京东的地址选择器，然后刚开始我是不愿意自己去写的，这东西就是费时间，然后大致浏览了一会，发现真没有符合公司需求的，好吧，那就自己开撸。先看看效果图，不知道是不是大家想要的。然后京东是用在一个从下而上的弹窗里面的。
![这里写图片描述](http://img.blog.csdn.net/20170510182201975?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMjU4NjcxNDE=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

#主要功能
1.大致分为三个模块：顶部的Tab模块，中间的移动指示器模块，还有就是下面的list了。
2.支持点击数据后自动跳到下一个Tab
3.支持点击Tab后回到当前Tab的状态
4.还有就是可以随意设置你想要的。
还是来说说怎么用吧。
项目地址：[https://github.com/Blincheng/AddressSelector](https://github.com/Blincheng/AddressSelector)
#集成导入（gradle）
1.Add the JitPack repository to your build file .Add it in your root build.gradle at the end of repositories:

```
allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
```
2.Add the dependency

```
dependencies {
            compile 'com.github.Blincheng:AddressSelector:v1.0.3'
    }
```
其余继承方式看：[https://jitpack.io/#Blincheng/AddressSelector](https://jitpack.io/#Blincheng/AddressSelector)
#使用
##XML直接使用

```
<com.yiguo.adressselectorlib.AddressSelector
        android:id="@+id/address"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    </com.yiguo.adressselectorlib.AddressSelector>
```
##Java中使用

```
AddressSelector addressSelector = (AddressSelector) findViewById(R.id.address);
```
##设置Tab数量

```
addressSelector.setTabAmount(3);
```
也可以不设置，默认3级。
##设置数据列表的Itme回调OnItemClickListener

```
addressSelector.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void itemClick(AddressSelector addressSelector, CityInterface city, int tabPosition) {

            }
        });
```
##设置Tab的点击事件回调OnTabSelectedListener

```
addressSelector.setOnTabSelectedListener(new AddressSelector.OnTabSelectedListener() {
            @Override
            public void onTabSelected(AddressSelector addressSelector, AddressSelector.Tab tab) {

            }

            @Override
            public void onTabReselected(AddressSelector addressSelector, AddressSelector.Tab tab) {

            }
        });
```
注意，一般来说这两个点击事件都要设置，并且数据的处理一定要搞清楚。
##其他的一些属性的设置
![这里写图片描述](http://img.blog.csdn.net/20170510183423862?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMjU4NjcxNDE=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)


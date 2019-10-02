[![](https://jitpack.io/v/zmide/ModifiableShadowCardView.svg)](https://jitpack.io/#zmide/ModifiableShadowCardView)

# 导入
## Method1
### Step1. Add it in your root build.gradle at the end of repositories:

	  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		} 
      }

### Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.zmide:ModifiableShadowCardView:1.0'
	}

## Method2
### Download the lib package and import it.

```
	api project(':ModifiableShadowCardView')
```

----

# 使用
## 布局
```
		<com.zmide.ms.CardView
		android:layout_width="200dp"
		android:layout_height="100dp"
		android:id="@+id/CardView"
		app:cardElevation="8dp"
		app:cardCornerRadius="15dp"
		app:shadowColor="#802196f3"
		app:cardBackgroundColor="#2196f3"/>
```

## 属性
* #### shadowColor:阴影颜色
* #### cardElevation:卡片高度 
* #### cardBackgroundColor:卡片颜色
* #### cardCornerRadius:卡片圆角
* #### cardMaxElevation:最大高度
#### For other attributes, please refer to the official document about CardView.
#### 更多属性参照CardView属性
### 方法体
 #### void setShadowColor(int startColor, int endColor)
##### 设置阴影颜色:渐变起始色，渐变结束色。起始色为属性中的阴影颜色，结束色为阴影边缘的颜色，默认为0x03000000
 #### int getShadowStartColor()
##### 获取起始色
 ####	int getShadowEndColor()
##### 获取结束色

 ## 阴影与背景颜色搭配建议
 #### 建议阴影颜色的透明度为80(16进制)，例:卡片背景颜色为#FF2196f3 则阴影颜色建议为#802196f3

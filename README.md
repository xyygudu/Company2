# Canpany2 #
## 接口类Leader和Menber ##
Leader接口主要是针对接待外宾和领导而创建的，里面的方法如下：
```java

	public interface Leader {
		public float giftPrice();
		public float eat();
		public float live();
		public float wallk();

```
定义了吃柱行和礼物四个方法，对于Menber只定义了吃住行三个方法，主要用于对老师，家长，学生
## 对接口的实现 ##
以Parents为例：在初始化对象时需要设置家长来自哪里，要去什么地方，对出接口的实现就是计算一下吃穿住行的花费，为简单起见，这里直接设置好了花费，不需要用户输入
```java

	@Override
	public float eat() {
		// TODO Auto-generated method stub
		float priceofeat=30;	
		return priceofeat;
	}

	@Override
	public float live() {
		// TODO Auto-generated method stub
		float priceoflive=100;
		return priceoflive;
	}

	@Override
	public float wallk() {
		// TODO Auto-generated method stub
		float priceofwallk=30;
		return 0;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
```
## 主控制类 ##
同样以Parents为例，输入家长入住天数，如下程序计算出家长总消费
```java

		Parents parents=new Parents();
		System.out.println("请输入家长要住的天数：");
		Scanner in=new Scanner(System.in);
		int days=in.nextInt();
		float pPriceOfoneDay=0;//家长总消费
		for(;days>0;days--) {
			pPriceOfoneDay+=parents.eat()+parents.live()+parents.wallk();
		}		
		parents.setPrice(pPriceOfoneDay);
		totalprice+=pPriceOfoneDay;
		System.out.println("家长这几天总过花费："+parents.getPrice());
```
运行结果如下：
![](https://i.imgur.com/BwNGeBT.png)


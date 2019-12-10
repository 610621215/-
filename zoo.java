package a413512;


public class zoo{//內部的抽象類別不能放這，因為尚未此為內部interface故在函數建立前則沒有該介面。
//抽象類別用意的解釋：https://www.mobile01.com/topicdetail.php?f=512&t=2971459
	static int zz=30;
	static class category extends dog{	
		public static void issue1() {
			profile();
			System.out.println(dog.name);
			System.out.println(dog.weight);
			System.out.println(name);//記得加上public 設定為共用
			System.out.println(weight);
			name="George";//可以直接修改附類別;
			weight=45;
			System.out.println(dog.name);
			System.out.println(dog.weight);
		}
	}
	public class mc extends 第二天王{
		public void issue2() {
			super.num=0;
			System.out.println(super.num+"");
			
		}
		
		
	}
	public class mc2 implements 第三天王{
	
		@Override
		public void origin() {
			// TODO Auto-generated method stub
			System.out.println("介面1");
		}

		@Override
		public void first_pokemon() {
			// TODO Auto-generated method stub			
					System.out.println("第一隻神奇寶貝");
		}
		
	}
	
	public interface 第三天王{
		
		public void origin();
		public void first_pokemon();//抽象類別裡面是不會打成{}的,出現大括號就是方法了
		
		
	}
	
	class 第四天王{
		Ballz b;
		public 第四天王(Ballz b) {
			this.b=b;
		
		}
		public void show() {
			b.getName();
			System.out.println(b.getName());
			
		}
	}
	public static void main(String[] args) {
		//內部類別與繼承
		category.issue1();
		zoo z=new zoo();
		//內部類別的建立
		mc m=z.new mc();//內部類別的宣告建立
		m.issue2();
		/*錯誤訊息
		 * No enclosing instance of type zoo is accessible. Must qualify the allocation with an enclosing instance of type zoo
		 */
		//雙重回傳
		Object[] chris=doublereturn();
		int re1=(int)chris[0];
		String re2=(String)chris[1];
		System.out.println("雙重回傳"+"\t"+re1+"\t"+re2);
		//抽象類別的實作
		mc2 mc2=z.new mc2();
		mc2.origin();
		mc2.first_pokemon();
		class minitest implements Ballz{

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "球";
			}
			
			
		}
		第四天王 四=z.new 第四天王(new minitest());
		四.show();
		//封裝
		
	}
	
	public static Object[] doublereturn() {
		Object[] ob=new Object[2];
		ob[0]=1;
		ob[1]="2";
		return ob;
	}
	
}

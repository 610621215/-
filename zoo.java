package a413512;


public class zoo{//��������H���O�����o�A�]���|����������interface�G�b��ƫإ߫e�h�S���Ӥ����C
//��H���O�ηN�������Ghttps://www.mobile01.com/topicdetail.php?f=512&t=2971459
	static int zz=30;
	static class category extends dog{	
		public static void issue1() {
			profile();
			System.out.println(dog.name);
			System.out.println(dog.weight);
			System.out.println(name);//�O�o�[�Wpublic �]�w���@��
			System.out.println(weight);
			name="George";//�i�H�����ק�����O;
			weight=45;
			System.out.println(dog.name);
			System.out.println(dog.weight);
		}
	}
	public class mc extends �ĤG�Ѥ�{
		public void issue2() {
			super.num=0;
			System.out.println(super.num+"");
			
		}
		
		
	}
	public class mc2 implements �ĤT�Ѥ�{
	
		@Override
		public void origin() {
			// TODO Auto-generated method stub
			System.out.println("����1");
		}

		@Override
		public void first_pokemon() {
			// TODO Auto-generated method stub			
					System.out.println("�Ĥ@�����_�_��");
		}
		
	}
	
	public interface �ĤT�Ѥ�{
		
		public void origin();
		public void first_pokemon();//��H���O�̭��O���|����{}��,�X�{�j�A���N�O��k�F
		
		
	}
	
	class �ĥ|�Ѥ�{
		Ballz b;
		public �ĥ|�Ѥ�(Ballz b) {
			this.b=b;
		
		}
		public void show() {
			b.getName();
			System.out.println(b.getName());
			
		}
	}
	public static void main(String[] args) {
		//�������O�P�~��
		category.issue1();
		zoo z=new zoo();
		//�������O���إ�
		mc m=z.new mc();//�������O���ŧi�إ�
		m.issue2();
		/*���~�T��
		 * No enclosing instance of type zoo is accessible. Must qualify the allocation with an enclosing instance of type zoo
		 */
		//�����^��
		Object[] chris=doublereturn();
		int re1=(int)chris[0];
		String re2=(String)chris[1];
		System.out.println("�����^��"+"\t"+re1+"\t"+re2);
		//��H���O����@
		mc2 mc2=z.new mc2();
		mc2.origin();
		mc2.first_pokemon();
		class minitest implements Ballz{

			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "�y";
			}
			
			
		}
		�ĥ|�Ѥ� �|=z.new �ĥ|�Ѥ�(new minitest());
		�|.show();
		//�ʸ�
		
	}
	
	public static Object[] doublereturn() {
		Object[] ob=new Object[2];
		ob[0]=1;
		ob[1]="2";
		return ob;
	}
	
}

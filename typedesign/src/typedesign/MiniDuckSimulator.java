package typedesign;
/* 1.�ҳ�Ӧ���п�����Ҫ�仯֮���������Ƕ�����������Ҫ����Щ����Ҫ�仯�Ĵ������һ��
 * 2.��Խӿڱ�̣����������ʵ�ֱ��
 * 3.������ϣ����ü̳�
 * 
 * 
 * */
public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		
		Duck model = new ModelDuck();
		model.performQuack();
		model.setQuackBehavior(new FlyRocketQuack());
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
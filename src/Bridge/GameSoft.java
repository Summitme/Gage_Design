package Bridge;

/**
 * @author MiaoGuozhu
 * @describtion 游戏软件类
 * ConcreteImplementor（具体实现类）：具体实现Implementor接口，在不同的ConcreteImplementor中提供基本操作的不同实现，
 * 在程序运行时，ConcreteImplementor对象将替换其父类对象，提供给抽象类具体的业务操作方法。
 * @date 2019/5/17 15:29
 */
public class GameSoft implements Soft {
	@Override
	public void run() {
		System.out.println("运行游戏软件");
	}
}

package abstraction;

public abstract class abstrct_two_parent {
	public abstract void disp();
	public void nomalmthd()
	{
		System.out.println("normal mthd");
	}
	public abstrct_two_parent()
	{
		System.out.println("hiii parent constr");
	}
	public abstrct_two_parent(String name)
	{
		System.out.println("parametrised parent cons");
	}

}

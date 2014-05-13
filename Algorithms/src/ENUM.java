public class ENUM
{
	public enum Direction { Instance};

	public static void main(String[] args)
	{
		Direction d = Direction.Instance;
		System.out.println(d);
	}
}
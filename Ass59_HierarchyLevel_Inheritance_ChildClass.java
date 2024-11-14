package Java_programs;

public class Ass59_HierarchyLevel_Inheritance_ChildClass extends Ass59_HierarchyLevel_Inheritance_ParentClass
{


	public static void static_method1_ChildClass()
	{
		System.out.println("static_method1_ChildClass");
	}
	public void non_static_method1_ChildClass()
	{
		System.out.println("static_method1_ChildClass");
	}
	public static void main(String[] args) 
	{
		static_method1_ChildClass();
		static_method1_ParentClass();
		Ass59_HierarchyLevel_Inheritance_ChildClass obj1=new Ass59_HierarchyLevel_Inheritance_ChildClass();
		obj1.non_static_method1_ChildClass();
		obj1.non_static_method1_ParentClass();

	}
}

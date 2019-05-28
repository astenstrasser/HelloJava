//learning Java Polymorphism!
public class TestingReferences {

	public static void main(String[] args) {

		Manager m1 = new Manager();
		m1.setName("Carol Dickens");
		String m1Name = m1.getName();
		System.out.println(m1Name);
		m1.setSalary(5000);

//		we could have done: 
//		Employee m1 = new Manager();
//		this way, our m1 would not be a Manager, but a generic employee.
//		the other way, it would not work. Manager m1 = new Employee();
//		A manager is an employee, but an employee is not a manager.
//		One object can never change its classes. Only the reference can be changed.

		Employee e1 = new Employee();
		e1.setSalary(2000.00);

		VideoEditor vE = new VideoEditor();
		vE.setSalary(3500.00);

		BonusControl controller = new BonusControl();
		controller.register(m1);
		controller.register(e1);
		controller.register(vE);

		System.out.println(controller.getSum());

	}

}

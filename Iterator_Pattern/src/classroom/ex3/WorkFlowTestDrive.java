package classroom.ex3;

public class WorkFlowTestDrive {

	public static void main(String[] args) {
		WorkflowComponent t1 = new Task("Lập Trình nâng cao");
		WorkflowComponent t2 = new Task("Thiết kế hướng đối tượng");

		WorkflowComponent tg1 = new TaskGroup("Công nghệ thông tin");
		tg1.add(t1);
		tg1.add(t2);

		tg1.execute();

		WorkflowComponent tg2 = new TaskGroup("Đại học nông lâm");
		tg2.add(tg1);

		tg2.execute();
	}
}

	package task2;


public class Agent {
	private AgentProgram program;
	private int point =0;
	public Agent() {
	}

	public Agent(AgentProgram aProgram) {
		program = aProgram;
	}

	public Action execute(Percept p) {
		if (program != null) {
			return program.execute(p);
		}
		return NoOpAction.NO_OP;
	}
	public void suck() {
		point += 500;
	}
	public void cantMove() {
		point -=100;
	}
	public void otherAction() {
		point -= 10;
	}
	public int getPoint() {
		return this.point;
	}
}

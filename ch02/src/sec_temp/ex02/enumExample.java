package sec_temp.ex02;

public class enumExample {

	public enum state {
		idle, walk, run, attack, die
	}

	public static void main(String[] args) {
		state _state = state.idle;
		
		System.out.println(_state);
	}

}

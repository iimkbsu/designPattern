package behavior.interpreter;

public interface Expression {
	boolean parse(Context context);
	boolean run();
}

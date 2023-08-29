package behavior.command;

import java.util.ArrayList;

//배치(Batch)작업 : 일일이 순서대로 작업하는 것이 아니라 한 번에 모아서 작업함
public class CommandGroup implements Command {
	
	private ArrayList<Command> commands = new ArrayList<>();
	
	public void add(Command command) {
		commands.add(command);	
	}

	@Override
	public void run() {
		int cntCommand = commands.size();
		for(int i=0; i<cntCommand; i++) {
			Command command = commands.get(i);
			command.run();
		}
		
	}
	
	
}

package CoreJavaLab2;

public class CommandPattern {
	public static void main(String[] args) {
		Tv tv=new Tv();
		SettopBox settopbox=new SettopBox();
		SoundSystem soundsystem =new SoundSystem();
		Netflix netflix=new Netflix();
		FatherNewsChannel fnsc=new FatherNewsChannel(tv, settopbox, soundsystem, netflix);
		MotherSeriesNetflix msnf=new MotherSeriesNetflix(tv, settopbox, soundsystem, netflix);
        FatherCricketWatching fctW=new FatherCricketWatching(tv, settopbox, soundsystem, netflix);
        Remote universalRemote=new Remote();
        universalRemote.executeCommand(4);
        universalRemote.setCommand(fnsc, 0);
        universalRemote.setCommand(msnf, 1);
        universalRemote.setCommand(fctW, 2);
        
        System.out.println("My Father Wants to see news Channel");
        universalRemote.executeCommand(0);
        System.out.println("\n\n");
        System.out.println("My mother Wants to see a Series in NetFlix");
        universalRemote.executeCommand(1);
        System.out.println("\n\n");
        System.out.println("My Father Wants to see a CricketMatch");
        universalRemote.executeCommand(2);



}
}
class Tv{
	public void SwitchOn() {
		System.out.println("Switched On the Tv");
	}
	public void av() {
		System.out.println("Switched to the av");
	}
	public void SwitchOff() {
		System.out.println("Switched Off the Tv");
	}
}
class SettopBox{
	public void newsChannel() {
		System.out.println("Change the channel to NewsChannel");
	}
	public void cricketMatch() {
		System.out.println("Change the channel to CricketMatch");
	}
}
class Netflix{
	public void series() {
		System.out.println("Watching Series");
	}
}
class SoundSystem{
	public void lowVolume() {
		System.out.println("Decrease the volume");
	}
	public void highVolume() {
		System.out.println("Increase the volume");
	}
}
interface Command{
	public void execute();
}
class FatherNewsChannel implements Command{
	Tv tv;SettopBox settopbox;SoundSystem soundsystem;Netflix netflix;
	
	public FatherNewsChannel(Tv tv, SettopBox settopbox, SoundSystem soundsystem, Netflix netflix) {
		this.tv = tv;
		this.settopbox = settopbox;
		this.soundsystem = soundsystem;
		this.netflix = netflix;
	}

	@Override
	public void execute() {
        System.out.println("Father started Watching Tv");
        tv.SwitchOn();
        tv.av();
        settopbox.newsChannel();
        soundsystem.lowVolume();
        System.out.println("Father is Enjoy now by Watching news Channel");
	}
}
class MotherSeriesNetflix implements Command{
Tv tv;SettopBox settopbox;SoundSystem soundsystem;Netflix netflix;
	
	public MotherSeriesNetflix(Tv tv, SettopBox settopbox, SoundSystem soundsystem, Netflix netflix) {
		this.tv = tv;
		this.settopbox = settopbox;
		this.soundsystem = soundsystem;
		this.netflix = netflix;
	}
	@Override
	public void execute() {
		tv.SwitchOn();
		tv.av();
		netflix.series();
		soundsystem.highVolume();
		System.out.println("Mother is enjoying by Watching a Series in Netflix Through Tv");
		tv.SwitchOff();
	}
}
class FatherCricketWatching implements Command{
Tv tv;SettopBox settopbox;SoundSystem soundsystem;Netflix netflix;
	
	public FatherCricketWatching(Tv tv, SettopBox settopbox, SoundSystem soundsystem, Netflix netflix) {
		this.tv = tv;
		this.settopbox = settopbox;
		this.soundsystem = soundsystem;
		this.netflix = netflix;
	}
	@Override
	public void execute() {
     tv.SwitchOn();
     tv.av();
     settopbox.cricketMatch();
     soundsystem.lowVolume();
     System.out.println("Father love to watch cricketMatch");
     tv.SwitchOff();
		
	}
}
class DummyCommand implements Command{
	@Override
	public void execute() {
		System.out.println("It is a Dummy Command..");
		
	}
}
class Remote {
	Command command[]=new Command[5];
	public Remote(){
		for(int i=0;i<command.length;i++) {
			command[i]=new DummyCommand();
		}
	}
	public void setCommand(Command command,int slot) {
		this.command[slot]=command;
	}
	public void executeCommand(int slot) {
		command[slot].execute();
	}
}

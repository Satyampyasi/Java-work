package Stream_API;
import java.util.ArrayList;
import java.util.List;

record   Player( Integer id,String name){}

public class Distinct_demo {

	public static void main(String[] args) {
		createPlayerList().stream()
		   .map( player->player.name().toUpperCase())
		      .distinct()
		        .forEach(System.out::println);
		

	}
	public static List<Player> createPlayerList(){ 
	List<Player> p1 = new ArrayList<>();
	p1.add(new Player( 18,"virat"));
	p1.add(new Player(45,"Rohit"));
	p1.add(new Player(7,"Dhoni"));
	p1.add(new Player(18,"virat"));
	p1.add(new Player(90,"Bumra"));
	p1.add(new Player( 67, "hardil"));
	
		
		return p1;
	} 
}

import java.util.HashMap;
import java.util.Set;

public class TrackList{
    public void getPlaylist(){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Map of the Problematique", "[" + "I can't get it right, get it right, since I met you..." + "]");
        trackList.put("Newborn", "[" + "Link it to the World, link it to yourself, stretch it like a birth squeeze ..." + "]");
        trackList.put("Knights of Cydonia", "["+ "No one's going to take me alive, you and I must fight for our rights..." + "]");
        trackList.put("Starlight", "[" + "Our hopes and expectations, blackholes and revelations..." + "]");

        String name = trackList.get("Newborn");
        System.out.println("The song is: " + name);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }

    }
}
import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args){
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("All Along The Watchtower","There must be some kind of way outta here Said the joker to the thief There's too much confusion I can't get no relief Business men, they drink my wine");
    trackList.put("Little Wing", "Well, she's walking through the clouds With a circus mind, That's running wild. Butterflies and zebras and moonbeams And fairy-tales, That's all she ever thinks about ...");
    trackList.put("Purple Haze", "Purple Haze was in my brain, lately thing don't seem the same, actin' funny but I don't know why 'Scuse me while I kiss the sky.");
    trackList.put("Red House", "There's a red house over yonder, that's where my baby stays. There's a red house over yonder, baby, that's where my baby stays. Well, I ain't been home to see my baby in about ninety nine and one half days, 'bout time I see her.");
    String song = trackList.get("All Along The Watchtower");
    System.out.println(song);
    System.out.println("***************");

    Set<String> lyrics = trackList.keySet();
    for(String track : lyrics){
        System.out.println(track);
        System.out.println("***************");
        System.out.println(trackList.get(track));
        }
    }
}
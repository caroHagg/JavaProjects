import java.util.ArrayList;

class Playlist {
  
    public static void Shuffle(){
        System.out.println("here");
         }
  
  public static void main(String[] args) {


    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("TQG -Karol G and Shakira");
    desertIslandPlaylist.add("La Bachata -Manuel Turizo");
    desertIslandPlaylist.add("Efecto -Bad Bunny");
    desertIslandPlaylist.add("Beso -Rosalia");
    desertIslandPlaylist.add("Telepatia -Kali Uchis");
    desertIslandPlaylist.add("Acrostico -Shakira");
    if(desertIslandPlaylist.size() > 5){
      desertIslandPlaylist.remove("La Bachata -Manuel Turizo");
    }
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    int songA = desertIslandPlaylist.indexOf("Efecto -Bad Bunny");
    int songB = desertIslandPlaylist.indexOf("TQG -Karol G and Shakira");
    String tempA = desertIslandPlaylist.get(songA);
    String tempB = desertIslandPlaylist.get(songB);
    desertIslandPlaylist.set(songB,tempA);
    desertIslandPlaylist.set(songA, tempB);
     System.out.println(desertIslandPlaylist);

     Shuffle();

}
}
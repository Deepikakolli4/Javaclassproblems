public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,7};
        int highestAltitude = findHighestAltitude(gain);
        System.out.println(highestAltitude);
    }
    public static int findHighestAltitude(int[] gain){
        int maxAltitude=0;
        int currentAltitude=0;
        for(int i =0 ;i<gain.length;i++){
            currentAltitude=currentAltitude+gain[i];
            maxAltitude=Math.max(currentAltitude,maxAltitude);
        }
        return maxAltitude;
    }
}

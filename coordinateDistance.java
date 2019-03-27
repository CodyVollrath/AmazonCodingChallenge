    //Coding Challenge
    /*
    Array of tuples (2 items each). [[x,y],[x,y],[x,y]]
    These tuples represent coordinates in a graph. 
    Origin is 0. Of course

    Given a set of points. How would I find the K closest points to the origin? 
    hint use - Math...

    Optimizations that can be made: Only calculate relative distance, not actual distance. AKA: Remove sqrts
    */
    import java.util.concurrent.TimeUnit;
    import java.lang.Math.*;
    import java.util.ArrayList;
    import java.util.*;
    public class coordinateDistance{
        public static void findDistance(int[][] data){
            ArrayList<Double> distanceVectors = new ArrayList<Double>();

            for(int i = 0; i < data.length;i++){
                Double r = (Math.sqrt((data[i][0])*(data[i][0])+(data[i][1]) * (data[i][1])));
                Double roundR = ((int)Math.round(r * 100.0)/100.0);
                distanceVectors.add(roundR);   
            }
            mapDistanceToCords(data,distanceVectors);
        }

        public static void mapDistanceToCords(int[][] data,ArrayList<Double> distanceV) {
            HashMap<String, Double> dataShelf = new HashMap<String, Double>();
            String dataKey;
            for(int i = 0; i < distanceV.size();i++){
                dataKey = "("+data[i][0] + "," + data[i][1]+")";
                dataShelf.put(dataKey,distanceV.get(i));
            }
            System.out.print("These cordinates are the shortest distance from the origin: ");
            getKeyFromValue(dataShelf, distanceV);
        }

        public static void getKeyFromValue(HashMap hm, ArrayList<Double> distanceV){
            Collections.sort(distanceV);
            for(Object i : hm.keySet()){
                if (hm.get(i).equals(distanceV.get(0))){
                    String key = i.toString();
                    System.out.println("{" + key + "}, ");
                }
            }
        }
}
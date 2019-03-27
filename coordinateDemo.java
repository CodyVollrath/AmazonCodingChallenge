import java.util.Scanner;
public class coordinateDemo{
    public static void main(String[] args){
        coordinateDistance distance = new coordinateDistance();
        int[][] data = {{3,4},{-2,4}, {2,8}, {4,6}, {5,5}, {4,4},{9,4}, {-1,8}, {-6,6}, {-1,1}, {1,1}};
        distance.findDistance(data);
    }
}
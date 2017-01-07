import java.util.*;
import java.lang.*;
import java.util.Arrays;


public class DirReduction{
    public static void main(String[] args) {
        String[] test1 = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println("test 1:");
        System.out.println(Arrays.toString(reduceDirections(test1)));

        String[] test2 = {"NORTH", "NORTH", "NORTH", "SOUTH", "EAST", "EAST", "WEST"};
        System.out.println("Test 2: ");
        System.out.println(Arrays.toString(reduceDirections(test2)));

    }

    public static String[] reduceDirections(String[] directions){
        List<String> reduced_list = new ArrayList<String>();
        int[] final_coords = {0,0};
        for(int i = 0 ; i < directions.length ; i++){
            move(final_coords, directions[i]);
        }

        int[] temp_coords = {0,0};
        for(int i = 0 ; i < directions.length ; i++){
            if(directions[i] == "NORTH" && temp_coords[0] + 1 <= final_coords[0]){
                move(temp_coords, directions[i]);
                reduced_list.add(directions[i]);
            }else if(directions[i] == "SOUTH" && temp_coords[0] - 1 >= final_coords[0]){
                move(temp_coords, directions[i]);
                reduced_list.add(directions[i]);
            }else if(directions[i] == "EAST" && temp_coords[1] + 1 <= final_coords[1]){
                move(temp_coords, directions[i]);
                reduced_list.add(directions[i]);
            }else if(directions[i] == "WEST" && temp_coords[1] - 1 >= final_coords[1]){
                move(temp_coords, directions[i]);
                reduced_list.add(directions[i]);
            }
        }
        String[] reduced_array = new String[reduced_list.size()];
        for(int i = 0 ; i < reduced_list.size() ; i++){
            reduced_array[i] = reduced_list.get(i);
        }

        return reduced_array;

    }

    public static void move(int[] coords, String movement){
        if(movement == "NORTH"){
            coords[0]++;
        }else if(movement == "SOUTH"){
            coords[0]--;
        }else if(movement == "EAST"){
            coords[1]++;
        }else if(movement == "WEST"){
            coords[1]--;
        }
    }
}

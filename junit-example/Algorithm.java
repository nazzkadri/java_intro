import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Algorithm {

    public void getGroups(String[] cohorts, int gn) {
        List<String> list = new ArrayList<String>(Arrays.asList(cohorts));
        Collections.shuffle(list);
        list.toArray(cohorts);
        System.out.println(list);
        System.out.println(Arrays.toString(cohorts));

        int size = cohorts.length;

        int groupsize = (size / gn);
        System.out.println(groupsize);

        int remainder = size % gn;
        System.out.println(remainder);

        int groups[] = new int[gn];
        groups[0] = groupsize;
        groups[1] = groupsize;
        groups[2] = groupsize;

        if (remainder >1) {
            for(int i = 0; i< remainder; i++){
                groups[i] += 1;
            }

        }
        else{
            groups[groups.length - 1] += 1;
        }

        System.out.println(Arrays.toString(groups));
        int randomStartPoint = 8;

        String[] firstArray = Arrays.copyOfRange(cohorts,randomStartPoint,cohorts.length);
        System.out.println(Arrays.toString(firstArray));

        String[] secondArray = Arrays.copyOfRange(cohorts,0,randomStartPoint);
        System.out.println(Arrays.toString(secondArray));

       // String[] result = Stream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray)).toArray(String[]::new);
        String[] result = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, secondArray.length);
        System.out.println(Arrays.toString(result));

        String[] group1 = new String[groups[0]];
        String[] group2 = new String[groups[1]];
        String[] group3 = new String[groups[2]];


        group1 = Arrays.copyOfRange(result,0,groups[0]);
        group2 = Arrays.copyOfRange(result,groups[0], groups[0]+groups[1]);
        group3 = Arrays.copyOfRange(result,groups[0]+groups[1], result.length);

        System.out.println(Arrays.toString(group1));
        System.out.println(Arrays.toString(group2));
        System.out.println(Arrays.toString(group3));


//        for(int j=0; j<groups.length; j++){
//           for(int k=0; k<groups[j]; k++){
//
//           }
//            System.out.println(Arrays.toString(group1));
//        }

    }
//            System.out.println(Arrays.toString(group2));
//                    System.out.println(Arrays.toString(group3));





    public static void main(String args[]){

        String[] cohorts = {"Nazz",
                "Freya",
                "Shweta",
                "Patrick",
                "Vu",
                "Chloe",
                "Amy",
                "Alex",
                "Din",
                "Damion",
                "Robbie",
                "Ruaridhi",
                "Victor",
                "Nathan",
                "Ibs",
                "Sebastian"
        };

        Algorithm testObj = new Algorithm();
        testObj.getGroups(cohorts, 3);

    }


}
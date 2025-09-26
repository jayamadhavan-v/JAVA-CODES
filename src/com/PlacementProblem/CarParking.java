package com.PlacementProblem;

import java.util.*;
public class CarParking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int occSpace = sc.nextInt();
        sc.nextLine();

        String carNo = sc.nextLine();
        String[] array1 = carNo.split(" ");
        ArrayList<String> carlist = new ArrayList<>(Arrays.asList(array1));

        int totalSpace = sc.nextInt();
        sc.nextLine();
        int q = sc.nextInt();
        sc.nextLine();
        int[] query = new int[q];

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < q; i++) {
            String input = sc.nextLine();
            String[] arr = input.split(" ");
            int key = Integer.parseInt(arr[0].trim());
            query[i] = key;
            map.put(i, arr[1].trim());
        }
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//    }

        int j = 0;
        while (j < q) {
            int availSpace = totalSpace - carlist.size();
            if (query[j] == 1) {
                String newCarNo = map.get(j);
                queryOne(carlist, newCarNo, availSpace, occSpace);
            } else if (query[j] == 2) {
                String givenNo = map.get(j);
                queryTwo(carlist, givenNo);
            } else {
                System.out.println("Invalid");
            }
            j++;
        }
    }

    public static void queryOne(ArrayList<String> carlist, String carNo, int aS, int oS) {
        boolean isThere = false;

        if (aS > 0) {
            for (int i = 0; i < carlist.size(); i++) {
                if (carlist.get(i).equals(carNo)) {
                    isThere = true;
                    break;
                }
            }

            if (!isThere) {
                carlist.add(carNo);
                oS++;
                System.out.println("Car parked at position : " + carlist.size());
            } else {
                System.out.println("Car already parked");
            }
        } else {
            System.out.println("No space for parking");
        }
    }

    public static void queryTwo(ArrayList<String> carlist, String givenNo) {
        boolean isThere = false;

        for (int i = 0; i < carlist.size(); i++) {
            if (carlist.get(i).equals(givenNo)) {
                System.out.println("Car position : " + (i + 1));
                isThere = true;
                break;
            }
        }

        if (!isThere) {
            System.out.println("Car does not exist");
        }
    }

}

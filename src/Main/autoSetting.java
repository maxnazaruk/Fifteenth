package Main;

/**
 * Created by Max on 7/27/2017.
 */
public class autoSetting {
    static boolean flag = false;
    static int[][] array;
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 13, 12},
                {0, 14, 15, 11}};
        enteringMatrix(arr);
//
//        int[][] arr = {{1, 2, 3, 4},
//                {5, 0, 10, 7},
//                {9, 12, 6, 8},
//                {13, 14, 11, 15}};
//        enteringMatrix(arr);


////        int[][] arr = {{6, 24, 23, 22, 0},
////                {21, 20, 18, 19, 17},
////                {16, 15, 14, 13, 12},
////                {10, 11, 8, 9, 7},
////                {1, 2, 3, 4, 5}};
////
//        int[][] arr1 = {{0, 5, 6, 12},
//                {11, 4, 7, 8},
//                {14, 1, 3, 2},
//                {9, 13, 15, 10}};

//
//        int[][] arr2 = {{5, 1, 0, 7},
//                {11, 3, 8, 2},
//                {14, 10, 12, 13},
//                {4, 15, 9, 6}};

//        int[][] arr3 = {{11, 1, 0, 8},
//                {9, 6, 2, 7},
//                {4, 3, 12, 13},
//                {5, 10, 15, 14}};
//
//        int[][] arr4 = {{14, 0, 1, 7},
//                {10, 4, 8, 2},
//                {5, 6, 12, 13},
//                {15, 3, 11, 9}};
//
//        int[][] arr5 = {{14, 1, 7, 2},
//                {10, 4, 8, 13},
//                {6, 12, 9, 11},
//                {5, 15, 3, 0}};
//
//        int[][] arr6 = {{1, 2, 0, 15},
//                {9, 12, 4, 5},
//                {7, 11, 6, 8},
//                {3, 14, 13, 10}};
//
//        int[][] arr7 = {{7, 6, 1, 0},
//                {11, 13, 10, 15},
//                {8, 12, 14, 4},
//                {2, 9, 5, 3}};
//
//        int[][] arr8 = {{15, 2, 1, 12},
//                {8, 5, 6, 11},
//                {4, 9, 10, 7},
//                {3, 14, 13, 0}};
//
//
//        int[][] arr9 = {{11, 6, 0, 8},
//                {15, 4, 12, 7},
//                {5, 9, 3, 2},
//                {1, 14, 10, 13}};
//
//        int[][] arr10 = {{0, 5, 6, 12},
//                {11, 4, 7, 8},
//                {14, 1, 3, 2},
//                {9, 13, 15, 10}};
//
//        int[][] arr11 = {{11, 6, 8, 0},
//                {15, 4, 12, 7},
//                {5, 9, 3, 2},
//                {1, 14, 10, 13}};
//
//        int[][] arr12 = {{13, 6, 8, 7},
//                {4, 14, 12, 2},
//                {10, 1, 3, 11},
//                {9, 15, 5, 0}};
//
//        int[][] arr13 = {{5, 1, 0, 7},
//                {11, 3, 8, 2},
//                {14, 10, 12, 13},
//                {4, 15, 9, 6}};
//
//        int[][] arr14 = {{11, 1, 0, 8},
//                {9, 6, 2, 7},
//                {4, 3, 12, 13},
//                {5, 10, 15, 14}};
//
//        int[][] arr15 = {{14, 0, 1, 7},
//                {10, 4, 8, 2},
//                {5, 6, 12, 13},
//                {15, 3, 11, 9}};




//        enteringMatrix(arr);
//        enteringMatrix(arr1);
//        enteringMatrix(arr3);
//        enteringMatrix(arr4);
//        enteringMatrix(arr5);
//        enteringMatrix(arr6);
//        enteringMatrix(arr7);
////
////        System.out.println("8");
//        enteringMatrix(arr8);
////        System.out.println("9");
//        enteringMatrix(arr9);
////        System.out.println("10");
//        enteringMatrix(arr10);
////        System.out.println("11");
//        enteringMatrix(arr11);
////        System.out.println("12");
//        enteringMatrix(arr12);
////        System.out.println("13");
//        enteringMatrix(arr13);
////        System.out.println("14");
//        enteringMatrix(arr14);
////        System.out.println("15");
//        enteringMatrix(arr15);

//        int [][]a = shuffle(24);
////
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        enteringMatrix(a);

//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();


    }

    public static void showMatrix(int[][] a) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
    }

    public static void enteringMatrix(int [][] arr){
        flag = true;
        array = new int[arr.length][arr[0].length];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                array[i][j] = arr[i][j];
            }
        }

//        navigation(arr, 1, 0, 0);
//        navigation(arr, 2, 0, 1);
//        navigation(arr, 3, 0, 2);
//        navigation(arr, 4, 0, 3);
//        navigation(arr, 5, 1, 0);
//        navigation(arr, 6, 1, 1);
//        navigation(arr, 7, 1, 2);
//        navigation(arr, 8, 1, 3);
//        navigation(arr, 9, 2, 0);
//        navigation(arr, 10, 2, 1);
        navigation(arr, 11, 2, 2);
//        navigation(arr, 12, 2, 3);
//        navigation(arr, 13, 3, 0);
        if(flag) {
//            navigation(arr, 14, 3, 1);
//            navigation(arr, 15, 3, 2);
        }

        if(flag) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }else{
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print("\u001B[31m" + arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\u001B[0m");
        }

    }

    public static void lastRowNavigation(int [][] a, int number, int targetPlace, int targetRow){
        int row = findZero(a)[0];
        int place = findZero(a)[1];

        while (place != a[0].length-1){
            right(a);

            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        if(a[a.length-1][0] == a[a.length-1][1] + 1 || a[a.length-1][1] == a[a.length-1][2] + 1){
            System.out.println("unfortunatly this combination cannot be completed!");
            flag = false;
            return;
        }

        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        if(targetPlace == placeNumber){
            return;
        }

        while (true) {

            while (place != 0) {
                left(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
            up(a);
            right(a);
            down(a);

            row = findZero(a)[0];
            place = findZero(a)[1];

            while (place != a[0].length - 1) {
                right(a);
                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            up(a);
            left(a);
            down(a);
            left(a);
            up(a);
            row = findZero(a)[0];
            place = findZero(a)[1];
            while (place != a[0].length - 1) {
                right(a);
                row = findZero(a)[0];
                place = findZero(a)[1];
            }
            down(a);

            while (place != targetPlace + 1) {
                left(a);
                row = findZero(a)[0];
                place = findZero(a)[1];
            }
            up(a);
            left(a);
            down(a);
            while (place != a[0].length - 1) {
                right(a);
                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            if(rowNumber == targetRow && targetPlace == placeNumber){
                break;
            }
        }
    }

    public static void lastRowNumber(int[][] a, int number, int targetPlace, int targetRow){
        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        int row = findZero(a)[0];
        int place = findZero(a)[1];

        if(rowNumber == a.length - 1 && place == targetPlace && placeNumber == targetPlace){
            down(a);

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        if(rowNumber == targetRow && placeNumber == targetPlace){
            return;
        }



        if((placeNumber == targetPlace && place <= targetPlace) || (placeNumber == targetPlace - 1 && place == targetPlace)){
            while (place != 0){
                left(a);
                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            up(a);

            row = findZero(a)[0];
            place = findZero(a)[1];

            while (place != a[0].length-1){
                right(a);
                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            down(a);
            left(a);
            up(a);

            while (place != 0){
                left(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
            down(a);
        }

        if((placeNumber == (a[0].length/2)-1 && place >= placeNumber+1) || (placeNumber == targetPlace - 1 && place <= placeNumber - 1)){
            while (place != 0){
                left(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            up(a);

            place = findZero(a)[1];
            while (place != targetPlace-1){
                right(a);
                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            down(a);
            right(a);
            up(a);

            while (place != 0){
                left(a);
                row = findZero(a)[0];
                place = findZero(a)[1];
            }
            down(a);

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            if(rowNumber == targetRow && placeNumber == targetPlace){
                return;
            }
        }


        if((placeNumber == (a[0].length/2)-1 && place > placeNumber+1)  || (placeNumber == (a[0].length/2) && place < placeNumber - 1)){
            while (place != 0){
                left(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            trickMove(a, targetPlace);
        }


        if(placeNumber == 0 || (placeNumber == (a[0].length/2) - 1 && place == 0) ){
            while (place != 0){
                left(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            up(a);

            row = findZero(a)[0];
            place = findZero(a)[1];

            while (place != targetPlace-1){
                right(a);
                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            down(a);
            left(a);
            up(a);
            right(a);

            down(a);
            right(a);
            up(a);
            left(a);

            left(a);
            down(a);
            right(a);
            up(a);

            while (place != 0){
                left(a);
                row = findZero(a)[0];
                place = findZero(a)[1];
            }
            down(a);

        }
    }

    public static void navigation(int[][] a, int number, int targetRow, int targetPlace) {
        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        int row = findZero(a)[0];
        int place = findZero(a)[1];

        int fixedRow = rowNumber;

        if(targetRow == a.length-1){
            lastRowNavigation(a, number, targetPlace, targetRow);
        }

        if (targetPlace == a[0].length - 1 && targetRow == a[0].length - 2){

            lastRowNumber(a, number, targetPlace, targetRow);

        }

        if (targetRow == rowNumber && targetPlace == placeNumber) {
            return;
        }

        if (targetRow == rowNumber && targetPlace < a[0].length - 1 && targetRow != a.length-1) {

            onSameRow(a, number, targetRow, targetPlace);
        }

        if (rowNumber == a.length - 1 && row <= rowNumber && targetRow <= (a.length / 2) - 1 && targetPlace < a[0].length - 1) {

            moveTargetOnLastRow(a, number, targetPlace, targetRow);

            setZeroToRollPosition(a, number, targetRow, targetPlace);

            rollNumber(a, number, targetRow, targetPlace);

        }

        if (rowNumber > targetRow && rowNumber < a.length - 1 && targetPlace < a[0].length - 1) {

            if (placeNumber != targetPlace) {
                moveNumberOnTheMiddleArea(a, number, targetPlace, targetRow);
            }

            setZeroToRollPosition(a, number, targetRow, targetPlace);

            rollNumber(a, number, targetRow, targetPlace);

        }

        if (targetPlace == a[0].length - 1 && targetRow != a.length-2) {


            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            row = findZero(a)[0];
            place = findZero(a)[1];

            fixedRow = rowNumber;

            if (rowNumber != targetRow || targetPlace != placeNumber) {


                if (rowNumber == a.length - 1) {
                    moveTargetOnLastRow(a, number, targetPlace - 1, targetRow);

                    setZeroToRollPosition(a, number, targetRow + 1, targetPlace);

                    rollNumber(a, number, targetRow + 1, targetPlace - 1);

                    upZeroToNumber(a, number, targetRow);

                    moveLastNumberToThePlace(a, number, targetRow, targetPlace);
                }

                if (rowNumber < a.length - 1) {
                    decomposition1(a, number, targetPlace, targetRow);
                }
            }
        }

        if(targetRow == a.length-2 && targetPlace < a[0].length/2){
            preLastRowLowMiddleItems(a, number, targetPlace, targetRow);
        }

        if(targetRow == a.length-2 && targetPlace >= a[0].length/2 && targetPlace != a[0].length-1){

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            row = findZero(a)[0];
            place = findZero(a)[1];

            if(place < placeNumber && row == a.length-1 && placeNumber == a[0].length - 1 && rowNumber == a.length - 1){
                while (place != targetPlace){
                    right(a);
                    row = findZero(a)[0];
                    place = findZero(a)[1];
                }
            }

            if((rowNumber == a.length-1 && placeNumber >= targetPlace && place >= targetPlace) || rowNumber == targetRow && placeNumber>targetPlace){
                if(place < targetPlace && placeNumber != targetPlace){
                    while (place != targetPlace){
                        right(a);

                        rowNumber = findNumber(a, number)[0];
                        placeNumber = findNumber(a, number)[1];

                        row = findZero(a)[0];
                        place = findZero(a)[1];
                    }
                }

                row = findZero(a)[0];
                place = findZero(a)[1];

                if(placeNumber >= targetPlace) {
                    while (true) {
                        afterMiddleRoll(a, number, targetPlace, targetRow);
                        rowNumber = findNumber(a, number)[0];
                        placeNumber = findNumber(a, number)[1];

                        row = findZero(a)[0];
                        place = findZero(a)[1];
                        if (rowNumber == targetRow && targetPlace == placeNumber) {
                            return;
                        }
                    }
                }
            }

            if((placeNumber <= targetPlace - 1 && rowNumber == a.length-1) || (placeNumber == targetPlace && place <= targetPlace - 1)){

                onLowerPolace(a, number, targetRow, targetPlace);
            }
        }



    }

    public static void roll(int[][]a){
        left(a);
        up(a);
        right(a);
    }

    public static void trickMove(int [][] a,int targetPlace){
        up(a);

        int row = findZero(a)[0];
        int place = findZero(a)[1];

        while (place != targetPlace - 1){
            right(a);

            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        down(a);

        right(a);

        up(a);

        while (place != 0){
            left(a);
            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        down(a);
    }

    public static void rightRoll(int[][]a){
        down(a);
        left(a);
        up(a);
    }

    public static void afterMiddleRoll(int[][] a, int number, int targetRow, int targetPlace){

        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        int row = findZero(a)[0];
        int place = findZero(a)[1];
        if(row == targetRow && place == targetPlace){
            down(a);

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            row = findZero(a)[0];
            place = findZero(a)[1];

            if(targetPlace == placeNumber && targetRow == rowNumber){
                return;
            }
        }

        if(row == a.length-1 && place == targetPlace){
            while (place != a[0].length-1){
                right(a);

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                row = findZero(a)[0];
                place = findZero(a)[1];

                if(targetPlace == placeNumber && targetRow == rowNumber){
                    return;
                }
            }
        }

        if(row == a.length-1 && place == a[0].length-1){
            up(a);

            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        if(row == targetRow && place == a[0].length- 1){
            while (place != targetPlace){
                left(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }
    }

    public static void up(int [][] a){
        int row = findZero(a)[0];
        int place = findZero(a)[1];


        a[row][place] = a[row - 1][place];
        a[row - 1][place] = 0;

        row = findZero(a)[0];
        place = findZero(a)[1];
        showMatrix(a);

    }

    public static void down(int[][] a){
        int row = findZero(a)[0];
        int place = findZero(a)[1];


        a[row][place] = a[row + 1][place];
        a[row + 1][place] = 0;

        row = findZero(a)[0];
        place = findZero(a)[1];
        showMatrix(a);
    }

    public static void left(int[][] a){
        int row = findZero(a)[0];
        int place = findZero(a)[1];


        a[row][place] = a[row][place - 1];
        a[row][place - 1] = 0;

        row = findZero(a)[0];
        place = findZero(a)[1];
        showMatrix(a);
    }

    public static void right(int[][] a){
        int row = findZero(a)[0];
        int place = findZero(a)[1];


        a[row][place] = a[row][place + 1];
        a[row][place + 1] = 0;

        row = findZero(a)[0];
        place = findZero(a)[1];
        showMatrix(a);
    }

    public static int[] findZero(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }

    public static int[] findNumber(int[][] a, int number) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == number) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }

    public static void onSameRow(int[][] a, int number, int targetRow, int targetPlace) {

        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];
        while (rowNumber != targetRow || placeNumber != targetPlace) {


            int row = findZero(a)[0];
            int place = findZero(a)[1];

            if (row > targetRow + 1) {
                while (row != targetRow + 1) {
                    a[row][place] = a[row - 1][place];
                    a[row - 1][place] = 0;

                    showMatrix(a);

                    row = findZero(a)[0];
                    place = findZero(a)[1];

                    rowNumber = findNumber(a, number)[0];
                    placeNumber = findNumber(a, number)[1];

                    if (rowNumber == targetRow && placeNumber == targetPlace) {
                        break;
                    }
                }
            }

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            if (rowNumber == targetRow && placeNumber == targetPlace) {
                break;
            }

            showMatrix(a);

            if (row == targetRow) {
                while (place != targetPlace) {
                    a[row][place] = a[row][place - 1];
                    a[row][place - 1] = 0;

                    showMatrix(a);

                    row = findZero(a)[0];
                    place = findZero(a)[1];
                    rowNumber = findNumber(a, number)[0];
                    placeNumber = findNumber(a, number)[1];

                    if (rowNumber == targetRow && placeNumber == targetPlace) {
                        break;
                    }


                }
            }

            if (row == targetRow && place == targetPlace) {
                a[row][place] = a[row + 1][place];
                a[row + 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            if (rowNumber == targetRow && placeNumber == targetPlace) {
                break;
            }

            if (row == targetRow + 1) {
                while (place != a[0].length - 1) {
                    a[row][place] = a[row][place + 1];
                    a[row][place + 1] = 0;

                    showMatrix(a);

                    row = findZero(a)[0];
                    place = findZero(a)[1];

                    rowNumber = findNumber(a, number)[0];
                    placeNumber = findNumber(a, number)[1];

                    if (rowNumber == targetRow && placeNumber == targetPlace) {
                        break;
                    }
                }
            }

            if (row == targetRow + 1 && place == a[0].length - 1) {
                a[row][place] = a[row - 1][place];
                a[row - 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

        }
    }

    public static void moveTargetOnLastRow(int[][] a, int number, int targetPlace, int targetRow) {

        int row = findZero(a)[0];
        int place = findZero(a)[1];

        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        int fixedRow = rowNumber;

        while (true) {

            if (row == fixedRow) {
                a[row][place] = a[row - 1][place];
                a[row - 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];


            }

            while (row != fixedRow - 1) {
                a[row][place] = a[row + 1][place];
                a[row + 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            if (place > 0 && row == fixedRow - 1) {
                while (place != 0) {
                    a[row][place] = a[row][place - 1];
                    a[row][place - 1] = 0;

                    showMatrix(a);

                    row = findZero(a)[0];
                    place = findZero(a)[1];

                    rowNumber = findNumber(a, number)[0];
                    placeNumber = findNumber(a, number)[1];

                    if (placeNumber == targetPlace && rowNumber == fixedRow - 1) {
                        break;
                    }
                }
            }

            if (placeNumber == targetPlace && rowNumber == fixedRow - 1) {
                break;
            }

            if (place == 0 && row == fixedRow - 1) {
                a[row][place] = a[row + 1][place];
                a[row + 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];
            }

            if (placeNumber == targetPlace && rowNumber == fixedRow - 1) {
                break;
            }

            if (place < a[0].length - 1 && row == fixedRow) {
                while (place != a[0].length - 1) {
                    a[row][place] = a[row][place + 1];
                    a[row][place + 1] = 0;

                    showMatrix(a);

                    row = findZero(a)[0];
                    place = findZero(a)[1];
                }
            }

            if (place == a[0].length - 1 && row == fixedRow) {
                a[row][place] = a[row - 1][place];
                a[row - 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }
    }

    public static void setZeroToRollPosition(int[][] a, int number, int targetRow, int targetPlace) {
        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        int row = findZero(a)[0];
        int place = findZero(a)[1];

        if(targetPlace == placeNumber && place > targetPlace + 1){
            while (place != targetPlace + 1){
                left(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            while (row != targetRow){
                up(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }

        if(targetPlace == placeNumber && place <= targetPlace){


            while (row != a.length - 1) {
                down(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            while (place != targetPlace + 1) {
                right(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            while (row != targetRow) {
                up(a);
                row = findZero(a)[0];
                place = findZero(a)[1];
            }


        }

        if (targetRow == rowNumber && targetPlace == placeNumber) {
            return;
        }


        if (row <= rowNumber && place <= placeNumber) {
            while (row != a.length - 1) {
                a[row][place] = a[row + 1][place];
                a[row + 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                if (rowNumber == targetRow && targetPlace == placeNumber) {
                    break;
                }
            }
        }

        if (row <= rowNumber && place == placeNumber + 1) {
            while (row != a.length - 1) {
                a[row][place] = a[row + 1][place];
                a[row + 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                if (rowNumber == targetRow && targetPlace == placeNumber) {
                    break;
                }
            }
        }

        if (row == a.length - 1 && place <= placeNumber) {
            while (place != placeNumber + 1) {
                a[row][place] = a[row][place + 1];
                a[row][place + 1] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                if (rowNumber == targetRow && targetPlace == placeNumber) {
                    break;
                }
            }
        }

        if(row == targetRow && place > targetPlace && placeNumber == targetPlace){
            while (place != targetPlace){
                left(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }

        if(row == targetRow && place <= targetPlace && placeNumber == targetPlace){
            while (place != targetPlace){
                right(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }

        if(row == targetRow && place == placeNumber){
            return;
        }



        if (row == a.length - 1 && place == placeNumber + 1) {
            while (row != targetRow) {
                a[row][place] = a[row - 1][place];
                a[row - 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                if (rowNumber == targetRow && targetPlace == placeNumber) {
                    break;
                }
            }
        }
    }

    public static void moveNumberOnTheMiddleArea(int[][] a, int number, int targetPlace, int targetRow) {


        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        int row = findZero(a)[0];
        int place = findZero(a)[1];

        int fixedRow = rowNumber;
        if (row <= rowNumber) {
            if (place == placeNumber) {
                fixedRow -= 1;
            }

            while (row != rowNumber + 1) {
                a[row][place] = a[row + 1][place];
                a[row + 1][place] = 0;

                row = findZero(a)[0];
                place = findZero(a)[1];
                showMatrix(a);

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                if (rowNumber == targetRow && targetPlace == placeNumber) {
                    break;
                }

                if(targetPlace+1 == a[0].length-1 && targetPlace+1 == placeNumber && rowNumber == targetRow){
                    break;
                }
            }
        }

        if(targetPlace+1 == a[0].length-1 && targetPlace+1 == placeNumber && rowNumber == targetRow){
            return;
        }



        rowNumber = findNumber(a, number)[0];
        placeNumber = findNumber(a, number)[1];
        if (row > rowNumber) {
            while (row != rowNumber + 1) {
                a[row][place] = a[row - 1][place];
                a[row - 1][place] = 0;

                row = findZero(a)[0];
                place = findZero(a)[1];
                showMatrix(a);
                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                if (rowNumber == targetRow && targetPlace == placeNumber) {
                    break;
                }
            }
        }

        rowNumber = findNumber(a, number)[0];
        placeNumber = findNumber(a, number)[1];
        while (true) {
            if (row == fixedRow + 1 && place >= 0) {
                while (place != a[0].length - 1) {
                    a[row][place] = a[row][place + 1];
                    a[row][place + 1] = 0;

                    row = findZero(a)[0];
                    place = findZero(a)[1];
                    showMatrix(a);

                    placeNumber = findNumber(a, number)[1];

                    if (placeNumber == targetPlace) {
                        break;
                    }

                    rowNumber = findNumber(a, number)[0];
                    placeNumber = findNumber(a, number)[1];

                    if (rowNumber == targetRow && targetPlace == placeNumber) {
                        break;
                    }
                }
            }

            if (placeNumber == targetPlace) {
                break;
            }

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            if (rowNumber == targetRow && targetPlace == placeNumber) {
                break;
            }


            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];
            if (row == fixedRow + 1 && place == a[0].length - 1) {
                a[row][place] = a[row - 1][place];
                a[row - 1][place] = 0;

                row = findZero(a)[0];
                place = findZero(a)[1];
                showMatrix(a);

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                if (rowNumber == targetRow && targetPlace == placeNumber) {
                    break;
                }
            }

            if (row == fixedRow && place == a[0].length - 1) {
                while (place != 0) {
                    a[row][place] = a[row][place - 1];
                    a[row][place - 1] = 0;

                    row = findZero(a)[0];
                    place = findZero(a)[1];
                    showMatrix(a);

                    placeNumber = findNumber(a, number)[1];

                    if (placeNumber == targetPlace) {
                        break;
                    }

                    rowNumber = findNumber(a, number)[0];
                    placeNumber = findNumber(a, number)[1];

                    if (rowNumber == targetRow && targetPlace == placeNumber) {
                        break;
                    }
                }
            }

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            if (rowNumber == targetRow && targetPlace == placeNumber) {
                break;
            }
            placeNumber = findNumber(a, number)[1];

            if (placeNumber == targetPlace) {
                break;
            }

            if (row == fixedRow && place == 0) {
                a[row][place] = a[row + 1][place];
                a[row + 1][place] = 0;

                row = findZero(a)[0];
                place = findZero(a)[1];
                showMatrix(a);

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                if (rowNumber == targetRow && targetPlace == placeNumber) {
                    break;
                }
            }
        }
    }

    public static void rollNumber(int[][] a, int number, int targetRow, int targetPlace) {
        while (true) {

            int rowNumber = findNumber(a, number)[0];
            int placeNumber = findNumber(a, number)[1];

            int row = findZero(a)[0];
            int place = findZero(a)[1];



            if (row == targetRow && place == targetPlace + 1) {
                while (row != a.length - 1) {
                    a[row][place] = a[row + 1][place];
                    a[row + 1][place] = 0;

                    showMatrix(a);

                    row = findZero(a)[0];
                    place = findZero(a)[1];
                }
            }

            if (row == a.length - 1 && place == targetPlace + 1) {
                a[row][place] = a[row][place - 1];
                a[row][place - 1] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }

            if (row == a.length - 1 && place == targetPlace) {
                while (row != targetRow) {
                    a[row][place] = a[row - 1][place];
                    a[row - 1][place] = 0;

                    showMatrix(a);

                    row = findZero(a)[0];
                    place = findZero(a)[1];
                }
            }

            if (row == targetRow && place == targetPlace) {
                a[row][place] = a[row][place + 1];
                a[row][place + 1] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                if (placeNumber == targetPlace && rowNumber == targetRow) {
                    break;
                }
            }

            if (placeNumber == targetPlace && rowNumber == targetRow) {
                break;
            }
        }
    }

    public static void upZeroToNumber(int[][] a, int number, int targetRow) {
        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        int row = findZero(a)[0];
        int place = findZero(a)[1];

        int fixedRow = rowNumber;

        if (row == targetRow + 1 && place == a[0].length - 1) {
            while (row != a.length - 1) {
                a[row][place] = a[row + 1][place];
                a[row + 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }

        if (row == a.length - 1 && place == a[0].length - 1) {
            while (place != 0) {
                a[row][place] = a[row][place - 1];
                a[row][place - 1] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }


        if (row == a.length - 1 && place == 0) {
            while (row != rowNumber) {
                a[row][place] = a[row - 1][place];
                a[row - 1][place] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }
    }

    public static void moveLastNumberToThePlace(int[][] a, int number, int targetRow, int targetPlace) {
        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        int row = findZero(a)[0];
        int place = findZero(a)[1];

        int fixedRow = rowNumber;

        if (row == rowNumber && place == 0) {
            a[row][place] = a[row - 1][place];
            a[row - 1][place] = 0;

            showMatrix(a);

            row = findZero(a)[0];
            place = findZero(a)[1];

            while (place != placeNumber) {
                a[row][place] = a[row][place + 1];
                a[row][place + 1] = 0;

                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }

        if (place == placeNumber && row == rowNumber - 1) {
            a[row][place] = a[row + 1][place];
            a[row + 1][place] = 0;

            showMatrix(a);

            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        if (row == rowNumber && place == placeNumber) {
            a[row][place] = a[row][place + 1];
            a[row][place + 1] = 0;

            showMatrix(a);

            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        if (row == rowNumber && place == a[0].length - 1) {
            a[row][place] = a[row - 1][place];
            a[row - 1][place] = 0;

            showMatrix(a);

            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        if (row == targetRow && place == targetPlace) {
            while (place != 0) {
                a[row][place] = a[row][place - 1];
                a[row][place - 1] = 0;
                showMatrix(a);

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }

        if (row == targetRow && place == 0) {
            a[row][place] = a[row + 1][place];
            a[row + 1][place] = 0;
            showMatrix(a);

            row = findZero(a)[0];
            place = findZero(a)[1];
        }
    }

    public static void decomposition1(int [][] a, int number, int targetPlace, int targetRow){
        moveNumberOnTheMiddleArea(a, number, targetPlace - 1, targetRow);

        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        if (targetRow == rowNumber && targetPlace == placeNumber) {
            return;
        }

        setZeroToRollPosition(a, number, targetRow + 1, targetPlace);

        rowNumber = findNumber(a, number)[0];
        placeNumber = findNumber(a, number)[1];

        if (targetRow == rowNumber && targetPlace == placeNumber) {
            return;
        }
        rollNumber(a, number, targetRow + 1, targetPlace - 1);

        rowNumber = findNumber(a, number)[0];
        placeNumber = findNumber(a, number)[1];

        if (targetRow == rowNumber && targetPlace == placeNumber) {
            return;
        }

        upZeroToNumber(a, number, targetRow);

        rowNumber = findNumber(a, number)[0];
        placeNumber = findNumber(a, number)[1];

        if (targetRow == rowNumber && targetPlace == placeNumber) {
            return;
        }

        moveLastNumberToThePlace(a, number, targetRow, targetPlace);

        rowNumber = findNumber(a, number)[0];
        placeNumber = findNumber(a, number)[1];

        if (targetRow == rowNumber && targetPlace == placeNumber) {
            return;
        }
    }

    public static void preLastRowLowMiddleItems(int[][] a, int number, int targetPlace, int targetRow){
        showMatrix(a);
        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        int row = findZero(a)[0];
        int place = findZero(a)[1];

        int fixedRow = rowNumber;

        if(targetPlace == 0){
            onSameRow(a, number, targetRow, targetPlace);
        }

        if(targetPlace > 0 && targetPlace < a[0].length-1){

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            row = findZero(a)[0];
            place = findZero(a)[1];
            showMatrix(a);


            if(row != a.length-1) {
                a[row][place] = a[row + 1][place];
                a[row + 1][place] = 0;

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                row = findZero(a)[0];
                place = findZero(a)[1];
                showMatrix(a);
            }

            if(rowNumber == targetRow && placeNumber == targetPlace){
                return;
            }


            if(place < targetPlace){

                while (place != targetPlace) {
                    right(a);

                    row = findZero(a)[0];
                    place = findZero(a)[1];
                }
            }

            if(place > targetPlace){

                while (place != targetPlace) {
                    left(a);

                    row = findZero(a)[0];
                    place = findZero(a)[1];
                }
            }

            while(true) {
                if (row == a.length - 1 && placeNumber < targetPlace) {
                    roll(a);

                    right(a);
                    down(a);
                    left(a);

                    roll(a);

                    down(a);

                    roll(a);

                    right(a);
                    down(a);

                    roll(a);
                }

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];


                if (targetRow == rowNumber && targetPlace == placeNumber) {
                    return;
                }

                if (row == a.length - 1 && placeNumber >= targetPlace) {


                    while (true) {
                        while (place != a[0].length - 1) {
                            right(a);

                            row = findZero(a)[0];
                            place = findZero(a)[1];
                        }

                        if (place == a[0].length - 1 && row == a.length - 1) {
                            up(a);

                            row = findZero(a)[0];
                            place = findZero(a)[1];
                        }

                        if (place == a[0].length - 1 && row == targetRow) {
                            while (place != targetPlace) {

                                left(a);

                                row = findZero(a)[0];
                                place = findZero(a)[1];
                            }
                        }

                        if (place == targetPlace && row == targetRow) {
                            down(a);

                            row = findZero(a)[0];
                            place = findZero(a)[1];

                            rowNumber = findNumber(a, number)[0];
                            placeNumber = findNumber(a, number)[1];

                            if (rowNumber == targetRow && placeNumber == targetPlace) {
                                break;
                            }

                        }
                    }
                }


            }

        }
    }

    public static void onLowerPolace(int[][] a, int number, int targetRow, int targetPlace){
        int rowNumber = findNumber(a, number)[0];
        int placeNumber = findNumber(a, number)[1];

        int row = findZero(a)[0];
        int place = findZero(a)[1];

        if(row != a.length-1){
            down(a);

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        if(row == a.length-1){
            while (place != 0){
                left(a);

                rowNumber = findNumber(a, number)[0];
                placeNumber = findNumber(a, number)[1];

                row = findZero(a)[0];
                place = findZero(a)[1];
            }
        }

        if(row == a.length-1 && place == 0){
            up(a);

            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        right(a);

        rowNumber = findNumber(a, number)[0];
        placeNumber = findNumber(a, number)[1];

        row = findZero(a)[0];
        place = findZero(a)[1];

        while (true){

            right(a);
            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            row = findZero(a)[0];
            place = findZero(a)[1];

            if(rowNumber == targetRow && placeNumber == targetPlace - 1){
                break;
            }
            rightRoll(a);
        }

        while (place != 0){
            left(a);
            rowNumber = findNumber(a, number)[0];
            placeNumber = findNumber(a, number)[1];

            row = findZero(a)[0];
            place = findZero(a)[1];
        }

        down(a);


    }

    public static int[][] shuffle(){
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}};

        return arr;
    }

    public static int[][] shuffle(int steps){
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}};

        for (int i = 0; i < steps; i++) {
            int methodNumber = (int)(Math.random()*4 + 1);

            if(methodNumber == 1){
                try {
                    up(arr);
                }catch (ArrayIndexOutOfBoundsException e){
                    down(arr);
                }
            }else if(methodNumber == 2){
                try {
                    down(arr);
                }catch (ArrayIndexOutOfBoundsException e){
                    up(arr);
                }
            }else if(methodNumber == 3){
                try {
                    left(arr);
                }catch (ArrayIndexOutOfBoundsException e){
                    right(arr);
                }
            }else {
                try {
                    right(arr);
                }catch (ArrayIndexOutOfBoundsException e){
                    left(arr);
                }
            }
        }

        return arr;
    }
}

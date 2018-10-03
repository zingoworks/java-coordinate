package com.zingoworks.coordinate;

import com.zingoworks.coordinate.domain.Coordinate;
import com.zingoworks.coordinate.view.InputView;
import com.zingoworks.coordinate.view.ResultView;

import java.util.ArrayList;

public class CoordinateMain {
    public static void main(String[] args) {
        String[] cods = InputView.inputCoordinate();
        Coordinate cg = new Coordinate(cods);
        System.out.println(cg.getVerifiedCoordinates().get(1));


        int lengthOfX = 24;
        int lenghtOfY = 24;
        ResultView.print(lengthOfX,lenghtOfY);
    }
}